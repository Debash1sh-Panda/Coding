package ARRAY_PROGRAMME;

import java.util.Scanner;

public class Find_Index_Of_Array_Element{

public static int findIndex(int[] arr,int value) {
    int len = arr.length;
    try{
    for(int i=0;i<len;i++){
        if (arr[i]==value){
            return i;}
    }}catch (Exception e){
        System.out.println("Number Not in an array");
    }
    return -1;
}
 public static void main(String[] args) {
    while(true){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int size = sc.nextInt();

    int[] arr = new int[size];
    System.out.println("Enter Numbers you wants to store in array");
    for(int i=0;i<size;i++){
        arr[i] = sc.nextInt();
    }

    System.out.println("Enter a number from an array to find index");
    int value=sc.nextInt();
    System.out.println("Index of your number is: "+findIndex(arr,value));
 }

}}