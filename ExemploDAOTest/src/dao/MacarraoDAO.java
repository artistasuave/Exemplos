package dao;

import bean.Macarrao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Michelle de Jesus Rogério
 */
public class MacarraoDAO {

    public int cadastrar(Macarrao macarrao) {
        Connection conexao = Conexao.conectar();
        if (conexao != null) {
            String sql = "INSERT INTO macarroes "
                    + "\n(tipo, peso, marca, aldente)"
                    + "\nVALUES (?,?,?,?);";
            try {
                PreparedStatement ps = conexao.prepareStatement(sql,
                        PreparedStatement.RETURN_GENERATED_KEYS);
                ps.setString(1, macarrao.getTipo());
                ps.setDouble(2, macarrao.getPeso());
                ps.setString(3, macarrao.getMarca());
                ps.setBoolean(1, macarrao.isAldente());
                ps.execute();
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    rs.getInt(1);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                Conexao.desconectar();
            }
        }
        return -1;
    }

    public Macarrao obterPeloId(int identificador) {
        Connection conexao = Conexao.conectar();
        if (conexao != null) {
            String sql = "SELECT * FROM macarroes WHERE id = ?";
            try {
                PreparedStatement ps = conexao.prepareStatement(sql);
                ps.setInt(1, identificador);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    Macarrao macarrao = new Macarrao();
                    macarrao.setId(rs.getInt("id"));
                    macarrao.setTipo(rs.getString("tipo"));
                    macarrao.setMarca(rs.getString("marca"));
                    macarrao.setPeso(rs.getDouble("peso"));
                    macarrao.setAldente(rs.getBoolean("aldente"));

                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                Conexao.desconectar();
            }
        }
        return null;
    }
