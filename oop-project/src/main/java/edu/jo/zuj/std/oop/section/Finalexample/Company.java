
package edu.std.oop.session.project.Finalexample;

import java.util.ArrayList;
import java.util.Scanner;

public class Company {
    static Scanner in=new Scanner(System.in);       
    private String Title;
    private ArrayList<owner>  Owners =new ArrayList<>();

    public Company() {
        Title="ZUJ";
        Owners=Owners;
        
    }

    public Company(String Title, ArrayList<owner> Owners) {
        setTitle(Title);
        
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }
    public void AddOwner(ArrayList<owner> owners){
       owner o=new owner();
       o.setId(0);
       o.setName(Title);
    
    
    }
     public void AddOwner(){
        ArrayList<owner>  Owners =new ArrayList<>();
        owner o=new owner();
        System.out.println(" enter the owner id");
        o.setId(in.nextInt());
        System.out.println("enter the owner name");
        o.setName(in.next());
        Owners.add(o);
     
     
     
     
     }
     
     public String getOwner(){
         owner o=new owner();
         for(int i=0;i<Owners.size();i++)
          
             
         return( "the name of Owner="+Owners.get(i).getName()+"the id="+Owners.get(i).getId());
         
         
           return getOwner();
     }

    @Override
    public String toString() {
        return "Company{" + "Title=" + Title + ", Owners=" + Owners + '}';
    }
    
}
