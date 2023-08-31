/*
package stack;

import java.util.ArrayList;

class Stack{
    static ArrayList<Integer> list = new ArrayList<>();

    public static boolean isEmpty(){
        return list.size()==0;
    }

    public static void push(int data){
        list.add(data);
    }

    //pop
    public static int pop(){
        if(isEmpty()){
            return  -1;
        }
        int top = list.get(list.size()-1);
        list.remove(list.get(list.size()-1));
        return top;
    }

    //peek
    public static int peek(){
        if(isEmpty()){
            return  -1;
        }
        return list.get(list.size()-1);
    }
}

public class Main {
    public static void main(String[] args) {
        // write your code here
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}

 */

/*
package stack;

import java.util.Stack;

public class Main {

}
class StackCollections {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int arr[] = {1,22,3,7};

        for(int i=0;i<arr.length;i++){
            stack.push(arr[i]);
        }

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}

 */










//For a given a string expression containing only round brackets or parentheses, check if they are balanced or not. Brackets are said to be balanced if the bracket which opens last, closes first.
/*

package stack;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        boolean ans = isBalanced(expression);
        System.out.println(ans);
    }

    public static boolean isBalanced(String expression) {
        //Your code goes here
        Stack<Character> stack= new Stack<>();

        for (int j=0;j<expression.length();j++){
            char i=expression.charAt(j);

            if (i=='[' || i=='{' || i=='('){
                stack.push(i);
            }
            else if(i==']' || i=='}' || i==')'){
                if (stack.isEmpty())
                    return false;

                else {

                    if (i==']'){
                        if (stack.peek()!='[')
                            return false;
                        else
                            stack.pop();
                    }

                    else if (i=='}') {
                        if (stack.peek()!='{')
                            return false;
                        else
                            stack.pop();
                    }

                    else if (i==')') {
                        if (stack.peek()!='(')
                            return false;
                        else
                            stack.pop();
                    }

                }
            }

        }
        return stack.isEmpty();
    }
}

 */














package stack;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        boolean ans = checkRedundantBrackets(expression);
        System.out.println(ans);

    }

    public static boolean checkRedundantBrackets(String expression) {
        //Your code goes here
        Stack<Character> stack=new Stack<Character>();
        int count=0;
        for(int i=0;i<expression.length();i++)
        {
            char c=expression.charAt(i);
            //System.out.print(c);

            if (c==')')
            {
                //System.out.println();
                while(!stack.isEmpty() && stack.peek()!='(')
                {
                    count=count+1;
                    stack.pop();
                    //System.out.print(stack.pop());
                }
                //System.out.println();
                //System.out.println(count);
                if (count==0 || count==1)
                {
                    return true;
                }
                stack.pop();
                count=0;

            }
            else
            {
                stack.push(c);
            }
        }
        return false;
    }
}












//Stock Span
/*

package stack;
import java.util.Scanner;
import java.util.Stack;

public class Main{

    public static int[] stockSpan(int[] price) {
        //Your code goes here
        int[] span=new int[price.length];
        Stack<Integer> stack=new Stack<Integer>();
        span[0]=1;
        stack.push(0);

        for (int i=1;i<price.length;i++)
        {
            while(stack.size()>0 && price[stack.peek()]<price[i])
            {
                stack.pop();
            }
//            System.out.println(stack.size());

            if (stack.size()==0)
            {
                span[i]=i+1;
            }
            else
            {
                //System.out.println("i = "+i);
                //System.out.println("top = "+stack.peek());
                span[i]=i-stack.peek();
            }
            stack.push(i);
            //System.out.println("New top: "+stack.peek());
            //System.out.println();
        }
        return span;
    }

    public static void print(int []arr){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int stockSpanAns[] = stockSpan(arr);

        print(stockSpanAns);
    }
}

 */









//For a given expression in the form of a string, find the minimum number of brackets that can be reversed in order to make the expression balanced. The expression will only contain curly brackets.

/*
package stack;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int ans = countBracketReversals(str);
        System.out.println(ans);

    }

    public static int countBracketReversals(String input) {
        //Your code goes here
        if (input.length()%2!=0)
        {
            return -1;
        }
        Stack<Character> stack=new Stack<Character>();
        int count=0;
        for (int i=0;i<input.length();i++)
        {
            char c=input.charAt(i);
            if (c=='{')
            {
                stack.push(c);
            }
            else
            {
                if (stack.size()==0)
                {
                    stack.push(c);
                }
                else if (stack.peek()=='}')
                {
                    stack.push(c);
                }
                else if (stack.peek()=='{')
                {
                    stack.pop();
                }
            }
        }

        while(!stack.isEmpty())
        {
            char c1=stack.pop();
            char c2=stack.pop();

            if (c1==c2)
            {
                count=count+1;
            }
            else
            {
                count=count+2;
            }
        }
        return count;

    }

}

 */