package IMIT_CODING_CLUB;

import java.util.Scanner;

public class Temprature_Converter_Only_Using_Switch_Case {
    
    public static void main(String[] args) {
        
        while (true) {
        System.out.println("Enter 1: if your TempValue is <= 0 ");
        System.out.println("Enter 2: if your TempValue is >= 0  & <= 10 ");
        System.out.println("Enter 3: if your TempValue is >= 10 & <= 20 ");
        System.out.println("Enter 4: if your TempValue is >= 20 & <= 30 ");
        System.out.println("Enter 5: if your TempValue is >= 30 & <= 40 ");
        System.out.println("Enter 6: if your TempValue is >= 40 ");


        Scanner sc =new Scanner(System.in);
        
        System.out.print("Choice a above number: ");
        int choice = sc.nextInt();

        System.out.print("Enter the temperature in Celsius: ");
        int tempratureValue = sc.nextInt();

        switch (choice) {
            case 1:
            if(tempratureValue<0)
                System.out.println("Freezing weather");
            break;
            case 2:
            if(tempratureValue>= 0  & tempratureValue<= 10)
                System.out.println("Very cold weather");
            break;
            case 3:
            if(tempratureValue>= 10 & tempratureValue<= 20)
                System.out.println("Cold weather");
            break;
            case 4:
            if(tempratureValue>= 20 & tempratureValue<= 30)
                System.out.println("Normal in Temprature");
            break;
            case 5:
            if(tempratureValue>= 30 & tempratureValue<= 40)
                System.out.println("It's Hot");
            break;
            default :
            if(tempratureValue>= 40)
                System.out.println("It's You !(Very Hot)");
        }
        // anotherway();
        }
    }

    public static void anotherway(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        int temperature = sc.nextInt();

        switch (temperature) {
            case 40:
                System.out.println("Its Very Hot");
                break;
            case 39:
            case 38:
            case 37:
            case 36:
            case 35:
            case 34:
            case 33:
            case 32:
            case 31:
            case 30:
                System.out.println("Its Hot");
                break;
            case 29:
            case 28:
            case 27:
            case 26:
            case 25:
            case 24:
            case 23:
            case 22:
            case 21:
            case 20:
                System.out.println("Normal in temp");
                break;
            case 19:
            case 18:
            case 17:
            case 16:
            case 15:
            case 14:
            case 13:
            case 12:
            case 11:
            case 10:
                System.out.println("cold weather");
                break;
            case 9:
            case 8:
            case 7:
            case 6:
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("very cold weather");
                break;
            default:
                System.out.println("Frezing weather");
                break;
        }
    }
}