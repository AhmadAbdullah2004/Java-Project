
package edu.std.oop.session.project.arry.LIST.ASSICATION;

import static edu.std.oop.session.project.arry.LIST.ASSICATION.Course.in;
import java.util.Scanner;


public class Main {
    
    static Scanner  i=new Scanner(System.in);   
    public static void main(String[] args) {
        Course c=new Course();
  drawmenue();
  String choice="*";/// اي ربش داتا اعطي السترنج عشان ما يعترض
  do{
      drawmenue();////////   ترجكه  الكود  (((ضلك اعملي درو مينيو طالما التشويس لا تساوي e/E
      choice=i.next();
      switch(choice){
      case"A":case"a":
          System.out.println("adding Students");  
          c.addnewstudents();
          break;
      case"b":case"B":
          System.out.println("droping students");
          System.out.println("enter number you want to delete");
          int number=in.nextInt();
          c.dropStudnts(number);
          break;
      case"c":case"C":
          System.out.println("changing course name");
          changecoursename(c);
      break;
      case "d": case"D":
          System.out.println("printing couese info");
          c.printallinformation();
          default:
              System.out.println("enter anthor choice");
         
      
      
      }
      }  
  while (!choice.equalsIgnoreCase("E"));     
        System.out.println("you end the program");        
        
    }

    public static void drawmenue(){
        
        System.out.println("A- to add students");
        System.out.println("b- to drop student from course");
        System.out.println("c-change course name");
        System.out.println("d-print couese info ");
        System.out.println("e- to exit  ");
        System.out.println("enter your choice");
    }
    
    
       public static void changecoursename(Course c){
          
          System.out.println("enter the new cours name");
          c.setCoursename(in.next());
          System.out.println("new cours name was added");
          c.printallinformation();
      
      
      }
      
    
    
    
    
    
    
    
        
 }
