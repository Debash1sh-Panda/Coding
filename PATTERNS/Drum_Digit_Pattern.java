package PATTERNS;

import java.util.Scanner;

/*Ex:- 5
1 2 3 4 5 
 2 3 4 5
  3 4 5
   4 5
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5
 */

public class Drum_Digit_Pattern{

    public static void drumDidgitPattern(int size){

/*
1 2 3 4 5 
 2 3 4 5
  3 4 5
   4 5
    5
 */
        for (int i = 1; i <= size; i++) {
            //Print Spaces
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }
            //Print Digits
            for (int j = i; j <= size; j++) {
                System.out.print(j+" ");
            }
        System.out.println();
        }
/*
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5
 */
        for (int i = size-1; i >= 1; i--) {
            //Print Spaces
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }
            //Print Digits
            for (int j = i; j <= size; j++) {
                System.out.print(j+" ");
            }
        System.out.println();
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        drumDidgitPattern(size);
    }
}