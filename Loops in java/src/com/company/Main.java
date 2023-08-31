/*
package com.company;

public class Main {

    public static void main(String[] args) {
        int [] arr;
        arr=new int[5];
        arr[0]=90;
        arr[1]=91;
        arr[2]=92;
        arr[3]=99;
        arr[4]=100;

        //System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
*/


//PEP QUESTION 1

/*
package com.company;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);

        System.out.println("enter the no. of term");
        int arrsize=sc.nextInt();

        int []arr=new int[arrsize];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the " +i+" no. in array");
            arr[i]=sc.nextInt();
        }

        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            //System.out.println(arr[i]);
            if(arr[i]>max){
                max=arr[i];
            }

            if(arr[i]<min){
                min=arr[i];
            }

        }
        int span=max-min;
        System.out.println(span);
    }
}
*/

package com.company;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int []arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        int ind=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==d){
                ind=i;
                break;
            }

        }
        System.out.println(ind);
    }
}