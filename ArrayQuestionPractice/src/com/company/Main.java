//SORT A NUMERIC ARRAY AND A STRING ARRAY
/*
package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] a1={1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456};
        String []a2={
                "Java",

                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };
        System.out.println( Arrays.toString(a1));
        System.out.println( Arrays.toString(a2));

        System.out.println();

        Arrays.sort(a1);
        Arrays.sort(a2);

        System.out.println();

        System.out.println( Arrays.toString(a1));
        System.out.println( Arrays.toString(a2));

    }
}


 */

//Write a Java program to sum values of an array.
/*
package com.company;

public class Main{
    public static void main(String [] args){
        int [] a={100 ,200 ,300 ,400, 500};
        System.out.println(a.length);

        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println(sum);
    }
}

 */


//Write a Java program to calculate the average value of array elements.
/*
package com.company;

public class Main{
    public static void main(String [] args){
        int [] a={100 ,200 ,300 ,400, 500};
        System.out.println(a.length);

        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println(sum);
        System.out.println("average="+sum/a.length);
    }
}

 */

//print the position of given number
/*

package com.company;
import java .util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [] a=new int [n];

        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            if(a[i]==m){
                System.out.println(i);
            }

        }

    }
}

 */

//Number of times a sorted Array is rotated

/*
package com.company;
import java .util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = {2, 5, 6, 8, 11, 12, 15, 18};
        // System.out.println(n.length);
        int cnt=0;
        int l=0;
        int h=n.length-1;
        while(l<=h){
            int m=(l+h)/2;
            if(n[l]<=n[m]){
                l=m+1;
                System.out.println(n.length-l);
                break;
            }
            else if(n[m]<=n[h]){
                h=m-1;
                System.out.println(m);
                break;
            }

        }
    }
}

 */


/*
package com.company;
import java .util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int []a=new int[11];
            for(int j=0;j<n;j++){
                int pi=sc.nextInt();
                int si=sc.nextInt();
                if(a[pi-1]<si){
                    a[pi-1]=si;
                }
            }
            int sum=0;
            for(int k=0;k<8;k++){
                sum +=a[k];
            }
            System.out.println(sum);
        }
    }
}

 */


/*
package com.company;
import java.util.Arrays;
import java .util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] A=new int[n];
        int [] B=new int[n];
        int k=-1;

        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            B[i]=sc.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);

        for(int i=0;i<n;i++){
            if(A[i]==B[i]){
                k=1;
            }
            else{
                k=0;
            }
            //
        }
        System.out.println(k);


    }
}

 */


/*
package com.company;
import java.util.Arrays;
import java .util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int [] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();

            }

            for(int i=0;i<n;i++){
                if(a[i]>a[i]){
                    a[i]=a[i+1];
                    System.out.println(a[i]);
                }
                //  System.out.println("yes");
            }

            t--;
        }
    }
}
*/

/*
package com.company;
import java.util.Arrays;
import java .util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int []a =new int[n];
        for(int i=0;i<a.length-2;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int c=1;
        for(int i=0;i<a.length-2;i++){
            if(a[i]==a[i+1]){
                c++;
                if(c==k){
                    System.out.println(a[i]);
                    //break;
                }
                break;
            }

            //System.out.println(a[i]);
        }
        //System.out.println(a[]);
    }
}

 */

//Given two arrays: a1[0..n-1] of size n and a2[0..m-1] of size m. Task is to check whether a2[] is a subset of a1[] or not. Both the arrays can be sorted or unsorted.
/*
package com. company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] a1=new int[n];
        int[] a2=new int[m];

        for(int i=0;i<n;i++){
            a1[i]=sc.nextInt();
        }

        for(int i=0;i<m;i++){
            a2[i]=sc.nextInt();
        }
       int  count =0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a1[i]==a2[j]){
                    count++;
                    // System.out.println("yes");
                }

            }
        }
        if(count==m){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }
}
*/


//Given an array A of positive integers. Your task is to find the leaders in the array. An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader.

/*
package com.company;
import java .util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();

        int [] arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int j;
            for (j = i + 1; j < n; j++) {
                if (arr[i] <=arr[j])
                    break;
            }
            if (j == n)
                System.out.print(arr[i] + " ");
        }


    }
}

 */


/*
package com.company;
import java.util.Arrays;
import java .util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();

        int [] arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);
        int sum=0;
        int j=0;
        int i=0;
        for(int k=0;k<n;k++){
            sum += arr[k];
            if(sum==s){
                System.out.println(i);
                System.out.println(j);
            }
            if(sum<s){
                i++;
                continue;
            }
            if(sum>s){
                j++;
                continue;
            }


           /* if(sum==s){
                System.out.println(i);
                System.out.println(j);
            }
            if(sum>s){
                j++;
                sum=sum-arr[k];
                continue;
            }
            if(sum<s){
                sum += arr[i];
                i++;
                continue;
            }*/
/*
        }



       /* while(i<n){
                //sum =sum+arr[i];
                if(sum==s){
                    System.out.println(i);
                    System.out.println(j);
                }
                if(sum>s){
                    sum -=arr[j];
                    j++;
                    continue;
                }
                if(sum<s){
                    i++;
                    sum = sum+arr[i];
                    continue;
                }
             //System.out.println(sum);
         }*/
/*
    }
}


 */

/*
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int p = 0; p < t; p++) {
            int c = 0;
            int max = 0;
            int i = 0;
            while (i <= n - k) {
                int j = i;
                while (j <= i + k - 1) {
                    c += arr[j];
                    j++;
                }

               if (c > max) {
                    max = c;
                }
               c=0;
               i++;
            }
            System.out.println(max);

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
        int t = sc.nextInt();

        for (int k = 0; k < t; k++) {
            int n = sc.nextInt();
            int count = 0;

            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            // Arrays.sort(arr);

            for (int i = 0; i < n ; i++) {
                for (int j =0; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }

                if (count % 2 == 0) {
                    continue;
                }
                else{
                    System.out.println(arr[i]);
                    break;
                }

            }

        }
    }

}


 */

/*
package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int k=sc.nextInt();

            int []girls=new int[n];
            for(int j=0;j<n;j++){
                girls[j]=sc.nextInt();
            }
            int count=0;
            for(int j=0;j<=girls.length-k;j++){
                int sum=0;
                for(int m=j;m<j+k;m++){
                    sum +=girls[m];
                }

                if(sum>count){
                    count =sum;
                }
            }
            System.out.println(count);

        }
    }
}


 */



/*
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0;k<t;k++){
            int n=sc.nextInt();
            int[] a=new int[n];
            int i;
            int j;
            for(i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int x=a[0];
            for(j=1;j<n;j++){
                x^=a[j];
            }
            System.out.println(x);
        }
    }
}
*/


/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int count = 0;

        for(int i=0;i<t;i++){
            int n=sc.nextInt();

            int []arr=new int[n];
            for(int j=1;j<arr.length;j++){
                if(arr[j-1] == arr[j]){
                    count ++;
                }
            }

            System.out.println(count);
        }

    }

}

 */


/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            String s=sc.next();
            String r=sc.next();
            String f="";

            for(int j=0;j<n;j++){
                if(s.charAt(j)!=r.charAt(j)){
                    f +=s.charAt(j);
                }
            }

            int count0=0;
            int count1=0;

            for(int j=0;j<f.length();j++){
                if(f.charAt(j)=='0'){
                    count0++;
                }
                else{
                    count1++;
                }
            }

            if(count0==count1){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
}

 */


/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t>0){
            int n=sc.nextInt();

            String s=sc.next();
            int s0=0;
            int s1=0;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='0'){
                    s0++;
                }
                else{
                    s1++;
                }
            }

            String r=sc.next();
            int r0=0;
            int r1=0;
            for(int i=0;i<n;i++){
                if(r.charAt(i)=='0'){
                    r0++;
                }
                else{
                    r1++;
                }
            }

            if(s0==r0 && s1==r1){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
            t--;
        }

    }
}

 */




/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            String str=sc.next();
            int c0=0;
            int c1=0;
            for(int i=0;i<n;i++){
                if (str.charAt(i) == '0') {
                    c0++;
                }
                else {
                    c1++;
                }
            }

            if(c0 == n || c1 == n){
                System.out.println("0");
            }else{
                if(x>y){
                    System.out.println(y);
                }else{
                    System.out.println(x);
                }
            }
        }

    }
}

 */




package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String str =sc.next();
            int c=0;
            for(int i=0;i<n;i++){
                if (str.charAt(i) == '0') {
                    c++;
                }
            }
            if(c==n){
                System.out.println("0");
            }

            for(int i=1;i<n-1;i++){
                if(str.charAt(i-1)=='1' && str.charAt(i)=='1'){
                    System.out.println("2");
                    break;
                }
                else if(str.charAt(i+1)=='1'){
                    System.out.println("1");
                    break;
                }
            }
        }
    }
}