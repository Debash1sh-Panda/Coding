package BASIC_PROGRAMME;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Find_Even_And_Odd_Number {

    public static void main(String[] args) throws IOException{
        
        while(true){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println();
        System.out.println("Enter a number to check it is Even or Odd :");
        int num = Integer.parseInt(br.readLine());

        findEvenOdd(num);
    }}

    private static void findEvenOdd (int num){

        if(num%2 == 0)
        System.out.println("Your number " + num +" is a Even number");
        else
        System.out.println("Your number " + num +" is a Odd number");
    } 
    
}
