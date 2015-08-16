package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MyClass {


    public static void main(String[] args) {


        TestClass tc = new TestClass();


        System.out.println(tc.fakultaet(3));
        System.out.println(TestClass.fibunacci(4));
        System.out.println();


//        int[] liste = {2, 4, 1, 78, 34};
//        TestClass.sortiere(liste);
//        System.out.println(liste[4]+"");

        int[] unsortiert = {4,78,1,34,49,9};
        Arrays.sort(unsortiert);
        for(int i : unsortiert){
            System.out.println(i);
        }

        ArrayList<String>mylist = new ArrayList<>();
        mylist.add("Dennis");
        mylist.add("Sindy");
        mylist.add("Robert");
        mylist.add("Heidrun");
        mylist.add("Andreas");

        Collections.sort(mylist);

        for (String str : mylist){
            System.out.println(str);
        }


        Bier[] biere = {new Bier("Paulaner","Bayern",123),
        new Bier("Berliner","Berlin",239),
        new Bier("Erdinger","Bayern",67)};

        Arrays.sort(biere);
        for (Bier b : biere) {
            System.out.println(b.toString());
        }





    }

}
