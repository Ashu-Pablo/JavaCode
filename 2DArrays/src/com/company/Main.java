//PRINT THE ELEMENT OF 2D ARRAYS
/*
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][]arr=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        /*
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print( arr[i][j]+"\t");
            }
            System.out.println();
        }


         /*
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

    }
}

*/


//MULTIPLICATION OF ARRAY
/*
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][] a1 = new int[r1][c1];

        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[0].length; j++) {
                a1[i][j] = sc.nextInt();
            }
        }


        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int[][] a2 = new int[r2][c2];

        for (int i = 0; i < a2.length; i++) {
            for (int j = 0; j < a2[0].length; j++) {
                a2[i][j] = sc.nextInt();
            }

        }

        if(c1!=r2){
            System.out.println("invalid input");
        }

        int [][] prd=new int[r1][c2];

        for(int i=0;i<prd.length;i++){
            for(int j=0;j<prd[0].length;j++){
                for(int k=0;k<c1;k++){
                    prd[i][j] += a1[i][k] * a2[k][j];
                }
            }
        }

        for(int i=0;i<prd.length;i++){
            for(int j=0;j<prd[0].length;j++){
                System.out.print(prd[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

 */

//SUM OF MATRIX
/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int r1=sc.nextInt();
        int c1=sc.nextInt();

        int[][] a1 = new int[r1][c1];

        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                a1[i][j] = sc.nextInt();
            }
        }


        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int[][] a2 = new int[r2][c2];

        for (int i = 0; i < a2.length; i++) {
            for (int j = 0; j < a2[i].length; j++) {
                a2[i][j] = sc.nextInt();
            }

        }

        if(r1!=r2 && c1!=c2){
            System.out.println("invalid input");
        }

        int [][]sum=new int[r1][c1];

        for(int i=0;i<sum.length;i++){
            for(int j=0;j<sum[i].length;j++){
                sum[i][j] +=a1[i][j]+a2[i][j];
            }
        }

        for(int i=0;i<sum.length;i++){
            for(int j=0;j<sum[i].length;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }

    }
}

 */


//WAVE TRAVERSAL
/*
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][] a1 = new int[r1][c1];

        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                a1[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < a1[0].length; j++) {
            if(j%2==0){
                for(int i=0;i<a1.length;i++){
                    System.out.println(a1[i][j]);
                }

            }
            else{
                for(int i=a1.length-1;i>=0;i--){
                    System.out.println(a1[i][j]);
                }

            }
        }

    }
}

 */


//Spiral Traversal

//Spiral traversal
/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int [][] arr=new int[n][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int minr= 0;
        int minc=0;
        int maxr=arr.length-1;
        int maxc=arr[0].length-1;

        int tne=m*n;
        int cnt=0;
        while(cnt<tne){
            //left wall
            for(int i=minr,j=minc;i<=maxr && cnt<tne;i++){
                System.out.println(arr[i][j]);
                cnt++;
            }
            minc++;

            //bottom wall
            for(int i=maxr,j=minc;j<=maxc && cnt<tne;j++){
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxr--;

            //right wall
            for(int i=maxr,j=maxc;i>=minr && cnt<tne;i--){
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxc--;

            //top wall
            for(int i=minr,j=maxc;j>=minc && cnt<tne;j--){
                System.out.println(arr[i][j]);
                cnt++;
            }
            minr++;
        }
    }
}

 */


/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int [][] arr=new int[n][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int dir=0;// 0-e , 1-s , 2-w , 3-n
        int i=0;
        int j=0;

        while(true){
            dir = dir+(arr[i][j])%4;

            if(dir==0){
                j++;
            }
            else if(dir==1){
                i++;
            }
            else if(dir==2){
                j--;
            }
            else if(dir==3){
                i--;
            }

            if(i<0){
                i++;
                break;
            }
            else if(j<0){
                j++;
                break;
            }
            else if(i==arr.length){
                i--;
                break;
            }
            else if(j==arr[0].length){
                j--;
                break;
            }

        }
        System.out.println(i);
        System.out.println(j);

    }
}

*/


//Rotate a matrix by 90 degree
/*
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = arr[0].length - 1; j >= 0; j--) {
                System.out.print(arr[j][i]+ "\t ");
            }
            System.out.println();

        }
    }
}

 */



//Rotate a matrix by 90 degree
/*
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = arr[0].length - 1; j >= 0; j--) {
                 System.out.print(arr[j][i]+ "\t ");
            }
            System.out.println();

        }
    }
}


        //transpose
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[0].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        for(int i=0;i<arr.length;i++) {
           int li=0;
           int ri=arr[i].length-1;

           while(li<ri){
               int temp=arr[i][li];
               arr[i][li]=arr[i][ri];
               arr[i][ri]=temp;

               li++;
               ri--;
           }
        }
        display(arr);
    }

    public static void display(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}



 */


/*
package com.company;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        System.out .println(A.length()+B.length());

        if(A.compareTo(B)<0){
            System.out.println("No");
        }
        else{
            System.out.println("yes");
        }

        System.out.println(A +" "+ B);

    }
}

 */


//Diagonal traversal

/*
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int g = 0; g <= arr.length ; g++) {
            for (int i =0,j=g; j < arr.length;i++, j++) {
                System.out.println(arr[i][j]);
            }

        }
    }
}

 */


//Search in a sorted  2 d array
package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n=sc.nextInt();
         int [][]arr=new int[n][n];

         for(int i=0;i< arr.length;i++){
             for(int j=0;j< arr[0].length;j++){
                 arr[i][j]=sc.nextInt();
             }
         }
         int x=sc.nextInt();
         int i=0;
         int j=arr[0].length;
         while(i<arr.length && j>0){
             if(x==arr[i][j]){
                 System.out.println(i);
                 System.out.println(j);
             }
             else if(x<arr[i][j]){
                  j--;
             }
             else{
                 i++
             }
         }
        System.out.println("not found");
    }
}