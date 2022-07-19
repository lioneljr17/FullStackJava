package Hibernated;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class hibernateUtil {
	private static SessionFactory sessionFactory;
	
	
	static{
		try {
			
			Configuration configuration = new Configuration().configure();
			
			
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
