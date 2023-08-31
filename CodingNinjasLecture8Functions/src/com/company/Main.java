/*
package com.company;

public class Main {

    /*
    public static void demo(int a,int b){
        System.out.println(a+" "+b);
    }

    public static void main(String[] args) {
	// write your code here
        int a=5;
        int b=15;
        demo(a,b);
    }

     */
/*

    public static double add(int a,int b)
    {
        float c=a+b;
        return c;
    }
    public static void main (String[] args) {
        System.out.print(add(10,3));
    }
}

*/





// nCr calculation program by using function
/*

package com.company;
import java.util.Scanner;

public class Main{

    public static int nCr(int n){
        int answer=1;
        for(int i=2;i<=n;i++){
            answer *=i;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int ans1=nCr(n);
        int ans2=nCr(r);
        int ans3=nCr(n-r);
        int ans=(ans1)/((ans2)*(ans3));
        System.out.println(ans);
    }
}

 */



//normal nCr calculation program without using function
/*

package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();

        int ans1=1;
        for(int i=2;i<=n;i++){
            ans1 *= i;
        }

        int ans2=1;
        for(int i=2;i<=r;i++){
            ans2 *= i;
        }

        int ans3=1;
        for(int i=2;i<=n-r;i++){
            ans3 *= i;
        }

        int ans=ans1/(ans2*ans3);
        System.out.println(ans);
    }
}

 */





//Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.
/*

package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        int w=sc.nextInt();
        FarenhiteToCelsiusTable(s,e,w);
    }

    public static void FarenhiteToCelsiusTable(int start ,int end ,int step){
       // int convert=0;
        for(int i=start;i<=end;i=i+step){
           int  convert = (5*(start-32))/9;
           System.out.println(start +" "+ convert);
        }
        return ;
    }
}

 */





//Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.
/*

package com.company;
import java.util.Scanner;

public class Main {

    public static boolean checkMember(int n){
        int a=1;
        int b=1;

        for(int i=0;i<=n;i++){
            //System.out.println(a);
            if(a==n){
                return true;
            }
            int temp=a+b;
            a=b;
            b=temp;
        }
        return false;

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        checkMember(n);
    }

}

 */





//find the prime number from 1 to n.
/*
package com.company;
import java.util.Scanner;

public class Main{

    public static boolean isPrime(int n){
        int d=2;
        while(d<n){
            if(n%d == 0){
                return false;
            }
            d++;
        }
        return true;
    }

    public static void printPrimes(int n){
        for(int i=2;i<=n;i++){
            boolean isIPrime = isPrime(i);
            if(isIPrime){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printPrimes(n);
        System.out.println("back to main");
    }
}

 */




/*

package com.company;
import java.util.Scanner;

public class Main{

    public static int divnum(int num,int demo){
        if(demo==0){
            return Integer.MIN_VALUE;
        }
        return num/demo;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int deno=sc.nextInt();
        int ans=divnum(num,deno);
        System.out.println(ans);
    }
}

 */




/*
package com.company;
import java.util.Scanner;

public class Main{

    public static int sum(int num1,int num2){
        return num1+num2;
    }

    public static double sum(double num1,double num2){
        return num1+num2;
    }

    public static int sum(int num1){
        return num1+1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(sum(n1,n2));
        System.out.println(sum(10.2,5.2));
        System.out.println(sum(n1));
    }
}

 */



package com.company;
import java.util.Scanner;

public class Main {
    public static int sum(int a,int b)
    {
        System.out.print("int sum ");
        return a+b;
    }
    public static long sum(long a,long b)
    {
        System.out.print("long sum ");
        return a+b;
    }
    public static void main (String[] args) {
        int a=4;
        int b=5;
        System.out.print(sum(a,b));
    }
}