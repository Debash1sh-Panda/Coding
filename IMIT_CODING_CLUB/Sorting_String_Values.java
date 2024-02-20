package IMIT_CODING_CLUB;

import java.util.Scanner;


public class Sorting_String_Values {

            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
        
                System.out.print("Enter Size of the Strings: ");
                int size = sc.nextInt();
                sc.nextLine();
        
                String[] value = new String[size];

                System.out.println("Enter values in string: ");
                for (int i = 0; i < value.length; i++) {
                    value[i] = sc.nextLine();
                }

                //Return Value in compareTo():
                //Negative integer: Indicates that the current object is less than the specified object (o).
                //Zero: Indicates that the current object is equal to the specified object (o).
                //Positive integer: Indicates that the current object is greater than the specified object (o).
                
                for (int i = 0; i < value.length-1; i++) {
                    for (int j = 0; j < value.length-1-i; j++) {
                        if (value[j].compareTo(value[j + 1]) > 0) {
                            String temp = value[j];
                            value[j] = value[j + 1];
                            value[j + 1] = temp;
                        }
                    }
                }
        
                System.out.println("After sorting values are: ");
                for (String str : value) {
                    System.out.println(str);
                }
            }
        }