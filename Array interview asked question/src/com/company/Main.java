/*

package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        int data= sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]>=data){
                System.out.println(arr[i]);
                break;
            }
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

        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        int data= sc.nextInt();
        int min=0;
        int max=arr.length-1;
        for(int i=0;i<n;i++){
            int mid=(min+max)/2;
            if(arr[mid]==data){
                System.out.println(mid);
                break;
            }
            else if(arr[mid]>data){
                max=mid-1;
                System.out.println(arr[max+1]);
            }
            else{
                min=mid+1;
            }
        }

    }
}

 */

/*
package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        int [][] arr={
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        int target =20;

        System.out.println(Arrays.toString(search(arr,target)));


    }

    static int[] search(int[][] matrix,int target){
        int r=0;
        int c = matrix.length-1;

        while(r <matrix.length && c>0){
            if(matrix[r][c]==target){
                return new int[]{r,c};
            }
            if(matrix[r][c]<target){
                r++;
            }
            if(matrix[r][c]>target){
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}

 */

package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int []a1=new int[n];
        for(int i=0;i<a1.length;i++){
            a1[i]=sc.nextInt();
        }

        int []a2=new int[m];
        for(int i=0;i<a2.length;i++){
            a2[i]=sc.nextInt();
        }

        int x=sc.nextInt();
        for(int i=0;i<a1.length;i++){
            for(int j=0;j<a2.length;j++){
                if(a1[i]+a2[j]==x){
                    System.out.println(a1[i]+" "+a2[j]);
                }
            }
        }
    }
}