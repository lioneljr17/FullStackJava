package hiberDemo;

import org.hibernate.SessionFactory;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class hiberUtil {
private static SessionFactory sessionFactory;
	
	
	static{
		try {
			
			Configuration configuration = new Configuration().configure();
			//StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
			//applySettings(configuration.getProperties());
			sessionFactory = configuration.buildSessionFactory();
		
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
		
		
	}
	
	public static SessionFactory getSessionFactory() {

		return sessionFactory;
	
	}

}
