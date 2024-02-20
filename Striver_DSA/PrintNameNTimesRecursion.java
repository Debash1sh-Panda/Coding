package Striver_DSA;

public class PrintNameNTimesRecursion {

    public static void main(String[] args) {
        
        // String name = "Debasish panda";
        // int times = 5;
        // nameprintntimes(name, times);

        oneton(0,6);
    }
    
    // public static void nameprintntimes(String name, int time) {
        
    //     if (time <= 0) return;
    //     System.out.println(name);
    //     nameprintntimes(name, time-1);
       
    // }

    public static void oneton(int sum,int num) {
        if (num <= 0){      
        System.out.print("sum is :"+ sum);
        return;}
        oneton(sum+=num,num-1);           
    }
}