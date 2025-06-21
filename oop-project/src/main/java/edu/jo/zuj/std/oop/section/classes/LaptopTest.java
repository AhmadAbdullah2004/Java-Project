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
public class LaptopTest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Laptoop l=new Laptoop();
        System.out.println("how  much laptop you need?");
        int size =in.nextInt();
        int[] array = new int[size];
 for( int i=0;i<=size;i++)
 {
     System.out.println("enter the brand ");
     l.setBrand(in.next());
     System.out.println("enter the ram");
     l.setRam(in.nextInt());
     System.out.println("enter the price");
     l.setPrice(in.nextDouble());
 // https://www.youtube.com/watch?v=RxB_ffbaElg&t=1723s
     System.out.println(l.tostring()); 
     
     System.out.println(" after copy");
     // لنفرض انه موجود l1 وl2     l1=l2.getcopy();

 }
     
    }
    
}
