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
public class TestCircle {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Circle c=new Circle();
        c.radius=in.nextDouble();
        System.out.println("enter the radius");
        System.out.println("area="+ c.area());
       
    }
    
        
    
    
}
