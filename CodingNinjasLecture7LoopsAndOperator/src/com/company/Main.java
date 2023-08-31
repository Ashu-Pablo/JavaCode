//sum of n numbers
/*
package com.company;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1,j=1;i<=n;i++,j++){
            sum +=i+j;
        }
        System.out.println(sum);
    }
}

 */



// prime or not
/*

package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=2;

        boolean div=false;
        while(d<n){
            if(n%d==0){
                div=true;
                break;
            }
            d++;
        }
        if(div){
            System.out.println("not prime");
        }else{
            System.out.println("prime");
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
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print(j+" ");
                j++;
                if(j>i){
                    break;
                }
            }
            System.out.println();
            i++;
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
        int n=sc.nextInt();
       /* int i=1;
        while(i<=n){
            if(i == 5){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }

        */
/*
        for(int i=1;i<=n;i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
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
        int T=sc.nextInt();
        int i=0;
        while(T-->0){
            int A=sc.nextInt();
            int B=sc.nextInt();
            int cA=0,cB=0;
            for(int j=1;j<=A;j+=2){
                cA+=j;
                A=A-j;
            }
            for(int j=2;j<=B;j+=2){
                cB+=j;
               B=B-j;
            }
            if(cA>cB)
                System.out.println("Limak");
            else
                System.out.println("Bob");
            
        }
    }
}

 */

/*
package com.company;
public class Main{
    public static void main(String[] args) {
        /*int a=10,b=20;
        int c=a&b;
        System.out.println(c);
        int d=a|b;
        System.out.println(d);
        int e=a^b;
        System.out.println(e);
        int f=c+d+e;
        System.out.println(~f);

         */
/*
        int a=10,b=-20;
        System.out.print(a^b);
    }
}
*/



package com.company;
import java.util.Scanner;

public class Main{
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int num=sc.nextInt();
                int orNum=num;
                int res=0;
                int n=0;
                for(int i=num;i!=0; i= i/10){
                        n++;
                }
                while(orNum!=0){
                        int rem = orNum % 10;
                        res += Math.pow(rem,n);
                        orNum = orNum/10;
                }

                if(res == num){
                        System.out.println("true");
                }
                else{
                        System.out.println("false");
                }

        }
}