
import bean.Sistema;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * @author Michelle de Jesus Rogerio
 */
public class Principal {

    public static void main(String[] args) {
        Configuration conf = new Configuration();
        StandardServiceRegistry sr
                = new StandardServiceRegistryBuilder()
                        .configure("hibernate.cfg.xml").build();

        SessionFactory factory = new Configuration()
                .buildSessionFactory(sr);

        Transaction transaction = null;
        try {
            Session session = factory.openSession();
            transaction = session.getTransaction();
            transaction.begin();

            /*Sistema sistemaDaMica = new Sistema();
            sistemaDaMica.setNome("Michelle");
            session.save(sistemaDaMica);*/

 /*Sistema sistemaDaMica = new Sistema();
            sistemaDaMica.setNome("Michelle");
            sistemaDaMica.setId(1);
            session.update(sistemaDaMica);*/
            List resultados = session
                    .createQuery("from Sistema").list();
            for (Sistema sistema : (List<Sistema>) resultados) {
                System.out.println(sistema.getNome());
            }

            Sistema sistema = new Sistema();
            sistema.setId(1);
            session.remove(sistema);

            // INSERT NO BD
            transaction.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            if (transaction.isActive()) {
                transaction.rollback();
            }
        } finally {
            factory.close();
        }
    }
}
