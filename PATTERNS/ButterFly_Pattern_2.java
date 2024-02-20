package PATTERNS;

import java.util.Scanner;

/*Ex:- 4
*      *
**    **
***  ***
********
***  ***
**    **
*      *
 */

public class ButterFly_Pattern_2{

    public static void butterflyPattern(int row){
/*
*      *
**    **
***  ***
********
 */
        //Print Lines
        for (int i = 1; i <= row; i++) {
            //Print Stars
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            //Print Spaces
            for (int j = 1; j <= 2*(row-i) ; j++) {
                System.out.print(" ");
            }
            //Print Stars
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
/*
***  ***
**    **
*      *
 */
        //Print Lines
        for (int i = row-1; i >= 1; i--) {
            //Print Stars
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            //Print Spaces
            for (int j = 1; j <= 2*(row-i) ; j++) {
                System.out.print(" ");
            }
            //Print Stars
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        butterflyPattern(row);
    }
 }
