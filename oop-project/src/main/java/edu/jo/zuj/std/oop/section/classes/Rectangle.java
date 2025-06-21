
package edu.std.oop.session.project.classes;

public class Rectangle {
private double length;
private double width;
public String color;
public boolean border;

    public Rectangle() {
        length =0.1;
        width=0.1;
        color="Not defined";
        border= false;        
    }

    public Rectangle(double length, double width, String color, boolean border) {
        setBorder(border);
        setColor(color);
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length>0.1)
        this.length = length;
        else
            this.length=0.1;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width>0.1)
        this.width = width;
        else
            this.width=0.1;
    }

    public String getColor() {
        
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isBorder() {
        return border;
    }

    public void setBorder(boolean border) {
        this.border = border;
    }
    
public double getarea(){

return (length*width);

}
public String toString(){
String r="";
r+="/n length="+length;
r+="/n width="+width;
r+="/n color="+color;
r+="/n border="+border;
r+="/n the area="+getarea();
return r;
}
}
