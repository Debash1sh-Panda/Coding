package Striver_DSA;

public class FindHighestAndLowestFrequencyElement {

    public static void main(String[] args) {
        
        int[] arr = {10, 5, 10, 15, 10, 5};
        boolean[] isvisit = new boolean[arr.length];
        int maxFreq = 0, minFreq = arr.length;
        int maxEle = 0, minEle = 0;
        
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
            // System.out.println(arr[i]+" Occure in "+count+" times");
            if (count > maxFreq) {
                maxEle = arr[i];
                maxFreq = count;
            }
            if (count < minFreq) {
                minEle = arr[i];
                minFreq = count;
            }    
        }
        System.out.println("The highest frequency element is: " + maxEle +"frequency is" + maxFreq);
        System.out.println("The lowest frequency element is: " + minEle +"frequency is" + minFreq);
    }
}
