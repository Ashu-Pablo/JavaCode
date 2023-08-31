package striver;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        for(int i=0; i < m;i++){
            for(int j = 0 ; j < n ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int target = sc.nextInt();

        boolean ans = searchMatrix(arr, target);
        System.out.println(ans);
    }

    public static boolean searchMatrix(int [][]arr, int target) {
        int m = arr.length;
        int n = arr[0].length;
        int j = 0;

        int p = 0;
        int r = 0;
        int i = 0;

        while (i < n){
            if (target >= arr[i][j] && target <= arr[i][m]) {
                p = i;
            }
            i++;
        }

        boolean ans = false;

        for(int k = p; k < m; k++){
            int c = 0;
            if(arr[k][c] == target){
                ans = true;
                break;
            }
            c++;
        }
        return ans;
    }
}
