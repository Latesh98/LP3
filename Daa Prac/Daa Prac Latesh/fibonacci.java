public class fibonacci {
    static int fib(int n)
    {
        int a = 0, b = 1, c,sum=0;
        if (n == 0)
            System.out.println("Please Enter Positive Number");
        for (int i = 0; i <n; i++) {
            System.out.println(a);   
            sum = a+ sum;               
            c = a + b;
            a = b;
            b = c;
          
        }

        System.out.println("Your total Value is "+sum);
        return b;
    }
 
    public static void main(String args[])
    {
        
        fib(6);
    }
};




/*

recursion Method 

import java.io.*;
class fibonacci {
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
 
    public static void main(String args[])
    {
        int n = 9;
        System.out.println(
            n + "th Fibonacci Number: " + fib(n));
    }
} */