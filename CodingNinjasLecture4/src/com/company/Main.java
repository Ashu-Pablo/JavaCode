// check odd/even
/*


package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem=n%2;
        if (rem == 0) {
            System.out.println("even");
            return;
        }
        System.out.println("odd");
    }
}

 */




//largest in 3 numbers
/*
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>=b && a>=c){
            System.out.println(a);
        }else{
            if(b>=a && b>=c){
                System.out.println(b);
            }else{
                System.out.println(c);
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
       /* int a=50;
        if(a>10)
        {
            System.out.print("Coding");
        }
        else(a>20)
        {
            System.out.print("Ninjas");
        }*/

        /*
        int x = 5;
        if (x < 6)
            System.out.print("Hello  ");
        if(x == 5){
            System.out.print("Hi  ");
        }
        else{
            System.out.print("Hey ");
        }

         */


        /*
        int x = 15;
        if(x <= 15){
            System.out.print("Inside if  ");
        }else if(x == 15){
            System.out.print("Inside else if  ");
        }
        System.out.println(x);

         */


        /*
        int var1 = 5;
        int var2 = 6;
        if ((var2 = 1) == var1)
            System.out.print(var2);
        else
            System.out.print(var2 + 1);

         */


        /*
        int a=50;
        int b=Integer.MIN_VALUE;
        if(a/0==b)
        {

            System.out.println("Hello");
        }
        else
        {
            System.out.println("Hi");
        }

         */



        /*
        int i=0;
        while(i<10)
        {
            i=i+1;
            System.out.print(i);
            i=i+1;
        }

         */

/*
        int a=50,b=20;
        if(a>b)
        {
            if(a>100)
                System.out.println("Ace");
            if(b<100)
                b=50;
        }
        else if(a==b)
        {
            System.out.println("King");
        }
        else
        {
            System.out.println("Queen");
        }
    }
}
*/




//
/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String str=sc.next();
       char ch=str.charAt(0);
       if(ch>='a' && ch <= 'z'){
           System.out.println("0");
       }else if(ch >= 'A' && ch <= 'Z'){
           System.out.println("1");
       }else{
           System.out.println("-1");
       }

    }
}

 */



//Multiplication Table
/*

package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(n*i);

        }
    }
}

 */





//Sum of Even & Odd
/*
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        int even=0;
        int odd=0;
        for(int i=0;i<str.length();i++){
            if((int)str.charAt(i)%2==0){
                even=even+str.charAt(i)-48;
            }else{
                odd=odd+str.charAt(i)-48;
            }
        }
        System.out.println(even+" "+odd);
    }
}

 */





// Write a program to print all the factors of a number other than 1 and the number itself.
/*
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}

 */



//While loop
//print counting from 1 to 10
/*
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1;
        int n = sc.nextInt();
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}

 */





//Prime or not
/*

package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int count = 0;

        while (i <= n / 2) {
            i++;
            if (n % i == 0) {
                count++;
            }
        }
        if (n == 2) {
            System.out.println("prime");
        } else {
            if (count > 0) {
                System.out.println("not prime");
            } else {
                System.out.println(" prime");
            }
        }
    }
}

 */




//sum of numbers
/*
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=n){
            sum=sum+i;
            i++;
        }
        System.out.println(sum);
    }
}

 */



package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        int w=sc.nextInt();

        while(s<=e){
            int convert=(5*(s-32))/9;
            System.out.println(s+" "+convert);
            s=s+w;*/

    }
}