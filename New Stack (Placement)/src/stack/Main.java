// This is a Basic implementation of Stack Data Structure
/*
package stack;

class Stack {
    private int []data;
    private int top;

    // Constructor
    public Stack(){
        data = new int[30];
        top = -1;
    }

    // Constructor
    public Stack(int capacity){
        data = new int[capacity];
        top = -1;
    }

    public boolean isEmpty(){
        if (top == -1){
            return true;
        }
        else{
            return false;
        }
    }

    public int size(){
        return top + 1;
    }

    public int top() throws StackEmptyException{
        if(size() == 0){
            StackEmptyException e = new StackEmptyException();
            throw e;
        }

        return data[top];
    }

    public void push(int element) throws StackFullException{
        if(size() == data.length){
            throw new StackFullException();
        }

        top ++;
        data[top] = element;
    }

    public int pop() throws StackEmptyException{
        if(isEmpty()){
            throw new StackEmptyException();
        }

        int temp = data[top];
        top --;
        return temp;
    }
}

class StackEmptyException extends Exception{}
class StackFullException extends Exception{}

public class Main{

    public static void printStack(Stack st) throws StackEmptyException {
        while (!st.isEmpty()){
            System.out.println(st.pop());
        }
    }

    public static void main(String[] args) throws StackFullException, StackEmptyException {
        Stack st = new Stack();
        st.push(55);
        st.push(23);
        st.push(55);
        st.push(23);
        st.push(55);
        st.push(23);
        st.push(55);
        st.push(23);
        st.push(55);
        st.push(23);
        st.push(55);
        st.push(23);
        st.push(55);
        st.push(23);
        st.push(55);
        st.push(23);
        st.push(55);
        st.push(23);
        st.push(55);
        st.push(23);
        st.push(55);
        st.push(23);
        st.push(55);
        st.push(23);
        st.push(55);

        System.out.println(st.top());
        System.out.println(st.isEmpty());
        System.out.println(st.size());

        // Function to print the element of stack
        printStack(st);
    }
}

 */








// take a size of an array and then execute operation of stacks
/*
package stack;

import java.util.Scanner;

class Stack {
    private int []data;
    private int top;

    // Constructor
    public Stack(int capacity){
        data = new int[capacity];
        top = -1;
    }

    public boolean isEmpty(){
        if (top == -1){
            return true;
        }
        else{
            return false;
        }
    }

    public int size(){
        return top + 1;
    }

    public int top() throws StackEmptyException{
        if(size() == 0){
            StackEmptyException e = new StackEmptyException();
            throw e;
        }

        return data[top];
    }

    public void push(int element) throws StackFullException{
        if(size() == data.length){
            throw new StackFullException();
        }

        top ++;
        data[top] = element;
    }

    public int pop() throws StackEmptyException{
        if(isEmpty()){
            throw new StackEmptyException();
        }

        int temp = data[top];
        top --;
        return temp;
    }
}

class StackEmptyException extends Exception{}
class StackFullException extends Exception{}

public class Main{

    public static void printStack(Stack st) throws StackEmptyException {
        while (!st.isEmpty()){
            System.out.println(st.pop());
        }
    }

    public static void main(String[] args) throws StackFullException, StackEmptyException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");

        int n = sc.nextInt();
        Stack st = new Stack(n);

        for (int i = 0; i < n; i++){
            int data = sc.nextInt();
            st.push(data);
        }

        System.out.println("top = "+st.top());
        System.out.println("Empty = "+st.isEmpty());
        System.out.println("size = "+st.size());

        // Function to print the element of stack
        System.out.println("Elements of stacks : ");
        printStack(st);
    }
}

*/









// Implementation of stack using LinkedList
/*
package stack;
import java.util.Scanner;

class Node<T>{
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        next = null;
    }
}

class Stack<T>{
    private Node<T> head;
    private int size;

    public Stack(){
        head = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public T top() throws StackEmptyException{
        if(size() == 0){
            throw new StackEmptyException();
        }

        return head.data;
    }

    public void push(T element) {
        Node<T> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public T pop() throws StackEmptyException{
        if(size() == 0){
            throw new StackEmptyException();
        }

        T tempData = head.data;
        head = head.next;
        size --;
        return tempData;
    }

}

class StackEmptyException extends Exception{

}

public class Main{

    public static void printStack(Stack<Integer> st) throws StackEmptyException {
        while(!st.isEmpty()){
            try{
                System.out.println(st.pop());
            }
            catch (StackEmptyException e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws StackEmptyException{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of element in a stack :  ");
        int n = sc.nextInt();

        Stack<Integer> st = new Stack<>();

        for(int i = 0 ; i < n ; i++){
            int data = sc.nextInt();
            st.push(data);
        }

        System.out.println(st.size());
        System.out.println(st.isEmpty());
        System.out.println(st.top());

        System.out.println(st.pop());
        System.out.println(st.pop());

//        printStack(st);

    }
}

 */





// find the expression is valid or not

/*
package stack;

import java.util.Stack;
import java.util.Scanner;

public class Main{

    public static boolean isBalanced(String expression){
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < expression.length(); i++){

            char expressionChar = expression.charAt(i);

            if(expressionChar == '(' || expressionChar == '{' || expressionChar == '['){
                st.push(expressionChar);
            }
            else if(expressionChar == ')' || expressionChar == '}' || expressionChar == ']'){
                if(st.empty()) {
                    return false;
                }
                else{
                    if (expressionChar == ')'){
                        if(st.peek() != '('){
                            return false;
                        }
                        else{
                            st.pop();
                        }
                    }
                    else if(expressionChar == '}'){
                        if(st.peek() != '}'){
                            return false;
                        }
                        else{
                            st.pop();
                        }
                    }
                    else if(expressionChar == ']'){
                        if(st.peek() != ']'){
                            return false;
                        }
                        else{
                            st.pop();
                        }
                    }
                }
            }

        }

        if(st.isEmpty()){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ths expression");
        String expression = sc.nextLine();

        boolean ans = isBalanced(expression);
        System.out.println(ans);

    }
}

 */









// check for the redundant Bracket (means check for extra bracket)
/*
package stack;

import java.util.Stack;
import java.util.Scanner;

public class Main {

    public static boolean isRedundantBrackets(String expression){
        Stack<Character> st = new Stack<>();

        for(int i = 0 ; i < expression.length(); i++){
            char ch = expression.charAt(i);

            if(ch == '(' || ch == '+' || ch == '-' || ch == '*' || ch =='/'){
                st.push(ch);
            }
            else{
                 // ch ya to ')' hai ya lowercase letter
                if(ch == ')'){
                    boolean isRedundant = true;
                    while (st.peek() != '('){
                        char top = st.peek();
                        if(top =='+' || top == '-' || top == '*' || top == '/'){
                            isRedundant = false;
                        }
                        st.pop();
                    }

                    if(isRedundant == true){
                        return true;
                    }

                    st.pop();
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter ths expression");
        String expression = sc.nextLine();

        boolean ans = isRedundantBrackets(expression);
        System.out.println(ans);
    }
}

 */