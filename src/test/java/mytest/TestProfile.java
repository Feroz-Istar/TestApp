package mytest;

import org.hibernate.Session;

import user.Address;
import user.Profile;
import util.Gender;
import util.HibernateUtil;

public class TestProfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Profile profile = new Profile("Feroz", "feroz@istarindia.com", 23, Gender.MALE, new Address("Home", "Flat No 204", "silver wood enclave", 560092, "Bangalore", "devinagar", "karnataka"));
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		session.save(profile);
		session.getTransaction().commit();
		session.close();
		HibernateUtil.shutdown();
	}

}
