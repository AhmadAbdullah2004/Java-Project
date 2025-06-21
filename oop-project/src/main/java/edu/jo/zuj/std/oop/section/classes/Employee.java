/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.std.oop.session.project.classes;

/**
 *
 * @author Vip0
 */
public class Employee {
    private String name ;
    private char gender;
    private double salary;
    private  static int numperofemployee=0;//  هان ستاتيك عشان تكون شامله للكل

    public Employee() {
        name="unkown";
        gender='m';
        salary=220;
        numperofemployee++;
    }

    public Employee(String name, char gender, double salary) {
        setName(name);
        setGender(gender);//////////                          هان بدل ذيس عشان يبعثه على طول للشرط
        setSalary(salary);   numperofemployee++;
    
    
    
    }
      
    
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the gender
     */
    public char getGender() {
        switch(gender)
        {      case 'm': case 'M':
                return 'm';
        case 'F': case 'f':
            return 'f';
        }
        return 0;
        
            
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(char gender) {
        switch (gender){
            case 'm':case'M':
            case 'f': case 'F':
                this.gender=gender;
                break;
                default:
                this.gender='m';
                }
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        if(salary>=220)
        {
       this.salary=salary; 
        }
        else
        {
        
        this.salary=220;
        }
        
    }
    public String getgenderAsString(){
    
    switch(gender){
        case 'm':case'M':
            return "male";
        case 'F':case'f':
            return "female";
         default: return "unkown";        /// هان ما بنحط breakلانها مش بال setmethod عشان فيها (return)
    
    //  هان حطينا unkownلانها stringg  يعني ممكن اليوزلر ما يحط حرف بيحط : توضيح
         
    
    }
    
    
    
    
    
    }
    public double gettax()
    {
    
return (salary*0.075);
    
    }
    public double getnetsalary(){
    
    return(salary-gettax());
    
    }
public String tostring(){
 String r ="";
 r+="name="+name;
 r+= "\n gender (as char)="+gender; 
 r+= "\n gender (as string)="+getgenderAsString();
 r+= "\n salary="+salary;
 r+= "\n tax="+gettax();
          r+= "\n netsalary="+getnetsalary();
          return r;

}
public static int getnumperofemployee(){
return numperofemployee;


}
    
}
