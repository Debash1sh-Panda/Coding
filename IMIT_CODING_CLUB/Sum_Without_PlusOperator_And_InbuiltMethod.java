package  IMIT_CODING_CLUB;

import java.util.Scanner;

public class Sum_Without_PlusOperator_And_InbuiltMethod{

    public static void sumTwoNumberWithoutUsingPlusOperatorAndInbuiltMethode(int Fnum, int Snum){

//This below syntax is used in case of both positive and two negative value cases;
        //  if (Fnum < 0 && Snum < 0) {
        //         System.out.println("Enter always a positive number or two negative number");
        //         System.exit(0);
        //     }
            
        // while (Snum > 0) {
           
        //     int hold = Fnum & Snum;

        //     Fnum = Fnum ^ Snum;

        //     Snum = hold << 1;
        // }

//OR
//This below syntax is used in case of both negative and positive value cases;
        int sum = Fnum-((-1)*Snum);
        System.out.println(sum);
    }
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        int Fnum = Math.abs(sc.nextInt());
        int Snum = Math.abs(sc.nextInt());
        // int Fnum = sc.nextInt();
        // int Snum = sc.nextInt();

        sumTwoNumberWithoutUsingPlusOperatorAndInbuiltMethode(Fnum, Snum);
    }
}