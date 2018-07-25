package mytest;

import org.hibernate.Session;

import association.Phone;
import association.PhoneDetails;
import association.School;
import association.Teacher;
import util.HibernateUtil;

public class SchoolTest {

	public static void main(String[] args) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();

		// TODO Auto-generated method stub
		School school = (School) session.get("association.School", 1);
		Teacher teacher = new Teacher("K V yadav", "Physics");
		school.setTeacher(teacher);

		session.save(teacher);

		session.save(school);
		session.getTransaction().commit();
		session.close();
		HibernateUtil.shutdown();
	}

}
