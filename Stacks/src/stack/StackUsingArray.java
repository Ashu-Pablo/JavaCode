/*
package stack;

import java.util.Scanner;

public class StackUsingArray {
    private int data[];
    private int top; // It is the index of top most element of stack

    public StackUsingArray(){
        data =new int[10];
        top =-1;
    }

    public StackUsingArray(int capacity){
        data =new int[capacity];
        top =-1;
    }



    public boolean isEmpty(){
//        if(top == -1){
//            return true;
//        }else{
//            return false;
//        }

        return (top == -1);
    }

    public int size(){
        return top+1;
    }

    public int top(){
        if(size() == 0){
            System.out.println("exception out of bound");
        }
        return data[top];
    }

    public void push(int element){

        if(size() == data.length){
            System.out.println("stack full");
            return ;
        }
        top++;
        data[top] = element;
    }

    public int pop(){
        int temp = data[top];
        top--;
        return temp;
    }

}

class stackUse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StackUsingArray stack = new StackUsingArray(n);
        for(int i=0;i<=n;i++){
            stack.push(i);
        }

        stack.push(6);
        while(!stack.isEmpty()){
            System.out.println( stack.pop());
        }

    }
}

 */











// 2nd type
//stack using array

/*
package stack;

import java.util.Scanner;

public class StackUsingArray {
     private int data[];
     private int top; // It is the index of top most element of stack

    public StackUsingArray(){
        data =new int[30];
        top =-1;
    }

    public StackUsingArray(int capacity){
        data =new int[capacity];
        top =-1;
    }



    public boolean isEmpty(){
//        if(top == -1){
//            return true;
//        }else{
//            return false;
//        }

        return (top == -1);
    }

    public int size(){
        return top+1;
    }

    public int top() throws StackEmptyException {
        if(size() == 0){
            //stack empty exception
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        //System.out.println(data[top]);
        return data[top];
    }



    public void push(int element) throws StackFullException{

        if(size() == data.length){
            //Stack full
           // throw new StackFullException();
            StackFullException e = new StackFullException();
            throw e;
        }
        top++;
        data[top] = element;
    }

    public int pop(){
        int temp = data[top];
        top--;
        return temp;
    }

}

class StackEmptyException extends Exception{
}

class StackFullException extends Exception{

}

class StackUse{
    public static void main(String[] args) throws StackFullException, StackEmptyException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StackUsingArray stack = new StackUsingArray(n);

        for(int i=1;i<=n;i++){
            System.out.println("Enter the value of "+i+" data");
            int data = sc.nextInt();
            stack.push(data);
        }


        System.out.println(stack.top());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());

        /*

       // stack.push(6);

         */
/*
        while(!stack.isEmpty()){
            System.out.println( stack.pop());
        }



    }
}

 */












//Stack using dynamic array


package stack;

import java.util.Scanner;

public class StackUsingArray {
    private int data[];
    private int top; // It is the index of top most element of stack

    public StackUsingArray(){
        data =new int[10];
        top =-1;
    }

    public StackUsingArray(int capacity){
        data =new int[capacity];
        top =-1;
    }



    public boolean isEmpty(){
//        if(top == -1){
//            return true;
//        }else{
//            return false;
//        }

        return (top == -1);
    }

    public int size(){
        return top+1;
    }

    public int top() throws StackEmptyException {
        if(size() == 0){
            //System.out.println("exception out of bound");
            //stack empty exception
            StackEmptyException e = new StackEmptyException();
            throw e;
        }
        return data[top];
    }

    public void push(int element) throws StackFullException{

        if(size() == data.length){
            //Stack full
            // throw new StackFullException();
//            StackFullException e = new StackFullException();
//            throw e;
            doubleCapacity();
        }
        top++;
        data[top] = element;
    }

    private void doubleCapacity(){
        int temp[] = data;
        data = new int[2* temp.length];

        for(int i=0;i<=top;i++){
            data[i] = temp[i];
        }
    }

    public int pop(){
        int temp = data[top];
        top--;
        return temp;
    }

}

class StackEmptyException extends Exception{
}

class StackFullException extends Exception{

}

class stackUse{
    public static void main(String[] args) throws StackFullException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StackUsingArray stack = new StackUsingArray(n);

        for(int i=1;i<=n*2;i++){
            System.out.println("Enter the value of "+i+" data");
            int data = sc.nextInt();
            stack.push(data);
        }

        while(!stack.isEmpty()){
            System.out.println( stack.pop());
        }

    }
}

