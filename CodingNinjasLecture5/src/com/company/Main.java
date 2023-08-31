/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
4444
4444
4444
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
            for(int j=1;j<=n;j++){
                System.out.print(n);
            }
            System.out.println();
        }
    }
}

*/






/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
*
**
***
****

 */


/*
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

 */





/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
1
22
333
4444
 */

/*
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=1;

        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(c);
            }

            System.out.println();
            c++;
        }
    }
}

 */





/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
1
21
321
4321
 */


/*
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){

            for(int j=i;j>=1;j--){
                System.out.print(j);
            }

            System.out.println();

        }
    }
}

 */



/*
print a pattern like this for n=4,
1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4
 */

/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

 */



/*
print a pattern like this for n=4,
1 2 3 4
1 2 3 4
1 2 3 4
1 2 3 4
 */

/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

 */



/*
print a pattern like this for n=4,
4 3 2 1
4 3 2 1
4 3 2 1
4 3 2 1
 */

/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                System.out.print(j);
                //System.out.println(n-j+1);
            }
            System.out.println();
        }
    }
}

 */



/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
1
12
123
1234
 */


/*
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(j);
            }

            System.out.println();

        }
    }
}

 */



/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
1
2 3
4 5 6
7 8 9 10
 */


/*
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=1;

        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print(c);
                c++;
            }

            System.out.println();

        }
    }
}
*/


/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
1
23
345
4567
 */


/*
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            int c=i;
            for(int j=1;j<=i;j++){
                System.out.print(c);
                c++;
            }

            System.out.println();

        }
    }
}

 */




/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
A B C D
A B C D
A B C D
A B C D
 */

/*
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)('A'+j-1));
            }
            System.out.println();
        }
    }
}

 */


/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
A B C D
B C D E
C D E F
D E F G

 */

/*
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            char startingChar=(char) ('A' + i - 1);

            for (int j = 1; j <= n; j++) {
                System.out.print(startingChar);
                startingChar = (char) (startingChar+1);
            }
            System.out.println();
        }
    }
}

 */




/*
Print the following pattern for the given N number of rows.
Pattern for N = 3
 A
 BB
 CCC
 */

/*

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)('A'+i-1));
            }
            System.out.println();
        }
    }
}

 */




/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
A
BC
CDE
DEFG
 */

/*
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            char startingChar=(char) ('A' + i - 1);

            for (int j = 1; j <= i; j++) {
                System.out.print(startingChar);
                startingChar = (char) (startingChar+1);
            }
            System.out.println();
        }
    }
}

 */





/*
Print the following pattern for the given number of rows.
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE
 */

/*
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            char startingChar=(char) ('A' + n - i);

            for (int j = 1; j <= i; j++) {
                System.out.print(startingChar);
                startingChar = (char) (startingChar+1);
            }
            System.out.println();
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

        for(int k=0;k<t;k++){
            int n=sc.nextInt();
            String str=sc.nextLine();
            int c=1;
            int c1=0;
            for(int i=1; i<n-1;i++){

                if(str.charAt(i-1)=='1'  &&  str.charAt(i)=='1'){
                    c++;
                }else if(str.charAt(i-1)=='0' && str.charAt(i)=='1'){
                    c1++;
                }

            }
            if(c==1){
                System.out.println("0");
            }else {
                int m = (c * (c + 1)) / 2;
                System.out.println(m + c1);
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
        /*
        int a=10,b=50;
        a++;
        System.out.println(a);
        --b;
        System.out.println(b);
        int c=a--+b--;
        System.out.println(c);
        System.out.print(++c);

         */

/*
        int a=10,b=20;
        System.out.println(a+++--b);//line 1
        System.out.println(a--+++b);//line 2
        System.out.println(a++-++b);//line 3
        System.out.println(a+++++b);//line 4

 */

        /*
        int x = 15;
        int y = x++;
        int  z = ++x;
        System.out.println(y +" " + z);


         */


        /*
        int x =10;
        int y = 20;
        if(x++ > 10 && ++y > 20 ){
            System.out.print("Inside if  ");
        }else{
            System.out.print("Inside else  ");
        }
        System.out.println(x +" "+y);

         */

        /*
        for(int i = 0; i < 2; i = i + 1) {
            for(int j = 0; j < 2; j = j + 1) {
                if (j == 1)
                    break;
                System.out.print(j +" ");
            }
        }

         */

        /*
        for(int i=729;i>0;i=i%3)
        {

            System.out.print("*");
        }

         */
/*

        int i=0;
        for(;;)
        {
            if(i==5)
                break;
            System.out.print(i);
            i++;

        }

 */

        /*
        for(int i=7;i!=0;i--)
        {
            System.out.print(i--);
        }

         */

        /*

        int i = 1;
        while(i < 5) {
            if(i == 3) {
                continue;
            }
            System.out.print(i + " ");
            i++;
        }

         */

/*
        int i = 1;
        while(i < 3) {
            int j = 1;
            while(j < 5) {
                if(j == 3) {
                    break;
                }
                System.out.print(j + " ");
                j++;
            }
            i++;
        }

 */

/*
        int i = 1;
        while(i < 3) {
            int j = 0;
            while(j < 5) {
                j++;
                if(j == 3) {
                    continue;
                }
                System.out.print(j + " ");
            }
            i++;
        }


    }
}

 */



// Convert decimal to binary

/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        /*
        int p=1;
        int ans=0;
        int pv=1;

        while(n>0){
            int rem=n%2;
            ans += rem*pv;

            pv *= 10;
            n=n/2;
        }
        System.out.println(ans);

        */
/*

System.out.println(Integer.toBinaryString(n));


    }
}

 */







package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();

        while(t-->0) {
            String str = sc.next();
            int c1=0;
            int c2=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='0'){
                    c1++;
                }
                else if(str.charAt(i)== '1'){
                    c2++;
                }

                if(c1==10 && c2==c1){
                    c1=0;
                    c2=0;
                    if(str.charAt(i)=='0'){
                        c1++;
                    }
                    else if(str.charAt(i)=='1'){
                        c2++;
                    }
                    if(c1>=2 && c1>c2){
                        System.out.println("lose");
                    }
                    else if(c2>=2 && c2>c1){
                        System.out.println("win");
                    }
                }

                if(c1==11 && c1>c2){
                    System.out.println("lose");
                }
                if(c2==11 && c2>c1){
                    System.out.println("win");
                }

            }
        }
    }
}