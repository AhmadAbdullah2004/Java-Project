
package edu.std.oop.session.project.arry.LIST.ASSICATION;

import java.util.ArrayList;
import java.util.Scanner;


public class Course {
    private String coursename;
    private ArrayList<Student> courseStudents=new ArrayList<>();//new ArrayList<>()  مهمه عشان توضح انو بدك تعمل اراي ليست جديدهههه
    private  int numperofStudents;
  static Scanner in=new Scanner(System.in);
    public Course() {
        coursename="NO title";
        numperofStudents= 0;        
    }

    public Course(String coursename, ArrayList<Student> courseStudents, int numperofStudents) {
        this.coursename = coursename;
      
        this.numperofStudents = 0;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }
    public void addnewstudents(){
    
        Student s=new Student();//// هاي ما فيها باراميتر  (بتقرا من اليوزر )
        System.out.println("enter studnst number=");
        s.setNumber(in.nextInt());
        System.out.println("enter studnst name=");
        s.setName(in.next());
        courseStudents.add(s);////// جمله تاكيد الاضافه مهمهههههههههههههههههههههههه في كل ارراي
        numperofStudents++; 
        
        
    }
      public void addnewstudents(int number,String name){///هاي فيها باراميتر بتقرا من الاورثررر
          Student s=new Student(number, name);
          courseStudents.add(s);// 1-
          numperofStudents++; 
          
      }
      
      public void  dropStudnts(int number){
          boolean found =false;
          for(int i=0;i<courseStudents.size();i++)
          {
             
            if(courseStudents.get(i).getNumber() ==number){
            found =true;
            courseStudents.remove(i);//2-
            numperofStudents--;
            
            }
      }
     if(found==false)
     {
     
         System.out.println("the students is not founded");
     }
     else{
     
         System.out.println("the students is deleted");}
      
      
      }

    public int getNumperofStudents() {
        return numperofStudents;
    }


    public void  printallinformation() {
        
        for(int i=0;i<courseStudents.size();i++)
        {  System.out.println("cours name="+coursename+"\nStudent name="+courseStudents.get(i).getName()+"Students Number=" +courseStudents.get(i).getNumber());
        
            System.out.println("the total number of students is="+numperofStudents);
        }
        
}
   
      
      
      }
