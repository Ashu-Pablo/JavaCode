/*

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);
       // String s1="hello";
       // String s1=sc.nextLine();
       // String s2=sc.nextLine();
       // System.out.println(s1);
       // System.out.println(s2);

        // *** How to declare the length of a String and print the character of string individually and also print all the character of string ***

        //print length of string
        //String s=sc.nextLine();
        //System.out.println(s);
        //System.out.println(s.length());

        //print character of array individually
       // char ch=s.charAt(3);
        //System.out.println(ch);

        //print all character of array
       /* for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            System.out.println(c);
        }
        */


        //Substring of a String
       // String s="om nath dixit";
       // System.out.println(s.substring(0,3));
       // System.out.println(s.substring(1));

       /* for (int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.println(s.substring(i,j));
            }
        }
        */

        //add two string

       // String s1="hello";
        // s1 +=' ';
       // s1 +='w';
       // s1 +='o';
       // System.out.println(s1);
       // String s2="world";
       // System.out.println(s1+" "+ s2+10+20);


        //Splits
/*
        String s="abs ,hfh ,kiem mccj";
        String [] parts=s.split(",");
        for(int i=0;i<parts.length;i++){
            System.out.println(parts[i]);
        }


    }
}

 */



//Print all the palindromic substring
/*
package com.company;
import java.util.Scanner;

public class Main{

    public static boolean ispalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            char ch1=s.charAt(i);
            char ch2=s.charAt(j);

            if(ch1 != ch2){
                return false;
            }
            else{
                i++;
                j--;
            }

        }
        return true;

    }

    public static void solution(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                String ss= s.substring(i,j);
                if(ispalindrome(ss)==true){
                    System.out.println(ss);
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str =sc.next();
        solution(str);
    }
}

 */



//Check the String is palindrome or not

/*
package com .company;
import java.util.Scanner;

public class Main {

    public static boolean ispalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }

            else{
                System.out.println("no");
                return false;
            }
        }

        System.out.println("yes");
        return true;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        ispalindrome(str);
    }
}

 */



//STRING BUILDER
/*

package com.company;

public class Main{
    public static void main(String [] args){
        StringBuilder sb=new StringBuilder("hello");
        System.out.println(sb);

        char ch=sb.charAt(0);
        System.out.println(ch);

        sb.setCharAt(0,'d');
        System.out.println(sb);

        sb.insert(2,'y');
        System.out.println(sb);

        sb.deleteCharAt(2);
        System.out.println(sb);

        sb.append('g');
        System.out.println(sb);

        System.out.println(sb.length());
    }
}

 */



/*
package com.company;

public class Main{
    public static void main(String[] args){
        int n=10000;

        long start=System.currentTimeMillis();
        String s="";
        for(int i=0;i<n;i++){
            s += i;
        }
        long end=System.currentTimeMillis();
        long duration = end - start;
        System.out.println(duration);
    }
}

 */




/*
package com.company;

public class Main{
    public static void main(String[] args){
        int n=10000000;

        long start=System.currentTimeMillis();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(i);
        }
        long end=System.currentTimeMillis();
        long duration = end - start;
        System.out.println(duration);
    }
}

 */



/*
package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(s.charAt(0));
        for(int i=1;i<s.length();i++){

            if(s.charAt(i)!=s.charAt(i-1)){
                System.out.println(s.charAt(i));
            }
          //  System.out.println(s.charAt(i));
        }

    }
}

 */


/*

package com.company;
import java.util.Scanner;

public class Main{
    public static String compression1(String str){
        String s= String.valueOf(str.charAt(0));

        for(int i=1;i<str.length();i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr != prev){
                s +=curr;
            }
        }
        return s;

    }

    public static String compression2(String str){
        String s= String.valueOf(str.charAt(0));

        int count=1;

        for(int i=1;i<str.length();i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            if(curr == prev){
                count++;
            }
            else {
                if(count>1){
                    s+=count;
                    count=1;
                }
                s+=curr;
            }
        }
        if(count>1){
            s+=count;
            count=1;
        }
        return s;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str =sc.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }
}

 */






/*
package com.company;
import java.util.Scanner;

public class Main {
    public static String compression1 (String str) {
        String s= String.valueOf(str.charAt(0));
        //System.out.println(s);

        for(int i=1;i<str.length();i++){
            char current=str.charAt(i);
            char previous=str.charAt(i-1);
            if(current != previous){
                s +=current;
            }

        }
        return s;
    }

    public static String compression2(String str) {
        String s= String.valueOf(str.charAt(0));
        int count = 1;

        for(int i=1;i<str.length();i++){
            char current = str.charAt(i);
            char previous = str.charAt(i-1);
            if(current == previous){
                count++;
            }
            else{
                if(count>1){
                    s+=count;
                    count=1;
                }
                s+=current;
            }


        }
        if(count>1){
            s +=count;
            count=1;
        }
        return s;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s= sc.next();
        System.out.println(compression1(s));
        System.out.println(compression2(s));
    }
}

 */


package com.company;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        int arr[] ={5,7,7,8,8,10};
        int target =8;
        searchRange(arr,target);


    }

    public static int[] searchRange(int[] nums,int target){
        return new int[]{findFirstOccurence(nums,target,0) , findLastOccurence(nums,target,nums.length-1)};

    }

    public static int findFirstOccurence(int []nums,int target,int idx){
        if(idx==nums.length){
            return -1;
        }

        if(nums[idx]==target){
            return idx;
        }
        int ans =findFirstOccurence(nums,target,idx+1);
        return ans;
    }

    public static int findLastOccurence(int []nums,int target,int idx){
        if(idx==0){
            return -1;
        }

        if(nums[idx]==target){
            return idx;
        }
        int ans =findFirstOccurence(nums,target,idx-1);
        return ans;
    }

}





/*
package com.company;
import java.util.Scanner;

public class Main{
    public static int summation(int a,int b){
        int sum=a+b;
        return sum;
    }

    public static int mul(int a,int b){
        int mult=a*b;
        return mult;
    }

    public static int div(int a,int b){
        int div=a/b;
        return div;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(summation(a,b));
        System.out.println(mul(a,b));
        System.out.println(div(a,b));


    }

}

 */



/*

package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static boolean isprime(int val){
        for(int div=2;div*div<=val;div++){
            if(val%div==0){
                return false;
            }
        }
        return true;
    }

    public static void solution(ArrayList<Integer> a1){
        for(int i=a1.size()-1;i>=0;i--){
            int val=a1.get(i);
            if(isprime(val) == true){
                a1.remove(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a1 = new ArrayList<>();
        for(int i=0;i<n;i++){
            a1.add(sc.nextInt());
        }
        solution(a1);
        System.out.println(a1);
    }

}

 */



//Toggle case of characteristic string
/*

package com.company;
import java.util.Scanner;

public class Main{
    public static String togglecase(String str){
        StringBuilder sb= new StringBuilder(str);

        for(int i=0;i<sb.length();i++){
            char ch= sb.charAt(i);
            System.out.println(ch);

            if (ch>='a' && ch<='z'){
                char uch= (char)('A' + ch - 'a') ;
                sb.setCharAt(i,uch);
            }else if(ch>='A' && ch<='Z'){
                char lch =(char)('a'+ch-'A');
                sb.setCharAt(i,lch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.next();
        System.out.println(togglecase(str));
    }
}

 */


/*

package com.company;
import java.util.Scanner;

public class Main{

    public static String sol(String str){
        StringBuilder sb=new StringBuilder();
        sb.append(str.charAt(0));

        for(int i=1;i<str.length();i++){
            char curr=str.charAt(i);
            char pre=str.charAt(i-1);
            int gap=curr-pre;

            sb.append(gap);
            sb.append(curr);
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(sol(str));

    }
}

 */



//permutations of a String

/*

package com.company;
import java.util.Scanner;

public class Main{

    public static void solution(String str){
        int n=str.length();
        int f=factorial(n);

        for(int i=0;i<f;i++){
            StringBuilder sb=new StringBuilder(str);
            int temp=i;

            for(int div=n;div>=1;div--){
                int q=temp/div;
                int r=temp%div;

                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);

                temp=q;

            }
            System.out.println();
        }
    }

    public static int factorial(int n){
        int val=1;
        for(int i=2;i<=n;i++){
            val *=i;
        }
        return val;
    }
}

 */


/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String str = sc.next();
            int count =0;

            for (int j = 0; j < str.length() - 2; j++) {
                String s = str.substring(j, j + 3);

                String s1 = "010";
                String s2 = "101";


                if (s.equals(s1) || s.equals(s2)) {
                    count++;
                }

            }
            if(count>0){
                System.out.println("Good");
            }
            else{
                System.out.println("Bad");
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
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int count=1;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<i+2;j++){
                if(str.charAt(i)==str.charAt(j)){
                    break;
                }else{
                    count++;
                }
            }
            System.out.println(count);
            break;

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

        while(t-->0){
            String str=sc.next();

            if(str.contains("party")){
                str = str.replace("party" , "pawri");    // replacement of a string by other string
                System.out.println(str);
            }
            else{
                System.out.println(str);
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
        int k = sc.nextInt();
        int n = sc.nextInt();
        String s[] = new String[k];

        for(int i = 0;i<k;i++){
            s[i] = sc.next();
        }

        for(int i = 0;i<n;i++){
            String str = sc.next();
            int count = 0;
            for(int j=0;j<k ; j++){
                if(str.contains(s[j]) || str.length()>=47){
                    count++;
                }
            }
            if(count>0)
                System.out.println("Good");
            else
                System.out.println("Bad");
        }
    }
}

 */


/*

package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int count = 1;

        for(int i=1;i<n;i++){
            if(arr[i-1]== arr[i]){
                count++;
            }
        }
        if(count==1){
            System.out.println("-1");
        }else{
            System.out.println(count);
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


        while(t-->0) {
            String str = sc.next();
            int c1 = 0;
            int c2 = 0;
            int c3=0;

            if(c3==0) {

                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == '1') {
                        c1++;
                    } else {
                        c2++;
                    }

                    if (c1 == 10 && c2 == 10 && c1==c2) {
                        c3=1;
                    }

                    if (c1 == 11) {
                        System.out.println("WIN");
                        break;
                    }
                    if(c2==11) {
                        System.out.println("LOSE");
                        break;
                    }
                }

            }

            else {
                for(int i=21;i<str.length();i++){
                    if(str.charAt(i)=='1'){
                        c1++;
                    }

                    if(str.charAt(i)=='0'){
                        c2++;
                    }

                    if(c1>c2 && c1-c2==2){
                        System.out.println("WIN");
                        break;
                    }

                    if(c2>c1 && c2-c1==2){
                        System.out.println("LOSE");
                        break;
                    }
                }
            }

        }
    }

}



 */




