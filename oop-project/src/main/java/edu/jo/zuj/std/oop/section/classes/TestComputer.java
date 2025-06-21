
package edu.std.oop.session.project.classes;

import java.util.Scanner;

public class TestComputer {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        Computer c=new Computer();
        Computer[] Computer=new Computer[5];
        for(int i=0;i<Computer.length;i++)
        {
        System.out.println("enter details for computer number"+(i+1)+":");
        System.out.println("enter the brand");
        c.setbrand(in.next());
        System.out.println("enter the Processor");
        c.setProcessor(in.next());
        System.out.println("enter the ram");
        c.setram(in.nextInt());
              System.out.println(c.toString());
        }
        
        
    }
    
}
