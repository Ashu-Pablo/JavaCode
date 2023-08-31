// fibbonaci series using recursion and Dp

/*
package dp;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input number for fibonacci");
        int n = sc.nextInt();
        int fibn =  fib(n);
        System.out.println("fibonacci using recursion "+fibn);
        int fibnDp = fibDP(n, new int[n+1]);
        System.out.println("fibonnaci using DP "+fibnDp);

    }

    public static int fib(int n){
        if(n == 0|| n== 1){
            return n;
        }

        int fibn1 = fib(n-1);
        int fibn2 = fib(n-2);
        int fibn = fibn1 + fibn2;

        return fibn;
    }

    public static int fibDP(int n, int[] qb){
        if(n == 0|| n== 1){
            return n;
        }

        if(qb[n] != 0){
            return qb[n];
        }

        int fibn1 = fibDP(n-1, qb);
        int fibn2 = fibDP(n-2, qb);
        int fibn = fibn1 + fibn2;

        return fibn;
    }
}
*/

// Climbing stairs using Recursion, DP, Tabulation in DP
/*
package dp;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cp = countPaths(n);
        System.out.println(cp);
        int cpDp = countPathsDP(n, new int[n+1]);
        System.out.println(cpDp);

        int cpTab = countPairsTabulation(n);
        System.out.println("Answer using tabulation = " + cpTab);

    }

    public static int countPaths(int n){

        if(n == 0){
            return 1;
        }else if(n < 0){
            return 0;
        }

        int nm1 = countPaths(n-1);
        int nm2 = countPaths(n-2);
        int nm3 = countPaths(n-3);
        int cp = nm1+nm2+nm3;

        return cp;
    }

    public static int countPathsDP(int n, int[] qb){

        if(n == 0){
            return 1;
        }else if(n < 0){
            return 0;
        }

        if(qb[n] > 0){
            return qb[n];
        }

        int nm1 = countPathsDP(n-1, qb);
        int nm2 = countPathsDP(n-2, qb);
        int nm3 = countPathsDP(n-3,qb);
        int cp = nm1+nm2+nm3;

        qb[n] = cp;
        return cp;
    }


    public static int countPairsTabulation(int n){
        int []dp = new int[n+1];
        dp[0] = 1;

        for(int i = 1; i <= n ;i++){
            if(i == 1){
                dp[i] = dp[i-1];
            }else if(i == 2){
                dp[i] = dp[i-1] + dp[i-2];
            }else{
                dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
            }
        }

        return dp[n];
    }
}

 */






// Climbing stairs with jumps using Dynamic programming

/*
package dp;
import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int []arr = new int[n];
        for (int i = 0; i< n ; i++){
            arr[i] = sc.nextInt();
        }

        int []dp = new int[n+1];
        dp[n] = 1;

        for (int i = n-1 ; i >=0; i--){
            for (int j = 1 ; j <= arr[i] &&(i+j) < dp.length; j++){
                dp[i] += dp[i+j];
            }
        }

        System.out.println(dp[0]);
    }
}

 */





package dp;
import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Integer []dp = new Integer[n+1];
        dp[n] = 0;

        for (int i = n-1; i >= 0; i--) {
            if(arr[i] > 0){
                int min = Integer.MAX_VALUE;

                for (int j = 1; j <= arr[i] && (i+j)< dp.length; j++){
                    if(dp[i+j] != null){
                        min = Math.min(min, dp[i+j]);
                    }
                }

                if(min != Integer.MAX_VALUE){
                    dp[i] = min +1;
                }
            }
        }
        System.out.println(dp[0]);
    }
}