package dao;

import bean.Filme;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alunos
 */
public class FilmeDAO {

    public int cadastrar(Filme terror) {
        Connection conexao = Conexao.conectar();
        if (conexao != null) {
            String sql = "INSERT INTO filmes "
                    + "\n(nome, diretor, categoria, atorPrincipal, idiomaOriginal,"
                    + "\ntempoFilme, ano, orcamento, faturamento, faixaEtaria,"
                    + "\nlegenda, dublado)"
                    + "\nVALUES (?,?,?,?,?,?,?,?,?,?,?,?);";
            try {
                PreparedStatement ps = conexao.prepareStatement(sql,
                        PreparedStatement.RETURN_GENERATED_KEYS);
                ps.setString(1, terror.getNome());
                ps.setString(2, terror.getDiretor());
                ps.setString(3, terror.getCategoria());
                ps.setString(4, terror.getAtorPrincipal());
                ps.setString(5, terror.getIdiomaOriginal());
                ps.setShort(6, terror.getTempoFilme());
                ps.setInt(7, terror.getAno());
                ps.setInt(8, terror.getOrcamento());
                ps.setLong(9, terror.getFaturamento());
                ps.setByte(10, terror.getFaixaEtaria());
                ps.setBoolean(11, terror.isLegenda());
                ps.setBoolean(12, terror.isDublado());
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    return rs.getInt(1);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                Conexao.desconectar();
            }

        }
        return -1;

    }
}
