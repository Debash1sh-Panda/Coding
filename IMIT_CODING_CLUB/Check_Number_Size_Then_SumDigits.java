package IMIT_CODING_CLUB;

import java.util.Scanner;

public class Check_Number_Size_Then_SumDigits {
    
    public static void main(String[] args) {
        
        while(true){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter only 5 digit number : ");
        int num = sc.nextInt();
        int sum = 0, count = 0;

        while (num > 0) {
            sum += num%10;
            num/=10;
            count++;
        }

        if (count == 5) {
            System.out.println("Sum of digit is : "+sum);
        }else{
            System.out.println("Invalid Number! please enter 5 digit number.");
        }
    }
    }   
}
