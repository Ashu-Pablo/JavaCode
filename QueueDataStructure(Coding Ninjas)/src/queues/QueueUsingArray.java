//  Basic structure of Queues
/*

package queues;

import java.util.Scanner;

public class QueueUsingArray {
    private int data[];
    private int front; // index at which front element is stored
    private int rear; // index at which front element is stored
    private int size;

    public QueueUsingArray(){
        data = new int[20];
        front = -1;
        rear = -1;
        size = 0;
    }

    public QueueUsingArray(int capacity){
        data = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    int size(){
        return size;
    }

    boolean isEmpty(){
        return size==0;
    }

    int getFront() throws QueueEmptyException{
        if(size == 0){
            throw new QueueEmptyException();
        }
        return data[front];
    }

    void enqueue(int element) throws QueueFullException {

        if(size == data.length){
            throw new QueueFullException();
        }
       // System.out.println(data.length);

        if(size == 0){
            front =0;
        }
        rear ++;
        if (rear == data.length){
            rear = 0;
        }
        size++;
        data[rear] = element;

    }


    int dequeue() throws QueueEmptyException{
        if(size == data.length) {
            throw new QueueEmptyException();
        }
       // System.out.println(data.length);

        int temp =data[front];
        front++;
        if(front == data.length){
            front=0;
        }
        size--;

        if(size == 0){
            front =-1;
            rear =-1;
        }
        return temp;
    }

}

class QueueEmptyException extends Exception {

}
class QueueFullException extends Exception {

}

class QueueUse{
    public static void main(String[] args) throws QueueFullException, QueueEmptyException {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        QueueUsingArray queue = new QueueUsingArray(n);
        for(int i=1;i<=n;i++){
//            int data =sc.nextInt();
            queue.enqueue(i);
        }

        //queue.dequeue();
        System.out.println(queue.getFront());
        while(!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }

//        while(queue.size()!=0){
//            System.out.println(queue.dequeue());
//        }
    }
}


*/









//Dynamic Array


package queues;

import java.util.Scanner;

public class QueueUsingArray {
    private int data[];
    private int front; // index at which front element is stored
    private int rear; // index at which front element is stored
    private int size;

    public QueueUsingArray(){
        data = new int[20];
        front = -1;
        rear = -1;
        size = 0;
    }

    public QueueUsingArray(int capacity){
        data = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    int size(){
        return size;
    }

    boolean isEmpty(){
        return size==0;
    }

    int getFront() throws QueueEmptyException{
        if(size == 0){
            throw new QueueEmptyException();
        }
        return data[front];
    }

    private void doubleCapacity(){
        int temp[] = data;
        data = new int[2*temp.length];
        int idx = 0;
        for (int i=front;i<temp.length;i++){
            data[idx]=temp[i];
            idx++;
        }

        for(int i=0;i<=front-1;i++){
            data[idx] = temp[i];
            idx++;
        }
        front = 0;
        rear = temp.length - 1;
    }
    void enqueue(int element) {

        if(size == data.length){
            //throw new QueueFullException();
            doubleCapacity();
        }

        if(size == 0){
            front =0;
        }
        rear ++;
        size++;
        if (rear == data.length){
            rear = 0;
        }
        data[rear] = element;

    }


    int dequeue() throws QueueEmptyException{
        if(size == data.length) {
            throw new QueueEmptyException();
        }

        int temp =data[front];
        front++;
        if(front == data.length){
            front=0;
        }
        size--;

        if(size == 0){
            front =-1;
            rear =-1;
        }
        return temp;
    }

}

class QueueEmptyException extends Exception {

}
//class QueueFullException extends Exception {
//
//}

class QueueUse{
    public static void main(String[] args) throws  QueueEmptyException {
        QueueUsingArray queue = new QueueUsingArray(3);
        Scanner sc = new Scanner(System.in);
        for (int i=1;i<=5;i++){
            int data = sc.nextInt();
            queue.enqueue(data);
        }

        System.out.println(queue.getFront());
        while(!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
    }
}
