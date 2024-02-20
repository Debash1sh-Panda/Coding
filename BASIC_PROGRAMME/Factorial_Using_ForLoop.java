package BASIC_PROGRAMME;

import java.util.Scanner;

public class Factorial_Using_ForLoop {
    public static void main(String[] args) {
        while(true){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter a number to know the factorial of it");
        int num= sc.nextInt();

        int fact=1;
        for(int i=1;i<=num;i++){
        fact=fact*i;
        }
        System.out.println("Factorial of your number is :"+fact);
        }
}}
