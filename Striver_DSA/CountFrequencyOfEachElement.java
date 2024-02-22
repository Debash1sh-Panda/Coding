package Striver_DSA;


public class CountFrequencyOfEachElement {

    public static void main(String[] args) {
        
        int[] arr = {10, 5, 10, 15, 10, 5};
        boolean[] isvisit = new boolean[arr.length];
        
        for (int i = 0; i < arr.length; i++) {

            
            if (isvisit[i] == true) {
                continue;
            }

            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                 if (arr[i] == arr[j]) {
                    isvisit[j] = true;
                    count++;
                 }
            }
            System.out.println(arr[i]+" Occure in "+count+" times");
        }
    }
}