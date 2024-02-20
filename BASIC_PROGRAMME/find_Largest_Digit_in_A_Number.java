package BASIC_PROGRAMME;

import java.util.Scanner;

public class find_Largest_Digit_in_A_Number {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();

        //Approach-1
        findLargestDigitusingMIN_MAX(digit);
        //Approach-2
        findInLogicalWay(digit);

    }

    private static void findLargestDigitusingMIN_MAX(int digit){

        int largest = 0;
        int smallest = 9;

        while (digit > 0) {
            
            int rem = digit % 10;

            largest = Math.max(rem, largest);
            smallest = Math.min(rem, smallest);
            
            digit /= 10;
        }
        System.out.println(smallest+" "+largest);
    }



        private static void findInLogicalWay(int digit){

            int max = 0;
            int min = 9;

        while (digit > 0) {
            int reminder = digit%10;
            if(reminder>max){
                max=reminder;
            }
            if(reminder<min){
                min=reminder;
            }
            digit /= 10;
        }
        System.out.println(max);        
        System.out.println(min);
    }

}

