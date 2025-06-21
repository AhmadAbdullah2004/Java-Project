
package edu.std.oop.session.project.arry;

import java.util.Scanner;


public class Exampelarr3 {
    public static void main(String[] args) {
        
        Scanner n=new Scanner(System.in);
        double arr[]=new double[5];
       double sum=0;
       double avg=0;
        for(int i=0;i<arr.length;i++)
          
        { 
            System.out.println("enter the number"+(i+1));
            arr[i]=n.nextInt();
          
       sum +=arr[i];
       avg=sum/arr.length;
        }
        System.out.println("sum="+    ""+sum);
        System.out.println("avg ="+   ""+avg);
    }
    
}
