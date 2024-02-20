package BASIC_PROGRAMME;

import java.util.Scanner;

public class Decimal_To_Binary {

    private static void convertDecimalToBinary(int decNum){

        int temp = decNum;
        int pow = 0;
        int binNum = 0;

        while (decNum > 0) {
            int lastDigit = decNum % 2;
            binNum = binNum + (lastDigit* (int)Math.pow(10, pow));//binNum = binNum + (LD*10 power)

            pow++;
            decNum/=2;
        }
        System.out.println("Binary number of "+ temp +" is :"+ binNum);
    }
    
    public static void main(String[] args) {
        while(true){
        System.out.println("Enter a binary number to convert into decimal :");
        
        Scanner sc = new Scanner(System.in);
        int decNum = sc.nextInt();

        convertDecimalToBinary(decNum);
        }
    }
}
