package org.example;

public class Hello_World {
    public static void main(String[] args) {
        printHelloWorldNTimes(10);
    }// Example: Print "Hello World" 10 times


    static void printHelloWorldNTimes(int n) { // this function prints the "Hello World" n times

        if (n <= 0)
            return; // if n is equal to 0 or smaller than 0


        System.out.println("Hello World!!!"); // prints hello world


        printHelloWorldNTimes(n - 1); // n is subtracted by 1
    }
}
