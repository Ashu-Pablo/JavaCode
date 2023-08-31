package queues;

public class Node<T>{
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        next = null;
    }
}

class QueueUsingLL<T>{
    private Node<T> front;
    private Node<T> rear;
    int size;

    public QueueUsingLL(){
        front = null;
        rear = null;
        size = 0;
    }

    int size(){
        return size;
    }

    boolean isEmpty(){
        return size == 0;
    }

    T front(){
        if(size == 0){
            System.out.println("Queue is empty");
        }

        return front.data;
    }

    void enqueue(T element){
        Node<T> newNode = new Node<>(element);
        if(front == null){
            front = newNode;
            rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode; // rear = rear.next;
        }
        size++;
    }

    T dequeue(){
        if(size == 0){
            System.out.println("Queue is empty");
        }

        T temp = front.data;
        front = front.next;
        if( size == 1){
            rear = null;
        }
        size --;
        return temp;
    }

}

class QueueUses{
    public static void main(String[] args) {
        QueueUsingLL<Integer> queue = new QueueUsingLL<>();
        queue.enqueue(10);
        queue.enqueue(100);
        queue.enqueue(60);
        queue.enqueue(1000);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.enqueue(201);
        queue.dequeue();

        while(!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
    }
}