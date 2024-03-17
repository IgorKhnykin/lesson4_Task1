package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        int b = 5000;
        int c = 123;
        int min = Math.min(a, Math.min(b,c));
        int max = Math.max(a, Math.max(b,c));
        int d = a + b + c - min - max;


    }
}