package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        countDown(8); // countdown starts from 8
    }

    static void countDown(int num) {
        if (num == 0)
            System.out.println("Blastoff!"); // if number is equal to 0 print Blastoff!
        else {
            if (num % 2 == 0 ){ // check to see if num is even
                System.out.println(num);
            }
            countDown(num-1); // decrements the number by 1
        }
    }
}

// If I first run the code with input as 2, the output is as follows;
//...
//...
//Blastoff!

// the decrement is 1 - the number until it reaches 0
// n = num
// each operation counts as 1 step
// the time complexity is linear O(n)