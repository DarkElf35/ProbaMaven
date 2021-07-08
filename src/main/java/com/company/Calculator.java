package com.company;

import java.io.IOException;

public class Calculator {
    public int a;
    public int b;
    public int c;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public  int getA(){
        return c;
    }
    public void setA(int c){
        this.c = c;
    }
    public Calculator(){}
    public  int plus(int a, int b) {

        int sum = a+b;
        return (sum);
    }

    public static int minus(int a, int b) {
        int difference = a-b;
        return (difference);
    }

    public static int multiply(int a, int b) {
        int multi = a*b;
        return (multi);
    }

    public  double division(double a, double b) throws IOException {

        if(b == 0)
        {
            throw new IOException("Ошибка, деление на ноль");

        }


        return(a/b);

    }
}
