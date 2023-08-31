//PRINT YOUR NAME

/*
package com.company;
import java.util.Scanner;

public class Main {

    public static void printMyName(String name){
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        printMyName(name);

    }
}

 */

//ADDITION AND MULTIPLICATION OF TWO NUMBERS
/*
package com.company;
import java.util.Scanner;

public class Main {

    public static void Add(int a,int b){
        System.out.println(a+b);
        System.out.println(a*b);
        return;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of test cases");
        int t=sc.nextInt();
        for(int i=1;i<=t;i++) {
            System.out.println("enter the value of first number:");
            int x = sc.nextInt();
            System.out.println("enter the value of second number:");
            int y = sc.nextInt();
            System.out.println("sum =" + (x + y));
            System.out.println("multiply =" + (x * y));
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

        int space=n-1;
        int star=n;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }

            for(int j=1;j<=star;j++){
                System.out.print(" *** love you mom *** \t");
            }

            space--;
            System.out.println();
        }

    }

}
*/

//write  function to takes in the radius as a input and returns the circumference of a circle
/*
package com.company;
import java.util.Scanner;

public class Main{
    public static double crc(double r){
        double pi=3.14;
        double cirm=2*pi*r;
        return cirm;

    }

    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        double x=sc.nextInt();
        double ci=crc(x);
        System.out.println(ci);
    }
}

*/


/*
package com.company;
import java.util.Scanner;

public class Main{
    public static int count(int m,int n){
        int rv=0;
        while(m>0){
            int dig=m%10;
            m=m/10;

            if(dig==n){
                rv++;
            }
        }
        return rv;

    }
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=count(a,b);
        System.out.println(c);
    }
}

 */


/*
//THIS IS A PROGRAM TO CONVERT DECIMAL TO ANY BASE
//Examle - [63] base 10 = [77] base 8.
//Examle - [57] base 10 = [111001] base 2.

package com.company;
import java .util.Scanner;

public class Main{
    public static int decimaltoanybase(int n,int b){
       int rv=0;
       int p=1;
       while(n>0){
           int dig=n%b;
           n=n/b;

           rv +=dig*p;
           p=p*10;
       }
       return rv;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();
        int f=decimaltoanybase(n,b);
        System.out.println(f);

    }
}
*/


/*
//  THIS IS A PROGRAM TO CONVERT ANY NUMBER OF ANY BASE TO DECIMAL NUMBER.
//Example - [111001] base 2 = [57] base 10
//Example - [1266] base 8 = [694] base 10

package com.company;
import java .util.Scanner;

public class Main{
    public static int anybasetodecimal(int n,int b1,int b2){
        //n=number
        //b1=base of n
        //b2=base of number in which you want to convert
        int rv=0;
        int p=1;
        while(n>0){
            int dig=n%b2;
            n=n/b2;
            if(b1==2){
                rv += dig * p;
                p = p * 2;
             }
             else{
                rv += dig * p;
                p = p * 2;
             }

        }
        return rv;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int b1=sc.nextInt();
        int b2=sc.nextInt();
        int f=anybasetodecimal(n,b1,b2);
        System.out.println(f);

    }
}


*/

/*

//  THIS IS A PROGRAM TO CONVERT ANY NUMBER OF ANY BASE TO DECIMAL NUMBER.
//Example - [111001] base 2 = [57] base 10
//Example - [1266] base 8 = [694] base 10

package com.company;
import java .util.Scanner;

public class Main{
    public static int anybasetodecimal(int n,int b){
        //n=number
        //n1=base of n
        //n2=base of number in which you want to convert
        int rv=0;
        int p=1;

        if (b == 2) {
            while (n > 0) {
                int dig = n % 10;
                n = n / 10;
                rv += dig * p;
                p = p * 2;
            }

        }

        else{
            while(n>0) {
                int dig = n % 10;
                n = n / 10;
                rv += dig * p;
                p = p * 8;
            }
        }
        return rv;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();

        int f=anybasetodecimal(n,b);
        System.out.println(f);

    }
}

*/


/*

 //  THIS IS A PROGRAM TO CONVERT ANY NUMBER OF ANY BASE TO DECIMAL NUMBER.
//Example - [111001] base 2 = [57] base 10
//Example - [1266] base 8 = [694] base 10


package com.company;
import java .util.Scanner;

public class Main{
    public static int anybasetodecimal(int n,int b){
        //n=number
        //n1=base of n
        //n2=base of number in which you want to convert
        int rv=0;
        int p=1;


            while (n > 0) {
                int dig = n % 10;
                n = n / 10;
                rv += dig * p;
                p = p * b;
            }
        return rv;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int b=sc.nextInt();

        int f=anybasetodecimal(n,b);
        System.out.println(f);

    }
}

 */



//CONVERSION OF A NUMBER TO ANY BASE TO ANY BASE

/*

package com.company;
import java .util.Scanner;

public class Main {
    public static int anybasetoanybase(int n, int b1, int b2) {
        //n=number
        //b1=base of n
        //b2=base of number in which you want to convert
        int dec = anybasetodecimal(n, b1);
        int dn = decimaltoanybase(dec, b2);
        return dn;
    }

    public static int decimaltoanybase(int n, int b) {
        int rv = 0;
        int p = 1;
        while (n > 0) {
            int dig = n % b;
            n = n / b;

            rv += dig * p;
            p = p * 10;
        }
        return rv;
    }

    public static int anybasetodecimal(int n, int b) {
        //n=number
        //n1=base of n
        //n2=base of number in which you want to convert
        int rv = 0;
        int p = 1;


        while (n > 0) {
            int dig = n % 10;
            n = n / 10;
            rv += dig * p;
            p = p * b;
        }
        return rv;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int f = anybasetoanybase(num, b1, b2);
        System.out.println(f);

    }

}

*/



//SUM OF TWO NUMBER HAVING SAME BASE
//Example - [236] base 8 + [754] base 8 = [1212] base 8

/*
package com.company;
import java.util.Scanner;

public class Main{
    public static int getsum(int m,int n,int b){
        int rv=0;
        int c=0;  //c=carry
        int p=1;
        while(m>0 || n>0 || c>0) {
            int d1 = m % 10;
            int d2=n%10;
            m=m/10;
            n=n/10;

            int d=d1+d2+c;
            c=d/b;
            d=d%b;
             rv +=d*p;
             p=p*10;
        }

        return rv;
    }

    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);

        System.out.println("enter the first number:");
        int m=sc.nextInt();
        System.out.println("enter the 2nd number:");
        int n=sc.nextInt();
        System.out.println("enter the base number:");
        int b=sc.nextInt();
        System.out.print("sum=");
        int sum=getsum(m,n,b);
        System.out.print(sum);

    }
}
 */



//SUBSTRACTION OF TWO NUMBERS HAVING SAME BASE
// Example --> [1212] base 8 - [256] base 8 = [734] base 8

/*
package com.company;
import java.util.Scanner;

public class Main{
    public static int getsub(int m,int n,int b){
        //m>n

        int rv=0;
        int c=0;
        int p=1;
        while(m>0){
            int d1=m%10;
            m=m/10;

            int d2=n%10;
            n=n/10;

            int d=0;
            d1=d1+c;

            if(d1>=d2){
                c=0;
                d=d1-d2;
            }
            else{
                c=-1;
                d=d1+b-d2;
            }

            rv +=d*p;
            p=p*10;
        }
        return rv;
    }

    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        system.out.println("enter the larger number:");
        int m=sc.nextInt();
        system.out.println("enter the smaller number:");
        int n=sc.nextInt();
        system.out.println("enter the base number:");
        int b=sc.nextInt();
        system.out.print("substraction = ");
        int f=getsub(m,n,b);

        System.out.print(f);
    }
}

 */
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        int b=sc.nextInt();
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        int d=getproduct(b,n1,n2);
        System.out.println(d);
    }

    public static int getproduct(int b,int n1,int n2){
        int rv=0;
        int p=1;
        while(n2>0){
            int d2=n2%10;
            n2=n2/10;

            int sprd=getproductwithasingledigit(b,n1,d2);
            rv=getsum(b,rv,sprd*p);
            p=p*10;
        }
        return rv;

    }

    public static int getproductwithasingledigit(int b,int n1,int d2){
        int rv=0;
        int c=0;
        int p=1;
        while(n1>0||c>0){
            int d1=n1%10;
            n1=n1/10;

            int d=d1*d2+c;
            c=d/b;
            d=d%b;

            rv=rv+d*p;
            p=p*10;
        }
        return rv;
    }

    public static int getsum(int b,int m,int n){
        int rv=0;
        int c=0;  //c=carry
        int p=1;
        while(m>0 || n>0 || c>0) {
            int d1 = m % 10;
            int d2=n%10;
            m=m/10;
            n=n/10;

            int d=d1+d2+c;
            c=d/b;
            d=d%b;
            rv +=d*p;
            p=p*10;
        }

        return rv;
    }

}