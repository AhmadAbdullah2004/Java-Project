
package edu.std.oop.session.project.arry.Assication;


public class CompanyTest {
    public static void main(String[] args) {
     Department d1=new Department();
     d1.setName("sales");
     Employee [] employees=new Employee[3];
     employees [0]=new Employee(300, "Ata");
     employees [1]=new Employee(852, "ali");
     employees [2]=new Employee(3333, "ahamd");
      
      d1.setEmployee(employees);                                                   
      System.out.println(d1.toString());
      
    }
    
}
