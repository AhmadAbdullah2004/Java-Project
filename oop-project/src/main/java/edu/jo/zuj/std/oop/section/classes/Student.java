/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.std.oop.session.project.classes;

/**
 *
 * @author Vip0
 */
public class Student {

    String name;
    private int grade1;
    private int grade2;
    private int grade3;

    public Student()//   هاي الساين تاسك تستخدم لملءالارقاموالكلامت الافتراضيه      (  .تطبعا جرب)         
    {
        name = "unkwone";
        grade1 = 50;
        grade2 = 50;
        grade3 = 50;

    }

    public Student(String name, int grade1, int grade2, int grade3) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public void setname(String name) {// void هان معناها انها تستقبل ما بترجع 

        this.name = name;      /// انو name تبعت الobject الحالي يساوي الname اللي جاي من برا 

    }

    public String getname() { // معى الاقواس الفارغه على انها لا تستقبل شء من برا ,وبنكنب string عشان الاسم ..........ودايما بجميله الترجيع نضع return
        return name;
    }

    public void setgrade1(int grade1) {
        if (grade1 >= 0 && grade1 <= 100) {
            this.grade1 = grade1;
        } else {
            grade1 = 50;
        }
    }

    public int getgrade() {
        return grade1;

    }

    public void setgrade2(int grade2) {
        if (grade2 >= 0 && grade2 <= 100) {
            this.grade2 = grade2;
        } else {
            grade2 = 50;
        }
    }

    public int getgrade2() {
        return grade2;

    }

    public void setgrade3(int grade3) {
        if (grade3 >= 0 && grade3 <= 100) {
            this.grade3 = grade3;
        } else {
            grade3 = 50;
        }
    }

    public int getgrade3() {
        return grade3;

    }

    public double getavg() {   /////// نستخدم get هنا مع الdata taype لانها لا تستقبل بل عمليه داخليه :)
        return ((grade1 + grade2 + grade3) / 3.0);

    }

    public String getstaut() {
        if (getavg() <= 50) {
            return "fail";
        } else {
            return "pass";
        }

    }

    public char getevaulation() {
        if (getavg() <= 49) {
            return 'f';
        }
        if (getavg() >= 60 && getavg() < 75) {
            return 'c';
        }
        if (getavg() >= 75 && getavg() <= 83) {
            return 'b';
        } else {
            return 'a';
        }
    }

    public String toString() {
        String r = "";
        r += "name:" + name;
        r += "\ngrade1:" + grade1;
        r += "\ngrade2:" + grade2;
        r += "\ngrade3:" + grade3;   /////////        هنا شرح to string (احفظها احسن)
        r+="\navg:"+getavg();
        r+="\nstaute:"+getstaut();
        r+="\nevulotion:"+getevaulation();
        return r;//https://www.youtube.com/watch?v=bS55yjyA7B0&t=341s
        

    }

}
