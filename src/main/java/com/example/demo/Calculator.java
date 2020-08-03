package com.example.demo;

public class Calculator {
    private int a;
    private int b;
    private int result;

    public void setResult(int result) {
        this.result = result;
    }

    public int getResult() {
        return result;
    }

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    //we will see if we want to use members or input variables later
    public int add(int a, int b) {
        return a+b;
    }

    public int substract(int a, int b) {
        return a-b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }

    public int divide(int a, int b) {
        if (b!=0)
            return a/b;
        else
            return -1;
    }

    public boolean isEven(int a) {
        return (a%2 == 0);
    }

    public boolean isOdd(int a){
        return (a%2 != 0);
    }
}
