package com.mythili4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mythili4.HibernateUtil;
import com.mythili4.model.UserDetails;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		try 
		{
                session.beginTransaction();
			
			
			/*
			 //Inserting userDetails into table
			for(int i=1;i<=10;i++)
			{
			UserDetails user=new UserDetails();
			user.setUserName("User "+i);
			session.save(user);
			
			}
			
			*/
			
                //Reading or retrieving the data
    		//	UserDetails user=session.get(UserDetails.class, 5);
    			//System.out.println(user.getUserName());
    			
    			
    			
    			 //Update the user details
    		//	UserDetails user=session.get(UserDetails.class, 8);
    			//user.setUserName("new user-5");
    	//		session.update(user);
    	//		session.save(user);
    			
    			
    			
    			 //Delete the user Details
    			UserDetails user=session.get(UserDetails.class, 9);
    			session.delete(user);
    			session.getTransaction().commit();
    			
    			
    			
    		}
    		finally 
    		{
    			session.close();
                sessionFactory.close();
    		}
    		
    		
        }
}
			

