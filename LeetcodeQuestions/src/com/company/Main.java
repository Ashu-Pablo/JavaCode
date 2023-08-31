/*package com.company;
import java.util.Scanner;
public class Main {

    public static double findMedianSortedArrays(int[] nums1 , int[] nums2) {
        int i=0;
        int j=0;
        int k=0;

        int arr[]=new int[nums1.length+nums2.length];

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                arr[k]=nums1[i];
                k++;
                i++;
            }
            else{
                arr[k]=nums2[j];
                k++;
                j++;
            }

        }

        while(i<nums1.length){
            arr[k]=nums1[i];
            i++;
            k++;
        }

        while(j<nums2.length){
            arr[k]=nums2[j];
            j++;
            k++;
        }

        System.out.println(arr.length);
        if(arr.length%2!=0){
            return arr[arr.length/2];
        }else{
            //double d= Double.valueOf( (arr[(arr.length/2)-1]+arr[arr.length/2])/2);
            return (arr[(arr.length/2)-1]+arr[arr.length/2])/2.0;

        }
    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int[] nums1=new int[m];
        for(int i=0;i<m;i++){
            nums1[i]=sc.nextInt();
        }

        int n=sc.nextInt();
        int[] nums2=new int[n];
        for(int i=0;i<n;i++){
            nums2[i]=sc.nextInt();
        }

        double median= findMedianSortedArrays(nums1,nums2);
        System.out.println(median);
    }
}

 */






/*
package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static int threeSumClosest(int[] nums, int target) {

        int []arr=new int[nums.length-2];
        for(int i=0;i<nums.length-2;i++){
              arr[i]=nums[i]+nums[i+1]+nums[i+2];
//            int ans=nums[i]+nums[i+1]+nums[i+2];
//            if(target<ans){
//                return ans;
//
//            }
        }

        int ans1=0;
       for (int i=0;i<arr.length;i++){
           if(arr.length==1){
               return arr[0];
           }
           if(target<=arr[i]){
                ans1= arr[i];
               // break;
           }
       }

       int c=0;
       for(int i=0;i<arr.length;i++){
           if (target>arr[i]){
               c++;
           }
       }

       if(c==arr.length){
           Arrays.sort(arr);
           return arr[arr.length-1];
       }



//        for(int i=0;i<nums.length-2;i++){
//            nums[i]=arr[i];
//            System.out.println(nums[i]);
//        }
        //return nums;

        return ans1;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int ans=threeSumClosest(arr,target);
        System.out.println(ans);
    }
}
*/


/*

package com.company;
import java.util.Scanner;

public class Main{

    public static int strStr(String haystack, String needle){
        int j=0;
        int i=0;
        for( i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(j)){
                if(j==needle.length()-1){
                    return i-j;
                }
                j++;

            }
            else if(j==0){
                i=i-j;
            }
            else{
                i=i-j+1;
                j=0;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        String s = sc.nextLine();

        int ans = strStr(str,s);
        System.out.println(ans);
    }
}

 */







// Q1)
/* You have n bags numbered from 0 to n - 1. You are given two 0-indexed integer arrays capacity and rocks.
The ith bag can hold a maximum of capacity[i] rocks and currently contains rocks[i] rocks.
You are also given an integer additionalRocks, the number of additional rocks you can place in any of the bags.

Return the maximum number of bags that could have full capacity after placing the additional rocks in some bags.
 */


/*
package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int remain[] = new int[capacity.length];
        for(int i = 0 ;i < remain.length;i++){
            remain[i] = capacity[i] - rocks[i];
        }

        Arrays.sort(remain);
        int count = 0;

        for (int i = 0; i < capacity.length; i++) {
            if(remain[i] == 0){
                count ++;
            }
            else{
                if(remain[i] <= additionalRocks){
                    additionalRocks = additionalRocks - remain[i];
                    count++;
                }else{
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cap[] = new int[n];
        System.out.println("enter capacity");
        for(int i = 0;i < n; i++){
            cap[i] = sc.nextInt();
        }

        System.out.println("Enter rocks");
        int roc[] = new int[n];
        for(int i = 0;i < n; i++){
            roc[i] = sc.nextInt();
        }

        System.out.println("enter the additional rocks");
        int additional = sc.nextInt();
        int ans = maximumBags(cap,roc,additional);
    }
}

 */












/* Q2)
Given head, the head of a linked list, determine if the linked list has a cycle in it.
There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
Return true if there is a cycle in the linked list. Otherwise, return false.

 */

/*
package com.company;
import java.util.Scanner;

class ListNode{
    int data;
    ListNode next;
}

public class Main{

    public static ListNode takeInput(){
        ListNode head = null;
        ListNode tail = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("-1 for end");
        System.out.println("Enter the data");
        int num = sc.nextInt();

        while(num != -1){
            ListNode newNode = new ListNode();
            newNode.data = num;
            if(head == null){
                head = newNode;
                tail = newNode;

            }
            else{
                tail.next = newNode;
                tail = newNode;
            }
            num = sc.nextInt();
        }
        return head;
    }

    public static boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }

        ListNode first = head;
        ListNode second = head;

        while (second.next != null && second.next.next != null){
            first = first.next;
            second = second.next.next;

            if(first == second){
                return true;
            }
        }

        return false;
    }

    public static void display(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListNode ans = takeInput();
        display(ans);
//        System.out.println("enter the position");
//        int pos = sc.nextInt();
        boolean TorF = hasCycle(ans);
        System.out.println(TorF);
    }
}

 */