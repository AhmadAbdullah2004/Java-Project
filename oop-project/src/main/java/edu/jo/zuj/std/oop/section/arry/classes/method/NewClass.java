 
package edu.jo.zuj.std.oop.section.arry.classes.method;

import java.awt.BorderLayout;
import java.util.Scanner;

public class NewClass {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
    ;
       Prouduct  arr[]=new Prouduct[2];
        fillarry(arr);
        lessthannten(arr);
        printarry(arr);
        
            
    }
        public static void fillarry(Prouduct arr[])
       {       
           System.out.println("=====fillarry=======");
           for( int i=0;i<arr.length;i++)
           { arr[i]=new Prouduct();
                 System.out.println("enter the name for product number"+(i+1));
                 arr[i].setName(in.next());
                 System.out.println("enter the category for product number"+(i+1));
                 arr[i].setCategory(in.next());   
                 System.out.println("enter the price for product number"+(i+1));
                 arr[i].setPrice(in.nextDouble()); 
                 System.out.println("enter the qunitity in stock for product number"+(i+1));
                 arr[i].setQuantityinstock(in.nextInt());
           }
       }
        public static void lessthannten(Prouduct arr[]){
         System.out.println("the price less than 10=");
        for( int i=0;i<arr.length;i++)
        {
           
            if(arr[i].getPrice()<10)
            System.out.println("\n"+arr[i].getPrice());
      
        
        }
        
        }
        public static void printarry(Prouduct arr[]){
            System.out.println("==========print arry=========");
            
        for( int i=0;i<arr.length;i++)
        {
            System.out.println("the detalies for peouduct number"+(i+1)+arr[i].toString());
        
        
        
        }
        
        }
        
    }
    

