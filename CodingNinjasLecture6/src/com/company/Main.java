/*
print a pattern like this
***1
**12
*123
1234
 */

/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=n-(n-i);j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

 */





/*
Print the following pattern
Pattern for N = 4
   *
  ***
 *****
*******
The dots represent spaces.
 */

/*

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){

            int Space=n-i;
            for(int space=1;space<=Space;space++){
                System.out.print(" ");
            }

            int star=i;
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }

            int star2 = i-1;
            for(int j=1;j<=star2;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

 */





/*
Print the following pattern for the given number of rows.
Pattern for N = 4

   1
  232
 34543
4567654

 */

/*

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){

            int Space=n-i;
            for(int space=1;space<=Space;space++){
                System.out.print(" ");
            }

            //int num=i;
            int num=i;
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num++;
            }

            int num2 = (2*i-2);
            for(int j=1 ; j <=(i-1) ; j++ ){
                System.out.print(num2);
                num2--;
            }
            System.out.println();
        }

    }
}

 */




/*
Print the following pattern for the given number of rows.
Note: N is always odd.

   *
  ***
 *****
  ***
   *
Pattern for N = 5
 */

/*
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int Space = n / 2;
        int star=1;

        for(int i=1;i<=n;i++) {


            for (int space = 1; space <= Space; space++) {
                System.out.print(" ");
            }

            for(int j=1;j<=star;j++){
                System.out.print("*");
            }

            if(i<=n/2){
                Space--;
                star +=2;
            }
            else{
                Space++;
                star-=2;
            }
            System.out.println();
        }
    }
}


 */





/*
Print the following pattern for the given number of rows.
Note: N is always odd.

   *
  ***
 *****
  ***
   *
Pattern for N = 5
 */

/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int n1=(n+1)/2;
        int n2=n/2;

        //first half
        for(int i=1;i<=n1;i++){
            for(int space=1;space<=(n1-i);space++){
                System.out.print(" ");
            }

            for(int star=1;star<=(2*i-1);star++){
                System.out.print("*");
            }
            System.out.println();
        }

        //second half
        for(int i=n2;i>=1;i--){
            for(int space=1;space<=(n2-i)+1 ; space++){
                System.out.print(" ");
            }

            for(int star=1;star<=(2*i)-1;star++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

 */





/*
Write a program to print parallelogram pattern for the given N number of rows.
For N = 4

*****
 *****
  *****
   *****
    *****

 */
/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=0;
        for(int i=1;i<=n;i++) {

            for (int j=1;j<=space;j++){
                System.out.print(" ");
            }

            for (int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
            space++;
        }

    }
}

 */





/*
Write a program to print N number of rows for Half Diamond pattern using stars and numbers
*
*1*
*121*
*12321*
*1234321*
*123454321*
*1234321*
*12321*
*121*
*1*
*
 */

/*
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("*");
            System.out.println("*");
        } else {

            for (int i = 1; i <= n + 1; i++) {

                System.out.print("*");

                for (int j = 2; j <= i; j++) {
                    System.out.print(j - 1);
                }

                int num = i - 2;
                for (int j = 3; j <= i; j++) {
                    System.out.print(num);
                    num--;
                }

                if (i == 1) {
                    System.out.print("");
                } else {
                    System.out.print("*");
                }

                System.out.println();
            }

            for (int i = n; i >= 1; i--) {
                System.out.print("*");

                for (int j = 1; j <= i - 1; j++) {
                    System.out.print(j);
                }

                int num = i - 2;
                for (int j = i; j >= 3; j--) {
                    System.out.print(num);
                    num--;
                }

                if (i == 1) {
                    System.out.print("");
                } else {
                    System.out.print("*");
                }
                System.out.println();
            }


        }
    }
}

 */





/*
Write a program to print triangle of user defined integers sum.
1=1
1+2=3
1+2+3=6
1+2+3+4=10
1+2+3+4+5=15
 */


/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum +=i;
            int t=1;

            for(int j=1;j<=i;j++){
                System.out.print(j);
                if(t<i){
                    System.out.print("+");
                }
                t++;
            }

            System.out.print("="+sum);
            System.out.println();
        }
    }
}

 */





/*
print a pattern like this
1 3 5 7
3 5 7 1
5 7 1 3
7 1 3 5
 */

/*
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int num=2*i-1;
            for(int j=n;j>=i;j--){
                System.out.print(num);
                num = num+2;
            }

            int sum2=1;
            for(int j=1;j<=i-1;j++){
                System.out.print(sum2);
                sum2=sum2+2;
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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int b=sc.nextInt();
            int c=0;

            for(int i=0;i<n;i++){
                int w=sc.nextInt();
                int h=sc.nextInt();
                int p=sc.nextInt();

                if(b>=p){
                    int max=w*h;
                    if(max>=c){
                        c=max;
                    }
                }

            }
            if(c==0){
                System.out.println("no tablet");
            }
            else{
                System.out.println(c);
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
        int t=sc.nextInt();

        while(t-->0){
            int n=sc.nextInt();
            String [] str=new String[n];
            for(int i=0;i<n;i++){
                str[i]= sc.next();
            }

            int c=0,si=0,e=0,em=0,mh=0;
            for(int i=0;i<n;i++) {
                if(str[i].equals("cakewalk")){
                    c++;
                }
                else if(str[i].equals("simple")){
                    si++;
                }
                else if(str[i].equals("easy")){
                    e++;
                }
                else if(str[i].equals("easy-medium") || str[i].equals("medium")){
                    em++;
                }
                else if(str[i].equals("medium-hard") || str[i].equals("hard")){
                    mh++;
                }
            }
            if(c>=1 && si>=1 && e>=1 && em>=1 && mh>=1){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
