package mytest;

import org.hibernate.Session;

import association.TestDatabase;
import user.MoneyLaundering;
import util.HibernateUtil;

public class TestCamakCase {
	public static void main(String args[]) {
		TestDatabase database = new TestDatabase("dsdjhdjdjd");
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();

		session.save(database);
		session.getTransaction().commit();
		session.close();
		HibernateUtil.shutdown();
	}
}
