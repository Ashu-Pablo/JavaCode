/*
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int a= sc.nextInt();
            int b= sc.nextInt();
            if(a+b<3){
                System.out.println("1");
            }
            else if(a+b>=3 && a+b<=10){
                System.out.println("2");
            }
            else if(a+b>=11 && a+b<=60){
                System.out.println("3");
            }
            else{
                System.out.println("4");
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
            int m = sc.nextInt();
            int h = sc.nextInt();
            if(m/(h*h)<=18){
                System.out.println("1");
            }
            else if(m/(h*h)>=19 && m/(h*h)<=24){
                System.out.println("2");
            }
            else if(m/(h*h)>=25 && m/(h*h)<=29){
                System.out.println("3");
            }
            else {
                System.out.println("4");
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
            int xa = sc.nextInt();
            int xb = sc.nextInt();
            int Xa = sc.nextInt();
            int Xb = sc.nextInt();
            System.out.println((Xa/xa)+(Xb/xb));

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
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a>=b && a>=c){
                System.out.println(a);
            }
            else if(a<=b && c<=b){
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
        }
    }
}
*/
/*
package com.company;
import java.util.Scanner ;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            System.out.println(x/(2*y));
        }
    }
}

 */
/*
package com.company;
import java .util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System .in);
        int  t=sc.nextInt();
        for(int i =0;i<t;i++){
            int m=sc.nextInt();
            int s=sc.nextInt();
            System.out.println(m/s);

        }
    }
}

 */


/*
package com.company;
import java.util.Scanner ;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            if(x+y==z){
                System.out.println("EQUAL");
            }
            else if(x+y<z){
                System.out.println("PLANEBUS");
            }
            else if(x<=y && x<=z){
                System.out.println("TRAIN");
            }


        }
    }
}



 */

/*
package com.company;
import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y1 = sc.nextInt();
            int y2 = sc.nextInt();
            int z1 = sc.nextInt();
            int z2 = sc.nextInt();
            if(x1<=x2 && y1<=y2 && z1>=z2){
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
import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int z = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (z - y >= a + b + c) {
                System.out.println("yes");

            }
            else {
                System.out.println("no");
            }
        }
    }
}

 */


//GCD (HCF) AND LCM

/*
package com.company;
import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a = n;
        int b = m;

        while (n%m!=0){
            int rem=n%m;
            n=m;
            m=rem;
        }
        int gcd=m;
        int lcm=(a*b)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}


 */

//prime factorisation
//1st method
/*
package com.company;
import java .util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<n;i++){
            while(n%i==0){
                n=n/i;
                System.out.println(i);
            }
        }
        if(n!=1){
            System.out.println(n);
        }
    }

}


 */

//2nd method
/*
package com.company;
import java .util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i*i <= n; i++) {
            while (n % i == 0) {
                n = n / i;
                System.out.println(i);
            }
        }
        if(n!=1){
            System.out.println(n);
        }
    }
}

 */

//check pythogorus
/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int b=sc.nextInt();
        int p=sc.nextInt();

        if((h*h)==(b*b)+(p*p)){
            System.out.println("pythogorus");
        }
        else {
            System.out.println("not pythogorus");
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
        int n=sc.nextInt();
        for(int i=1;i*i<=n;i++){
            System.out.println(i*i);
        }
    }
}

 */

/*
package com.company;
import java.util.Scanner;

public  class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            5
        }

    }

}

 */
/*
package com.company;
import java.util.Scanner;

public  class Main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++) {
            int n=sc.nextInt();
            int num=n/7;
            if((n%7)>5){
                num++;
            }
            System.out.println(num);
        }
    }
}

 */

/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner (System .in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a>b){
                System.out.println(a);
            }
            else {
                System.out.println(b);
            }
            System.out.println(a+b);
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
        for(int i=0;i<t;i++){
            int c=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            System.out.println((c-x)*y);


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
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int k=sc.nextInt();
            if(n>=k/x){
                System.out.println(k/x);
            }
            else{
                System.out.println(n);
            }



        }
    }
}

 */

//find the largest number from 1 to 10 which divides the number n.
/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        for(int i=10;i>=1;i--){
            if(n%i==0) {
                System.out.println(i);
                break;
            }

        }
    }
}

 */

/*
package com.company;
import java .util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int x=sc.nextInt();
            if(x>=1 && x<100){
                System.out.println("Easy");
            }
            else if(x>=100 && x<200){
                System.out.println("Medium");
            }
            else {
                System.out.println("Hard");
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
            int x1=sc.nextInt();
            int x2=sc.nextInt();
            int y1=sc.nextInt();
            int y2=sc.nextInt();
            if(y1/x1<y2/x2){
                System.out.println("-1");
            }
            else if(y1/x1>y2/x2){
                System.out.println("1");
            }
            else
            {
                System.out.println("0");
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
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int r=sc.nextInt();
            if(r>=2000){
                System.out.println("1");
            }
            else if(r<2000 && r>=1600){
                System.out.println("2");
            }
            else
            {
                System.out.println("3");
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
            int p=sc.nextInt();
            System.out.println(p/2+1);
        }
    }
}

 */

/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int count=0;
            for(int j=l;j<=r;j++){
                //int count=0;
                if(j%3==0){
                    count++;
                }

            }
            System.out.println(count);
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
            int l = sc.nextInt();
            int r = sc.nextInt();
           // int count = 0;
            for (int j = l; j <= r; j++) {
                int count=0;

                if (j % 10 == 2 && j % 10 == 3 && j % 10 == 9) {
                    count++;
                    //System.out.println(count);
                }
                System.out.println(count);
            }
            //System.out.println(count);
        }
    }
}


 */


//PATTERN QUESTION 1
/*
package com.company;
import java .util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}


 */

//PATTERN QUESTION 2
/*
package com.company;
import java .util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

 */

//PATTERN QUESTION 3
/*
package com.company;
import java .util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int space=n-1;
        int star=1;

        for (int i = 1; i <= n; i++) {
            //System.out.print(space+";"+star);
            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }

            for(int k=1;k<=star;k++){
                System.out.print("*\t");
            }
            space--;
            star++;
            System.out.println();
        }
    }
}


 */

//PATTERN QUESTION 4
/*
package com.company;
import java .util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space =0;
        int star=n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            for (int k=1;k<=star;k++) {
                System.out.print("*\t");
            }
            space++;
            star--;
            System.out.println();
        }
    }
}
*/


   /*
         *
       * *
     * * *
       * *
         *
    */

/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();

        int space=n/2;
        int star=1;
        for(int i=1;i<=n;i++){
            if(i<=n/2){
               // space--;
                //star++;
                for(int j=1;j<=space;j++ ) {
                    System.out.print("\t");
                }
                for(int k=1;k<=star;k++){
                    System.out.print("*\t");
                }
                space--;
                star++;
            }
            else{
                //space++;
                //star--;
                for(int j=1;j<=space;j++ ) {
                    System.out.print("\t");
                }
                for(int k=1;k<=star;k++){
                    System.out.print("*\t");
                }
                space++;
                star--;
            }
            System.out.println();

        }

    }

}

 */

//PATTERN QUESTION 5

//PROGRAMMING  LANGUAGES
/*
package com.company;
import java .util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int a1=sc.nextInt();
            int b1=sc.nextInt();
            int a2=sc.nextInt();
            int b2=sc.nextInt();
            if(a==a1 && b==b1 || a==b1 && b==a1){
                System.out.println("1");

            }
            else if(a==a2 && b==b2 || a==b2 && b==a2){
                System.out.println("2");
            }
            else{
                System.out.println("0");
            }


        }

    }
}

 */

//PRINT PATTERN LIKE
          /*            *
                    *   *   *
                *   *   *   *   *
                    *   *   *
                        *

           */
/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();

        int space=n/2;
        int star=1;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }

            for(int k=1;k<=star;k++){
                System.out.print("*\t");
            }

            if(i<=n/2){
                space--;
                star+=2;
            }
            else {
                space++;
                star-=2;
            }
            System.out.println();
        }
    }
}

 */


//PRINT A PATTERN LIKE
            /*     * * *   * * *
                   * *       * *
                   *           *
                   * *       * *
                   * * *   * * *

             */

//pattern question 6
/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int star=3;//(n/2)+1;
        int space=1;

        for(int i=1;i<=n;i++){
           // System.out.println(star+","+space+","+star);

            for(int j=1;j<=star; j++){
                System.out.print("*\t");
            }

            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }

            for(int j=0;j<=star;j++){
                System.out.print("*\t");
            }

            if(i<=n/2){
                star --;
                space += 2;
            }
            else {
                star ++;
                space -= 2;
            }
            System.out.println();
        }

    }
}


 */

 //PRINT A PATTERN LIKE
/*    *
        *
          *
            *
              *
 */
/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int space=0;
        int star=1;

        for(int i=1;i<=n;i++){
            int j;
            for( j=1;j<=n;j++){
                if(i==j)
                System.out.print("*\t");
                else
                {
                    System.out.print("\t");
                }
            }

            System.out.println();

        }
    }
}

 */

//PRINT A PATTERN LIKE
/*                 *
                 *
               *
             *
           *
 */

/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int space=0;
        int star=1;

        for(int i=1;i<=n;i++){

            for( int j=n;j>=1;j--){
                if(i==j)
                    System.out.print("*\t");
                else
                {
                    System.out.print("\t");
                }
            }

            System.out.println();

        }
    }
}

 */


//PRINT A PATTERN LIKE
/*
       *              *
          *       *
              *
          *       *
      *               *
 */

/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in) ;
        int n=sc.nextInt();
         for (int i=1;i<=n;i++){
             for(int j=1;j<=n;j++){
                 if(i==j || i+j==n+1) {
                     System.out.print("*\t");
                 }
                 else
                 {
                     System.out.print("\t");
                 }

             }

             System.out.println();

         }
    }
}

 */

//PRINT A PATTERN LIKE
    /*                        *
                     *                 *
            *                                   *
                     *                 *
                              *
*/
/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();

        int outspace=n/2;
        int inspace=-1;

        for(int i=1;i<=n;i++){
           // System.out.println(outspace+","+inspace);

            for(int j=0;j<=outspace;j++){
                System.out.print("\t");
            }

                System.out.print("*\t");


            for(int j=1;j<=inspace;j++){
                System.out.print("\t");
            }

            if(i>1 && i<n){
                System.out.print("*\t");
            }

            if(i<=n/2){
                outspace--;
                inspace+=2;

            }
            else{
                outspace++;
                inspace-=2;
            }
            System.out.println();

        }
    }
}

*/




/*
package com .company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x>=750){
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }

}

 */

/*
package com .company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1;i<=t;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println((x*y)/100);
        }
    }
}


 */

/*
package com .company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int x=sc.nextInt();
            if(x%10==0){
                System.out.println(x/10);
            }
            else if(x%10==5){
                System.out.println((x/10)+((x%10))/5);
            }
            else{
                System.out.println("-1");
            }
        }
    }
}
*/

/*
package com .company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            System.out.println((2*(n/3)*x)+(n%3)*x);

        }
    }
}

*/

//PRINT A PATTERN LIKE
/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
  */


/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int value=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(value +"\t");
                  value++;
            }

            System.out.println();
        }

    }
}
*/


//PRINT A PATTERN LIKE
/*
1   2  3  4  5
6   7  8  9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25

 */
/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int value=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(value +"\t");
                value++;
            }

            System.out.println();
        }

    }
}

 */


//PRINT A PATTERN LIKE
   /*   0
        1 1
        2 3  5      //FIBBONNACI SERIES
        8 13 21 34

    */
/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a+"\t");
                int c=a+b;
                a=b;
                b=c;
            }
            System.out.println();
        }


    }
}
*/

//PRINT A PATTERN LIKE
/*
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1

 */

/*
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int icj=1;
            for(int j=0;j<=i;j++){
                System.out.print(icj+"\t");
                int icjp1=icj*(i-j)/(j+1);
                icj=icjp1;
            }
            System.out.println();
        }
    }
}


 */

//PRINT A TABLE OF 5

/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
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
        if(x>=750){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }

    }
}
*/


//PRINT A PATTERN LIKE
/*
             1
          2  3  2
       3  4  5  4  3
          2  3  2
             1
 */

/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();

        int space=n/2;
        int star=1;
        int value=1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }

            int val=value;
            for(int k=1;k<=star;k++){
                System.out.print(val+ "\t");

                if(k<=star/2) {
                    val++;
                }
                else {
                    val--;
                }

            }

            if(i<=n/2){
                space--;
                star +=2;
                value++;
            }
            else{
                space++;
                star -=2;
                value--;
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
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int star=1;
         int space=2*n-3;

         for(int i=1;i<=n;i++){

             for(int j=1;j<=star;j++){
                 System.out.print("*\t");

             }

             for(int j=1;j<=space;j++){
                 System.out.print("\t");
             }

             for(int j=1;j<=star;j++){
                 System.out.print(star+"\t");


             }



             if(i<=n/2){
                 star++;
                 space -=2;
             }
             else{
                 star--;
                 space +=2;
             }
             System.out.println();
         }

    }
}

 */

//PRINT A PATTERN LIKE
 /*     *					    *
        *	*				*	*
        *	*	*		*	*	*
        *	*	*	*	*	*	*
*/
/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int space=2*n-3;

        for(int i=1;i<=n;i++){

            for(int j=1;j<=star;j++){
                System.out.print("*\t");

            }

            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }
            if(i==n)
                    star--;

            for(int j=1;j<=star;j++){
                System.out.print("*\t");
            }
                star++;
                space -=2;

            System.out.println();
        }

    }
}
*/

//PRINT A PATTERN LIKE
 /*     1						1
        1	2				2	1
        1	2	3		3	2	1
        1	2	3	4	3	2	1
*/
/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=1;
        int space=2*n-3;

        for(int i=1;i<=n;i++){
            int value=1;
            for(int j=1;j<=star;j++){
                System.out.print(value+"\t");
                value++;
            }

            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }
            if(i==n) {
                star--;
                value--;
            }
            for(int j=1;j<=star;j++){
                value--;
                System.out.print(value+"\t");

            }
            star++;
            space -=2;

            System.out.println();
        }

    }
}

 */