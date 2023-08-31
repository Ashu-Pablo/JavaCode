/*

package com.company;
import java.util.Scanner;
public class Main{
    //Main is my class
    String name;
    int rollnumber;

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        Main student=new Main();
        student.name="Ashu";
        student.rollnumber=123;

        Main s2=new Main();
        System.out.println(student);
    }
}



 */





/*
package com.company;
import java.util.Scanner;

public class Main{
    public static class person{
        int age;
        String name;
        void saysHii(){
            System.out.println(name+"["+age+"] says hi");
        }
    }

    public static void main(String[] args) {
        person p1=new person();
        p1.age=10;
        p1.name="f";
        p1.saysHii();

        person p2=new person();
        p2.age=120;
        p2.name="fkfjhh";
        p2.saysHii();


    }
}

 */









/*
package com.company;
public class Main{
    public static class Student{
        int roll_no;
        String name;
    }

    public static void main (String[] args) {
        Student s=new Student();
            System.out.println(s);
    }

}

 */






/*

package com.company;
import java.util.Scanner;

public class Main{
       public static class person{
           public String name;
           private int rollno;

           public void setRollno(int rn){
               rollno=rn;
           }
           public int getRollno() {
               return rollno;
           }
       }

       public static void main(String[] args){
           person p1=new person();
           p1.setRollno(4);

           System.out.println(p1.getRollno());
       }
}

 */


/*


package com.company;
import java.util.Scanner;

public class Main{
    public static class test{
        static int marks;
        void set_marks(int marks)
        {
            this.marks=marks;               //Line 1
        }
    }

    public static void main(String[] args){
        test t=new test();
        t.set_marks(78);                //Line 2
        System.out.print(test.marks);   //Line 3
    }
}

 */





/*

package com.company;
import java.util.Scanner;

public class Main{
    public static class test{
        static int a = 10;
        int b = 20;
        static void fun1()
        {
            a = 20;                             //Line 1
           // b = 10;                             //Line 2
            fun2();                             //Line 3
            System.out.print(this.b);           //Line 4
        }
        void fun2()
        {
            System.out.println("from m2");
        }

    }

    public static void main(String[] args){
        {
            test.fun1();
        }
    }
}



 */







/*
package com.company;
import java.util.Scanner;

public class Main{
    public static class Book{
        final int price = 10;
    }

    public static void main(String[] args){
        Book b = new Book();
       // b.price = 16;
        System.out.println(b.price);
    }
}

 */




//package com.company;
//import java.util.Scanner;
//
//public class Main{
//    class A{
//        public static void A(){
//            System.out.print("Good ");
//            throw new RuntimeException();
//        }
//        public static void B(){
//            A();
//            System.out.print("This ");
//        }
//        public static void main(String[] args){
//            try{
//                B();
//            }
//            catch(Exception e){
//                System.out.print("Time ");
//            }
//            finally{
//                System.out.print("at CodingNinjas");
//            }
//        }
//    }
//}


//package com.company;
//import java.util.Scanner;
//
//public class Main{
//    public static void main (String[] args) {
//        // Your code here
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        int x = a+b;
//        int y = b+c;
//        int z = c+a;
//        if((x%2 == 0 && x > 0) || (y%2 == 0 && y > 0) || (z%2 == 0 && z > 0)){
//            System.out.println("YES");
//        }
//        else{
//            System.out.println("NO");
//        }
//    }
//}




//package com.company;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while( t-- > 0){
//            int n = sc.nextInt();
//            int l = sc.nextInt();
//            int s = sc.nextInt();
//
//            int arr[] = new int[n];
//            for(int i = 0 ; i< n ;i++){
//                arr[i] = i+1;
//            }
////            int sum = 0;
//            for(int i = 0 ; i < l;i++){
//                int sum = arr[i]+arr[i+1]+arr[i+2];
//                if(sum == s){
//                    System.out.println("YES");
//                    return ;
//                }
//            }
//            System.out.println("NO");
//        }
//    }
//}


/*
package com.company;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while( t-- > 0){
            int n = sc.nextInt();
            int l = sc.nextInt();
            int s = sc.nextInt();

            int arr[] = new int[n];
            for(int i = 0 ; i< n ;i++){
                arr[i] = i+1;
            }
            boolean ans = findSubarray(arr,l,s);
            if(ans == true){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    public static boolean findSubarray(int[] A, int L, int S) {
        int N = A.length;
        int left = 0;
        int right = L - 1;
        int currentSum = 0;

        for (int i = left; i <= right; i++) {
            currentSum += A[i];
        }

        while (right < N) {
            if (currentSum == S) {
                return true;
            }
            if (currentSum < S) {
                right++;
                if (right < N) {
                    currentSum += A[right];
                }
            } else {
                currentSum -= A[left];
                left++;
                if (left + L <= right) {
                    currentSum += A[left + L - 1];
                }
            }
        }
        return false;
    }
}


 */

package com.company;
import java.util.Arrays;
import java.util.Collections;

// * Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode sortList(ListNode head){
        if(head == null|| head.next == null){
            return head;
        }

        ListNode temp = head;
        ListNode temp1 = head;
        int n = 0;
        while(temp1 != null){
            n++;
            temp1 = temp1.next;
        }

        int []arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = temp.val;
            temp = temp.next;
        }

        Arrays.sort(arr);

        ListNode newNode = new ListNode();

        // Append all elements of array to linked list
        // using Collections.addAll() method
         Collections.addAll((newNode), arr);

        return newNode;
    }


}