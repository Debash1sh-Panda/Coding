package PATTERNS;

import java.util.Scanner;

public class Diamond_Pattern_1 {
    
/*Ex:- 5
    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *
 */

    public static void diamondPattern(int row){

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
*********
 *******
  *****
   ***
    *
 */
        for (int i = row; i >= 1; i--) {
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


        diamondPattern(row);
    }
}
