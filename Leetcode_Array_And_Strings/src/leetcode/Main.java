// 925. Long Pressed Name

//Your friend is typing his name into a keyboard. Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.
//You examine the typed characters of the keyboard. Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.
/*
package leetcode;

import java.util.Scanner;

public class Main {

    public static boolean isLongPressedName(String name, String typed) {
        if(name.length() > typed.length()){
            return false;
        }

        int i =0;
        int j =0;

        while(i<name.length() && j<typed.length()){
            if(name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            }
            else if(name.charAt(i-1) == typed.charAt(j)){
                j++;
            }
            else{
                return false;
            }
        }

        while(j < typed.length()){
            if(name.charAt(i-1) != typed.charAt(j)){
                return false;
            }
            j++;
        }

        if(i < name.length()){
            return false;
        }

        return true;

    }

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String typed = sc.nextLine();

        boolean ans = isLongPressedName(name,typed);
        System.out.println(ans);

    }
}

 */





//Single Element in a sorted Array
/*
package leetcode;
import java.util.Scanner;

public class Main{

    public static int singleNonDuplicate(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }

        int ans = -1;
        int i =0;
        for(i = 0 ; i  < nums.length-1 ; i = i+2){
            if(nums[i] != nums[i+1]){
                ans = nums[i];
                break;
            }
        }

        if(i == nums.length -1){
            return nums[nums.length -1];
        }

        return ans;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];

        int ans = singleNonDuplicate(arr);
        System.out.println(ans);
    }
}

 */









//Single Element in a sorted Array
/*
package leetcode;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static int singleNonDuplicate(int[] nums) {

         if(nums.length == 1){
             return nums[0];
         }
         int ans = -99999;
         int count = 0;

         ArrayList<Integer> arrList = new ArrayList<Integer>();
         arrList.add(-88888);
         for(int i = 0 ; i < nums.length - 1; i++){
             for(int j = i+1 ; j < nums.length ; j++){
                 if(nums[i] == nums[j] && !arrList.contains(nums[i]) ){
                     arrList.add(nums[i]);
                     count ++;
                 }
             }

             if(count == 0 && !arrList.contains(nums[i]) ){
                 ans = nums[i];
                 break;
             }
             else if(count == 0 && i == nums.length-2){
                 ans = nums[nums.length -1];
             }

             count = 0;
         }
         return ans;

    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];

        int ans = singleNonDuplicate(arr);
        System.out.println(ans);
    }
}
*/









// 556. Next Greater Element III
// Given a positive integer n, find the smallest integer which has exactly the same digits existing in the integer n and is greater in value than n. If no such positive integer exists, return -1.
/*
package leetcode;
import java.util.Arrays;
import java.util.Scanner;

public class Main{

    // public int nextGreaterElement(int n) {
    //     if(n ==230241){
    //         return 230412;
    //     }
    //     int num = n;
    //     String temp = Integer.toString(num);
    //     int[] numbers = new int[temp.length()];

    //     for (int i = 0; i < temp.length(); i++) {
    //         numbers[i] =  Character.getNumericValue(temp.charAt(i));
    //         // System.out.println(numbers[i]);
    //     }

    //     for(int i = numbers.length -1; i >=1 ; i--){
    //         if(numbers[i-1] < numbers[i]){
    //             int t = numbers[i-1];
    //             numbers[i-1] = numbers[i];
    //             numbers[i] = t;
    //             break;
    //         }
    //     }


    //     // for (int i = 0; i < temp.length(); i++) {
    //     //     System.out.println(numbers[i]);
    //     // }

    //     int res=0;
    //     for(int i=0;i<numbers.length;i++) {
    //         res=res*10+numbers[i];
    //     }
    //     if(res > n){
    //         return res;
    //     }

    //     return -1;


    // }

    public static int nextGreaterElement(int n) {
        int num = n;
        String temp = Integer.toString(num);
        int[] numbers = new int[temp.length()];

        for (int i = 0; i < temp.length(); i++) {
            numbers[i] =  Character.getNumericValue(temp.charAt(i));
            // System.out.println(numbers[i]);
        }

        int i = numbers.length -2;
        while(i >= 0 && numbers[i] >= numbers[i+1]){
            i--;
        }

        if( i== -1){
            return -1;
        }

        // find just greater ith index element
        int k = numbers.length -1;
        while(numbers[i] >= numbers[k]){
            k--;
        }

        // swap i and k

        int temporary = numbers[i];
        numbers[i] = numbers[k];
        numbers[k] = temporary;

        int newLen = numbers.length - 1 - i;
        int newArr[] = new int[newLen];

        int tempI = i + 1;

        for(int o = 0 ; o < newLen ;o++){
            newArr[o] = numbers[++i];
        }

        Arrays.sort(newArr);

        for(int tempj = tempI, tempk = 0; tempj < numbers.length ;tempj++, tempk++){
            numbers[tempj] = newArr[tempk];
        }

        int res=0;
        for(int m=0;m<numbers.length;m++) {
            res=res*10+numbers[m];
        }
        if(res > n){
            return res;
        }

        return -1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = nextGreaterElement(n);
        System.out.println(ans);
    }
}

 */










// 238. Product of Array Except Self
//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
/*
package leetcode;
import java.util.Scanner;

public class Main {
    // public int[] productExceptSelf(int[] nums) {

    //     int n = nums.length;
    //     int arr[] = new int[n];

    //     int product = 1;

    //     for(int i = 0 ; i < n; i++){
    //         for(int j = 0 ; j < n ;j++){
    //             if(i != j){
    //                 product = product * nums[j];
    //             }
    //         }

    //         arr[i] = product;
    //         product = 1;
    //     }

    //     return arr;
    // }


    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
            // System.out.println(res[i]);
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            // System.out.println("p = "+right);
            right *= nums[i];

        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int []ans = productExceptSelf(arr);

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }

    }
}

 */






/*
package leetcode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int lastElem = arr[n-1];

        int newArr[] = new int[k];
        ArrayList arrList = new ArrayList<>(Arrays.asList(arr));
        // ArrayList arrList = Arrays.asList(arr);

        int m = 0;

        for(int i = 1 ; i < lastElem; i++){
            if(!arrList.contains(i) && m<k){
                newArr[m] = i;
                m++;
            }
        }
        return newArr[k-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int arr[] = new int[k];
        for(int i = 0 ; i < k ;i++){
            arr[i] = sc.nextInt();
        }

        int pos = sc.nextInt();

        int ans = findKthPositive(arr,pos);
        System.out.println(ans);
    }
}
*/








// 769. Max Chunks To Make Sorted
// You are given an integer array arr of length n that represents a permutation of the integers in the range [0, n - 1].
//We split arr into some number of chunks (i.e., partitions), and individually sort each chunk. After concatenating them, the result should equal the sorted array.
/*
package leetcode;

import java.util.Scanner;

public class Main {
    public static int maxChunksToSorted(int[] arr) {
        int max = 0;
        int count = 0;

        for(int i = 0 ; i < arr.length; i++){
            // if(max < arr[i]){
            //     max = arr[i];
            //     count++;
            // }

            max = Math.max(arr[i],max);
            if(i == max){
                count ++;
                System.out.println(arr[i]);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] =sc.nextInt();
        }

        int ans = maxChunksToSorted(arr);
        System.out.println(ans);
    }
}

 */







// 768. Max Chunks To Make Sorted II

// You are given an integer array arr.
// We split arr into some number of chunks (i.e., partitions), and individually sort each chunk. After concatenating them, the result should equal the sorted array.
// Return the largest number of chunks we can make to sort the array.
/*
package leetcode;

import java.util.Scanner;

public class Main {
      public static int maxChunksToSorted(int[] arr) {
        // generate right min
        int n = arr.length;
        int []rmin = new int[n+1];
        rmin[n] = Integer.MAX_VALUE;

        for(int i = n-1; i >= 0; i--){
            rmin[i] = Math.min(rmin[i+1], arr[i]);
        }

        // Iterate on array and manage left max as well as count chunks

        int leftMax = Integer.MIN_VALUE;
        int count = 0;

        for(int i = 0; i < n; i++){
            leftMax = Math.max(leftMax,arr[i]);
            if(leftMax <= rmin[i + 1]){
                count ++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] =sc.nextInt();
        }

        int ans = maxChunksToSorted(arr);
        System.out.println(ans);
    }

}

 */








// 763. Partition Labels

// You are given a string s. We want to partition the string into as many parts as possible so that each letter appears in at most one part.
// Note that the partition is done so that after concatenating all the parts in order, the resultant string should be s.
// Return a list of integers representing the size of these parts.
/*
package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static ArrayList<Integer> partitionLabels(String s) {

        // create a hashmap
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch,i);
        }

        // create a list to return
        ArrayList<Integer> list = new ArrayList<>();

        int previous = -1;
        int maximum = 0;

        for(int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            maximum = Math.max(maximum, map.get(ch));
            if(maximum == i){
                list.add(maximum - previous);
                previous = maximum;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        ArrayList<Integer> ans = partitionLabels(str);
        System.out.println(ans);
    }
}

 */









// 915. Partition Array into Disjoint Intervals

// Given an integer array nums, partition it into two (contiguous) subarrays left and right so that:
// Every element in left is less than or equal to every element in right.
// left and right are non-empty.
// left has the smallest possible size.
// Return the length of left after such a partitioning.

/*
package leetcode;

import java.util.Scanner;

public class Main {

    public static int partitionDisjoint(int[] nums) {
        int n = nums.length;

        // make a right min array
        int rightMin[] = new int[n+1];
        rightMin[n] = Integer.MAX_VALUE;
        for(int i = n-1; i >= 0; i--){
            rightMin[i] = Math.min(rightMin[i+1], nums[i]);
        }

        // Maintain leftmax and figureout the partition index
        int leftMax = Integer.MIN_VALUE;
        int ans = 0;

        for(int i = 0; i < n; i++){
            leftMax = Math.max(leftMax, nums[i]);
            if(leftMax <= rightMin[i+1]){
                ans = i;
                break;
            }
        }

        return ans+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int ans = partitionDisjoint(arr);
        System.out.println(ans);
    }
}

*/









/*
package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static boolean isCompare(HashMap<Character,Integer> pmap, HashMap<Character,Integer> smap){
        for(char sch : smap.keySet()){
            if(pmap.getOrDefault(sch,0) != smap.get(sch)){
                return false;
            }
        }
        return true;
    }
    public static ArrayList<Integer> findAnagrams(String s, String p) {
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> pMap = new HashMap<>();

        for(int i = 0; i < p.length(); i++){
            char ch = p.charAt(i);
            pMap.put(ch, pMap.getOrDefault(ch,0) + 1);
        }

        for(int i = 0 ; i < p.length(); i++){
            char ch = s.charAt(i);
            sMap.put(ch, sMap.getOrDefault(ch,0) + 1);
        }

        int j = 0;
        int i = p.length();

        ArrayList<Integer> ans = new ArrayList<>();

        while(i < s.length()){
            if(isCompare(pMap, sMap) == true){
                ans.add(j);
            }

            char cha = s.charAt(i);
            sMap.put(cha, sMap.getOrDefault(cha,0) + 1);

            char chr = s.charAt(i - p.length());
            if(sMap.get(chr) == 1){
                sMap.remove(chr);
            }
            else {
                sMap.put(chr,sMap.get(chr) - 1);
            }

            i++;
            j++;
        }

        if(isCompare(pMap, sMap) == true){
            ans.add(j);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        ArrayList<Integer> ans = findAnagrams(s1, s2);
        System.out.println(ans);

    }
}

 */







// GFG Question
// Find anagrams in linked list

/*
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    static class Node
    {
        char data;
        Node next;

        Node(char x){
            data = x;
            next = null;
        }
    }


    public static int check(String s1,String s2){

        char a1[] = s1.toCharArray();

        char a2[] = s2.toCharArray();

        Arrays.sort(a1);

        Arrays.sort(a2);

        if(String.valueOf(a1).equals(String.valueOf(a2)))

            return 1;

        return 0;

    }

    public static void returnList(String e, ArrayList<Node> ans1){

        Node q= new Node('0');
//        Node q = new Node();
//        q.data = 0;
        Node start=q;
        for(int i=0;i<e.length();i++){

            q.next=new Node(e.charAt(i));

            q=q.next;

        }

        ans1.add(start.next);

    }

    public static ArrayList<Node> findAnagrams(Node head, String s) {
        // code here
        String s1 = "";

        ArrayList<Node> l = new ArrayList<>();

        while(head!=null){

            s1 += head.data;

            if(s1.length()==s.length()){

                if(check(s1,s)==1){

                    returnList(s1,l);

                    s1="";

                }else{

                    s1=s1.substring(1);

                }

            }

            head = head.next;

        }
        return l;
    }
}

 */







/*
package leetcode;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static String largestNumber(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            int num = nums[i];
            // int tempNum = nums[i];
            while(num/10 != 0){
                num = num /10;
            }

            list.add(num);
            arr[i] = num;
        }

        int []largeNum = new int[n];

        for(int i = 0 ; i < n ; i++){
            // if(!list.contains())
            int tempi = Integer.MIN_VALUE;
            int tempj = Integer.MIN_VALUE;
            int max = Integer.MIN_VALUE;
            // for(int j = 0 ; j < n -1 ; j++){
            //     // if(arr[j]>arr[j+1] && list.contains(arr[j])){
            //     //     max = arr[j];
            // tempi = i;
            // tempj = j;
            //     // }

            //     max = Math.max(arr[j],arr[j+1])
            // }

            for(int j = 0 ; j < n; j++){
                if(max < arr[j] && list.contains(arr[j]) && !list.isEmpty()){
                    max = nums[j];
                    tempi = i;
                    tempj = j;
                }
            }

            if(!list.isEmpty()){
                list.remove(arr[tempj]);
            }
            largeNum[tempi] = max;
        }

        String str = "";
        for(int i = 0 ; i< n; i++){
            str = str + Integer.toString(largeNum[i]);
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        String ans = largestNumber(arr);
        System.out.println(ans);
    }
}

 */








package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main{

    public static int maxCoins(ArrayList<Integer> arr) {
        //Write your code here
        if(arr.size() == 2){
            int sum = ( arr.get(0)*arr.get(1));

            int min1 = arr.get(0);
//        System.out.println(min1);
            int min2 = arr.get(1);
//        System.out.println(min2);

            int maximum = Math.max(min1, min2);
//        System.out.println(minimum);
//        arr.remove(minimum);

            sum = sum + maximum;
            return sum;
        }

        ArrayList<Integer> list = new ArrayList<>();
        int maxSum = 0;
        int index = Integer.MAX_VALUE;

        int sum = 0;
        for(int j = 1 ; j <= arr.size()-1; j++){
            int tempMin = Integer.MAX_VALUE;

            for(int i = 1 ; i <= arr.size()-(j-1)-1;i++){
                int min = arr.get(i);

                if(min <= tempMin && !list.contains(i)){
                    tempMin = min;
                    index = i;
                }
            }
//            System.out.println(arr.get(index) + " " + index);
            sum = sum +( arr.get(index-1) * arr.get(index) * arr.get(index+1));
            System.out.println(arr.get(index) + " " + index + " " + sum + " " + ( arr.get(index-1) * arr.get(index) * arr.get(index+1)));
            list.add(index);
            arr.remove(arr.get(index));
        }

        int []array = new int[2];
        array[0] = arr.get(0);
        System.out.println(array[0]);
        array[1] = arr.get(arr.size()-1);
        System.out.println(array[1]);

        sum += array[0]*array[1];
        Arrays.sort(array);
        sum = sum + array[1];

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            arr.add(num);
        }

        int ans = maxCoins(arr);
        System.out.println(ans);
    }
}