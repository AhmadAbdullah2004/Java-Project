
package edu.jo.zuj.std.oop.section.arry.classes.method;


public class Emplyee {
    private int number;
    private String name;
    private double salary;

    public Emplyee() {
        number=-1;
        name ="unkown";
        salary =400;
        
    }

    public Emplyee(int number, String name, double salary) {
       
        setName(name);
        setNumber(number);
        setSalary(salary);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if(number>=1 && number<=100)
         this.number = number;
        else
            this.number=-1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary>400)
        this.salary = salary;
        else 
            this.salary=400;
    }
    private double gettax(){/// لا يمكن استدعائها
    return (salary*0.1);
    
    }
    public double getnetsalary(){
    
    return (salary-gettax());
    }
    public Emplyee getcopy(){
    Emplyee temp=new Emplyee();
    temp.name=this.name;
    temp.number=this.number;
    temp.salary=this.salary;
    return temp;
    
    }
}
