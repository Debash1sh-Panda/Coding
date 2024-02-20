package BASIC_PROGRAMME;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Find_Sum_Of_Digits_In_A_Number {
    public int digitFind(int num){
        int sum = 0;
    
        while(num!=0){
            int rem = num%10;
                sum += rem;
                num = num/10;
        }
        return sum;
    }
    public static void main(String[] args) throws IOException{
        while(true){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println();
        System.out.print("Enter a number to find the sum of the Digits : ");
        int digit = Integer.parseInt(br.readLine());

        Find_Sum_Of_Digits_In_A_Number sum = new Find_Sum_Of_Digits_In_A_Number();
       int yourDugitIs = sum.digitFind(digit);
       System.out.println("your sum of digit Is : "+ yourDugitIs);
    }
}
}