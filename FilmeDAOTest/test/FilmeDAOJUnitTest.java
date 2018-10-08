


import dao.FilmeDAO;
import bean.Filme;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michelle de Jesus Rogério
 */
public class FilmeDAOJUnitTest {
    
    @Test
    public void TestarCadastro(){
        Filme terror = new Filme();
        terror.setNome("O Exorcista");
        terror.setDiretor("William Friedkin");
        terror.setCategoria("Terror");
        terror.setAno(1973);
        terror.setAtorPrincipal("Linda Blair");
        terror.setTempoFilme((short)132);
        terror.setOrcamento(1200000000);
        terror.setFaturamento(44130000000);
        terror.setFaixaEtaria(18);
        terror.setLegenda(true);
        terror.setDublado(false);
        terror.setIdiomaOriginal("Inglês");
        
        int identificador = new FilmeDAO().
                cadastrar(terror);
        
    }
}
