
//how to declare and initialize an array
/*

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
       /* boolean arr[] = new boolean[5];
        System.out.println(arr[4]);

        */
/*
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int input[] = new int[size];

        for(int i=0;i<size;i++){
            input[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++){
            System.out.print(input[i]+" ");
        }
        System.out.println();
    }
}
*/


/*
package com.company;
import java.util.Scanner;

public class Main {

    public static int[] arr(int n){
        Scanner sc=new Scanner(System.in);
        int []array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        return array;
    }

    public static void print(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=arr(n);
        print(ar,n);
    }
}

 */



//This is how to declare the array ,initialize the array and then print the element of the arrary
/*
package com.company;
import java.util.Scanner;

public class Main {

    public static int[] takeInput(){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []input=new int[size];
        for(int i=0;i<size;i++){
            input[i]=sc.nextInt();
        }
        return input;
    }

    public static void print(int input[]){
        int size=input.length;
        for(int i=0;i<size;i++){
            System.out.println(input[i]);
        }
    }

    public static void main(String[] args) {
        int arr[]=takeInput();
        print(arr);
    }
}

 */







//This is how to declare the array ,initialize the array, print the element of the arrary and then find the maximum element of the Array
/*

package com.company;
import java.util.Scanner;

public class Main {

    public static int LargestElementOfArrary(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    public static int[] takeInput(){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []input=new int[size];
        for(int i=0;i<size;i++){
            input[i]=sc.nextInt();
        }
        return input;
    }

    public static void print(int input[]){
        int size=input.length;
        for(int i=0;i<size;i++){
            System.out.println(input[i]);
        }
    }

    public static void main(String[] args) {
        int arr[]=takeInput();
        print(arr);
        int Largest=LargestElementOfArrary(arr);
        System.out.println("largest element is:"+Largest);
    }
}


 */






//Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list.
/*
package com.company;
import java.util.Scanner;

public class Main{
    public static int sum(int[] arr) {
        //Your code goes here
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
        }
        return sum;
    }
    /*
    public static int[] takeInput(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
       // int array[];
        while(t-->0){
            int size=sc.nextInt();
            int array[]=new int[size];
            for(int i=0;i<size;i++){
                array[i]=sc.nextInt();
            }

        }
        return array;
    }
    */
/*
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int size=sc.nextInt();
            int []arr=new int[size];

            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }

            int total=sum(arr);
            System.out.println(total);
        }


        // int a[]=takeInput();

    }
}

 */







//You have been given a random integer array/list(ARR) of size N, and an integer X. You need to search for the integer X in the given array/list using 'Linear Search'.
/*

package com.company;
import java.util.Scanner;

public class Main{
    public static int linearSearch(int arr[], int x) {
        //Your code goes here
        if(arr.length==0){
            return -1;
        }
        int idx=0;
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                idx=i;
            }
            else{
                c++;
            }
        }

        if(c==arr.length){
            return -1;
        }
        else{
            return idx;
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int size=sc.nextInt();
            int []arr=new int[size];
            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
            int x=sc.nextInt();

            int idx=linearSearch(arr,x);
            System.out.println(idx);
        }
    }
}

 */






//You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array.
//Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,5,.......,6,4,2.
/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void arrange(int[] arr, int n) {
        //Your code goes here
        int c=1;
        int copy=n;
        if(n%2==0){
            for(int i=0;i<n/2; i++){
                System.out.print(c+" ");
                c +=2;
            }
            for(int i=(n/2);i<n;i++){
                System.out.print(copy+" ");
                copy -=2;
            }

        }

        else{
            for(int i=0;i<(n/2)+1; i++){
                System.out.print(c+" ");
                c +=2;
            }
            for(int i=(n/2)+1;i<n; i++){
                System.out.print((copy-1)+" ");
                copy -=2;
            }
        }


    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int []a=new int[n];

            arrange(a,n);
        }
    }
}

 */







//You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
//Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
//You need to find and return that number which is unique in the array/list.
/*

package com.company;
import java.util.Scanner;
public class Main{
    public static int findUnique(int[] arr){
        //Your code goes here

        int copy=0;
        for(int i=0;i<arr.length;i++){
            int c=0;

            for(int j=0;j<arr.length;j++){

                if(i==j){
                    continue;
                }
                else if(arr[i]==arr[j]){
                    c++;
                }
            }

            if(c==0){
                copy=arr[i];
                break;

            }

        }
        return copy;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int [] arr=new int[n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int unique=findUnique(arr);
            System.out.println(unique);
        }
    }
}

 */






//You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging from 0 to 3 and among these, there is a single integer value that is present twice. You need to find and return that duplicate number present in the array.

/*
package com.company;
import java.util.Scanner;

public class Main{
    public static int duplicateNumber(int arr[]) {
        //Your code goes here

        int copy=0;
        for(int i=0;i<arr.length;i++){
            int c=0;

            for(int j=0;j<arr.length;j++){
                if(i==j){
                    continue;
                }

                if(arr[i]==arr[j]){
                    c++;
                }
                else{
                    continue;
                }
            }

            if(c==1){
                copy=arr[i];
                break;
            }

        }
        return copy;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int [] arr=new int[n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int duplicate=duplicateNumber(arr);
            System.out.println(duplicate);
        }
    }
}

 */





//You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.
/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void intersections(int arr1[], int arr2[]) {
        //Your code goes here

        for(int i=0;i<arr1.length;i++){
            int same=0;
            for(int j=0;j<arr2.length;j++){

                if(arr1[i]==arr2[j]){
                    same++;
                    arr2[j]=Integer.MIN_VALUE;
                    break;
                }
                else{
                    continue;
                }
            }
            if(same>0){
                System.out.print(arr1[i]+" ");
            }

        }

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int [] arr1 =new int[n];
            int [] arr2=new int[m];


            for(int i=0;i<n;i++){
                arr1[i]=sc.nextInt();
            }
            for(int i=0;i<m;i++){
                arr2[i]=sc.nextInt();
            }
            intersections(arr1,arr2);
        }

    }
}

 */







//You have been given an integer array/list(ARR) and a number X. Find and return the total number of pairs in the array/list which sum to X.
/*

package com.company;
import java.util.Scanner;

public class Main{
    public static int pairSum(int arr[], int x) {
        //Your code goes here
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){

                if(arr[i]+arr[j]==x){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            int x=sc.nextInt();
            int sum=pairSum(arr,x);
            System.out.println(sum);
        }
    }

}

 */






//You have been given a random integer array/list(ARR) and a number X. Find and return the number of triplets in the array/list which sum to X.
/*
package com.company;
import java.util.Scanner;

public class Main{
    public static int findTriplet(int[] arr, int x) {
        //Your code goes here
        int count =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==x){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int x=sc.nextInt();
            int tripletSum=findTriplet(arr,n);
            System.out.println(tripletSum);
        }
    }

}

 */





//You have been given an array/list(ARR) of size N. You need to swap every pair of alternate elements in the array/list.


package com.company;
import java.util.Scanner;

public class Main{
    public static void swapAlternate(int arr[]) {
        //Your code goes here
        if(arr.length%2==0){
            for(int i=0;i<arr.length;i=i+2){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;

            }
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }

        }
        else{
            for(int i=0;i<arr.length-1;i=i+2){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            //System.out.println(arr[arr.length-1]);
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            swapAlternate(arr);
        }
    }
}



/*

package com.company;
import java.util.Scanner;

public class Main{
    /*public static void main(String[] args) {
        int[] arr = new int[5];
        arr = new int[6];
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }*/
/*
    public static void change(int input[]){
        input[0] = 15;
    }

    public static void main(String args[]){
        int arr[] = new int[5];
        change(arr);
        System.out.println(arr[0]);
    }
}

 */







//print all the pairs  of the array
/*
package com.company;
import java.util.Scanner;

public class Main{

    public static void pairsOfArray(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.println("("+arr[i]+","+arr[j]+")");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        pairsOfArray(arr);
    }
}

 */