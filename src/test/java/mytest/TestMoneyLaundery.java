package mytest;

import org.hibernate.Session;

import user.MoneyLaundering;
import util.HibernateUtil;

public class TestMoneyLaundery {

	public static void main(String args[]) {
		createMoney();
		//getMoney();
	}

	private static void getMoney() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		MoneyLaundering laundering =(MoneyLaundering) session.get("", "1");

		session.save(laundering);
		session.getTransaction().commit();
		session.close();
		HibernateUtil.shutdown();
	}

	private static void createMoney() {
		MoneyLaundering laundering = new MoneyLaundering(199000.333f);
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		session.save(laundering);
		session.getTransaction().commit();
		session.close();
		HibernateUtil.shutdown();
	}
}
