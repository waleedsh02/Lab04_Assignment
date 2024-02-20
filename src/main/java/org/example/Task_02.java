package org.example;

public class Task_02 {
    public class Main {
        public static void main(String[] args) {
            // Test the gcd method with sample values
            int result = gcd(18, 12);
            System.out.println("The GCD is as follows: " + result);
        }

        // Method to calculate the greatest common divisor (GCD)
        static int gcd(int x, int y) {
            if (x == y) // if x equals y, x is now the GCD
                return x;
            else if (x > y) { //if x is bigger than y, recurse
                return gcd(x - y, y);
            } else { // if y  is greater than x, recurse
                return gcd(x, y - x);

            }


            // Recursive call as x is now equal to y and y is now the remainder
            // the output of the code is 2 for now
            // the input and output can be changed accordingly
            //the program will run until the value zero is reached by continuing dividing until the desired result is achieved

            // after modifying gcd, we can now use subtraction instead of division to find to gcd
            // to find the gcd, we recursively subtract the smaller integer until it is equal (which is gcd)
            //


        }


    }
