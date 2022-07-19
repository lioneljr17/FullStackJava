package Hibernated;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.demo.pojo.User;

public class main {

	public static void main(String[] args) {
SessionFactory factory1 =  hibernateUtil.getSessionFactory();
		
		Session session = factory1.openSession();
		
		session.beginTransaction();
		
		User user = new User();
		
		user.setName("jure");
		user.setPhoneNo("347777654");
		user.setDob(new Date());
		user.setUsername("jur");
		user.setPassword("sql");
		
		session.save(user);
		
		session.getTransaction().commit();;
		session.close();
		
		System.out.println("exite");

	}

}
