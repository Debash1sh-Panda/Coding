package BASIC_PROGRAMME;
import java.util.Scanner;

public class Palindrome_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
        System.out.println();
        System.out.println("Enter a number to check palindrome");
        int n = sc.nextInt();
        
        int rem,temp,sum=0;
        temp=n;
        while(n>0){
            rem=n%10;
            sum=sum*10+rem;
            n/=10;
        }
        if(sum==temp){
            System.out.println("congrats! your number "+temp+" is a palindrome");
        }else{
            System.out.println("Sorry! your number "+temp+" is not a palindrome");
        }
    }
}
}
