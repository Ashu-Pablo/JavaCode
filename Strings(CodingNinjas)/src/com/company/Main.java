/*

package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        // initializing the character
        char[] arr={'C','o','d','i','n','g'};
        System.out.println(arr);

        //take a input of character array
        char[] a=new char[10];
        //Store the element of character in character array
        for(int i=0;i<a.length;i++){
            System.out.println("value at"+i);
            a[i]=sc.next().charAt(0);
        }

        //print the character array
        System.out.println(a);

        //print the element store in character array
        for(int i=0;i<a.length;i++){
            System.out.println("value at "+i+" is "+a[i]);
        }

    }
}


 */






/*

package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //how to take empty string
        String str="";
        //method of printing the length of the string
        System.out.println(str.length());


        //initializing of a string
        String s="Coding";
        //printing of String
        System.out.println(s);
        //print the length of the string
        System.out.println(s.length());


    }
}


 */








//More function on String
/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


         //Declaration of 1st String
        String str1="coding";
        //Declaration of 2nd String
        String str2=" with OM";


        // *** Concat(Add up) both the string and then printing
        System.out.println(str1+str2);
        //We can also concat the string by other method
       // str1 +=str2;
        System.out.println(str1);
        //We can also concat the string by other one method
        str1=str1.concat(str2);
        System.out.println(str1);



        // *** Comparing of two string
        String s1="Om Nath Dixit";
        String s2="Om Nath Dixit";
        String s3="Bhaskar";

        //comparing the equality of 1st string and 2nd string
        System.out.println(s1.equals(s2));//give answer in boolean
        //comparing the equality of 1st string and 3rd string
        System.out.println(s1.equals(s3));// give answer in boolean

        //comparing of 1st string and 2nd string
        System.out.println(s1.compareTo(s2));// if both string are equal it gives 0.
        //comparing of 1st string and 3rd string
        System.out.println(s1.compareTo(s3));//if both string are not equal it gives the difference of the Ascii value of the mismatch character.


        //contains the character or part of the string
        System.out.println(s1.contains(" Nath"));//if contain then the output is "true" else "false".


        //Substring of a string
        String st="Learn Coding";
        String substr=st.substring(1,9);// it will print from index 1 to index 8 element (not printed the last index element).
        System.out.println(substr);
        System.out.println(st.substring(0));// it will print from 0 to last index of string.

    }
}

 */







//Reverse String
/*
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String reverse=reverseString(str);
        System.out.println(reverse);
        

    }

    public static String reverseString(String str){
        String reversedStr="";
       /* for(int i=str.length()-1;i>=0;i++){
            reversedStr += str.charAt(i);
        }*/
/*

        for(int i=0;i<str.length();i++){
            reversedStr = str.charAt(i)+reversedStr;
        }

        return reversedStr;
    }

}

 */





/*
package com.company;
import java.util.Scanner;
public class Main {


    public static String reverseWordWise(String input) {
        // Write your code here
        String s="";
        int k=0;

//        for(int lastWord=input.length()-1;lastWord>=0;lastWord--){
//            if(input.charAt(lastWord)==' '){
//                s=input.charAt(lastWord)+s;
//            }
//
//        }

        for(int i=0;i<input.length();i++){

            if(input.charAt(i)==' '){

                for(int j=i;j>=k;j--){
                    s=input.charAt(j)+s;
                }
                // s=s+" ";
                k=i+1;
            }
        }

        String st="";

        for(int i=k;i<input.length();i++){
            st += input.charAt(i);
        }
        st =st+" ";
        // System.out.println(s);
        return st+s;

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String reverse=reverseWordWise(str);
        System.out.print(reverse);
    }

//    public static void main (String[] args) {
//        StringBuffer str1=new StringBuffer("");
//        for(int i=0;i<5;i++)
//        {
//            str1.append(('a'+i));
//        }
//        System.out.println(str1);
//    }
}