package BASIC_PROGRAMME;

import java.util.Scanner;

public class Number_Of_Digits_In_A_Number{
    public static void main(String[] args) {
        
        while(true){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int digit = sc.nextInt();

        Number_Of_Digits_In_A_Number number = new Number_Of_Digits_In_A_Number();
        number.findDigit(digit);
        }
    }


        private void findDigit(int digit){

            int count = 0;
        while (digit>0){
            int rem = digit%10;
            count++;
            digit = digit/10;
        }
        System.out.println("Number of digits are : "+ count);
        
        
    }
}