package mytest;

import org.hibernate.Session;

import user.MyUser;
import util.HibernateUtil;
import variety.UserType;

public class TestUser {
	public static void main(String args[]) {
		//createUser();
		getCurrentUser();
	}

	private static void getCurrentUser() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		MyUser myUser = (MyUser) session.get("user.MyUser", 1);
		System.out.println(myUser.getEmail());
		myUser.setEmail("champa@hoo.com");
		session.save(myUser);
		session.getTransaction().commit();
		session.close();
		HibernateUtil.shutdown();
	}

	private static void createUser() {
		MyUser myUser = new MyUser("hello@gmail.com",UserType.TRAINER);
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		session.save(myUser);
		session.getTransaction().commit();
		session.close();
		HibernateUtil.shutdown();
	}
	
	
	
}
