package BASIC_PROGRAMME;

import java.util.Scanner;

public class Swap_Number_In_Five_Different_Ways{

    
    private void firstSimpleLogic(int x, int y){

    System.out.println("Before Swap");
    System.out.println("X = "+x);
    System.out.println("Y = "+y);

    int temp = x;
    x = y;
    y = temp;

    System.out.println("After Swap");
    System.out.println("X = "+x);
    System.out.println("Y = "+y);
    
    
}

private void secondLogicUsingPlusAndMinus(int x, int y){

    System.out.println("Before Swap");
    System.out.println("X = "+x);
    System.out.println("Y = "+y);

    x = x + y;
    y = x - y;
    x = x - y;

    System.out.println("After Swap");
    System.out.println("X = "+x);
    System.out.println("Y = "+y);

}    

private void thirdLogicUsingMultiplicationAndDivision(int x, int y){

    System.out.println("Before Swap");
    System.out.println("X = "+x);
    System.out.println("Y = "+y);
    try{
    x = x * y;
    y = x / y;
    x = x / y;
    }catch( ArithmeticException e){
        System.out.println("Exception in thread \"main\" java.lang.ArithmeticException: / by zero");
    }
    System.out.println("After Swap");
    System.out.println("X = "+x);
    System.out.println("Y = "+y);

}

private void fourthLogicUsingBitwiseXOR(int x, int y){

    System.out.println("Before Swap");
    System.out.println("X = "+x);
    System.out.println("Y = "+y);

    x = x ^ y;
    y = x ^ y;
    x = x ^ y;

    System.out.println("After Swap");
    System.out.println("X = "+x);
    System.out.println("Y = "+y);

}

private void fifthLogicUsingSingleStatement(int x, int y){

    System.out.println("Before Swap");
    System.out.println("X = "+x);
    System.out.println("Y = "+y);
    
    y = x + y - (x = y);

    System.out.println("After Swap");
    System.out.println("X = "+x);
    System.out.println("Y = "+y);

}

// Main Method
public static void main(String[] args){
    while(true){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your First number");
    int X = sc.nextInt();
    System.out.println("Enter your Second number");
    int Y = sc.nextInt();
    

    Swap_Number_In_Five_Different_Ways swap = new Swap_Number_In_Five_Different_Ways();
    swap.firstSimpleLogic(X,Y);
    swap.secondLogicUsingPlusAndMinus(X, Y);
    swap.thirdLogicUsingMultiplicationAndDivision(X,Y);
    swap.fourthLogicUsingBitwiseXOR(X,Y);
    swap.fifthLogicUsingSingleStatement(X,Y);
  }
 }
}