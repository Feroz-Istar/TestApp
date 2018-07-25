package mytest;

import org.hibernate.Session;

import association.Person;
import association.PersonDetail;
import user.MoneyLaundering;
import util.HibernateUtil;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		Person person = new Person("Feroz", 28);
		PersonDetail detail = new PersonDetail("feroz@istarindia.com");
		person.setDetail(detail);
		detail.setPerson(person);

		session.save(person);
		session.getTransaction().commit();
		session.close();
		HibernateUtil.shutdown();
	}

}
