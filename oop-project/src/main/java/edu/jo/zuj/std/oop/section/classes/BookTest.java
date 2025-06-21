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
public class BookTest {
    
    
    public static void main(String[] args) {
      
        Scanner in=new Scanner(System.in);
        Book b1=new Book("noo", 232, 'a');
        Book b=new Book();
        System.out.println("enter title");
        b.setTitle(in.next());
        System.out.println("enter the pages");
        b.setPages(in.nextInt());
        System.out.println("enter the category");
        b.setCaterogy(in.next().charAt(0));
        System.out.println(b.toString());
        System.out.println("====================================");
        System.out.println("after copy");
        b1=b.getcopy();/// يعني هان انسخ bفي b1
        System.out.println(b);
        System.out.println(" book 2 ="+b1);
    }
    
}
