/*
package LinkedList;
import java.util.Scanner;
public class Node {
    int data;
    Node next;
}

class LinkedListUses {
    public static Node TakeInput(){
        Node head = null;
        System.out.println("Enter the data");
        System.out.println("-1 for end");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while(num != -1){
            if(head == null){
                Node newNode = new Node();
                newNode.data = num;
                newNode.next = null;
                head = newNode;
            }
            else{
                Node newNode = new Node();
                newNode.data = num;
                newNode.next = null;
                Node ptr = head;

                while(ptr.next != null) {
                    ptr = ptr.next;
                }
                ptr.next = newNode;

            }
            num = sc.nextInt();
        }
        return head;
    }

    public static Node takeInput(){
        Node head = null;
        System.out.println("print -1 to end");
        System.out.println("Enter the data");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num != -1){
            Node newNode = new Node();
            newNode.data = num;
            if(head == null){
                head = newNode;
            }
            else{
                Node temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            num = sc.nextInt();
        }
        return head;
    }

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
//        takeInput();
        Node ans = takeInput();

        display(ans);
    }
}


 */








/*

package LinkedList;
import java.util.Scanner;

public class Node<T>{
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        next = null;
    }
}

class LinkedListUse{
    public static Node<Integer> takeInput(){
        Node<Integer> head = null;
        System.out.println("Enter -1 to end");
        System.out.println("Enter the data");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while(num != -1){
            Node<Integer> newNode = new Node<Integer>(num);
            if(head == null){
                head = newNode;
            }
            else{
                Node<Integer> temp = head;
                while(temp.next != null){
                    temp =temp.next;
                }
                temp.next = newNode;
            }
            num = sc.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        Node<Integer> ans = takeInput();
        print(ans);
    }
}

 */







/*

package LinkedList;
import java.util.Scanner;

public class Node<T>{
    T data;
    Node<T> next;

//    Node(T data){
//        this.data = data;
//        next = null;
//    }
}

class LinkedListUse{
    public static Node<Integer> takeInput(){
        Node<Integer> head = null;
        System.out.println("Enter -1 to end");
        System.out.println("Enter the data");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while(num != -1){
            Node<Integer> newNode = new Node<Integer>();
            newNode.data = num;
            if(head == null){
                head = newNode;
            }
            else{
                Node<Integer> temp = head;
                while(temp.next != null){
                    temp =temp.next;
                }
                temp.next = newNode;
            }
            num = sc.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void printIthPosition(Node<Integer> head,int n){
        if(head == null){
            return;
        }
        Node<Integer> temp = head;
        while(temp != null){
            n--;
            if(n == 0){
                System.out.println(temp.data);
            }
            temp = temp.next;
        }
    }

    public static Node<Integer> insert(Node<Integer> head, int num,int pos){
        Node<Integer> newNode = new Node<>();
        newNode.data = num;
        if(pos == 0){
            newNode.next = head;
            head = newNode;
            return head;
        }

        Node<Integer> temp = head;

        while(temp!=null){
            pos --;
            if(pos == 1){
                newNode.next = temp.next;
                temp.next = newNode;
            }
            temp = temp.next;
        }
        return head;
    }

    public static Node<Integer> delete(Node<Integer> head,int pos){
        if(pos == 1){
            head = head.next;
            System.out.println(head.data);
            return head;
        }

        Node<Integer> temp = head;
        while(temp != null){
            pos --;
            if(pos == 1){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void increment(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            temp.data++;
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static int size(Node<Integer> head){
        int i = 0;
        Node<Integer> temp = head;

        while(temp != null){
            i++;
            temp = temp.next;
        }

        return i;
    }

    public static int position(Node<Integer> head,int num){
        Node<Integer> temp = head;
        int i=-1;
        int cnt = 0;
        while(temp != null){
            cnt ++;
            if(num == temp.data){
                i = cnt;
                break;
            }
            temp = temp.next;
        }
        return i;
    }

    public static Node<Integer> printReverse(Node<Integer> head){
        if(head == null){
            return head;
        }
        Node<Integer> reverse = printReverse(head.next);
        System.out.print(head.data + " ");
        return reverse;
    }
    public static void reverselist(Node<Integer> head){
        Node<Integer> reverse = printReverse(head);
    }

    public static void main(String[] args) {
        Node<Integer> ans = takeInput();
        print(ans);
        reverselist(ans);

//        int pos = position(ans,50);
//        System.out.println(pos);
//        int length = size(ans);
//        System.out.println(length);
//        insert(ans,50,5);
//        print(ans);
//        Node<Integer> del = delete(ans,5);
//        print(del);
//        printIthPosition(ans, 5);
//        increment(ans);
//        printIthPosition(ans, 5);
    }
}

 */










/*

package LinkedList;
import java.util.Scanner;

public class Node<T> {
    T data;
    Node<T> next;
}

class LinkedListUse{
    public static Node<Integer> takeInput(){
        Node<Integer> head = null;
        Node<Integer> tail = null;
        System.out.println("-1 for end");
        System.out.println("Enter the data");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while(num != -1){
            Node<Integer> newNode = new Node<Integer>();
            newNode.data = num;

            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode;
            }
            num = sc.nextInt();
        }
        return head;
    }

    public static void display(Node<Integer> head){
        Node<Integer> temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n){
        Node<Integer> temp = head, checkNode = null, newHead = null;
        if(n == 0){
            return head;
        }

        int count = 0;

        while(temp != null){
            temp = temp.next;
            count ++;
        }

        if(count < n){
            return head;
        }

        n = count - n;
        temp = head;

        for(int i = 0; i < n-1 ;i++){
            temp = temp.next;
        }

        checkNode=temp.next;
        temp.next=null;
        newHead=checkNode;

        while(checkNode.next != null) {
            checkNode=checkNode.next;
        }
        checkNode.next=head;
        head=newHead;

        return head;

    }

    public static Node<Integer> mergeTwoSortedLinkedLists(Node<Integer> head1, Node<Integer> head2) {
        //Your code goes here
        if(head1 == null){
            return head2;
        }

        if(head2 == null){
            return head1;
        }

        Node<Integer> t1= head1;
        Node<Integer> t2= head2;

        Node<Integer> head = null;
        Node<Integer> tail = null;


        if(t1.data <= t2.data){
            head = t1;
            tail = t1;
            t1 = t1.next;
        }
        else{
            head = t2;
            tail = t2;
            t2 = t2.next;
        }

        while(t1 !=null && t2 != null){
            if(t1.data <= t2.data){
                tail.next = t1;
                tail = t1;
                t1 = t1.next;
            }
            else{
                tail.next = t2;
                tail = t2;
                t2 = t2.next;
            }
        }

        //one list is over
        if(t1 != null){
            tail.next=t1;
        }
        else{
            tail.next=t2;
        }

        return head;
    }

    public static void main(String[] args) {
//        Node<Integer> head = takeInput();
//        Scanner sc=new Scanner(System.in);
//        int position = sc.nextInt();
//        Node<Integer> ans = appendLastNToFirst(head,position);
        Node<Integer> head1 = takeInput();
        Node<Integer> head2 = takeInput();
        Node<Integer>newHead = mergeTwoSortedLinkedLists(head1,head2);
        display(newHead);
    }
}

*/




/*

package LinkedList;
import java.util.Scanner;

public class Node<T>{
    T data;
    Node<T> next;
}

class LinkedListUse{
    public static Node<Integer> takeInput(){
        Node<Integer> head = null;
        Node<Integer> tail = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("-1 for end");
        System.out.println("Enter the data");
        int num = sc.nextInt();

        while(num != -1){
            Node<Integer> newNode = new Node<>();
            newNode.data = num;
            if(head == null){
                head = newNode;
                tail = newNode;

            }
            else{
                tail.next = newNode;
                tail = newNode;
            }
            num = sc.nextInt();
        }
        return head;
    }

    public static void display(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node<Integer> midPoint(Node<Integer> head){
        if(head == null){
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

    public static Node<Integer> removeDuplicate(Node<Integer> head){
        if(head == null || head.next == null){
            return head;
        }

        Node<Integer> first = head;
        Node<Integer> second = head.next;

        while(second != null){
            if(first.data != second.data){
                first.next = second;
                first = first.next;
            }
            second = second.next;
        }
        first.next = second;


        //Another solution

//        Node<Integer> node=head;
//        while(node.next!=null){
//            if(node.data==node.next.data){
//                node.next=node.next.next;
//            }
//            else{
//                node=node.next;
//            }
//        }
//

        return head;
    }

    public static void main(String[] args) {
        Node<Integer> root = takeInput();
        display(root);
        Node<Integer> Ans = removeDuplicate(root);
        System.out.println();
        display(Ans);
//        Node<Integer> MidPoint = midPoint(root);
//        System.out.println();
//        System.out.println(MidPoint.data);
    }
}


 */











// Insert element recursively

package LinkedList;
import java.util.Scanner;

public class Node<T>{
    T data;
    Node<T> next;
}

class LinkedListUse{
    public static Node<Integer> takeInput(){
        Node<Integer> head = null;
        Node<Integer> tail = null;

        System.out.println("-1 for end");
        System.out.println("enter the data");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while(num != -1){
            Node<Integer> newNode = new Node();
            newNode.data = num;
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode;
            }
            num = sc.nextInt();
        }

        return head;
    }

    public static void display(Node<Integer> head){
        Node<Integer> temp = head;

        while(temp!= null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node<Integer> insertRecursively(Node<Integer> head,int pos,int num){
        if(pos == 0){
            Node<Integer> newNode = new Node();
            newNode.data = num;
            newNode.next = head;
            head = newNode;
            return head;
        }

        if (head == null){
            return head;
        }

        head.next = insertRecursively(head.next, pos - 1,num);

        return head;
    }

    public  static Node<Integer> reverseLLR(Node<Integer> head){
        if(head == null || head.next==null){
            return head;
        }

        Node<Integer> reversedTail = head.next;
        Node<Integer> smallHead = reverseLLR(head.next);
        reversedTail.next = head;
        head.next = null;

        return smallHead;
    }

    public static Node<Integer> reverseLinkedListRec(Node<Integer> head) {
        //Your code goes here
        if (head==null || head.next==null) {
            return head;
        }

        Node<Integer> ans = reverseLinkedListRec(head.next);

        Node<Integer> node=ans;
        while (node.next!=null)
        {
            node=node.next;
        }
        node.next=head;
        head.next=null;

        return ans;

    }

    public static Node<Integer> reverseI(Node<Integer> head){
        Node<Integer> curr = head;
        Node<Integer> prev = null;

        while (curr != null){
            curr.next = prev;
            prev = curr;
            curr = curr.next;
        }
        return prev;
    }

    public static Node<Integer> deleteNodeRec(Node<Integer> head, int pos) {
        //Your code goes here
        if (head == null){
            return head;
        }

        if (pos==0){
            head=head.next;
            return head;
        }

        Node<Integer> smallerHead=deleteNodeRec(head.next,pos-1);
        head.next=smallerHead;
        return head;

    }

    public static int findNodeRec(Node<Integer> head, int n) {
        //Your code goes here
        if (head==null) {//Empty linked list
            return -1;
        }

        if (head.data.equals(n)){
            return 0;
        }
        int smallIndex=findNodeRec(head.next,n);
        //System.out.println("ff"+smallIndex);
        if (smallIndex==-1) {
            return smallIndex;
        }
        else {
            return smallIndex+1;
        }
    }

    public static Node swapNodes(Node head, int k) {
        Node temp = head;
        int count = 0;
        while(temp!= null){
            count ++;
            temp = temp.next;
        }

        Node newNode1 = new Node();
        Node newNode2 = new Node();

        int c1= 0;
        int c2 = 0;
        Node ptr = head;
        while(ptr != null){
            c1 ++;
            c2 ++;
            if(c1 == k){
                newNode1 = ptr;
            }
            if(c2 == count - k){
                newNode2 = ptr.next;
            }
            ptr = ptr.next;
        }

        Node cptr = head;
        int c3 = 0;
        int c4 = 0;

        while(cptr != null){
            c3 ++;
            c4 ++;

            if(c3 == k){
                cptr.data = newNode1.data;
            }
            if(c4 == count - k){
                cptr.next.data = newNode2.data;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> root = takeInput();
        display(root);
        System.out.println();
//        Node<Integer> ans = insertRecursively(root,5,50);
//        display(ans);
        Node<Integer> ans = swapNodes(root , 2);
        display(ans);
    }
}