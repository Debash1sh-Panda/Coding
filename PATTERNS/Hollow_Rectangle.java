package PATTERNS;

import java.util.Scanner;

/* Ex:-5 5
*****
*   *
*   *
*   *
*****
*/

public class Hollow_Rectangle{

    public static void findHollowRectangle(int r, int c){

        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
                if (i==1||i==r||j==1||j==c) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       int row = sc.nextInt();       
       int column = sc.nextInt();

       findHollowRectangle(row,column);
    }
}