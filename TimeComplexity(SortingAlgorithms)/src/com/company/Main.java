//Bubble sort alogorithm
/*

package com.company;
import java.util.Scanner;

public class Main {

    public static void bubbleSort(int[] arr){
        for(int itr=1;itr<=arr.length-1;itr++){
            for(int j=0;j<arr.length-itr;j++){
                if(isSmaller(arr,j+1,j)){
                    swap(arr,j+1,j);
                }
            }
        }
    }

    public static void swap(int [] arr,int i,int j){
        System.out.println("swapping"+arr[i]+"and"+arr[j]);
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    public static boolean isSmaller(int[] arr,int i,int j){
        System.out.println("comparing"+arr[i]+"and"+arr[j]);
        if(arr[i]<arr[j]){
            return true;
        }
        else{
            return false;
        }
    }

    public static void print(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        bubbleSort(arr);
        print(arr);

    }
}

 */






//Selection sort
/*

package com.company;
import java.util.Scanner;

public class Main {

    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(isSmaller(arr,j,min)){
                    min=j;
                }
            }
            swap(arr,i,min);
        }
    }

    public static void swap(int [] arr,int i,int j){
        System.out.println("swapping"+arr[i]+"and"+arr[j]);
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    public static boolean isSmaller(int[] arr,int i,int j){
        System.out.println("comparing"+arr[i]+"and"+arr[j]);
        if(arr[i]<arr[j]){
            return true;
        }
        else{
            return false;
        }
    }

    public static void print(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        selectionSort(arr);
        print(arr);

    }
}

 */






//insertion sort
/*

package com.company;
import java.util.Scanner;

public class Main {

    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){

            for(int j=i-1;j>=0;j--){
                if(isGreater(arr,j,j+1)){
                    swap(arr,j,j+1);
                }else{
                    break;
                }
            }

        }
    }

    public static void swap(int [] arr,int i,int j){
        System.out.println("swapping"+arr[i]+"and"+arr[j]);
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    public static boolean isGreater(int[] arr,int j,int i){
        System.out.println("comparing"+arr[i]+"and"+arr[j]);
        if(arr[i]<arr[j]){
            return true;
        }
        else{
            return false;
        }
    }

    public static void print(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        insertionSort(arr);
        print(arr);

    }
}

 */








//Merge two sorted Array
/*
package com.company;
import java.util.Scanner;

public class Main{

    public static int[] mergeTwoSortedArrays(int[] a,int[] b){
        int[] res=new int[a.length+b.length];
        int i=0;
        int j=0;
        int k=0;

        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                res[k]=a[i];
                i++;
                k++;
            }
            else{
                res[k]=b[j];
                j++;
                k++;
            }
        }

        while(i<a.length){
            res[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
            res[k]=b[j];
            j++;
            k++;
        }
        return res;
    }

    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] b=new int[m];
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        int []mergeArray = mergeTwoSortedArrays(a,b);
        print(mergeArray);
    }
}

 */







/*

package com.company;
import java.util.Scanner;

public class Main{

    public static int[] mergeSort(int[] arr,int lo,int hi){

        if(lo==hi){
            int []ba=new int[1];
            ba[0]=arr[lo];
            return ba;
        }
        int mid=(lo+hi)/2;
        int []fsh = mergeSort(arr,lo,mid);
        int []ssh = mergeSort(arr,mid+1,hi);
        int []fsa= mergeTwoSortedArrays(fsh,ssh);
        return fsa;
    }

    public static int[] mergeTwoSortedArrays(int[] a,int[] b){
        System.out.println("Merging these two arrays");
        System.out.println("left Array ->");
        print(a);
        System.out.println("right Array ->");
        print(b);
        int[] res=new int[a.length+b.length];
        int i=0;
        int j=0;
        int k=0;

        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                res[k]=a[i];
                i++;
                k++;
            }
            else{
                res[k]=b[j];
                j++;
                k++;
            }
        }

        while(i<a.length){
            res[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
            res[k]=b[j];
            j++;
            k++;
        }
        return res;
    }

    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] b=new int[m];
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        int []mergeArray = mergeTwoSortedArrays(a,b);
        print(mergeArray);
    }
}


 */







package com.company;
import java.util.Scanner;

public class Main{

    public static int lengthOfLongestSubstring(String s) {

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int length=lengthOfLongestSubstring(str);
        System.out.println(length);
    }

}