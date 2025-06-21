
 
package edu.jo.zuj.std.oop.section.arry.classes.method;

import java.util.Scanner;


public class EmployeeTest {
  static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        Emplyee arr[]=new Emplyee[2];
        fillarry(arr);
        Emplyee max=getmaxsalary(arr);//  الميثود اللي فيها عمليه حسابيه ما بنستدعيها مثل اللي فيها فويد منستدعيها عن طريق ريفرنس مساوي الها...
        System.out.println("name number of the max selery="+max.getName());// get تستخدم لكي يخرجها البرنامج
    }
        public static void fillarry(Emplyee arr[])
        { System.out.println("===fill arry====");
            for(int i=0;i<arr.length;i++)
            {
           arr[i]=new Emplyee();// ضروري عشان يعرف يعمل موظف جديد او اوبجيكت جديد 
          System.out.println("enter name");
           arr[i].setName(in.next());
          System.out.println("enter number");
          arr[i].setNumber(in.nextInt());
          System.out.println("enter salary");
          arr[i].setSalary(in.nextDouble());
          
           }
        }
        public static Emplyee getmaxsalary(Emplyee arr[]){
       Emplyee max=arr[0];
       for(int i=1;i<arr.length;i++)
       {
        if (arr[i].getnetsalary()>max.getnetsalary()){
           
        max=arr[i].getcopy();}
      
       }
      return max;
        
        }
}