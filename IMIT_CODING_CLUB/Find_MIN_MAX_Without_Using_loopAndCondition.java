package IMIT_CODING_CLUB;

import java.util.Scanner;

public class Find_MIN_MAX_Without_Using_loopAndCondition {
    
    public static void findMinMax(int a, int b){

        int max =((a+b) + Math.abs(a-b))/2;
        int min = max - Math.abs(a-b); // Also use this logic ((a+b) - Math.abs(a-b))/2;

        System.out.println("Max is :"+ max);
        System.out.println("Min is :"+ min);

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int firstValue = sc.nextInt();
        int secondValue = sc.nextInt();


        findMinMax(firstValue, secondValue);
    }
}
