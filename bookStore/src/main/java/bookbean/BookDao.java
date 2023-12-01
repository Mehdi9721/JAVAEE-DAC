package bookbean;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
public class BookDao {
	public static Session getCon() {
	     Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Book.class);
	      SessionFactory sf=con.buildSessionFactory();
	        Session session=sf.openSession();
	        
	return session;
	}
	        public static boolean book(Book b) {
	        System.out.println("connectiing sesison");
	        Session s= getCon();
        	System.out.println("connected");
        	System.out.println(b);
        	   s.beginTransaction();
        	  s.save(b);
             s.getTransaction().commit();
             return true;
        }
	        public static boolean verfy(int id) {
		        Session s= getCon();
	        	   s.beginTransaction();
	        	   System.out.println(" book verfy");
	               Query q=s.createQuery("from Book b where b.id= :id");
	               q.setParameter("id", id);
	               Book b= (Book)q.uniqueResult();
	               if(b!=null) {
	            	   return false;
	               }
	               s.getTransaction().commit();
	        	return true;
	        }
	        public static List<Book> allBook(){
	        	 Session s= getCon();
	         	   s.beginTransaction();
	         	    Query q=s.createQuery("from Book");
	         	   List<Book> ls=q.list();
	              s.getTransaction().commit();
	        	return ls;
	        }
	        public static Book one(int id) {
	        	 Session s= getCon();
	        	   s.beginTransaction();
	               Query q=s.createQuery("from Book b where b.id= :id");
	               q.setParameter("id", id);
	               Book b= (Book)q.uniqueResult();
	               s.getTransaction().commit();
	        	return b;
	        }
	        public static boolean edit(Book b) {
	        	 Session s= getCon();
	        	   s.beginTransaction();
	               s.update(b);
	               s.getTransaction().commit();
	       return true;
	        }
	        public static boolean delete(int id) {
	        	 Session s= getCon();
	        	   s.beginTransaction();
	        	   Query q=s.createQuery("delete from Book b where b.id = :id");
	        	   q.setParameter("id",id);
	               q.executeUpdate();
	               s.getTransaction().commit();
	       return true;
	        }
	        public static int updateQuantity(int id,String quanti) {
	        	 Session s= getCon();
	        	   s.beginTransaction();
	        	   System.out.println(id+" this is id");
	        	   System.out.println(quanti);
	        	   Query q=s.createQuery("from Book b where b.id = :id");
	        	   q.setParameter("id",id);
	               Book k=(Book)q.uniqueResult();
	               System.out.println(k);
	               int h=Integer.parseInt(k.getQuantity())-1;
	               if(h==0) {
	            	   delete(id);
	               }else {
	            	    String p=h+"";
	 	               k.setQuantity(p);
	 	               System.out.println(k);
	 	               s.update(k);
	 	               s.getTransaction().commit();
	               }
	           
	       return h;
	        }
	        
}
