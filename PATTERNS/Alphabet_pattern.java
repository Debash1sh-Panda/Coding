package PATTERNS;

import java.util.Scanner;

/**
 * Alphabet_pattern
 */
public class Alphabet_pattern {

    public static void alphabetPattern(int size){

        // print lines
        for (int i = 0; i < size; i++) {
            //Print values
             char val = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(val);
                val++;
            }
            System.out.println();
        } 

    }

    public static void reverseAlphabetPattern(int size){
    
        //print lines
        for (int i = size; i > 0; i--) {
            //Print values
             char val = 'A';
            for (int j = 0; j < i; j++) {
                System.out.print(val);
                val++;
            }
            System.out.println();
        } 
        
    }

    public static void singleLineAlphabetPattern(int size){

        char val = 'A';
        //print lines
        for (int i = 0; i < size; i++) {
            //Print values
            
            for (int j = 0; j <= i; j++) {
                System.out.print(val);
                
            }
            val++;
            System.out.println();
        } 

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of your pattern : ");
        int size = sc.nextInt();
        // alphabetPattern(size)
        // reverseAlphabetPattern(size);
        // singleLineAlphabetPattern(size);

    }
}

