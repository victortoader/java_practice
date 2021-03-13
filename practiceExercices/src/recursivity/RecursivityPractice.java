package recursivity;

import java.util.Scanner;

public class RecursivityPractice {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("n = ");
        int n = Integer.parseInt(scan.next());
        System.out.println("RecursivityPractice of "+ n +" is: "+ factorial(n));
        System.out.println("Fibonacci sum of "+ n +" is: "+ fibonacci(n));
    }


    public static long factorial(int n) {
        if ((n == 1) || (n ==0)) {
            return 1;
        }  else {
            return n * factorial(n-1);
        }
    }


    public static long fibonacci(int n) {
        if (n<=1) {
            return n;
        } else {
            return fibonacci(n-1)+fibonacci(n-2);
        }

     }

}
