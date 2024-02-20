package IMIT_CODING_CLUB;

import java.util.Scanner;

public class Find_Max_Number_Of_Character_In_A_String {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Input the string: ");
        String stringvalue = scanner.nextLine();

        // Convert the string to lowercase to make it case-insensitive
        stringvalue = stringvalue.toLowerCase();

        // Find the maximum character frequency
        char maxChar = ' ';
        int maxFrequency = 0;

        for (int i = 0; i < stringvalue.length(); i++) {
            char currentChar = stringvalue.charAt(i);
            int currentFrequency = 0;

            for (int j = 0; j < stringvalue.length(); j++) {
                if (currentChar == stringvalue.charAt(j)) {
                    currentFrequency++;
                }
            }

            if (currentFrequency > maxFrequency) {
                maxFrequency = currentFrequency;
                maxChar = currentChar;
            }
        }

        // Display the result
        System.out.println("The Highest frequency of character '" + maxChar + "' appears number of times: " + maxFrequency);

    }
}