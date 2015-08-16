package com.example;

/**
 * Created by dennis on 16.06.15.
 */
public class TestClass {
    int num = 1500;
    int num2 = 240;
    double a = 10;
    double b = 2;
    int[] array = {1, 2, 3, 4, 5};

    public int calc() {
        return num2 + num;
    }

    public double calcDouble() {
        double erg = Math.pow(a, b);
        return erg;
    }

    public void iteriere() {

        for (int i = 0; i < this.array.length; i++) {

            System.out.println(array[2] + " " + array[3]);
        }
    }

    public int fakultaet(int n) {
        if (n <= 1) {
            return 1;

        } else {
            return n * fakultaet(n - 1);

        }
    }
    public static long fibunacci(int n) {
        if(n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibunacci(n - 1) + fibunacci(n - 2); //der rekursive Aufruf
        }
    }
    public static void sortiere(int[] x) {
        boolean unsortiert=true;
        int temp;

        while (unsortiert){
            unsortiert = false;
            for (int i=0; i < x.length-1; i++)
                if (x[i] > x[i+1]) {
                    temp       = x[i];
                    x[i]       = x[i+1];
                    x[i+1]     = temp;
                    unsortiert = true;
                }
        }
    }


}
