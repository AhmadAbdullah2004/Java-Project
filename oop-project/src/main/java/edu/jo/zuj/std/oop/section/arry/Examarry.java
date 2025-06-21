
package edu.std.oop.session.project.arry;


public class Examarry {

    public static void main(String[] args) {
        double[] myList = new double[10];
        myList[2] = myList[0] + myList[1];
        myList[0] = 20;
        myList[1] = 20;
        double sum = myList[0] + myList[1];
        System.out.println("sum=" + sum);

    }

}
