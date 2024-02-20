package org.example;

public class task_03 {
    public static void main(String[] args) {
        int n = 10; // calculating the fibonacci number
        int result = fib(n); // the result is stored in the result variable
        System.out.println("Fibonacci number for n = " + n + ": " + result);
    }


    static int fib(int n) { // the function itself calculates the fibonacci number recursively,an input integer is taken in

        if (n <= 0) // if n is smaller or equal to 0, the fibonacci number is equal to zero
            return 0;
        else if (n == 1) //if n is equal to 1, then it returns 1
            return 1;
            // Recursive case
        else
            return fib(n - 1) + fib(n - 2); //if n is bigger than one, it recursively calls n-1 and n-2

        //at the end the result is of two recursive calls
    }
}
/* Time Complexity:
there is one step in  n<= 0 --1
One step in n==1 --1
two recursive calls  fib (n-1) + fib (n-2)
n decreases by one step
the time complexity of this algorithm is O(2^n)
X(n) = X(n-1) + X(n-2) +1
+1 shows function call at each level
function call grows exponentially


 */
