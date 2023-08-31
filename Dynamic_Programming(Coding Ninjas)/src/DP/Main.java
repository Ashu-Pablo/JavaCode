
// Fibonacci of a given number
/*
package DP;

public class Main {

    // 1st method to calculate Fibonacci series
    // time complexity is O(2^n)
    // using recursion
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }

        int ans = fib(n-1) + fib(n-2);
        return ans;
    }



    // 2nd method to calculate Fibonacci series
    // time complexity is O(n)
    // using Memoization
    public static int fibM(int n){
        int storage[] = new int[n+1];
        for (int i =0 ;i <= n ; i++) {
            storage[i] = -1;
        }

        return fibM(n,storage);
    }

    public static int fibM(int n,int storage[]){
        if(n == 0 || n == 1){
            storage[n] = n;
            return storage[n];
        }

        storage[n] = fibM(n-1 ,storage) + fibM(n-2 ,storage);
        return storage[n];
    }




    // DP in fibonacci
    // Using Dynamic Programming
    public static int fibDP(int n){
        int storage[] = new int[n+1];
        storage[0] =0;
        storage[1] = 1;

        for(int i =2 ;i <=n;i++){
            storage[i] = storage[i-1] + storage[i-2];
        }

        return storage[n];
    }

    public static void main(String[] args) {
	// write your code here
        int n =100;

        System.out.println(fibDP(n));
        System.out.println(fibM(n));
        System.out.println(fib(n));


    }
}

 */









/*
package DP;

public class Main {
    public static int countSteps(int n){
        if(n == 1){
            return 0;
        }
        System.out.println("n  op1 "+ n);
        int op1=countSteps(n-1);
        System.out.println("op1 = "+op1);
        int minSteps = op1;
        //System.out.println("minSteps  op1 "+ minSteps);

        if(n % 3 == 0){
            System.out.println("n  op2 "+ n);
            int op2 = countSteps(n/3);
            System.out.println("op2 = "+op2);
            if(op2 < minSteps){
                minSteps = op2;
                //System.out.println("minSteps  op2 "+ minSteps);
            }
        }

        if(n % 2 == 0){
            System.out.println("n  op3 "+ n);
            int op3 = countSteps(n/2);
            System.out.println("op3 = "+op3);
            if(op3 < minSteps){
                minSteps = op3;
               // System.out.println("minSteps  op3 "+ minSteps);
            }
        }

       return  minSteps +1;
    }

    public static int countStepsM(int n){
        int storage[] = new int[n+1];
        return countStepsM(n,storage);
    }
    private static int countStepsM(int n, int [] storage){
        if(n == 1){
            storage[n] =0;
            return storage[n];
        }

        if(storage[n] != 0){
            return storage[n];
        }

        int op1 = countStepsM(n-1,storage);
        int minSteps = op1;

        if(n % 3 == 0){
            int op2 = countStepsM(n/3,storage);
            if(op2 < minSteps){
                minSteps = op2;
            }
        }

        if(n % 2 == 0){
            int op3 = countStepsM(n/2,storage);
            if(op3 < minSteps){
                minSteps = op3;
            }
        }

        storage[n] = 1+ minSteps;
        return storage[n];
    }

    public static int countStepsDP(int n){
        int storage[] = new int[n+1];
        storage[1] = 0;
        for (int i=2; i <= n; i++){
            int min = storage[i-1];
            if(i%3 == 0){
                if(min > storage[i/3]){
                    min = storage[i/3];
                }
            }

            if(i%2 == 0){
                if(min > storage[i/2]){
                    min = storage[i/2];
                }
            }

            storage[i] = 1 + min;
        }

        return storage[n];
    }

    public static void main(String[] args) {
        int n = 5;
//        System.out.println(countStepsDP(n));
//        System.out.println(countStepsM(n));
//        System.out.println(countSteps(n));
        countSteps(n);
//        countStepsM(n);
//        countStepsDP(n);
    }
}

*/







/*

package DP;

public class Main{

    // Recursive code for min square
    public static int minSquare(int n) {

        if( n == 0){
            return 0;
        }
        int minAns = Integer.MAX_VALUE;
        for(int i = 1;i*i <= n; i++){
           // System.out.println(n);
            int currAns = minSquare(n-(i*i));
           // System.out.println("******************************************");
           // System.out.println(currAns);
            if(minAns > currAns){
                minAns = currAns;
               // System.out.println(minAns);
            }
        }

        int myAns = 1+minAns;
        return myAns;
    }

    public static int minSquaresM(int n, int[] dp) {
        if(n == 0) {
            return 0;
        }
        int minAns = Integer.MAX_VALUE;

        for(int i=1; i*i <= n;i++) {
            int currAns;
            if(dp[n-(i*i)] == -1){
                currAns = minSquaresM(n-(i*i),dp);
                dp[n-(i*i)] = currAns;
            } else {
                currAns = dp[n-(i*i)];
            }
            if(minAns > currAns) {
                minAns = currAns;
            }
        }

        int myAns = 1 + minAns;
        return myAns;
    }


//    public static int minSquareDp(int n){
//        int []dp = new int[n+1];
//        dp[0] = 0;
//        dp[1] = 1;

//        for (int i = 2;i <= n;i++){
//            int min = Integer.MAX_VALUE;
//
//            for (int j =1;j*j <= i; j++){
//                int rem = i - (j*j);
//                if(dp[rem] < min){
//                    min = dp[rem];
//                }
//            }
//            dp[i] = min + 1;
//        }
//
//        return dp[n];
//    }


    public static int minSquareDp(int n){
        int []dp = new int[n+1];
        dp[0] = 0;

        for (int i =1 ;i <= n;i++){
            int minAns = Integer.MAX_VALUE;

            for (int j =1;j*j <= i; j++){
                int currAns = dp[i-(j*j)];
                if(minAns > currAns){
                    minAns = currAns;
                }
            }
            dp[i] = minAns+1;
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n= 10;

        int dp[] = new int[n+1];
        for(int i=0;i<dp.length;i++) {
            dp[i] = -1;
        }
        int ans = minSquaresM(n,dp);
        System.out.println(ans);

        int Ans = minSquare(n);
        System.out.println(Ans);

        int Answer = minSquareDp(n);
        System.out.println(Answer);
    }
}

 */







/*

//Number of Balanced BTs Using DP
//Given an integer h, find the possible number of balanced binary trees of height h. You just need to return the count of possible binary trees which are balanced.
//This number can be huge, so, return output modulus 10^9 + 7.

package DP;

import java.util.Scanner;

public class Main{

    public static long balancedBTs(long n){
//        if(n == 0 || n == 1){
//            return 1;
//        }
        if (n <= 1) {
            return 1;
        }

        int mod =(int) Math.pow(10, 9) + 7;
        long x = balancedBTs(n - 1);
        long y = balancedBTs(n - 2);

        long temp1 = (x * x) % mod; // Number of BTs made by attaching subtrees of height (n - 1)at both sides of root
        long temp2 = (2 * x * y) % mod; // Number of BTs made by attaching subtrees of heights (n - 1) and (n - 2) at each side of root
        long ans = (temp1 + temp2) % mod;

        return ans;
    }

    public static int balancedBTsDp(int height){

        if(height == 0){
            return 1;
        }

        int storage[] = new int[height+1];
        storage[0] = 1;
        storage[1] = 1;
        int mod = (int) Math.pow(10, 9) + 7;

        for(int i = 2; i <= height ;i++){

            long temp1 = (long) (storage[i-1]) * storage[i-1];
            temp1 = temp1 % mod;

            long temp2 = 2 * (long) (storage[i - 1]) * storage[ i - 2];
            temp2 = temp2 % mod;

            storage[i] = (int) (temp1 + temp2) % mod;
        }
        return storage[height];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of Tree");
        int n = sc.nextInt();

        long ans1 = balancedBTs(n);
        int ans2 = balancedBTsDp(n);

        System.out.println(ans1);
        System.out.println(ans2);
    }
}

 */











/*
package DP;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static long bytelandian(long n, HashMap<Long, Long> memo) {
        // Write your code here
        if (n<12){
            memo.put(n,n);
            return n;
        }

        if (!memo.containsKey(n)) {

            long ans1=bytelandian(n/2,memo);
            // System.out.println(ans1);

            long ans2=bytelandian(n/3,memo);
            // System.out.println(ans2);

            long ans3=bytelandian(n/4,memo);
            // System.out.println(ans3);

            long currVal=ans1+ans2+ans3;
            if (currVal>n)
                memo.put(n,currVal);
            else
                memo.put(n,n);

        }

        return memo.get(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        HashMap<Long, Long> memo = new HashMap<Long, Long>();
        long ans = bytelandian(n,memo);

        System.out.println(ans);
    }

}

 */






package DP;

import java.util.Scanner;

public class Main {

    public static int maxMoneyLooted(int[] houses) {
        //Your code goes here
        if (houses.length==0)
            return 0;

        if (houses.length==1)
            return houses[0];

        if (houses.length==2)
            return Math.max(houses[0],houses[1]);

        int n = houses.length;
        int[] dp = new int[n];
        dp[0]=houses[0];
        dp[1]=Math.max(houses[0],houses[1]);

        for (int i=2;i<n;i++)
        {
            int maxVal1=dp[i-2]+houses[i];

            int maxVal2=dp[i-1];

            dp[i]=Math.max(maxVal1,maxVal2);
        }


        return dp[n-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int ans = maxMoneyLooted(arr);
        System.out.println(ans);
    }

}