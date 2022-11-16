package hiberDemo;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import hiberDemo.demo.pojo.user;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory factory = hiberUtil.getSessionFactory();
		
		Session session = factory.openSession();
		session.beginTransaction();
		
		
		user user = new user();
		user.setId(11);
		user.setName("Rajib");
		//user.setAddress("USA");
		user.setDob(new Date());
		user.setUsername("root");
		user.setPassword("root");
		
		session.delete(user);
		
		
		session.getTransaction().commit();
		
		
		
		session.close();
		System.out.println("exit");
	}

}
