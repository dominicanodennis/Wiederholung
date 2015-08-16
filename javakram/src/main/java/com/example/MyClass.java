package com.example;

import java.util.Stack;

public class MyClass {

    double number;

    void doSomething(){
        this.number =   23;
        System.out.println(number+"");
        System.out.println(number+" "+number);
        System.out.println("hi baby");
    }
    public String toString(){

        int sekProMinute =60;
        int sekProStunde = sekProMinute*60;
        int sekProTag = sekProStunde* 24;
        int sekProMoche = sekProTag *7;
        int sekProMonat = sekProTag*30;
        long sekproJahr = sekProMonat *12;
        long sekProJahrhundert = sekproJahr *100;


        String ausgabe =
        "eine Minute hat = "+ sekProMinute+ " Sekunden"+"\n"+
        "eine Stunde hat = "+ sekProStunde+ " Sekunden"+ "\n"+
        "ein Tag hat = "+ sekProTag+ " Sekunden"+"\n"+
       "eine Woche hat = "+ sekProMoche+ " Sekunden"+"\n"+
        "ein Monat hat = " + sekProMonat+ " Sekunden"+"\n"+
        "ein Jahr hat = " + sekproJahr+ " Sekunden"+"\n"+
        "ein Jahrhundert hat = "+ sekProJahrhundert+ " Sekunden";

        System.out.println(ausgabe+"");
        return ausgabe;
    }





}
