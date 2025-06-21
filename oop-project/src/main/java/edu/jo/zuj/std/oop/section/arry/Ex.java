
package edu.std.oop.session.project.arry;

import java.util.Random;

public class Ex {
    public static void main(String[] args) {
           int[] array = new int[1000];

        // Step 2: Fill the array with random numbers
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);  // Generates a random number between 0 and 999
        }

        // Step 3: Print the array
        System.out.println("Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Step 4: Find the max, min, and average
        int max = array[0];
        int min = array[0];
        int sum = 0;

        for (int num : array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            sum += num;
        }

        double average = (double) sum / array.length;

        // Step 5: Print the results
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        System.out.println("Average value: " + average);


        
    }}

