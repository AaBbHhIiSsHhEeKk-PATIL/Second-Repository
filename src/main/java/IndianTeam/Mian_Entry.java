package IndianTeam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mian_Entry {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("IndianTeam/hibernet.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Record rd = new Record();
		rd.setName("Virat Kolhi");
		rd.setRun(9999);
		rd.setCentury(51);
		rd.setHalfcentury(49);
		
		RR r = new RR();
		r.setSR(135);
		r.setAvg(45);
		
		rd.setRr(r);
		
		Session session =  factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(rd);
	    tx.commit();	
		session.close();

	}

}
