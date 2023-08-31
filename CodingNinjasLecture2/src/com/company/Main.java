/*

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i=10;  //  Integer = 4 byte
        int j=15;  //  Integer = 4 byte
        int k=i+j;  //  Integer = 4 byte
        System.out.println(k);

        short s=123;  //  short = 2 byte

        long l=12345;  //long = 8 byte

        double d=1.83;  // double = 8 byte , float = 4 byte

        char c ='a';     //character = 1 byte

        boolean b = true;
        boolean otherB= false;

        System.out.println(s);
        System.out.println(l);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);
        System.out.println(otherB);
    }
}


 */




//SIMPLE INTEREST CALCULATION FORMULA

/*
package com.company;
public class Main{
    public static void main(String[] args) {
        int p=700;
        int r=5;
        int t=3;

        int simpleintrest=(p*r*t)/100;

        System.out.println(simpleintrest);

    }
}

 */




//SIMPLE SUM PROGRAM

/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int i=sc.nextInt();
        int j=sc.nextInt();

        int k=i+j;
        System.out.println(k);

    }
}

 */




/*

package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        String st =sc.nextLine();   //this is how we take input the  String datatype
        System.out.println(st);

        char ch=st.charAt(0);   // This is how we print the 0th character of the String

        String str="abcd";   //this is how we declare String datatype
        System.out.println(str);  //printing of string that we take input


        int p=sc.nextInt();  //this is how we take input the integer datatype
        int r=sc.nextInt();   //this is how we take input the integer datatype
        int t=sc.nextInt();  //this is how we take input the integer datatype

        long l=sc.nextLong();   //this is how we take input the long datatype

        double d=sc.nextDouble();    //this is how we take input the double datatype

        float f = sc.nextFloat();   //this is how we take input the float datatype

        int si=(p*r*t)/100;  //Simple interest formula
        System.out.println(si);  //Simple interest output

    }
}


 */





//Convert franhite to celcius
//Arthematical operators
// how convert datatype from one type to another
/*
 package com.company;
 import java.util.Scanner;

 public class Main{
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);


         int f=sc.nextInt();
         // int cel=(5/9)*(f-32);  // It gives 0 because 5/9=0 in integer datatype
         int cel =(int)((5.0/9)*(f-32));
         System.out.println(cel);



         System.out.println(9/5);
         System.out.println(9.0/5);

         System.out.println(9+5);
         System.out.println(9-5);
         System.out.println(9/5);
         System.out.println(9*5);

         System.out.println('a'/3);

         System.out.println(9%5);

         char ch='a';
         char i= (char)(ch+3);
         System.out.println(i);

         System.out.println('a' + 'b');
     }
 }
 */




//boolean expression checkup
//Relational operators
/*

package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();

        boolean isequal = (i==j);
        boolean isnotequal = (i!=j);
        boolean isgreater = (i>j);
        boolean isgreaterequal = (i>=j);
        boolean isless = (i<j);
        boolean islessequal = (i<=j);

        System.out.println(isequal);
        System.out.println(isnotequal);
        System.out.println(isgreater);
        System.out.println(isgreaterequal);
        System.out.println(isless);
        System.out.println(islessequal);


    }
}

 */





// uses of logical operators
/*


package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        boolean isLargest = (a>=b) && (a>=c);
        System.out.println(isLargest);
        System.out.println((a>=b || a>=c));
        System.out.println(!(a>=b));

    }
}

 */





// IMPLICIT TYPECAST
/*

package com.company;

public class Main {
    public static void main(String[] args) {
        char c = 'a';  // Ascii value of a == 97
        System.out.println(c+3);  // 97+3 == 100

        int i = c+100;   // 97+10 == 107
        System.out.println(i);

        i = c;   //------>> this is possible to store Character(c) into integer(i) because integer takes 4 byte place whereas the character have required only two byte of space.
        //char abc = i;
        // char abc = i; ------>> this is not possible to store integer(i) into Character(abc) because integer takes 4 byte place whereas the character have takes only two byte space.


        long l = i;  //------>> this is possible to store integer(i) into long(l) because longr takes 8 byte place whereas the integer have required only 4 byte of space.
        //i=l;
        //i=l;   ------>> this is not possible to store long(l) into integer(i) because long takes 8 byte place whereas the integer have required 8 byte space.


        double d = i;
        //i=d;

        float f = 1.23f;
        //f=d;
        d=f;
        System.out.println(d);
    }
}

 */



//EXPLICIT TYPECAST
/*

package com.company;

public class Main {
    public static void main(String[] args) {
        char c = 'a';  // Ascii value of a == 97
      //  System.out.println(c+3);  // 97+3 == 100

        int i = c+100;   // 97+10 == 107
       // System.out.println(i);


        i = c;
        char abc = (char)i;
        System.out.println(abc);


        long l = i;
        l=12345678912l;
        i=(int)l;
        System.out.println(l);
        System.out.println(i);
        //i=l;

        double d = i;
        //i=d;

        float f = 1.23f;
        //f=d;
        d=f;
       // System.out.println(d);
    }
}

 */



package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();


            if (A == 1 || A == 3 || A == 5) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}