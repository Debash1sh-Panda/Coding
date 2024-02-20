package BASIC_PROGRAMME;

import java.util.Scanner;

public class Fibonacci_Series{

    public static void main(String[] args) {
        
        while(true){
        Scanner sc = new Scanner(System.in);
        System.out.println();        
        System.out.println("Enter a number to find Fibonacci Series...");
        int number = sc.nextInt();
        
        findfibonaccinumber(number);
        System.out.println("        "+number +"th fibonacci number is "+findFibonacciUsingRecurssion(number));
         }
    }

    private static void findfibonaccinumber(int number){

         int n1=0, n2=1, sum=0;

        System.out.print(n1+","+n2);
        for(int i = 2; i<number; i++){
            sum = n1 + n2;
            System.out.print(","+sum);
            n1=n2;
            n2=sum;
    }   }

    private static int findFibonacciUsingRecurssion(int number){

        if(number == 0 || number == 1 ){//OR (number <= 1) OR (number < 2)
            return number;
         }
         return findFibonacciUsingRecurssion(number-1) + findFibonacciUsingRecurssion(number-2);
    }
}

