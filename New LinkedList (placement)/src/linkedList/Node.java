// This is the code for implemetation of a single Linkedlist
// Also Print all the element of LinkedList

/*
package linkedList;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        next = null;
    }
}

class Main{
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(10);
        Node<Integer> node2 = new Node<>(20);
        Node<Integer> node3 = new Node<>(30);
        Node<Integer> node4 = new Node<>(40);
        Node<Integer> node5 = new Node<>(50);
        Node<Integer> node6 = new Node<>(60);
        Node<Integer> node7 = new Node<>(70);
        Node<Integer> node8 = new Node<>(80);
        Node<Integer> node9 = new Node<>(90);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;

        System.out.println(node1.data);
        System.out.println(node2.data);
        System.out.println(node3.data);
        System.out.println(node4.data);
        System.out.println(node5.data);
        System.out.println(node6.data);
        System.out.println(node7.data);
        System.out.println(node8.data);
        System.out.println(node9.data);

        Node<Integer> head= node1;

        printLinkedList(head);

    }

    public static void printLinkedList(Node<Integer> head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
        System.out.println("You have printed all the Data of Linked List!");
    }
}
*/





// This Program is written to Take Input in a LinkedList
/*
package linkedList;
import java.util.Scanner;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        next = null;
    }
}

class Main{

    // 1st method to take input program in LinkedList
    public static Node<Integer> takeInput1stMethod(){
        Scanner sc = new Scanner(System.in);
        Node head = null;

        System.out.println("Inter the head data of element");
        int data = sc.nextInt();

        while(data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
            }
            else{
                Node<Integer> temp = head;
                while (temp.next != null){
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            data = sc.nextInt();
        }

        return head;
    }
    // 2nd method to takeInput in a LinkedList
    public static Node<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        Node head = null;
        Node tail = null;

        System.out.println("Inter the head data of element");
        int data = sc.nextInt();

        while(data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }

        return head;
    }

    public static void printLinkedList(Node<Integer> head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
        System.out.println("You have printed all the Data of Linked List!");
    }

    public static void main(String[] args) {
        Node<Integer> head1 =  takeInput1stMethod();
        Node<Integer> head = takeInput();
        printLinkedList(head);
        printLinkedList(head1);
    }
}
*/







// this program is write to add any element at any position in a LinkedList
/*
package linkedList;
import java.util.Scanner;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        next = null;
    }
}

class Main{

    // this is the code to insert any element at any position in a LinkedList
    public static Node<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        Node head = null;
        Node tail = null;

        System.out.println("Inter the head data of element");
        int data = sc.nextInt();

        while(data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }

        return head;
    }

    public static void printLinkedList(Node<Integer> head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
        System.out.println("You have printed all the Data of Linked List!");
    }

    public static Node<Integer> insert(Node<Integer> head, int value, int pos){
        Node<Integer> newNode = new Node<>(value);

        if(pos == 1){
            newNode.next = head;
            return newNode;
        }

        int n = 1;
        Node<Integer> temp = head;
        while(n < pos-1){
            temp = temp.next;
            n++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        printLinkedList(head);
        head = insert(head, 58, 7);
        printLinkedList(head);

    }
}

 */







// Print Ith element of Linked List
/*
package linkedList;
import java.util.Scanner;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        next = null;
    }
}

class Main{

    // this is the code to insert any element at any position in a LinkedList
    public static Node<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        Node head = null;
        Node tail = null;

        System.out.println("Inter the head data of element");
        int data = sc.nextInt();

        while(data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }

        return head;
    }

    public static void printLinkedList(Node<Integer> head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
        System.out.println("You have printed all the Data of Linked List!");
    }

    public static Node<Integer> insert(Node<Integer> head, int value, int pos){
        Node<Integer> newNode = new Node<>(value);

        if(pos == 1){
            newNode.next = head;
            return newNode;
        }

        int n = 1;
        Node<Integer> temp = head;
        while(n < pos-1){
            temp = temp.next;
            n++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public static void printIthElement(Node<Integer> head, int pos){
        int cnt = 1;

        while(cnt < pos){
            head = head.next;
            cnt++;
        }
        System.out.println(head.data);
    }
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        printLinkedList(head);
//        head = insert(head, 58, 7);
//        printLinkedList(head);

        printIthElement(head, 5);
    }
}

 */










// Delete the node from Ith position
/*
package linkedList;
import java.util.Scanner;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        next = null;
    }
}

class Main{

    // this is the code to insert any element at any position in a LinkedList
    public static Node<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        Node head = null;
        Node tail = null;

        System.out.println("Inter the head data of element");
        int data = sc.nextInt();

        while(data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }

        return head;
    }

    public static Node<Integer> deleateIthPosition(Node<Integer> head, int pos){
        if(pos == 0){
            return head.next;
        }

        Node<Integer> prev = null;
        Node<Integer> curr = head;

        int cnt = 0;

        while(cnt < pos){
            prev = curr;
            curr = curr.next;
            cnt++;
        }

        prev.next = curr.next;

        return head;
    }

    public static void printLinkedList(Node<Integer> head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
        System.out.println("You have printed all the Data of Linked List!");
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        printLinkedList(head);
        head = deleateIthPosition(head, 2);
        printLinkedList(head);
    }
}

 */







// Find a position of a node in a LinkedList
/*
package linkedList;
import java.util.Scanner;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        next = null;
    }
}

class Main{

    // this is the code to insert any element at any position in a LinkedList
    public static Node<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        Node head = null;
        Node tail = null;

        System.out.println("Inter the head data of element");
        int data = sc.nextInt();

        while(data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }

        return head;
    }

    public static void printLinkedList(Node<Integer> head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
        System.out.println("You have printed all the Data of Linked List!");
    }

    public static int findNode(Node<Integer> head, int num){
        if(head == null){
            return -1;
        }

        int cnt = 0;

        while(head.data != num && head != null){
            head = head.next;
            cnt ++;
        }

        return cnt;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        printLinkedList(head);
        int ans = findNode(head, 50);
        System.out.println(ans);
    }
}

 */








// append last n node in the last of the LinkedList
/*
package linkedList;
import java.util.Scanner;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        next = null;
    }
}

class Main{

    // this is the code to insert any element at any position in a LinkedList
    public static Node<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        Node head = null;
        Node tail = null;

        System.out.println("Inter the head data of element");
        int data = sc.nextInt();

        while(data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }

        return head;
    }

    public static void printLinkedList(Node<Integer> head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
        System.out.println("You have printed all the Data of Linked List!");
    }

    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n){
        Node<Integer> node = head;
        Node<Integer> checkNode = null;
        Node<Integer> newHead = null;

        if(n == 0){
            return head;
        }

        int count = 0;

        while(node != null){
            node = node = node.next;
            count++;
        }
//        System.out.println(count);

        if(n > count){
            return head;
        }

        n = count - n;
        node = head;

        for(int i = 0 ; i < n-1; i++){
            node = node.next;
        }
        checkNode = node.next;
        node.next = null;
        newHead = checkNode;

        while(checkNode.next != null){
            checkNode = checkNode.next;
        }

        checkNode.next = head;
        return newHead;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        printLinkedList(head);
        head = appendLastNToFirst(head, 7);
        printLinkedList(head);
    }
}

 */








// print reverse of a Linked List
/*
package linkedList;
import java.util.Scanner;
import java.util.Stack;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        next = null;
    }
}

class Main{

    // this is the code to insert any element at any position in a LinkedList
    public static Node<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        Node head = null;
        Node tail = null;

        System.out.println("Inter the head data of element");
        int data = sc.nextInt();

        while(data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }

        return head;
    }

    public static void printLinkedList(Node<Integer> head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
        System.out.println("You have printed all the Data of Linked List!");
    }

    // Reversing of linked list using stack
    public static Node<Integer> reverseUsingStack(Node<Integer> head){
        Node<Integer> curr = head;
        Stack<Integer> st = new Stack<>();

        while (curr != null){
            st.push(curr.data);
            curr = curr.next;
        }

        Node<Integer> temp = head;
        while(!st.isEmpty()){
            temp.data = st.pop();
            temp = temp.next;
        }

        return head;
    }

    public static Node<Integer> reverse(Node<Integer> head){
        Node<Integer> curr = head;
        Node<Integer> prev = null;

        while(curr != null){
            Node<Integer> temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }

    public static Node<Integer> reverseRec(Node<Integer> head){
        if(head == null || head.next == null){
            return head;
        }

        Node<Integer> newHead = reverseRec(head.next);
        Node<Integer> headNext = head.next;
        headNext.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        printLinkedList(head);
//        head = reverseUsingStack(head);
//        printLinkedList(head);
        Node<Integer> nodeRev = reverse(head);
        printLinkedList(nodeRev);
    }
}
*/








// This program is used to find that the LinkedList is pallindrome or not
/*
package linkedList;
import java.util.Scanner;
import java.util.Stack;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        next = null;
    }
}

class Main{

    // this is the code to insert any element at any position in a LinkedList
    public static Node<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        Node head = null;
        Node tail = null;

        System.out.println("Inter the head data of element");
        int data = sc.nextInt();

        while(data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }

        return head;
    }

    public static void printLinkedList(Node<Integer> head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
        System.out.println("You have printed all the Data of Linked List!");
    }

    // check the LinkedList is pallindrome or not

    public static boolean isPallindrome(Node<Integer> head){
        if(head == null || head.next == null){
            return true;
        }

        Node<Integer> temp = head;

        Stack<Integer> st = new Stack<>();
        while(temp != null){
            st.push(temp.data);
            temp = temp.next;
        }

        temp = head;

        while(!st.isEmpty()){
            if(st.pop() != temp.data){
                return false;
            }
            temp = temp.next;
        }

        return true;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        printLinkedList(head);
        boolean ans = isPallindrome(head);
        System.out.println(ans);
    }
}

 */











// find midpoint of linkedList
/*
package linkedList;
import java.util.Scanner;
import java.util.Stack;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        next = null;
    }
}

class Main{

    // this is the code to insert any element at any position in a LinkedList
    public static Node<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        Node head = null;
        Node tail = null;

        System.out.println("Inter the head data of element");
        int data = sc.nextInt();

        while(data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }

        return head;
    }

    public static void printLinkedList(Node<Integer> head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
        System.out.println("You have printed all the Data of Linked List!");
    }

    // mid point of LinkedList
    public static Node<Integer> midPoint(Node<Integer> head){
        if(head == null || head.next == null){
            return head;
        }

        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        printLinkedList(head);
        Node<Integer> midpt = midPoint(head);
        System.out.println(midpt.data);
    }
}

 */






// program to merge 2 sorted LinkedList
/*
package linkedList;
import java.util.Scanner;
import java.util.Stack;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        next = null;
    }
}

class Main{

    // this is the code to insert any element at any position in a LinkedList
    public static Node<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        Node head = null;
        Node tail = null;

        System.out.println("Inter the head data of element");
        int data = sc.nextInt();

        while(data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }

        return head;
    }

    public static void printLinkedList(Node<Integer> head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
        System.out.println("You have printed all the Data of Linked List!");
    }

    // merge two sorted LinkedList
    public static Node<Integer> mergeTwoSortedList(Node<Integer> list1, Node<Integer> list2){
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }

        Node<Integer> l1 = list1;
        Node<Integer> l2 = list2;

        Node<Integer> newNode1 = new Node<Integer>(-3333);
        Node<Integer> newNode = newNode1;

        while(l1 != null && l2 != null){
            if(l1.data <= l2.data){
                newNode.next = l1;
                l1 = l1.next;
            }
            else{
                newNode.next = l2;
                l2 = l2.next;
            }
            newNode = newNode.next;
        }

        if(l1 == null && l2 != null){
            while(l2 != null){
                newNode.next = l2;
                l2 = l2.next;
                newNode = newNode.next;
            }
        }

        if(l2 == null && l1 != null){
            while(l1 != null){
                newNode.next = l1;
                l1 = l1.next;
                newNode = newNode.next;
            }
        }

        return newNode1.next;
    }

    public static void main(String[] args) {
        Node<Integer> head1 = takeInput();
        Node<Integer> head2 = takeInput();
        printLinkedList(head1);
        printLinkedList(head2);
        Node<Integer> newHead = mergeTwoSortedList(head1, head2);
        printLinkedList(newHead);
    }
}

 */








// Delete a Node from LinkedList Recursively
/*
package linkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.Delayed;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        next = null;
    }
}

class Main{

    // this is the code to insert any element at any position in a LinkedList
    public static Node<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        Node head = null;
        Node tail = null;

        System.out.println("Inter the head data of element");
        int data = sc.nextInt();

        while(data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }

        return head;
    }

    public static void printLinkedList(Node<Integer> head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
        System.out.println("You have printed all the Data of Linked List!");
    }

    public static Node<Integer> deleteNodeRec(Node<Integer> head, int pos){
        if(head == null){
            return head;
        }

//        System.out.println("head position"+head.data);

        if (pos == 0){
            head = head.next;
//            System.out.println(head.data);
            return head;
        }

        Node<Integer> smallerHead = deleteNodeRec(head.next, pos-1);
//        System.out.println(smallerHead.data);
        head.next = smallerHead;
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        int position = 4;
        printLinkedList(head);
        head = deleteNodeRec(head, position);
        printLinkedList(head);
    }
}

 */









// Find the Node in LinkedList Recursively
/*
package linkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.Delayed;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        next = null;
    }
}

class Main{

    // this is the code to insert any element at any position in a LinkedList
    public static Node<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        Node head = null;
        Node tail = null;

        System.out.println("Inter the head data of element");
        int data = sc.nextInt();

        while(data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }

        return head;
    }

    public static void printLinkedList(Node<Integer> head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
        System.out.println("You have printed all the Data of Linked List!");
    }

    static int count = 0;
    public static int findNodeRec(Node<Integer> head, int val){
        if(head == null){
            return -1;
        }
        System.out.println(head.data);
        if(head.data == val){
            return count;
        }
        else{
            count++;
        }

        int ans = findNodeRec(head.next, val);
        System.out.println(head.data);
        return ans;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        int value = 40;
        printLinkedList(head);
        int ans = findNodeRec(head, value);
        System.out.println(ans);
    }
}

 */








// For a given Singly LinkedList of integers, arrange the elements such that all the even numbers are placed after the odd number
/*
package linkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.Delayed;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        next = null;
    }
}

class Main{

    // this is the code to insert any element at any position in a LinkedList
    public static Node<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        Node head = null;
        Node tail = null;

        System.out.println("Inter the head data of element");
        int data = sc.nextInt();

        while(data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }

        return head;
    }

    public static void printLinkedList(Node<Integer> head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
        System.out.println("You have printed all the Data of Linked List!");
    }

    public static Node<Integer> evenAfterOdd(Node<Integer> head){
        if(head == null || head.next == null){
            return head;
        }

        Node<Integer> node = head;

        Node<Integer> evenNode = null;
        Node<Integer> evenHead = null;

        Node<Integer> oddNode = null;
        Node<Integer> oddHead = null;

        while(node != null){
            int data = node.data;

            if(data%2 == 0){
                if(evenHead == null){
                    evenHead = node;
                    evenNode = node;
                }
                else{
                    evenNode.next = node;
                    evenNode = evenNode.next;
                }
            }
            else{
                if(oddHead == null){
                    oddHead = node;
                    oddNode = node;
                }
                else{
                    oddNode.next = node;
                    oddNode = oddNode.next;
                }
            }

            node = node.next;
        }

        if(oddHead == null){
            evenNode.next = null;
            return evenHead;
        }

        if(evenHead == null){
            oddNode.next = null;
            return oddHead;
        }

        if(oddHead != null && evenHead != null){
            evenNode.next = null;
            oddNode.next = evenHead;
        }
        return oddHead;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        int value = 40;
        printLinkedList(head);
        Node<Integer> evenAfterOddNodeHead = evenAfterOdd(head);
        printLinkedList(evenAfterOddNodeHead);
    }
}

 */







// Skip M elements and Delete N elements in a LinkedList
/*
package linkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.Delayed;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        next = null;
    }
}

class Main{

    // this is the code to insert any element at any position in a LinkedList
    public static Node<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        Node head = null;
        Node tail = null;

        System.out.println("Inter the head data of element");
        int data = sc.nextInt();

        while(data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }

        return head;
    }

    public static void printLinkedList(Node<Integer> head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
        System.out.println("You have printed all the Data of Linked List!");
    }

    public static Node<Integer> skipMDeleteN(Node<Integer> head, int m, int n){
        if(m == 0){
            return null;
        }
        if(n == 0){
            return head;
        }

        Node<Integer> node = head;
        Node<Integer> delNode = null;

        while (node != null){

            for (int i = 0 ; i < m-1 && node != null ; i++){
                node = node.next;
            }

            if(node == null){
                break;
            }

            delNode = node.next;

            for(int i = 0 ; i < n && delNode != null; i++){
                delNode = delNode.next;
            }

            node.next = delNode;
            node = delNode;
        }

        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        int value = 40;
        printLinkedList(head);
        int m = 3;
        int n = 2;
        head = skipMDeleteN(head, m , n);
        printLinkedList(head);
    }
}

 */










// Sort a LinkedList using BubbleSort
/*
package linkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.Delayed;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        next = null;
    }
}

class Main{

    // this is the code to insert any element at any position in a LinkedList
    public static Node<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        Node head = null;
        Node tail = null;

        System.out.println("Inter the head data of element");
        int data = sc.nextInt();

        while(data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }

        return head;
    }

    public static void printLinkedList(Node<Integer> head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
        System.out.println("You have printed all the Data of Linked List!");
    }

    public static int lengthOfList(Node<Integer> head){
        Node<Integer> curr = head;
        int count = 0;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        return count;
    }

    // Sort a linked list using Bubble sort
    public static Node<Integer> bubbleSort(Node<Integer> head){
        if(head == null || head.next == null){
            return head;
        }

        int len = lengthOfList(head);

        Node<Integer> node1 = null;
        Node<Integer> node2 = null;

        for(int i = 0 ; i < len - 1; i++){
            node1 = head;
            node2 = head.next;

            for (int j = 0 ; j < len - 1 - i; j++){
                int data1 = node1.data;
                int data2 = node2.data;

                if(data1 > data2){
                    node1.data = data2;
                    node2.data = data1;
                }

                node1 = node1.next;
                node2 = node2.next;
            }

        }
        return head;
    }
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        printLinkedList(head);
        head = bubbleSort(head);
        printLinkedList(head);
    }
}

 */