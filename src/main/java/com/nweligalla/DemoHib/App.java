package com.nweligalla.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Students obj1 = new Students();
//        obj1.setRollNO(104);
//        obj1.setName("AquaMan");
//        obj1.setColor("Aquagreen");
        
        Configuration con =new Configuration().configure().addAnnotatedClass(Students.class);
        									   //get defualt conf xml 			//get class
        
        
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        
        SessionFactory sf = con.buildSessionFactory(reg);

        Session session = sf.openSession();
        
        Transaction tx =session.beginTransaction();
        
        //save data in database
       // session.save(obj1);	
        
      //get data
        obj1 = (Students) session.get(Students.class, 101);	
        
        
        tx.commit();	
        
        
        
       
        
        System.out.println(obj1);
    }
}
