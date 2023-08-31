//Print Decreasing function
/*

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        Scanner sc=new Scanner (System.in);
        int m=sc.nextInt();
        printDecreasing(m);
    }

    public static void printDecreasing(int n){
        int i=0;
        if(n==i){
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }
}


 */


//Print Increasing function
/*


package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner (System.in);
        int m=sc.nextInt();
        printIncreasing(m);
    }

    public static void printIncreasing(int n){
        int i=0;
        if(n==i){
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
}


 */




//print increasing and decreasing function
/*


package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        printDecInc(m);
    }

    public static void printDecInc(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printDecInc(n-1);
        System.out.println(n);
    }
}


 */

//factorial program

/*


package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
         int f=Fact(m);
        System.out.println(f);
    }

    public static int Fact(int n){
        if(n==1){
            return 1;
        }
        int f=Fact( n-1 );
        int fn=n*f;
        return fn;
    }
}

 */

// print x to the power n (x^n)

/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int p=XtopowerN(x,n);
        System.out.println(p);
    }

    public static int XtopowerN(int x, int n){
        if(n==0){
            return 1;
        }
        int p=XtopowerN(x,n-1)*(x);
        return p;
    }
}

 */



/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int p = power(x,n);
        System.out.println(p);
    }

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int p=0;
        if(n%2==0){
            p=power(x,n/2)*power(x,n/2);
        }
        else{
            p=power(x,n/2)*power(x,n/2)*x;
        }
        return p;
    }
}

 */


/*
package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] a=new int[size];

        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int currcount=0;
        int printcount=0;
        int p=0;
        for(int i=1;i<size;i++){
            if(a[i-1]==a[i]){
                currcount++;
            }else{
                currcount=0;
            }

            if(currcount>printcount){
                printcount=currcount;
                p=a[i];
            }

        }

        if(currcount==0){
            System.out.println("-1");
        }else
        System.out.println(p);
    }

}

 */


/*
package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String s1 ;
        String s2 ;

        char [] st1;
        char [] st2;


         for(int i=0;i<t;i++){
             String str=sc.next();
             if(str.length()%2==0){
                 s1=str.substring(0,str.length()/2);
                // System.out.println(s1);

             }else{
                 s1=str.substring(0,str.length()/2+1 );
                // System.out.println(s1);
             }

             s2=str.substring(str.length()/2,str.length());
             //System.out.println((s2));

             st1 = s1.toCharArray();
             st2 = s2.toCharArray();

             Arrays.sort(st1);
             Arrays.sort(st2);

             s1=new String(st1);
             s2=new String(st2);

             if(s1.equals(s2)){
                 System.out.println("yes");
             }else{
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
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        int n=sc.nextInt();
        int count1 = str.length();
        int count = 0;

        for(int k=0;k<n;k++){
            String s1= sc.next();
            for(int i=0;i<str.length();i++){
                for(int j=0;j<s1.length();j++){
                    if(str.charAt(i) == s1.charAt(j)) {
                        count++;
                    }
                }
            }

            if(count1==count){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }

            count=0;
        }
    }
}

 */




// PRINT ZIG-ZAG

/*

package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        zzg(n);
    }

    public static void zzg(int n){
        if(n==0){
            return;
        }

        System.out.println("pre"+n);
        zzg(n-1);
        System.out.println("in"+n);
        zzg(n-1);
        System.out.println("post"+n);
    }
}

 */




// PRINT ZIG-ZAG
/*

package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        zzg(n);
    }

    public static void zzg(int n){
        if(n==0){
            return;
        }

        System.out.print(" "+n);
        zzg(n-1);
        System.out.print(" "+n);
        zzg(n-1);
        System.out.print(" "+n);
    }
}


 */




//TOWER OF HANNOI
//VERY IMPORTANT PROBLEM OF RECURSION

/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int t1d=sc.nextInt();
        int t2d=sc.nextInt();
        int t3d=sc.nextInt();
        toh(n,t1d,t2d,t3d);

    }

    public static void toh(int n,int t1d,int t2d,int t3d){

        if(n==0){
            return;
        }
        toh(n-1,t1d,t3d,t2d); //will print the instructions to move n-1 disks from t1 to t3 using t2
        System.out.println(n + "["+t1d+"->"+t2d+"]");
        toh(n-1,t3d,t2d,t1d);
    }
}

 */




//Display array element using recursion

/*

package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int idx=sc.nextInt();
        int[] arr=new int[idx];

        for(int i=0;i<idx;i++){
            arr[i]=sc.nextInt();
        }

        displayArr(arr,idx-1);
    }

    public static void displayArr(int[] arr, int idx){
        if(idx==-1){
            return;
        }


        displayArr(arr,idx-1);
        System.out.println(arr[idx]);

    }
}

 */




//Display array element using recursion
/*

package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int idx=sc.nextInt();
        int[] arr=new int[idx];

        for(int i=0;i<idx;i++){
            arr[i]=sc.nextInt();
        }

        displayArr(arr,0);
    }

    public static void displayArr(int[] arr, int idx){
        if(idx==arr.length){
            return;
        }

        System.out.println(arr[idx]);
        displayArr(arr,idx+1);
    }
}

 */




//display reverse of array using recursion


/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int idx=sc.nextInt();
        int[] arr=new int[idx];

        for(int i=0;i<idx;i++){
            arr[i]=sc.nextInt();
        }

        displayArr(arr,idx-1);
    }

    public static void displayArr(int[] arr, int idx){
        if(idx==-1){
            return;
        }

        System.out.println(arr[idx]);
        displayArr(arr,idx-1);

    }
}

 */




//Display array element using recursion

/*

package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int idx=sc.nextInt();
        int[] arr=new int[idx];

        for(int i=0;i<idx;i++){
            arr[i]=sc.nextInt();
        }

        displayArr(arr,0);
    }

    public static void displayArr(int[] arr, int idx){
        if(idx==arr.length){
            return;
        }

        displayArr(arr,idx+1);
        System.out.println(arr[idx]);
    }
}

 */




//Find maximum of array using recursion

/*


package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int idx=sc.nextInt();
        int[] arr=new int[idx];

        for(int i=0;i<idx;i++){
            arr[i]=sc.nextInt();
        }
        int max =maxOfArray(arr,0);
        System.out.println(max);
    }

    public static int maxOfArray(int[] arr, int idx){

 //       if(idx==arr.length){
 //           return 0;
 //       }


        if(idx==arr.length-1){
            return arr[idx];
        }

       int misa= maxOfArray(arr,idx+1);
       if(misa>arr[idx]){
           return misa;
       }
       else{
           return arr[idx];
       }
    }
}

 */




//First index of occurrence in Array using recursion

/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int idx=sc.nextInt();
        int[] arr=new int[idx];

        for(int i=0;i<idx;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int fi =firstIndex(arr,0,x);
        System.out.println(fi);
    }

    public static int firstIndex(int[] arr, int idx, int x){


        if(idx==arr.length){
            return -1;
        }

        if(arr[idx]==x){
            return idx;
        }else{
            int fiisa=firstIndex(arr,idx+1,x);
            return fiisa;
        }


   //     int fiisa= firstIndex(arr,idx+1,x);
   //     if(arr[idx]==x){
   //         return idx;
   //     }else{
   //         return fiisa;
   //     }


    }
}

 */




// print last index of occurrence in array using recursion
/*

package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int res=lastIndex(arr,0,x);
        System.out.println(res);
    }

    public static int lastIndex(int[] arr, int idx, int x){

        if(idx==arr.length){
            return -1;
        }

        int liisa = lastIndex(arr,idx+1, x);
        if(liisa==-1){
            if(arr[idx]==x){
                return idx;
            }
            else{
                return -1;
            }
        }
        else{
            return liisa;
        }

    }
}

 */





/*
package com.company;
import java .util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        allIndices(arr,0,x);
       // System.out.println(res);

    }

    public static int  allIndices(int[] arr,int idx,int x){

        if(idx==arr.length){
            return -1;
        }
        int res=allIndices(arr,idx+1,x);
        if(res==-1) {
            if (arr[idx] == x) {
                System.out.println(idx);

            } else {
                return -1;
            }
        }

        return -1;
    }
}



 */





//ALL INDICES IN ARRAY
/*

package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int [] iarr=allIndices(arr,x,0,0);

        if(iarr.length==0){
            System.out.println();
            return;
        }

        for(int i=0;i<iarr.length;i++){
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr,int x,int idx,int fsf){
        if(idx==arr.length){
            return new int[fsf];
        }

        if(arr[idx]==x){
            int[] iarr = allIndices(arr,x,idx+1,fsf+1);
            iarr[fsf]=idx;
            return iarr;
        }
        else{
            int[] iarr = allIndices(arr,x,idx+1,fsf);
            return iarr;
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
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int sum = 0;
            int c1 = 0;
            int c2 = 0;
            int c3 = 0;
            int[] arr = new int[n];

            for (int k = 0; k < n; k++) {
                arr[k] = sc.nextInt();
            }


            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    sum += arr[i] + arr[j];
                    if (sum % 2 == 0) {
                        c1++;
                    } else {
                        c2++;
                    }

                    sum = 0;
                }
            }


                if (c2 > 0 && c1 == 0) {
                    System.out.println("chef");
                }
                if (c1 > 0 && c2 == 0) {
                    System.out.println("chefina");
                }
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
        int n = sc.nextInt();
        int a=0;
        int b=1;
        int sum=0;
        int d=0;
        int c=0;
        for (int i = 0; i <= n; i++) {

            if(n==3){
                System.out.println("yes");
                break;
            }

            if(a==n){
                System.out.println("yes");
                c++;
            }else{
                d++;
            }

            sum =a+b;
            a=b;
            b=sum;
        }
        if(d>0 && c==0 ){
            System.out.println("no");
        }
    }
}

 */




//GET SUBSEQUENCE
/*

package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        ArrayList<String> res= gss(str);
        System.out.println(res);
    }

    public static ArrayList<String> gss(String str){

        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch=str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String> rres =gss(ros);

        ArrayList<String> mres=new ArrayList<>();
        for(String rstr : rres ){
            mres.add(""+rstr);
        }

        for(String rstr : rres ){
            mres.add(ch+rstr);
        }

        return mres;
    }
}

 */




package com.company;
import java.util.Scanner;

    public class Main{

            String colour;
            private int number;

        class Car extends Main{
            public static void main(String[] args) {
                Main v = new Main();
                v.colour = "black";
                v.number = 8486;
                System.out.println(v.number + " " + v.colour);
            }
        }

    }


