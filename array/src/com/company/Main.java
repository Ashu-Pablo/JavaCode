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

/*
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


 */


//PEP QUESTION 3
//BAR GRAPH

/*
package com.company;
import java .util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        for(int floor=max;floor>=1;floor--){
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=floor){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}

 */


//PEP QUESTION 2
/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        for(int floor=max;floor>=1;floor--){
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=floor){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();

        }

    }
}

 */

/*
package com.company;
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);

        int n1=sc.nextInt();
        int [] a1=new int[n1];

        for(int i=0;i<a1.length;i++){
            a1[i]=sc.nextInt();
        }

        int n2=sc.nextInt();
        int [] a2=new int[n2];

        for(int i=0;i<a2.length;i++){
            a2[i]=sc.nextInt();
        }

        int [] sum=new int[n1>n2? n1:n2];
        int c=0;

        int i=a1.length-1;
        int j=a2.length-1;
        int k=sum.length-1;

        while(k>=0) {
            int d=c;

            if(i>=0){
                 d +=a1[i];
            }

            if(j>=0){
                 d +=a2[j];
            }

            c=d/10;
            d=d%10;

            sum[k]=d;

            i--;
            j--;
            k--;
        }

        if(c!=0){
            System.out.println(c);
        }

        for(int val:sum){
            System.out.println(val);
        }



    }
}

 */


//PEP QUESTION 2
//SUM OF TWO ARRAY
/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int n1=sc.nextInt();
        int [] a1=new int[n1];
        for(int i=0;i<a1.length;i++){
            a1[i]=sc.nextInt();
        }

        int n2=sc.nextInt();
        int [] a2=new int[n2];
        for(int i=0;i<a2.length;i++){
            a2[i]=sc.nextInt();
        }

        int [] sum=new int[n1>n2 ? n1:n2];
        int c=0;

        int i=a1.length-1;
        int j=a2.length-1;
        int k=sum.length-1;

        while(k>=0){
            int d=c;

            if(i>=0){
                d +=a1[i];
            }

            if(j>=0){
                d +=a2[j];
            }

            c=d/10;
            d=d%10;

            sum[k]=d;

            i--;
            j--;
            k--;

        }
        if(c>0){
            System.out.println(c);
        }
        for(int val:sum){
            System.out.println(val);
        }
    }
}

 */


//PEP QUESTION 3
//difference of array
/*
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();
        }

        int [] diff=new int[n2];
        int c=0;

        int i=a1.length-1;
        int j=a2.length-1;
        int k=diff.length-1;

        while(k>=0){
            int d=0;
            int a1v=i>=0? a1[i]:0;

            if(a2[j]+c>=a1v){
                d=a2[j]+c-a1v;
                c=0;
            }
            else{
                d=a2[j]+c+10-a1v;
                c=-1;
            }

            diff[k]=d;

            i--;
            j--;
            k--;
        }

        int idx=0;
        while (idx<diff.length){
            if(diff[idx]==0){
                idx++;
            }
            else{
                break;
            }

            while(idx<diff.length){
                System.out.println(diff[idx]);
                idx++;
            }
        }

    }
}

 */

//print array element
/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}

 */


//REVERSE OF ARRAY
/*
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        //System.out.println(arr.length);

        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}

 */


//ROTATE AN ARRAY
/*
 package com.company;
 import java.util.Scanner;


//import static jdk.internal.org.jline.keymap.KeyMap.display;

public class Main{
     public static void  reverse (int []a,int i,int j){
          int li=i;
          int ri=j;

          while(li<ri){
              int temp =a[li];
              a[li]=a[ri];
              a[ri]=temp;

              li++;
              ri--;
          }
     }

     public static void rotate(int []a,int k){
         //part1
         reverse(a,0,a.length- k -1);

         //part 2
         reverse(a,a.length-k, a.length-1);

         //part 3
         reverse(a , 0 , a.length-1);
     }

     public static void main(String [] args) throws Exception{
         Scanner sc=new Scanner (System.in);
         int n=sc.nextInt();

         int [] a=new int[n];

         for(int i=0;i<a.length;i++){
             a[i]=sc.nextInt();
         }

         int k=sc.nextInt();
         rotate(a,k);
         System.out.println(a);
     }
 }

 */


//SUBARRAYS OF AN ARRAY
/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int [] a = new int[n];

        for(int i = 0;i < a.length;i++){
            a[i]=sc.nextInt();
        }

        for(int i = 0; i < a.length;i++){
            for(int j = i;j<a.length;j++){
                for(int k = i;k <= j;k++){
                    System.out.print(a[k]+" ");
                }
                System.out.println();
            }
        }
    }
}

 */



//SUBSETS OF ARRAY
/*
package com.company;
import java . util. Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n =sc.nextInt();
        int [] a= new int [n];

        for(int i=0;i<a.length;i++){
            a[i]= sc.nextInt();
        }

        int limit=(int)Math.pow(2,a.length);
        for(int i=0;i<limit;i++){
            String  set ="";
            int temp = i;

            for(int j=a.length-1;j>=0;j--){
                int r=temp%2;
                temp = temp/2;

                if(r==0){
                    set="-\t"+set;
                }
                else{
                   set=a[j]+"\t"+set;
                }
            }
            System.out.println(set);
        }
    }
}

 */

/*
//Binary search algorithm

package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int data = 80;
        //System.out.println(a.length);
        int l = 0;
        int h = a.length - 1;

        while (l <= h) {
            int m = (l + h) / 2;

            if(data>a[m]){
                l=m+1;
            }
            else if(data<a[m]){
                h=m-1;
            }
            else{
                System.out.println(m);
                return ;
            }

        }
        System.out.println(-1);
    }
}

 */

//SUBSETS OF ARRAY
/*
package com.company;
import java .util .Scanner;

public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int limit=(int)Math.pow(2,arr.length);

        for(int i=0;i<limit;i++){
            int temp=i;
            String s="";
            for(int j=arr.length-1;j>=0;j--) {
                int r = temp % 2;
                temp = temp / 2;

                if (r == 0) {
                    s="-\t"+s;
                } else {
                    s=arr[j]+"\t"+s;
                }

            }
            System.out.println(s);
        }
    }
}

 */


//Binary search algorithm
/*
package com .company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int i=0;

        for ( i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();

        for ( i = 0; i < a.length; i++) {
            if (a[i] == m) {
                System.out.println(i+1);
            }

        }

        if(a[i-1]!=m){
            System.out.println("invalid");
        }

    }
}

 */

//Binary search algorithm
/*
package com .company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50,60,70,80,90,100};
        int data=110;
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int m=(l+h)/2;

            if(data>arr[m]){
                l=m+1;
            }
            else if(data<arr[m]){
                h=m-1;
            }
            else{
                System.out.println(m);
                return;
            }
        }
        System.out.println("-1");

    }
}

 */


//Ceil and floor
/*
package com .company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        int data=sc.nextInt();
        int lo=0;
        int hi=arr.length-1;
        int ceil=0;
        int floor=0;

        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(data<arr[mid]){
                hi=mid-1;
                ceil=arr[mid];
            }
            else if(data>arr[mid]){
                lo=mid+1;
                floor=arr[mid];
            }
            else{
                ceil=arr[mid];
                floor=arr[mid];
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
    }
}

 */

//print first and last index
/*
package com .company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int [] arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int data=sc.nextInt();
        int lo=0;
        int hi=arr.length-1;
        int fi=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;

            if(data>arr[mid]){
                lo=mid+1;
            }
            else if(data<arr[mid]){
                hi=mid-1;
            }
            else{
                fi=mid;
                hi=mid-1;
            }
        }
        System.out.println(fi);

        lo=0;
        hi=arr.length-1;
        int li=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;

            if(data>arr[mid]){
                lo=mid+1;
            }
            else if(data<arr[mid]){
                hi=mid-1;
            }
            else{
                li=mid;
                lo=mid+1;
            }
        }
        System.out.println(li);
    }
}

 */