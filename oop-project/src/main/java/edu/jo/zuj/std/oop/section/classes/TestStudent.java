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
public class TestStudent {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student s = new Student();// جمله الrefernce
        System.out.println("enter the name");
        s.setname(in.next());// جمله الأستداع تكون منs.set ثم (name of scanner.next()) 
        System.out.println("enter grade 1");
        s.setgrade1(in.nextInt());
        System.out.println("enter grade 2");
        s.setgrade2(in.nextInt());
        System.out.println("enter grade3 ");
        s.setgrade3(in.nextInt());
//        System.out.println("the name ="+ s.name);
//        System.out.println("grade 1="+s.getgrade());
//        System.out.println("grade2="+s.getgrade2());
//        System.out.println("grade3="+s.getgrade3());
//        System.out.println("the avarge="+s.getavg());
//        System.out.println("the staus="+s.getstaut());
//        System.out.println("the evaulation="+s.getevaulation());
System.out.println(s.toString());
///https://www.youtube.com/watch?v=bS55yjyA7B0&t=341s  Doctor hw حلو :)
    }

}
