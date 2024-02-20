
package BASIC_PROGRAMME;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Armstrong_Number{
      public static void main(String[] args) throws IOException {
      
      while(true){
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println();
      System.out.println("Enter a number to check it is armstrong or not");
      int num = Integer.parseInt(br.readLine());  
      int rem,sum = 0;
      int temp = num;

      while(num>0){
      rem = num%10;
      sum = (rem*rem*rem)+sum;
      num = num/10;
      }
      if(temp == sum)
      System.out.println("Congrats! your number "+sum+" is a Armstrong Number");
      else
      System.out.println("Damm! your number "+sum+" is not a Armstrong Number");
      }
} }