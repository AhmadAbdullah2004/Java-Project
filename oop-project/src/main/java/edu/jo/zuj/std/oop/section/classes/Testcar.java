/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.std.oop.session.project.classes;

/**
 *
 * @author Vip0
 */
public class Testcar {
    public static void main(String[] args) {
         //car: data type(class name)
         // c= reference ,name
         // new Car(); construction
        Car c=new Car();
        c.make="avante";
        c.model="kia";
        c.year=2022;
        
        c.start();
        c.stop();
        
        Car c2=new Car();
        c2.make="fu";
        c2.model="ford";
        c2.year=2029;
        
        c2.start();
        c2.stop();
        System.out.println(c.make);
        System.out.println(c2.make);
}
}