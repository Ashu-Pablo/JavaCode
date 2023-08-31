/*
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int N=sc.nextInt();

        if(N%2==1){
            System.out.println("Weird");

        }
        else if(N%2==0 && N>=2 && N<=5){
            System.out.println("Not Weird");

        }
        else if(N%2==0 && N>=6 && N<=20){
            System.out.println(" Weird");
        }
        else {
           // if(N>20 && N%2==0){
                System.out.println("Not Weird");
           // }
        }

    }
}
*/

//PRINT A PATTERN LIKE
/*

 *
 *	*
 *	*	*
 *	*
 *

 */
/*
package com .company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int space=n/2;
        int star=1;

        for(int i=1;i<=n;i++){
            for (int j=1;j<=space;j++) {
                System.out.print("\t");
            }

            for(int j=1;j<=star;j++){
                System.out.print("*\t");
            }

            if(i<=n/2){
                star++;
            }
            else{
                star--;
            }
            System.out.println();

        }

    }
}

 */

//PRINT A PATTERN LIKE
/*
       *
       *  *
 *  *  *  *  *
       *  *
       *
 */
/*
package com .company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int space=n/2;
        int star=1;

        for(int i=1;i<=n;i++){
            for (int j=1;j<=space;j++) {
                //System.out.print("\t");
                if(i==n/2+1){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }

            for(int j=1;j<=star;j++){
                System.out.print("*\t");
            }

            if(i<=n/2){
                star++;
            }
            else{
                star--;
            }
            System.out.println();

        }

    }
}

 */

//PRINT A PATTERN LIKE
/*

 *	*	*	*	*	*	*
    *	*	*   *	*
        *	*	*
            *
        *	*	*
    *	*	*	*	*
 *	*	*	*	*	*	*


 */

/*
package com.company;
import java .util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int space=1;
        int star=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<space;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=star;j++){

                    System.out.print("*\t");

            }
            if(i<=n/2){
                star-=2;
                space++;
            }
            else{
                star +=2;
                space--;
            }
            System.out.println();
        }
    }
}

 */

//PRINT A PATTERN LIKE
/*
 *	*	*	*	*	*	*
    *				*
        *       *
            *
        *   *   *
    *   *   *   *   *
 *  *   *   *   *   *   *

 */
/*
package com.company;
import java .util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int space=1;
        int star=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<space;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=star;j++){
                if(i>1 && i<=n/2 && j>1 && j<star)
                {
                    System.out.print("\t");
                }else {
                    System.out.print("*\t");
                }
            }
            if(i<=n/2){
                star-=2;
                space++;
            }
            else{
                star +=2;
                space--;
            }
            System.out.println();
        }
    }
}
*/

//PRINT A PATTERN LIKE
/*

 *				*
 *				*
 *		*		*
 *	*		*	*
 *				*

 */
/*
package com .company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();


        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j==1 || j==n){
                    System.out.print("*\t");
                }
                else if(i>n/2 && (i==j || i+j==n+1)) {
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
import java .util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n;k++){
                if(k==1 || k==n){
                    System.out.print("*\t");
                }
                else if(i<n/2 && (i==k||i+k==n+1)){
                    System.out.print("*\t");
                }else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();

        }

    }
}

 */

/*
package  com.company;
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int k=sc.nextInt();
           if(k%2==1){
               System.out.println(3*(k/2+1)-k/2);
           }
           else {
               System.out.println(3*k/2-k/2);
           }
        }

    }
}

 */


//PRINT A PATTERN LIKE
/*

					  love your goal  	  love your goal  	  love your goal  	  love your goal  	  love your goal
				  love your goal  	  love your goal  	  love your goal  	  love your goal  	  love your goal
			  love your goal  	  love your goal  	  love your goal  	  love your goal  	  love your goal
		  love your goal  	  love your goal  	  love your goal  	  love your goal  	  love your goal
	  love your goal  	  love your goal  	  love your goal  	  love your goal  	  love your goal

 */
/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int space=n;
        int star=n;
        for(int i=1;i<=n;i++){
            for(int j=space;j>=1;j--){
                System.out.print("\t");
            }
            for(int j=1;j<=star;j++){
                System.out.print("  love your goal  \t");

            }
            space--;
            System.out.println();
        }
    }
}

 */

/*
                ***(LOVE YOU MOM)***  	  ***(LOVE YOU MOM)***  	  ***(LOVE YOU MOM)***  	  ***(LOVE YOU MOM)***  	  ***(LOVE YOU MOM)***
             ***(LOVE YOU MOM)***  	  ***(LOVE YOU MOM)***  	  ***(LOVE YOU MOM)***  	  ***(LOVE YOU MOM)***  	  ***(LOVE YOU MOM)***
          ***(LOVE YOU MOM)***    ***(LOVE YOU MOM)***  	  ***(LOVE YOU MOM)***  	  ***(LOVE YOU MOM)***  	  ***(LOVE YOU MOM)***
       ***(LOVE YOU MOM)***   ***(LOVE YOU MOM)***  	  ***(LOVE YOU MOM)***  	  ***(LOVE YOU MOM)***  	  ***(LOVE YOU MOM)***
    ***(LOVE YOU MOM)***   ***(LOVE YOU MOM)***  	  ***(LOVE YOU MOM)***  	  ***(LOVE YOU MOM)***  	  ***(LOVE YOU MOM)***

 */
/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int space=n;
        int star=n;
        for(int i=1;i<=n;i++){
            for(int j=space;j>=1;j--){
                System.out.print("\t");
            }
            for(int j=1;j<=star;j++){
                System.out.print("  ***(LOVE YOU MOM)***  \t");


            }
            space--;
            System.out.println();
        }
    }
}
*/

/*
                 * 	 * 	 * 	 * 	 *
             * 	 * 	 * 	 * 	 *
         * 	 * 	 * 	 * 	 *
     * 	 * 	 * 	 * 	 *
 *   * 	 * 	 * 	 *
 */
/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int space=n;
        int star=n;
        for(int i=1;i<=n;i++){
            for(int j=space;j>=1;j--){
                System.out.print("\t");
            }
            for(int j=1;j<=star;j++){
                System.out.print(" * \t");


            }
            space--;
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
        Scanner sc=new Scanner (System.in);
        int T=sc.nextInt();
        for(int i=1;i<=T;i++){
            int X=sc.nextInt();
            int Y=sc.nextInt();
            int D=sc.nextInt();

           if(X>Y && X-Y<=D){
               System.out.println("yes");
           }
           else if(Y>X && Y-X<=D){
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
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        int x=sc.nextInt();
        if(x+7>170){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}

 */

/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int x=sc.nextInt();
        if(a==x||b==x||c==x){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
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
        int t=sc.nextInt();

        for(int i=1;i<=t;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

             if(x!=a && x!=b && y!=a && y!=b){
                System.out.println("2");
            }
            else if(x!=a && x!=b && y==a && y!=b){
                System.out.println("1");

            }
            else if(x!=a && x!=b && y!=a && y==b){
                System.out.println("1");
            }
            else if(x==a && x!=b && y!=a && y!=b){
                 System.out.println("1");
             }
            else if(x!=a && x==b && y!=a && y!=b){
                 System.out.println("1");
             }
            else{
                 System.out.println("0");
             }
        }
    }
}

 */


/*
package com.company;
import java .util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int s=sc.nextInt();
            int x=s;
            int y=0;

            if(s==x+y) {

                x++;
                y--;
            }
            System.out.println(-(x));


        }

    }
}

 */

/*
package com.company;
import java .util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int a1=1;
            int a2=a1+1;
           // if(a<0||b<0||c<0||d<0){

              /*  while( b!=a1*a2 ){
                    a1++;
                    a2++;
                }
                System.out.println(a1+" "+a2);

           // }
           if(a<0||b<0||c<0||d<0){
                System.out.println("-1  -1");
                break;
           }*/

/*
            while (a!=a1-a2 && b!=a1*a2  && c!=a1/a2 && d!=a1+a2){
                a1++;
                a2++;
            }
            System.out.println(a1+" "+a2);


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
        for(int i=0;i<t;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x>y){
                System.out.println(x-y);
            }
            else{
                System.out.println(y-x);
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
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            if (m-k>=n){
                System.out.println("yes");
            }
            else {
                System.out.println("no");
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
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(m>=n){
                System.out.println(n);
            }
            else{
                System.out.println((n-m)+n);
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
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();

            if(x>=y){
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
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int x=sc.nextInt();
            int m=sc.nextInt();
            int y=sc.nextInt();

            if(x*y<m){
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
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();

           if(y%x>0){
               System.out.println(y/x);
           }
           else{
               System.out.println(y/x-1);
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
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++){
            int l=sc.nextInt();
            int r=sc.nextInt();
            int count=0;
            for(int k=l;k<=r;k++){
                if(k%10==2 || k%10==3 || k%10==9){
                    count++;
                }

            }
            System.out.println(count);

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
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t ;i++){
            int n=sc.nextInt();
            int [] a=new int[n];
            for(int j=0;j<a.length;j++){
                a[j]=sc.nextInt();
            }
            Arrays.sort(a);
            int sum=0;
            for(int k=1;k<a.length;k++){
                sum +=a[k];
            }
            System.out.println(sum);
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
        int t=sc.nextInt();

        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int [] a=new int[n];

            int count=0;
            for(int j=0;j<a.length;j++){
                a[j]=sc.nextInt();
            }
            for(int j=0;j<a.length;j++){
                if(a[j]>k){
                    count++;
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
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int sum=a+b;
            while(sum>-1){
                sum=sum%10;
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
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int sum=a+b;
            int temp=sum;
            int count=0;
            while(sum>0){
                temp=sum%10;
                sum=sum/10;
                if (temp==0){
                    System.out.println("6");
                }
                else if(temp==1) {
                    System.out.println("2");
                }
                else if(temp==2){
                    System.out.println("5");
                }
                else if(temp==3){
                    System.out.println("5");
                }
                else if(temp==4){
                    System.out.println("4");
                }
                else if(temp==5){
                    System.out.println("5");
                }
                else if(temp==6){
                    System.out.println("6");
                }
                else if(temp==7){
                    System.out.println("3");
                }
                else if(temp==8){
                    System.out.println("7");
                }
                else{
                    System.out.println("6");
                }

            }

        }
    }
}

 */


//factorial program
/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int fact=1;

        for(int i=1;i<=n;i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}

 */


//playing with matches
/*
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int []arr={6,2,5,5,4,5,6,3,7,6};

        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int sum=a+b;
            int temp=0;
            int count=0;
            while(sum>0){
                temp=sum%10;
                sum=sum/10;
                count +=arr[temp];

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
        Scanner sc=new Scanner (System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(s1.length());
        System.out.println(s2.length());

        float l1=s1.length();
        float l2=s2.length();

        if(l1==l2){
            System.out.println("good");
        }
        else{
            System.out.println("bad");
        }


        if(l1>l2){
            System.out.println(((l1-l2)/l2)*100);
        }
        else{
            System.out.println(((l2-l1)/l2)*100);
        }




    }
}
*/

/*
package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < arr.length;j++){
                arr[j]=sc.nextInt();
            }
            Arrays.sort(arr);
            int count=0;
             for(int k=0;k<arr.length-1;k++){
                 if (arr[k]==arr[k+1]){
                     count++;
                 }
             }
            System.out.println(n-count);
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
        for(int i=0;i<t;i++){
            int x=sc.nextInt();
            if(x>=1 && x<=4){
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

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            if(y/x<z){
                System.out.println(z-(y/x));
            }
            else{
                System.out.println("0");
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
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int [] a=new int[n];

            for(int j=0;j<a.length;j++){
                a[j]=sc.nextInt();
            }

            int co=0;
            for(int j=1;j<a.length;j++){

                if(a[0]+a[j]>a[0]*a[j]){
                    co++;
                }

            }
            System.out.println(co);

        }
    }
}

 */


//Binary search algorithm
/*
package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner (System .in);
        int n=sc.nextInt();
        int [] a=new int[n];

        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);

        int m=sc.nextInt();
        int l=0;
        int h=a.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(m>a[mid]){
                l=mid+1;
            }
            else if(m<a[mid]){
                h=mid-1;
            }
            else{
                System.out.println(mid);
                return;
            }

        }
        System.out.println("-1");
    }
}

 */


//Binary search on reverse sorted array
/*
package com.company;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner (System .in);
        int n=sc.nextInt();
        int [] a=new int[n];

        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        int m=sc.nextInt();
        int l=0;
        int h=a.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(m>a[mid]){
                h=mid-1;
            }
            else if(m<a[mid]){
                l=mid+1;
            }
            else{
                System.out.println(mid);
                return;
            }

        }
        System.out.println("-1");
    }
}

 */


//Print first and last index of array
/*
package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner (System .in);
        int n=sc.nextInt();
        int [] a=new int[n];

        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        int m= sc.nextInt();
        int l=0;
        int h=a.length-1;
        int fi=-1;

        //code for printing first index
        while(l<=h){
            int mid=(l+h)/2;
            if(m>a[mid]){
                l=mid+1;
            }
            else if(m<a[mid]){
                h=mid-1;
            }
            else{
                fi=mid;
                h=mid-1;
            }

        }
        System.out.println(fi);

        //Code for last index
        l=0;
        h=a.length-1;
        int li=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(m>a[mid]){
                l=mid+1;
            }
            else if(m<a[mid]){
                h=mid-1;
            }
            else{
                li=mid;
                l=mid+1;
            }

        }
        System.out.println(li);

    }
}

 */


//count of an element in a sorted array
package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner (System .in);
        int n=sc.nextInt();
        int [] a=new int[n];

        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        int m= sc.nextInt();
        int l=0;
        int h=a.length-1;
        int fi=-1;

        //code for printing first index
        while(l<=h){
            int mid=(l+h)/2;
            if(m>a[mid]){
                l=mid+1;
            }
            else if(m<a[mid]){
                h=mid-1;
            }
            else{
                fi=mid;
                h=mid-1;
            }

        }
       // System.out.println(fi);

        //Code for last index
        l=0;
        h=a.length-1;
        int li=-1;

        while(l<=h){
            int mid=(l+h)/2;
            if(m>a[mid]){
                l=mid+1;
            }
            else if(m<a[mid]){
                h=mid-1;
            }
            else{
                li=mid;
                l=mid+1;
            }

        }
        System.out.println(li);
        System.out.println(li-fi+1);

    }
}