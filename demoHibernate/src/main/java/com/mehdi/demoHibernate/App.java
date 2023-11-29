package com.mehdi.demoHibernate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       Demo d=new Demo();
       d.setId(101);
       d.setName("mehdi");
      Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Demo.class);
      SessionFactory sf=con.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tran=session.beginTransaction();
    session.save(d);
    tran.commit();
    }
}
