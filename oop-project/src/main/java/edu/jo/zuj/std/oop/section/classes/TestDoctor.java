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
public class TestDoctor {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Doctor d=new Doctor();
        System.out.println("enter the name");
        d.setname(in.next());
        System.out.println("enter the salary");
   d.setbaiscsalary(in.nextDouble());
         System.out.println("enter the allowance");
       d.setallowance(in.nextDouble());
         System.out.println("enter the transportation ");
        d.settransportation(in.nextDouble());
       System.out.println(d.toString());         
    }

    
           
    
}
