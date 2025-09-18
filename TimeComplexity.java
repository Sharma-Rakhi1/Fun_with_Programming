import java.util.*;
public class TimeComplexity{
    public static void main(String[] args){
        double now = System.currentTimeMillis();
        TimeComplexity demo = new TimeComplexity();
        System.out.println(demo.findSum(99999)); // EDIT THIS LINE AND REPLACE FOR CALLING YOUR FUNCTION
        System.out.println("Time Taken- "+(System.currentTimeMillis()-now)+"millisecs.");
    }
    // TRY OUT WITH YOUR FUNCTIONS BY PUTTING HERE

    // public int findSum(int n){
    //     return n*(n+1)/2;
    // }

    public int findSum(int n){
        int sum =0;
        for(int i =0; i<=n; i++){
            sum+=i;
        }
        return sum;
    }

}
