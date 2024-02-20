package BASIC_PROGRAMME;

import java.util.Scanner;

public class Table_of_any_Number {
    public static void main(String[] args) {
        while(true){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number to find Table of that number...");
         int num = sc.nextInt();
          
         for (int i=1;i<=10;i++){
            System.out.println(num+" x "+i+":  "+num*i);
         }

    }
}
}
