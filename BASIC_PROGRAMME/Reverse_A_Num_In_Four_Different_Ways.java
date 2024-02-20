package BASIC_PROGRAMME;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Reverse_A_Num_In_Four_Different_Ways {

    private static void firstNormalLogic(int n, int sum){

      while(n > 0)
     {
       int  rem = n % 10 ;
       sum = (sum * 10) + rem ;
       n /= 10;
     }
     System.out.println(sum);

    }

    private static void secondModifiedLogic(int n, int sum){

      while(n != 0){
        sum = (sum * 10) + n % 10;
        n /= 10;
      }
      System.out.println(sum);

    }

    private static void thirdLogicUsingStringBufferClass(int n){

      StringBuffer strbuf = new StringBuffer(String.valueOf(n));
      StringBuffer rev = strbuf.reverse();
      System.out.println(rev);

    }

    private static void fourthLogicUsingStringBuilderClass(int n){

      StringBuilder strbud = new StringBuilder(String.valueOf(n));
      StringBuilder rev = strbud.reverse();
      System.out.println(rev);

    }

    private static void fifthLogicUsingStringBuilderClass(int n){

//String str = String.valueOf(n); these both are use to convert integer => string
    String str = Integer.toString(n);
    System.out.println(str);
     String emp = "";
     for(int i=str.length()-1; i>=0; i--){
       emp = emp + str.charAt(i);
     }
     System.out.println(emp);
    }
    
    // Main Method
    public static void main(String[] args) {
      while(true){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();

    int sum = 0 ;
    
    firstNormalLogic(n,sum);
    secondModifiedLogic(n, sum);
    thirdLogicUsingStringBufferClass(n);
    fourthLogicUsingStringBuilderClass(n);
    fifthLogicUsingStringBuilderClass(n);
    }  
}
}  
