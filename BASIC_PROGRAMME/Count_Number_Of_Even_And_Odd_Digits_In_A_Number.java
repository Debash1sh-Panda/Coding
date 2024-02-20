package BASIC_PROGRAMME;

import java.util.Scanner;

public class Count_Number_Of_Even_And_Odd_Digits_In_A_Number {
    
    public static void main(String[] args) {
        
        while(true){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter number for count Even and Odd digits :");
        int digit = sc.nextInt();

        int evenCount = 0;        
        int oddCount  = 0;

        findEvenOddDigits(digit, evenCount, oddCount);
        }
    }

    private static void findEvenOddDigits(int digit, int evenCount, int oddCount){

            while(digit>0){
            int rem = digit%10;

            if(rem%2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
            digit = digit/10;
        }
        System.out.println("Even digits are :" + evenCount);
        System.out.println("Odd digits are :" + oddCount);

    }      
}
