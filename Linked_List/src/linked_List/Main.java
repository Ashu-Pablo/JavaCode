package linked_List;

public class Main {

    public static class Node{
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int val){
            if(size==0){
                Node temp = new Node();
                temp.data =val;
                temp.next = null;
                head = tail = temp;
                size++;
            }
            else{
                Node temp = new Node();
                temp.data =val;
                temp.next = null;

                tail.next = temp;
                tail = temp;

                size++;
            }
        }
    }
    public static void main(String[] args) {
	// write your code here
        
    }
}
