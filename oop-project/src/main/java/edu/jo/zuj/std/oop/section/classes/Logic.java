/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.std.oop.session.project.classes;

import java.util.Scanner;

/**
 *
 * @author Vip0
 */
public class Logic {
    
        static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("How many numbers do you want to convert : ");
        int numbers = input.nextInt();
        int arr[] = new int[numbers];
        FillArray(arr);
        printNumbers(arr);
        numberConversion(arr);
    }

    public static void FillArray(int arr[]) {
        System.out.println("----fill Array----");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" arr [" + (i + 1) + "] : ");
            arr[i] = input.nextInt();
        }
        System.out.println("---------------------------------------");

    }

    public static void printNumbers(int arr[]) {
        System.out.println("----print Numbers before conversion----");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" Number : " + (i + 1) + " before conversion : " + arr[i]);

        }
        System.out.println("---------------------------------------");
    }

    public static void numberConversion(int arr[]) {
        System.out.println("----Print numbers after conversion----");
        for (int i = 0; i < arr.length; i++) {
            int invertedNumber = arr[i] * -1;
            System.out.println(" Number : " + (i + 1) + " after conversion : " + invertedNumber);

        }
    }

}
    
    

