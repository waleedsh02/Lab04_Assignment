package org.example;

public class Multiples_of_Seven {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 30; // in the main you two input integers that define ranges in which you want find the sum of multiples of seven
        int sum = Multiples_of_Seven(n1, n2);
        System.out.println("The sum of multiples of 7 is: " + n1 + " and " + n2 + " : " + sum);
    }

    // Function to return the sum of multiples of 7 between n1 and n2 using recursion
    static int Multiples_of_Seven(int n1, int n2) {

        if (n1 > n2) //  if n1 is bigger than n2 than return 0
            return 0;

        else if (n1 % 7 == 0) // if n1 is a multiple of 7, then add n1 to the sum as n1 + 7
            return n1 + Multiples_of_Seven(n1 + 7, n2);

        else
            return Multiples_of_Seven(n1 + 1, n2); // if n1 is not a multiple of 7 then do n1 + 1


    }
}
