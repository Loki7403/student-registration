/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao.impl;

/**
 *
 * @author apiiit-rkv
 */
import com.mycompany.dao.StudentDao;
import org.hibernate.SessionFactory;
import com.mycompany.student.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;


public class StudentDaoimpl implements StudentDao {
    SessionFactory factory;
    public StudentDaoimpl(){
        ServiceRegistry sr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata m=new MetadataSources(sr).getMetadataBuilder().build();
        factory=m.getSessionFactoryBuilder().build();
    }
    @Override
    public void savestudent(Student student){
        Session session=factory.openSession();
        Transaction t=session.beginTransaction();
        try{
            session.save(student);
            System.out.println("obj inseted");
            t.commit();
        }
        catch(Exception e){
            t.rollback();
             System.out.println("obj not inseted");
             System.out.println(e);
            
        }
        finally{
            
            session.close();
            factory.close();
        }
        
        
    
    }
    
}
