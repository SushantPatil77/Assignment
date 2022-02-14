import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MainClass {

	public static void main(String[] args) {

	       /// Session session = HibernateUtil.getSessionFactory().openSession();
	        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	        Session session = sessionFactory.openSession();
	        Transaction transaction = session.beginTransaction();
	       
	        Laptop laptop=new Laptop();
	        laptop.setCpu("Core 7");
	        laptop.setHdd("500gb");
	        laptop.setRam("4gb");
	        
	        Person person=new Person();
	        person.setName("sushant");
	        person.setId(45);
	        person.setAddress("pune");
	        person.setPhone("78985622522");
	        session.save(laptop);
	        session.save(person);
	        transaction.commit();
	        session.close();           // Optional
	        sessionFactory.close();   // Optional
	    }

	}


