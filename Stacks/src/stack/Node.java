//Stack using LinkedList
/*
package stack;

import java.util.Scanner;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data){
        this.data=data;
    }
}

class StackUsingLL<T>{
    private Node<T> head;
    private int size;

    public StackUsingLL(){
        head = null;
        size = 0;
    }

    int size(){
        return size;
    }

    T top() throws StackEmptyExceptions {
        if(size()==0){
            throw new StackEmptyExceptions();
        }
        return head.data;
    }

    boolean isEmpty(){
        return size()==0; // head == null;
    }

    void push(T element){
        Node<T> newNode =new Node<>(element);
        newNode.next = head;
        head = newNode;
        size++;
    }

    T pop() throws StackEmptyExceptions {
        if(size()==0){
            throw new StackEmptyExceptions();
        }

        T tempData = head.data;
        head = head.next;
        size--;
        return tempData;
    }

}

class StackEmptyExceptions extends Exception{
}

class Stack_Use{
    public static void main(String[] args) throws StackEmptyExceptions {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        StackUsingLL<Integer> stack = new StackUsingLL<>();
        for (int i=1;i<=n;i++){
            int data = sc.nextInt();
            stack.push(data);
        }

        stack.push(10);

        System.out.println(stack.top());

        while(!stack.isEmpty()){
            try{
                System.out.println(stack.pop());
            }
            catch (StackEmptyExceptions e) {
                e.printStackTrace();
            }
        }
    }
}

 */








package stack;

import java.util.Scanner;
import java.util.Stack;

public class Node {
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


