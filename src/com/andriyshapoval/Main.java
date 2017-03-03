package com.andriyshapoval;

       /*write a method called
        powArray that takes a double array, a , and returns a new array that contains the
        elements of a squared. Generalize it to take a second argument and raise the ele‐
        ments of a to the given power.

        write a method
        called histogram that takes an int array of scores from 0 to (but not including)
        100, and returns a histogram of 100 counters. Generalize it to take the number of
        counters as an argument.*/

public class Main {

    public static double[] powArray(double[]a, int n){
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.pow(a[i], n);
            System.out.println(a[i]);
        }
        return a;
    }

    public static int[] histogram (int [] scores, int k) {
        int[] counts = new int[k];
        for (int i = 0; i < scores.length - 1; i++) {
            counts[i]++;
        }
        return counts;
    }

    public static void main(String[] args) {
        double [] someArr = {0.0, 1.0, 2.0, 3.0, 4.0};
        powArray(someArr, 3);
    }
}
