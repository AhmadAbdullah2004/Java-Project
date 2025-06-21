
package edu.std.oop.session.project.classes;
public class Computer {
   String brand;
   private String Processor;
   private int Ram;
   
   
   public Computer(){
   brand="not specified";
   Processor= "Intel";
   Ram= 4;
   }
  
public Computer(String brand,String Processor,int Ram)   
   
{
   brand=this.brand;
   Processor=this.Processor;
   Ram=this.Ram;
   
   }
public void setbrand(String brand){
 this.brand=brand;   
    }

public String getbrand(){
    return brand;
}
public void setProcessor(String Processor){
    this.Processor=Processor;
}
public String getProcessor(){
return Processor;

}
public void setram(int Ram){

Ram=this.Ram;    
}
public int getram(){
           if(Ram>+4)
           {return Ram;}   
           else{ 
               return 4;}
}
public String toString(){

String r="";
r+="\n brand" +" "+brand;
r+="\n processor"+ " "  +Processor;
r+="\n ram" +" "+   +Ram;



return r;

}




}