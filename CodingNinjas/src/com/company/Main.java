/*
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of row");
        int n=sc.nextInt();
        System.out.println("enter the value of column");
        int m=sc.nextInt();

        int arr[][]=new int[n][m];

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}


 */




package com.company;
import java.util.Scanner;

public class Main {
   /* public static void main (String[] args) {
        int arr2[][]=new int[4][];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=new int[i+2];
        }

        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                System.out.print(arr2[i][j]);
            }
            System.out.println();
        }

    }

    */

    public static void main (String[] args) {
        int arr[][]={ {1,2,3,4} , {2,4} , {3,5,7,8,9,11} };
        System.out.print(arr.length+","+arr[0].length+","+
                arr[1].length+","+arr[2].length);
    }
}