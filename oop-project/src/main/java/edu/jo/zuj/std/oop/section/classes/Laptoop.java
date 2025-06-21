/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.std.oop.session.project.classes;

/**
 *
 * @author Vip0
 */
public class Laptoop {

    private String brand;
    private int ram;
    private double price;
    private int numperoflaptop;

    public Laptoop() {
        brand = "dell";
        ram = 8;
        price = 350;
        numperoflaptop++;
    }

    public Laptoop(String brand, int ram, double price, int numperoflaptop) {
        setBrand(brand);
        setRam(ram);
        setPrice(price);
        numperoflaptop++;
    }

    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        switch (ram) {
            case 4:
            case 8:
            case 12:
            case 16:
                this.ram = ram;
                break;
            default:
                this.ram = 8;

        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 350) {
            this.price = price;

        } else {
            this.price = 350;
        }
    }

    public int getNumperoflaptop() {
        return numperoflaptop;
    }
public double getramprice(){
switch(ram)
{ case 4: case 8:
        return ram*5;
    case 12: case 16:
        return ram*10;
    case 32: case 64:
        return ram*15;
        default:
            return 8; 
}   
}
public double gettax(){
return (getramprice()+price)*0.12;
}
public double gettotalprice()
{
return price+getramprice()-gettax();



}
public String tostring(){

String r="r";
r+="brand="+brand;
r+="\n ram="+ram;
r+="\n price="+price;
r+="\n the ram price="+getramprice();
r+="\n the tax="+gettax();
r+="\n the total price="+gettotalprice();
r+="\n the number of lap="+getNumperoflaptop();



return r;
}
public Laptoop getcopy(){

Laptoop temp=new Laptoop();// هان للكوبي ريفرنس جديدهه
temp.brand=this.brand;
temp.price=this.price; /////////////// حفظ
temp.ram=this.ram;
return temp;
}
}
