/*

package DP;

public class Main {

    public static int minCostPath(int arr[][]){
        return minCostPath(arr,0,0);
    }

    // Min cost path from cell(i,j) to cell (m-1,n-1)
    public static int minCostPath(int arr[][],int i,int j){
        int m =arr.length;
        int n = arr[0].length;
        if(i == m-1 && j == n-1){
            return arr[i][j];
        }
        if(i >= m || j >= n){
            return Integer.MAX_VALUE;
        }

        int op1 = minCostPath(arr,i,j+1);
        int op2 = minCostPath(arr,i+1,j+1);
        int op3 = minCostPath(arr,i+1,j);

        int ans = arr[i][j] + Math.min(op1,Math.min(op2,op3));
        return ans;
    }



    public static int minCostPathM(int arr[][]){
        int m = arr.length;
        int n = arr[0].length;
        int storage[][] = new int[m][n];
        for (int i=0;i< m;i++) {
            for (int j=0; j<n;j++){
                storage[i][j] = -1;
            }
        }
        return minCostPathM(arr,0,0,storage);
    }

    private static int minCostPathM(int[][] arr, int i, int j, int[][] storage) {
        int m =arr.length;
        int n = arr[0].length;

        if(i >= m || j >= n){
            return Integer.MAX_VALUE;
        }
        if(i == m-1 && j == n-1){
            storage[m-1][n-1] = arr[i][j];
            return storage[i][j];
        }

        if (storage[i][j] != -1){
            return storage[i][j];
        }

        int op1 = minCostPathM(arr,i,j+1,storage);
        int op2 = minCostPathM(arr,i+1,j+1,storage);
        int op3 = minCostPathM(arr,i+1,j,storage);

        storage[i][j] = arr[i][j] + Math.min(op1,Math.min(op2,op3));
        return storage[i][j];
    }


    public  static int minCostPathDP(int arr[][]){
        int m = arr.length;
        int n = arr[0].length;
        int storage[][] = new int[m][n];

        storage[m - 1][n - 1] = arr[m - 1][n - 1];
        // Last Row
        for(int j = n - 2; j >= 0; j--){
            storage[m - 1][j] = storage[m - 1][j + 1] + arr[m - 1][j];
        }
        // Last Column
        for(int i = m - 2; i >= 0; i--){
            storage[i][n - 1] = storage[i + 1][n - 1] + arr[i][n - 1];
        }

        for(int i = m - 2; i >= 0; i--){
            for(int j = n - 2; j >= 0; j--){
                storage[i][j] = arr[i][j] +  Math.min(storage[i][j + 1],
                        Math.min(storage[i + 1][j + 1], storage[i + 1][j]));
            }
        }
        return storage[0][0];
    }

    public static void main(String[] args) {
	// write your code here
        int arr[][] = {{1,1,1},{4,5,2},{7,8,9}};
        System.out.println(minCostPath(arr));
        System.out.println(minCostPathM(arr));
        System.out.println(minCostPathDP(arr));
    }
}

 */








/*

package DP;

public class Main{
    public static int LCS(String s, String t){
        if(s.length() == 0 || t.length() == 0){
            return 0;
        }

        if(s.charAt(0) == t.charAt(0)){
            return 1+LCS(s.substring(1),t.substring(1));
        }
        else {
            // it is also right but op3 is not required to call because it is already take part in op1 or op2.

//            int op1 = LCS(s, t.substring(1));
//            int op2 = LCS(s.substring(1), t);
//            int op3 = LCS(s.substring(1), t.substring(1));
//            return Math.max(op1, Math.max(op2,op3));

            int op1 = LCS(s, t.substring(1));
            int op2 = LCS(s.substring(1), t);
            return Math.max(op1, op2);
        }
    }


    public static int lcsM(String s, String t){
        int storage[][] = new int[s.length() + 1][t.length() + 1];
        for(int i = 0; i < s.length() + 1; i++){
            for(int j = 0; j < t.length() + 1; j++){
                storage[i][j] = -1;
            }
        }
        return lcsM(s, t, storage);
    }

    private static int lcsM(String s, String t, int[][] storage) {
        int m = s.length();
        int n = t.length();

        if(storage[m][n] != -1){
            return storage[m][n];
        }
        if(m == 0 || n == 0){
            storage[m][n] = 0;
            return storage[m][n];
        }
        if(s.charAt(0) == t.charAt(0)){
            storage[m][n] = 1 + lcsM(s.substring(1), t.substring(1), storage);
        }else{
            int op1 = lcsM(s, t.substring(1), storage);
            int op2 = lcsM(s.substring(1), t, storage);
            storage[m][n] = Math.max(op1, op2);
        }
        return storage[m][n];
    }



    public static int lcsDp(String s,String t){
        int m = s.length();
        int n = t.length();
        int storage[][] = new int[m+1][n+1];

        for(int i=0;i<=m;i++){
            storage[i][0] = 0;
        }
        for(int j=0;j<=m;j++){
            storage[0][j] = 0;
        }

        for(int i = 1; i <= m ; i++){
            for (int j = 1; j <=n ; j++) {
                if (s.charAt(m - i) == t.charAt(n - j)){
                    storage[i][j] = 1 + storage[i-1][j-1];
                }
                else{
                    storage[i][j] = Math.max(storage[i][j-1], storage[i-1][j]);
                }
            }
        }

        return storage[m][n];
    }

    public static void main(String[] args) {
        String s = "dgeigeigeigeigeigeigeigeigei";
        String t = "begigeigeigaaawqgeigeiggeigeigeigei";
        System.out.println(lcsDp(s,t));
        System.out.println(lcsM(s,t));
        System.out.println(LCS(s,t));

    }
}

 */











/*

package DP;

public class Main {
    public static int editDistance(String s, String t){
        if(s.length() == 0){
            return t.length();
        }
        if(t.length() == 0){
            return s.length();
        }

        if(s.charAt(0) == t.charAt(0)){
            return editDistance(s.substring(1), t.substring(1));
        }else{
            // insert
            int op1 = editDistance(s, t.substring(1));
            // delete
            int op2 = editDistance(s.substring(1), t);
            //substitute
            int op3 = editDistance(s.substring(1), t.substring(1));
            return 1 + Math.min(op1, Math.min(op2, op3));
        }
    }



    public static int editDistanceM(String s, String t){
        int m = s.length();
        int n = t.length();
        int storage[][] = new int[ m + 1][n + 1];
        for(int i = 0; i <= m; i++){
            for(int j = 0; j <= n; j++){
                storage[i][j] = -1;
            }
        }
        return editDistanceM(s,t,storage);
    }

    private static int editDistanceM(String s, String t, int[][] storage) {
        int m = s.length();
        int n = t.length();
        if(storage[m][n] != -1){
            return storage[m][n];
        }

        if(m == 0){
            storage[m][n] = n;
            return storage[m][n];
        }
        if(n == 0){
            storage[m][n] = m;
            return storage[m][n];
        }
        if(s.charAt(0) == t.charAt(0)){
            storage[m][n] = editDistanceM(s.substring(1), t.substring(1), storage);
        }else{
            // insert
            int op1 = editDistanceM(s, t.substring(1), storage);
            // delete
            int op2 = editDistanceM(s.substring(1), t, storage);
            //substitute
            int op3 = editDistanceM(s.substring(1), t.substring(1), storage);
            storage[m][n] = 1 + Math.min(op1, Math.min(op2, op3));
        }
        return storage[m][n];
    }



    public static int editDistanceDP(String s, String t){
        int m = s.length();
        int n = t.length();
        int storage[][] = new int[ m + 1][n + 1];
        for(int j = 0; j <= n; j++){
            storage[0][j] = j;
        }
        for(int i = 0; i <= m; i++){
            storage[i][0] = i;
        }

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(s.charAt(m - i) == t.charAt(n - j)){
                    storage[i][j] = storage[i - 1][j - 1];
                }else{
                    storage[i][j] = 1 + Math.min(storage[i][j - 1],
                            Math.min(storage[i - 1][j], storage[i - 1][j - 1]));
                }
            }
        }
        return storage[m][n];
    }


    public static void main(String[] args) {
        String s = "adef";
        String t = "gbde";
        System.out.println(editDistanceDP(s, t));
        System.out.println(editDistanceM(s, t));
        System.out.println(editDistance(s, t));

    }

}

 */










package DP;

public class Main {

    public static int knapsack(int[] weights, int[] values, int maxWeight){

        return knapsack(weights,values,maxWeight,0);
    }

    private static int knapsack(int[] weights, int[] values, int maxWeight, int i) {
        if( i == weights.length || maxWeight == 0){
            return 0;
        }

        if (weights[i] > maxWeight){
            return knapsack(weights, values, maxWeight, i+1);
        }
        else {
            // include this ith item
            int op1 = values[i] + knapsack(weights,values,maxWeight - weights[i],i+1);

            // not include this ith item
            int op2 = knapsack(weights,values,maxWeight,i+1);

            return Math.max(op1,op2);
        }
    }




    public static int knapsackI(int wt[], int val[],int W)  {

        int n = val.length;
        int[][] dp = new int[n+1][W+1];

        for(int i=n-1; i>=0; i--) {
            for(int w=0;w<=W;w++) {

                int ans;
                if(wt[i] <= w) {
                    int ans1 = val[i] + dp[i+1][w-wt[i]];
                    int ans2 = dp[i+1][w];
                    ans = Math.max(ans1, ans2);
                }else{
                    ans = dp[i+1][w];
                }
                dp[i][w] = ans;
            }
        }

        return dp[0][W];
    }


    public static void main(String[] args) {

        int weights[] = {6,1,2,4,5};
        int values[] = {10,5,4,8,6};
        int maxWeight = 5;
        System.out.println(knapsack(weights,values,maxWeight));
        System.out.println(knapsackI(weights,values,maxWeight));
    }
}