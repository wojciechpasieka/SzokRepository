package szok_hb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
    public static void main(String[] args) {

        HibernateConfig config = new HibernateJavaConfig();
        SessionFactory sessionFactory = config.getSessionFactory();

        try(Session session = sessionFactory.openSession()){
            session.createQuery("from Prelegent").list().forEach(e-> System.out.println(e));
        }


        config.shutdown();
    }
}
