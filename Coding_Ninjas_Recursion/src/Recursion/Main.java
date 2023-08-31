// Factorial Program
/*

package Recursion;

import java.util.Scanner;

public class Main {

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int factorial=fact(n-1);
        return n * factorial;
    }
    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans= fact(n);
        System.out.println(ans);
    }
}


 */







// addtion from 1 to n number
/*
package Recursion;

import java.util.Scanner;

public class Main {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int summation = sum(n-1);
        return n+summation;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int add= sum(n);
        System.out.println(add);
    }
}

 */







/*
package Recursion;

import java.util.Scanner;

public class Main {

    public static int fib(int n){
        if (n == 0 || n == 1){
            return n;
        }

        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        int n=8;
        System.out.println(fib(n));
    }
}

 */









// check the array is sorted or not using recursion

package Recursion;
import java.util.Scanner;

public class Main {

    public static boolean checkSorted(int input[]){
        if(input.length<=1){
            return true;
        }
        int smallInput[] = new int[input.length-1];
        for(int i=1;i<input.length;i++){
            smallInput[i-1]=input[i];
        }

        boolean smallAns= checkSorted(smallInput);
        if(!smallAns){
            return false;
        }

        if(input[0]<=input[1]){
            return true;
        }
        else{
            return false;
        }

    }

    public static boolean checkSortedBetter(int input[],int startIndex){
        if (startIndex>= input.length-1){
            return true;
        }

        if(input[startIndex]>input[startIndex+1]){
            return false;
        }

        boolean smallAns = checkSortedBetter(input,startIndex+1);
        return smallAns;
    }

    public static boolean checkSortedBetter(int []input){
        return checkSortedBetter(input,0);
    }

    public static void main(String []args){
        int input[] = {2,1,3,6,9};
        System.out.println(checkSorted(input));
        System.out.println(checkSortedBetter(input,0));
        System.out.println(checkSortedBetter(input));
    }

}