/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.std.oop.session.project.classes;

import java.util.Scanner;

/**
 *
 * @author Vip0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e=new Employee();
        System.out.println(e.tostring());
        System.out.println("======================================");
        Employee e2=new Employee();
        Scanner in=new Scanner(System.in);  
        System.out.println("enter the name ");
        e2.setName(in.next());
        System.out.println("enter the gender");
        e2.setGender(in.next().charAt(0));
        System.out.println("enter the salary");
        e2.setSalary(in.nextDouble());        
        System.out.println(e2.tostring());
        System.out.println("======================================");
        Employee e3=new Employee("ahmad",'s',232);
        System.out.println(e3.tostring());
        
        System.out.println("the number of employee is="+Employee.getnumperofemployee());/// عندما نستخدم ستاتيك طريقه الاستدعاء تبدا باسم الكلاسس 
     
    }
    
}
