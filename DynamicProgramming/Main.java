package DynamicProgramming;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    static int fibonacciMemoisation(int n, int dp[]){

        if(n <=1) return n;

        if(dp[n] != -1) return dp[n];


        return dp[n] = fibonacciMemoisation(n-1,dp)+fibonacciMemoisation(n-2,dp);

    }

    static int fibonacciTabulation(int n, int[] dp){

        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <=n ; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    static int fibonacciTabulationOptimised(int n){

        if(n<=1) return n;
        int prev2 = 0;
        int prev = 1;

        for(int i = 2;i <=n;i++){
            int curr = prev+prev2;
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }


    public static void main(String[] args){
        
        int[] dp = new int[6];
        Arrays.fill(dp, -1);
        int x = fibonacciTabulation(5,dp);
        System.out.println(x);
    }
    
}
