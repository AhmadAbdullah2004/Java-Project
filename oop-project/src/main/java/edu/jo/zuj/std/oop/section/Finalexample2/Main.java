
package edu.jo.zuj.std.oop.section.Finalexample2;

import edu.std.oop.session.project.Finalexample.Department;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
      static Scanner in=new Scanner(System.in); 
      public static void main(String[] args) {
   
        ArrayList<Department> arr=new ArrayList<>() ;
          fillArry(arr);
          SerachBugedByEmpCount(arr);
        
    }
    public static void fillArry(ArrayList<Department> arr){
    for (int i=0;i<5;i++)
    {    Department e =new Department();//
       
        System.out.println("enter the debartment name = ");
       e.setDname(in.next());
        
        System.out.println("enter the emplyee  count = ");
        e.setEmpcount(in.nextInt());
       
        arr.add(e);//
    
    
    }
    
    
    
    
    }
    public static void SerachBugedByEmpCount(ArrayList<Department> arr){
         Department e =new Department();
        System.out.println(" pleas enter the empCount that you want to print all arry iformation is like it");
          e.setEmpcount(in.nextInt());
        for(int i=0;i<arr.size();i++)
        {
        if(arr.get(i).getEmpcount()<=e.getEmpcount())
        
                System.out.println(" the debatment name= "+e.getDname()+"the empcount="+e.getEmpcount()+"the total budget=  "+e.getTotalBudget());
        
        
        
        
        
        
        }
        
        
        
        
    
    
    
    }
      
      
}
