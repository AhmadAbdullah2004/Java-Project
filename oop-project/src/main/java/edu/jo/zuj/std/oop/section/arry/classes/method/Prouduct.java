/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jo.zuj.std.oop.section.arry.classes.method;

/**
 *
 * @author Vip0
 */
public class Prouduct {
    private String name;
    private String category;
    private double price;
    private int quantityinstock;

    public Prouduct() {
        name ="not defin";
        price =1;
        
    }

    public Prouduct(String name, String category, double price, int quantityinstock) {
        setName(name);
        setCategory(category);
        setPrice(price);
        setQuantityinstock(quantityinstock);}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name!= null)
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price>=1)
        this.price = price;
        else 
          this.price=1;
    }

    public int getQuantityinstock() {
        return quantityinstock;
    }

    public void setQuantityinstock(int quantityinstock) {
        this.quantityinstock = quantityinstock;
    }
    
    
      public  double CalculatStockValu()
{
    
return (price*quantityinstock);
}
      public  void  sellproduct( int sellproduct){
          if(quantityinstock>CalculatStockValu())
              System.out.println("Insufficient stock");
          else
              System.out.println(quantityinstock-CalculatStockValu());
                } 
      
      public String toString(){
      String r="";
      r+="\n the name="+name;
      r+="\n the category="+category;
      r+="\n the price="+price;
      r+="\n the quantity="+quantityinstock;
      r+="\n the sum of stock value="+CalculatStockValu();
     
   return r;
      }
      
}
