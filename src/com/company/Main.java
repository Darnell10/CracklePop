package com.company;

public class Main {

    public static void main(String[] args) {

        int number = 100;

        for (int i = number; i >= 0; i--) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("CracklePop");
            } else if (i % 3 == 0) {
                System.out.println("Crackle");
            } else if (i % 5 == 0) {
                System.out.println("Pop");
            } else {
                System.out.println(i);
            }
        }
    }
}
