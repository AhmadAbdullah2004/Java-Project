
package edu.std.oop.session.project.classes;

import java.util.Scanner;

public class RectangleTest {
    static Scanner in= new Scanner(System.in); 
    public static void main(String[] args) {
        Rectangle[] arr=new Rectangle[3];/// استدعاء array مع object 
        fillarry(arr);
        printarry(arr);
    }
    public static void fillarry(Rectangle arr[]){
       
        System.out.println("=======fill array===========");
        for( int i=1;i<=arr.length;i++)
        {
                                                          arr[i]=new Rectangle();
         System.out.println("enter the length for Rectangle  "+i);
        arr[i].setLength(in.nextDouble()) ;
        System.out.println("enter the width for Rectangle  "+i);
        arr[i].setWidth(in.nextDouble());
        System.out.println("enter the color for Rectangle  "+i);
        arr[i].setColor(in.next());
        System.out.println("enter the border true/false for Rectangle  "+i+1.0);
        arr[i].setBorder(in.nextBoolean());
            }}
    public static void printarry(Rectangle arr[]){
    
        System.out.println("===========print arry============");
       
     for( int i=0;i<arr.length;i++)
     {
         System.out.println(arr[i].toString());
     
     
     }
    
    
    
    }
    
    }

