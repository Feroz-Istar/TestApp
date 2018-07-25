package mytest;

import org.hibernate.Session;

import association.Phone;
import association.PhoneDetails;
import user.MoneyLaundering;
import util.HibernateUtil;

public class TestOneToOneMapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phone = new Phone("8657601666");
		PhoneDetails details = new PhoneDetails("Bt","Web Service");
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();

		session.save(details);
		phone.setDetails(details);
		session.save(phone);

		session.getTransaction().commit();
		session.close();
		HibernateUtil.shutdown();
	}

}
