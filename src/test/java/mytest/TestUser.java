package mytest;

import org.hibernate.Session;

import user.MyUser;
import util.HibernateUtil;

public class TestUser {
	public static void main(String args[]) {
		MyUser myUser = new MyUser("hello@gmail.com");
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		session.save(myUser);
		session.getTransaction().commit();
		session.close();
		HibernateUtil.shutdown();
		
	}
}
