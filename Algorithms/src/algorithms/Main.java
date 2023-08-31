package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] bubbleSort(int []arr){
        int n = arr.length;
        for (int i = 0 ; i < n-1; i++){
            for (int j = 0 ; j < n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }


    public static int[] insertionSort(int []arr){
        int n = arr.length;
        for(int i = 1 ; i < n ; i++){
            int currElement = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > currElement){
                arr[j+1] = arr[j];
                j = j-1;
            }

            arr[j+1] = currElement;
        }
        return arr;
    }

    public static void print(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.print("enter the length of array : ");
        int n = sc.nextInt();

        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int []bubbleSortArray = bubbleSort(arr);
        print(bubbleSortArray);

        int[] insertionSortArray= insertionSort(arr);
        print(insertionSortArray);
    }
}
