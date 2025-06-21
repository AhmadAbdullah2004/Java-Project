
package edu.std.oop.session.project.arry.LIST.ASSICATION;

public class Student {
    private int number;
    private String name;

    public Student() {
        number=1;
        name="unkown";
    }

    public Student(int number, String name) {
        setName(name);
        setNumber(number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        
        if(number>=1&&number<=100)
        this.number = number;
        else
        this.number=1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
