/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.std.oop.session.project.classes;

/**
 *
 * @author Vip0
 */
public class Doctor {

    String name;
    private double baiscsalary;
    private double allowance;
    private double transportation;

    public Doctor() {
        name = "unknown";
        baiscsalary = 220;
        allowance = 100;
        transportation = 50;

    }

    public Doctor(String name, double baiscsalary, double allowance, double transportation) {

        name = this.name;
        baiscsalary = this.baiscsalary;
        transportation = this.transportation;

    }

    public void setname(String name) {
        name = this.name;
    }

    public String getname() {
        return name;
    }

    public void setbaiscsalary(double baiscsalary) {
        if (baiscsalary >= 220) {
            baiscsalary = this.baiscsalary;
        } else {
            baiscsalary = 220;
        }

    }

    public double getbaiscsalary() {

        return baiscsalary;

    }

    public void setallowance(double allowance) {
        if (allowance >= 100) {
            allowance = this.allowance;
        } else {

            allowance = 100;
        }
    }

    public void settransportation(double transportation) {
        if (transportation >= 50) {
            transportation = this.transportation;

        } else {

            transportation = 50;
        }

    }

    public double gettransportation() {
        return transportation;

    }

    public double getsum() {
        double sum = transportation + allowance + baiscsalary;
        return sum;
    }

    public String gettransportationstatues() {
        if (transportation <= 200) {
            return "good";

        } else {
            return "very good";
        }

    }

    public char gettotalsalaryevulation() {
        if (getsum() >= 300) {
            return 'A';
        }
        if (getsum() > 200 && getsum() < 300) {
            return 'b';
        }
    

    if(getsum() >=100 && getsum() <200)

    {
return 'c';
    }

    
        else {
return 'd';
    }
}
    public String toString(){
    
    String r="";
    r+="\n name="+name;
    r+="\n salary="+baiscsalary;
    r+="\nallowance ="+allowance;
    r+="\n transpotation="+transportation;
    r+="\n totalsalary="+getsum();
    r+="\n transportation statues="+gettransportationstatues();
    r+="\n evaluation="+gettotalsalaryevulation();
    return r;
    
    }
    
}