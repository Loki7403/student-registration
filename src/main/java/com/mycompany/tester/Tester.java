/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tester;

/**
 *
 * @author apiiit-rkv
 */
import com.mycompany.dao.StudentDao;
import com.mycompany.dao.impl.StudentDaoimpl;
import com.mycompany.student.Student;

public class Tester {
    public static void main(String[] args){
        StudentDao dao=new StudentDaoimpl();
        Student student=new Student();
        student.setid(10);
         student.setname("Rahul");
          student.setmarks(10);
           student.setgender("male");
           dao.savestudent(student);
    }
    
}
