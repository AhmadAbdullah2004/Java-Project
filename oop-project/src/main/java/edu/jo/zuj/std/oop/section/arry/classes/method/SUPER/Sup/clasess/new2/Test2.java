/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.jo.zuj.std.oop.section.arry.classes.method.SUPER.Sup.clasess.new2;

import edu.jo.zuj.std.oop.section.arry.classes.method.SUPER.Sup.clasess.A;
import edu.jo.zuj.std.oop.section.arry.classes.method.SUPER.Sup.clasess.B;

// جمله الimport مهمه

public class Test2 {
    public static void main(String[] args) {
        A a=new A();
        a.m1();
        a.m2();
        // m3.m4 لا يمكن استدعائها من الA لانها ليست نفس الكلاس ولا الباكيج
    B b=new B();
    b.m2();
    b.m5();//m3 from A
    b.m6();//m2 from super
    b.m7();// (the defaulte visabilities methodes)/// m4 from A
    
    
    
    }
    
}
