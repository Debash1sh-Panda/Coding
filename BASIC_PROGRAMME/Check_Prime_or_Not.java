package BASIC_PROGRAMME;

import java.util.Scanner;

public class Check_Prime_or_Not{

    public static boolean anotherWayToFind(int num) {
//BruteForce approach      
        for(int i = 2; i <= num-1; i++){
            if(num % 2 == 0){
                return false;
            }
        }
        return true;
    }
//Optimised way 
    public static boolean anotherWayUsingMathSQRT(int num) {
        for(int i = 0; i<=Math.sqrt(num); i++){
            if (num % 2 == 0) {
                return false;
            }
        }
        return true;
    }

// Find in Range

public static void anotherWayToFindInRange(int range){
    
    for(int i = 2; i <= range; i++){
        if (anotherWayUsingMathSQRT(i)) {
            System.out.print(i+" ");
        }
    }
}
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  while(true){
  System.out.println();
  System.out.println("Enetr a number to chek prime or not...");
  int num=sc.nextInt();

//Logical approach
  int count =0;
  for (int i=1; i<=num; i++){
    if(num%i==0){
        count++;
    }}
        if(count==2)
            System.out.println("Congrats! Your number "+num+" is prime ");
        else
            System.out.println("Damm! Your number "+num+" is not prime ");
    

System.out.println(anotherWayToFind(num));
System.out.println(anotherWayUsingMathSQRT(num));

System.out.println("Enter number to find value in a range");
int range = sc.nextInt();
anotherWayToFindInRange(range);

}
}}