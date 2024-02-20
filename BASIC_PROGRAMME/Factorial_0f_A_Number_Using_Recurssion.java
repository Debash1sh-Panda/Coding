package BASIC_PROGRAMME;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial_0f_A_Number_Using_Recurssion {

    public static int findFactorial(int n) {
       if(n==0){
       return 1;
       }
       return n*findFactorial(n-1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        while(true){
        System.out.println("Enter a number to find factorial...");
        int num=Integer.parseInt(br.readLine());
        System.out.println(findFactorial(num));
    }
}}
