/*
package com.company;
//import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("hello  hiiiii");
    }
}
*/

/*package com.company;

public class Main{
    public static void main(String[] args){
        System.out.println("*****\n   *\n  *\n *\n*****");
    }
}*/

/*
package com.company;

import java.util.*;

//package com.company;
public class Main{
    public static void main(String[] args){
        int a=10;
        int b=50;
        int sum=a+b;
        float mul=a*b;
        float div=a/b;
        float mod=b%a;
        System.out.println(sum);
        System.out.println("sum of"+a+"and"+b+"is"+sum);
        System.out.println("product of"+a+"and"+b+"is"+mul);
        System.out.println("division of"+a+"and"+b+"is"+div);
        System.out.println(div);
        System.out.println("modulas of"+b+"and"+a+"is"+mod);
    }
}

*/


/*
package com.company;

import java.util.Scanner;


public class Main{
    public static void main(String[] args)
    {
        //int marks=64;
        Scanner sc=new Scanner (System.in);
        int marks =sc.nextInt();
        if(marks>90){
            System.out.println("excellent");
        }
        else if(marks>80){
        System.out.println("good");
        }
        else if(marks>70){
        System.out.println("fair");
        }
        else if(marks>60){
            System.out.println("poor");
        }
        else
        {
            System.out.println("bad");
        }
    }
}
*/

/*
//write a program to check a number is greater and smaller

package com.company;


import java.util.Scanner;


public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            System.out.println(a+ "equal to" +b);
        }
        else if(a>b){
            System.out.println(a+ ">" +b);
        }
        else {
            System.out.println(a+ "<" +b);
        }
    }


}

*/


//print the stages of ages using if,else if,else statement
/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int age=sc.nextInt();
        if(age<18){
            System.out.println("teen agers");
        }
        else if(age<50){
            System.out.println("adult");
        }
        else
        {
            System.out.println("old");
        }

    }

}
*/


//Q:- for 1 print red, for 2 print yellow, for 3 print white using break statement;
/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        switch(num){
            case 1:
            {
                System.out.println("red");
                break;
            }

            case 2:
            {
                System.out.println("yellow");
                break;
            }

            case 3:
            {
                System.out.println("white");
                break;
            }

            case 4:
            {
                System.out.println("default");
                break;
            }
        }
    }

}
*/

//Q:- make a simple calculator
/*

package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        System.out.println("choose any operator from +,-,*,/");
        Scanner sc= new Scanner(System.in);
        char op=sc.next().charAt(0);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        int sub=a-b;
        int mul=a*b;
        int div=a/b;

        switch(op){
            case '+':
            {
                System.out.println(a+"+"+b+"="+sum);
                break;
            }
            case '-':
            {
                System.out.println(a+"-"+b+"="+sub);
                break;
            }
            case '*':
            {
                System.out.println(a+"*"+b+"="+mul);
                break;
            }
            case '/':
            {
                System.out.println(a+"/"+b+"="+div);
                break;
            }


        }
    }
}*/


//calculator
/*
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        System.out.println("choose any operator from +,-,*,/,%,|"); // "| symbol for square"
        Scanner sc = new Scanner(System.in);
        char op = sc.next().charAt(0);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        float sum = a + b;
        float sub = a - b;
        float mul = a * b;
        float div = a / b;
        float mod = a % b;
        float sqr = c * c;

        if (op=='|'){
            System.out.println(c+"|"+c+"=" +sqr);
        }

        switch (op) {
            case '+': {
                System.out.println(a + "+" + b + "=" + sum);
                break;
            }
            case '-': {
                System.out.println(a + "-" + b + "=" + sub);
                break;
            }
            case '*': {
                System.out.println(a + "*" + b + "=" + mul);
                break;
            }
            case '/': {
                System.out.println(a + "/" + b + "=" + div);
                break;
            }
            case '%': {
                System.out.println(a + "%" + b + "=" + mod);
                break;
            }


        }

    }
}

 */
/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner (System .in);
        int x= sc.nextInt();
        if(x%2==0){
            System.out.println("even number");
        }
        else
        {
            System.out.println("odd number");
        }

    }
}
*/


//print natural no. from 1 to n
/*

package com.company;
import java .util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner scn = new Scanner (System.in);
        int n=scn.nextInt();
        for (int i=0;i<=n;i++){
            System.out.println(i);
        }

    }

}

 */


//print the table of 5

/*

package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of m:");
        int m=sc.nextInt();
        System.out.println("table of 5 is:");
        for(int i=1;i<=10;i++){
            System.out.println(m+"*"+i+"=" + m*i);
        }
    }
}
*/

/*


package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String args[])
    {
        for (int i=1;i<=50;i++)
        {
            if (i%2==0)
            {
                System.out.println(i);
            }

        }
    }
}
*/

//using while loop

// while loop

/*
package com .company;
import java.util.Scanner;

public class Main{
    public static void main(String args[])
    {
        //Scanner sc= new Scanner (System.in);
        //int m=sc.nextInt();
        int m=0;
        while(m<5){
            m++;
            System.out.println("  ***  " + " *** ");
            System.out.println("  ***  " + " *** ");
            System.out.println("  ***  " + " *** ");
            System.out.println("  ***  " + " *** ");
            System.out.println("*******"+"***** ");
            System.out.println("  ***  " + " *** ");
            System.out.println("   *   " + "  *  ");
        }
    }

}
*/

//print pattern using do while loop

/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        int m=0;
        do{
            m++;
            System.out.println("*  *  *");
            System.out.println("  ***  ");
            System.out.println(" ***** ");
            System.out.println("*******");
            System.out.println(" ***** ");
            System.out.println("  ***  ");
            System.out.println("*  *  *");
        }while(m<5);
    }
}
*/


//check the no. is prime or not
/*
package com.company;
import java . util.Scanner;

public class Main
 {
    public static void main(String args[])
     {
        Scanner sc=new Scanner (System.in);
        int m=sc.nextInt();

        for(int i=0;i<m;i++) {
            int n = sc.nextInt();
            int count=0;

            for(int div=1;div<=n;div++){
                if(n%div==0){
                    count++;
                }
            }

            if(count==2){
                System.out.println("prime no.");
            }
            else {
                System.out.println("not prime");
            }

        }

     }
 }

*/

/*
package com.company;
import java . util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int m=sc.nextInt();

        for(int i=0;i<m;i++) {
            int n = sc.nextInt();
            int count=0;

            for(int div=2;div*div<=n;div++){
                if(n%div==0){
                    count++;
                    break;
                }
            }

            if(count==0){
                System.out.println("prime no.");
            }
            else {
                System.out.println("not prime");
            }

        }

    }
}

*/

/*
//check no. is prime or not
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the no. of terms");
        int m=sc.nextInt();
        for(int i=0;i<m;i++){
            int n=sc.nextInt();

            if(n==2){
                System.out.println("prime  no.");
            }
            if(n==3){
                System.out.println("prime  no.");
            }
            if(n==5){
                System.out.println("prime  no.");
            }
            if(n==7){
                System.out.println("prime  no.");
            }
            else if(n%2==0){
                System.out.println("not prime");
            }
            else if(n%3==0){
                System.out.println("not prime");
            }
            else if(n%4==0){
                System.out.println("not prime");
            }
            else if(n%4==0){
                System.out.println("not prime");
            }
            else if(n%5==0){
                System.out.println("not prime");
            }
            else if(n%6==0){
                System.out.println("not prime");
            }
            else if(n%7==0){
                System.out.println("not prime");
            }
            else if(n%8==0){
                System.out.println("not prime");
            }
            else if(n%9==0){
                System.out.println("not prime");
            }
            else {
                System.out.println("prime no.");
            }
        }
    }
}

*/
/*
package com. company;
import java.util.Scanner;

public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int m=sc.nextInt();
        for (int i=0;i<m;i++){
            System.out.println("enter the first and second number:");
            int n=sc.nextInt();
            int b=sc.nextInt();
            int sum=n+b;
            System.out.println("sum of both the number is");
            System.out.println(sum);
        }

    }
}
*/
/*
package com.company;
import java .util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner (System. in);
        System.out.println("enter the no. of cases");
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            System.out.println("the capacity of" +i+ " bucket is :");
            int x=sc.nextInt();
            System.out.println(("the capacity of water available in"+i+"bucket"));
            int k=sc.nextInt();
            int sub=x-k;
            System.out.println("the capacity of water required for" +i+ "bucket is");
            System.out.println(sub);



        }

    }
}
*/

/*
package com. company;
import java .util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int n =sc.nextInt();
            int  m=sc.nextInt();
            System.out.println(n*2+m*4);
        }



    }
}

*/
/*
package com. company;
import java .util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int x =sc.nextInt();
            int  y=sc.nextInt();
            System.out.println(x*y);
        }

    }
}

 */

/*
package com.company;
import java . util.Scanner;

public class Main{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();

       for(int i=0;i<t;i++){
           int a=sc.nextInt();
           int b=sc.nextInt();
           int x=sc.nextInt();
           int y=sc.nextInt();
           if(x*y>=a*b){
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
import java . util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x>y){
                System.out.println("bike");
            }
            else{
                System.out.println("car");
            }

        }
    }
}

 */


//print all prime number between n to m;

/*
package com.company;
import java . util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the lower number:");
        int n=sc.nextInt();
        System.out.println("enter the higher number:");
        int m=sc.nextInt();
        for(int i=n;i<=m;i++){
            if(i==1){
                System.out.println();
            }
            else if(i==2){
                System.out.println(i);
            }
            else if(i==3){
                System.out.println(i);
            }
            else if(i==5){
                System.out.println(i);
            }
            else if(i==7){
                System.out.println(i);
            }
            else if(i%2==0){
                System.out.println();
            }
            else if(i%3==0){
                System.out.println();
            }
            else if(i%4==0){
                System.out.println();
            }
            else if(i%5==0){
                System.out.println();
            }
            else if(i%6==0){
                System.out.println();
            }
            else if(i%7==0){
                System.out.println();
            }
            else if(i%8==0){
                System.out.println();
            }
            else if(i%9==0){
                System.out.println();
            }
            else{
                System.out.println(i);
            }

        }

    }
}

 */
/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a+b>=11){
                System.out.println(21-(a+b));
            }
            else{
                System.out.println("-1");
            }
        }

    }
}

 */
/*
package com.company;
import java .util.scanner;

 public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int res=0;
            int rest=0;
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int x2=sc.nextInt();
            int y2=sc.nextInt();
            if(x1>x2){
                res=x1-x2;
            }
            else{
                res=x2-x1;
            }
            if(y1>y2){
                rest=y1-y2;
            }
            else{
                rest=y2-y1;
            }
            if(res>rest){
                System.out.println(res);
            }
            else{
                System.out.println(rest);
            }




        }
    }
}
*/

/*
package com.company;
import java .util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int count=0;
            for(int j=0;j<n;j++){
                int a=sc.nextInt();

                if(a>=10 && a<=60){
                    count++;
                }

            }
            System.out.println(count);
        }
    }
}
*/


//print all the prime no. till n solution
/*


package com.company;
import java .util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        for(int i=m;i<=n;i++){
            int count=0;
package com.company;
import java .util.Scanner;

public class Main
            for(int div=2;div*div<=i;div++){
                if(i%div==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println(i);
            }

        }

    }
}
*/

//print all fibonnaci number till n
/*
package com.company;
import java .util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner (System. in);
        System.out.println("enter the number of terms of fibonnaci");
        int t=sc.nextInt();
        int a=0;
        int b=1;
        System.out.println("fibonnaci series till "+t+" terms");
        for(int i=0;i<t;i++){

            System.out.println(a);
            int c=a+b;
            a=b;
            b=c;

        }
    }
}

 */

//count digit in a number
/*
package com.company;
import java .util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.println("digits in numer is:");
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}

 */

//print digits of a number line wise
/*
package com.company;
import java .util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int nod=0;
        int temp=t;

        while(temp!=0){
            temp=temp/10;
            nod++;

        }
        int div=(int)Math.pow(10,nod-1);
        while(div!=0){
            int q=t/div;
            System.out.println(q);
            t=t%div;
            div=div/10;

        }

    }
}

 */

//reverse of a number
/*
package com.company;
import java .util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.");
        int n=sc.nextInt();
        System.out.println("reverse of "+n+" is:");
        while(n!=0){
            int dig=n%10;
            n=n/10;
            System.out.println(dig);
        }
    }
}

*/
/*
package com.company;
import java .util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int p=sc.nextInt();
            if((x*3)-(n-x)>=p){
                System.out.println("pass");
            }
            else{
                System.out.println("fail");
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
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            if(a+c==180){
                System.out.println("yes");
            }
            else if(b+d==180){
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
import java .util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            if(n%10==0){
                System.out.println(n/10);
            }
            else{
                System.out.println((n/10)+1);
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
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        System.out.println(n*n/2);
    }
}

 */
/*
package com.company;
import java .util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int r=sc.nextInt();
        int o=sc.nextInt();
        int c=sc.nextInt();
        if(c+(20-o)*6*6>r){
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
import java .util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            /* the logic behind this program is that if we increment or decrement x by 1 at y no. of times then the no. should be odd or even.given janmansh takes first move. if
            x is odd then only janmansh wins the game and if x is even then jay wins the match in any case.*/

/*
            if((x+y)%2==0){
                System.out.println("janmansh");
            }
            else{
                System.out.println("jay");
            }
        }
    }
}

*/
//count no. 4

/*
package com.company;
import java .util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int m=sc.nextInt();
            int count=0;
            while(m>0){
                int r=m%10;
                m=m/10;
                if(r==4){
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
import java .util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a>b&&b>c){
                System.out.println(a+b);
            }
            else if(a>c && c>b){
                System.out.println(a+c);
            }
            else if(b>a && a>c){
                System.out.println(b+a);
            }
            else if(b>c && c>a){
                System.out.println(b+c);
            }
            else if(c>a && a>b){
                System.out.println(a+c);
            }
            else{
                System.out.println(b+c);
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
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a<=b && a<=c){
                System.out.println(b+c);
            }
            else if(b<=a && b<=c){
                System.out.println(a+c);
            }
            else{
                System.out.println(a+b);
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
            int y=sc.nextInt();
            int z=sc.nextInt();
            if(y<=x+(z*2)){
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

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int x=sc.nextInt();
            int m=sc.nextInt();
            int d=sc.nextInt();
            if(x*m>x+d){
                System.out.println(x*m);
            }
            else{
                System.out.println(x+d);
            }
        }
    }
}

 */


/*
package com.company;
import java .util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for (int i = 0; i < t; i++) {
            int sa = scn.nextInt();
            int sb = scn.nextInt();
            int sc = scn.nextInt();
            if (sa<sb && sa<sc) {
                System.out.println("draw");
            }
            else if(sb<sa && sb<sc){
                System.out.println("bob");
            }
            else{
                System.out.println("alice");
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
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();
            if(n%4==0){
                System.out.println("no");
            }
            else if(n%4==2){
                System.out.println("yes");
            }

        }
    }
}

 */


//print digit of number line wise

/*
package com.company;
import java.util.Scanner;

public class  Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int  count=0;
        int temp=n;
        while(temp!=0){
            temp=temp/10;
            count++;

        }
        int div=(int)Math.pow(10,count-1);
        while(div!=0){
            int q=n/div;
            System.out.println(q);
            n=n%div;
            div=div/10;

        }

    }
}
*/


//inverse of a number

/*
package com.company;
import java.util.Scanner;

public class  Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int inv=0;  //inv =inverse;
        int op=1;   //original position;
        while(n!=0){
            int od=n%10;   //original digit;
            int id=op;     //inverse digit;
            int ip=od;     //inverse position;

            inv =inv +id*(int)Math .pow(10,ip-1);

            n=n/10;
            op++;
        }
        System.out.println(inv);
    }
}

 */

//rotate a number


/*
package com.company;
import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int temp=n;
        int nod=0;
        while(temp>0){
            temp=temp/10;
            nod++;
        }

        k=k%10;
        if(k<0){
            k=k+nod;
        }

        int div=1;
        int mul=1;

        for(int i=1;i<=nod;i++){
            if(i<=k){
                div=div*10;
            }
            else{
                mul=mul*10;
            }
        }

        int q=n/div;
        int r=n%div;

        int rot=r*mul+q;
        System.out.println(rot);

    }
}

 */

/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System. in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            x=x/2;
            y=y;
            if(x<=y){
                System.out.println(x);
            }
            else{
                System.out.println(y);
            }
        }
    }
}

 */


/*
package com .company;
import java .util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System. in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int m=sc.nextInt();
            int n=sc.nextInt();
            int k=sc.nextInt();
            if(m>n*k){
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
package com .company;
import java .util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System. in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int a3 = sc.nextInt();
            int a4 = sc.nextInt();
            int a5 = sc.nextInt();
            int a6 = sc.nextInt();
            int a7 = sc.nextInt();
            if (a1 + a2 + a3 + a4 + a5 + a6 + a7 >= 4) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }


        }
    }
}


 */
/*
package com .company;
import java .util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a+b>0 && a>0 && b>0) {
                System.out.println("Solution");
            } else if (a+b>0 && b==0) {
                System.out.println("Solid");
            } else {
                System.out.println("Liquid");
            }
        }
    }
}
*/