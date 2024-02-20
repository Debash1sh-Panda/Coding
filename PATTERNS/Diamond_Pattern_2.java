package PATTERNS;

import java.util.Scanner;

public class Diamond_Pattern_2 {
    
/*Ex:- 5
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 */

    public static void diamondPattern2(int row){

/*
    *
   ***
  *****
 *******
*********
*/
        //Print Lines
        for (int i = 1; i <= row; i++) {
            //Print Spaces
            for (int j = 1; j <= row-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
/*Just Reverse the upper one
 *******
  *****
   ***
    *
 */
        for (int i = row-1; i >= 1; i--) {
            //Print Spaces
            for (int j = 1; j <= row-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i)-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();


        diamondPattern2(row);
    }
}
