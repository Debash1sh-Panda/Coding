package BASIC_PROGRAMME;

import java.util.Scanner;

public class Binary_To_Decimal {

    private static void convertBinaryToDecimal(int binNum){

        int temp = binNum;
        int pow = 0;
        int decimal = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decimal = decimal + (lastDigit*(int)Math.pow(2,pow));//decimal=decimal+(LD*2power pow)
            binNum/=10;
            pow++;
        }
        System.out.println("Decimal number of "+ temp +" is :"+ decimal);
    }


    public static void main(String[] args) {
        while (true) {
        System.out.println("Enter a Binary number :");
        Scanner sc = new Scanner(System.in);
        int binNum = sc.nextInt(); 

        convertBinaryToDecimal(binNum);
        }
       
    }
    
}
