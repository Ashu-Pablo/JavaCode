/*
package linkedList;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
       // next = null;
    }
}


 class LinkedListUse{

    public static void print(Node<Integer> head){
        Node<Integer> temp = head;

        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void increment(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            temp.data++;
            temp = temp.next;
        }
    }

    public static void main(String args[]){

        Node<Integer> node1 = new Node<Integer>(10);
        Node<Integer> node2 = new Node<Integer>(20);
        node1.next = node2;
        increment(node1);
        print(node1);
    }
}

 */
/*
class LinkedListUse {
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<>(10);
//        System.out.println(node1.data);
//        System.out.println(node1.next);
        Node<Integer> node2 = new Node<>(20);
        Node<Integer> node3 = new Node<>(30);

        node1.next = node2;
        node2.next =node3;
        Node<Integer> head = node1;
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }

//        System.out.println(node3.next);
//        System.out.println(node2.data);
//        System.out.println(node1.next);
//        System.out.println(node2.next);

    }

}

 */








/*

package linkedList;
import java.util.Scanner;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        // next = null;
    }
}

class LinkedListUse{

    public static Node<Integer> takeInput(){
        Node<Integer> head =null;
        Scanner sc =new Scanner(System.in);
        int data =sc.nextInt();
        while (data !=-1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
            }
            else {
                Node<Integer> temp =head;

                while(temp.next != null){
                    temp = temp.next;
                }

                temp.next = newNode;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head){
        Node<Integer> temp = head;

        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void increment(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            temp.data++;
            temp = temp.next;
        }
    }

    public static void main(String args[]){
        Node<Integer> head = takeInput();
        print(head);

//        Node<Integer> node1 = new Node<Integer>(10);
//        Node<Integer> node2 = new Node<Integer>(20);
//        node1.next = node2;
//        increment(node1);
        //print(node1);
    }
}

 */










//print Ith position of the linked list
//For a given a singly linked list of integers and a position 'i', print the node data at the 'i-th' position.

/*
package linkedList;
import java.util.Scanner;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        // next = null;
    }
}

class LinkedListUse{

    public static Node<Integer> takeInput(){
        Node<Integer> head =null,tail =null;
        Scanner sc =new Scanner(System.in);
        int data =sc.nextInt();
        while (data !=-1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail=newNode; // tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }


    public static void print(Node<Integer> head){
        Node<Integer> temp = head;

        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }

//    public static void increment(Node<Integer> head){
//        Node<Integer> temp = head;
//        while(temp != null){
//            temp.data++;
//            temp = temp.next;
//        }
//    }

    public static void printIthNode(Node<Integer> head, int i){
        //Your code goes here
        int cnt=0;
        //int ans =0;

        if(head==null){
            return;
        }

        Node<Integer> temp =head;

        while(temp != null){
            cnt++;
            temp = temp.next;

            if(cnt == i){
                System.out.println(temp.data);
            }
        }
    }

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        Node<Integer> head = takeInput();
        System.out.println("enter index");
        int idx =sc.nextInt();
        printIthNode(head,idx);
        print(head);

    }
}


 */








//You have been given a linked list of integers. Your task is to write a function that deletes a node from a given position, 'POS'.

/*
package linkedList;
import java.util.Scanner;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        // next = null;
    }
}

class LinkedListUse{

    public static Node<Integer> takeInput(){
        Node<Integer> head =null,tail =null;
        Scanner sc =new Scanner(System.in);
        int data =sc.nextInt();
        while (data !=-1){
            Node<Integer> newNode = new Node<>(data);
//            System.out.println(data);
//            System.out.println(newNode);
            if(head == null){
                head = newNode;
               // System.out.println(head.data);
                tail = newNode;
               // System.out.println(tail.data);
            }
            else {
                tail.next = newNode;
               // System.out.println(tail.next);
                tail=newNode; // tail = tail.next;
               // System.out.println(tail.next);
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head){
        Node<Integer> temp = head;

        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node<Integer> insert(Node<Integer> head,int data,int pos){
        Node<Integer> newNode = new Node<>(data);
        if(pos==0){
            newNode.next = head;
            return newNode;
        }

        int i=0;
        Node<Integer> temp = head;
        while (i<pos-1){
            temp = temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next = newNode;

        return head;
    }

    public static void increment(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            temp.data++;
            temp = temp.next;
        }
    }

    public static void main(String args[]){
        Node<Integer> head = takeInput();
        Scanner sc=new Scanner(System.in);
        int data = sc.nextInt();
        int position = sc.nextInt();
        head = insert(head,data,position);
        print(head);

        increment(head);
        print(head);
    }
}


 */








//Print the length of the Linked list
/*

package linkedList;
import java.util.Scanner;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        // next = null;
    }
}

class LinkedListUse{

    public static Node<Integer> takeInput(){
        Node<Integer> head =null,tail =null;
        Scanner sc =new Scanner(System.in);
        int data =sc.nextInt();
        while (data !=-1){
            Node<Integer> newNode = new Node<>(data);
//            System.out.println(data);
//            System.out.println(newNode);
            if(head == null){
                head = newNode;
                // System.out.println(head.data);
                tail = newNode;
                // System.out.println(tail.data);
            }
            else {
                tail.next = newNode;
                // System.out.println(tail.next);
                tail=newNode; // tail = tail.next;
                // System.out.println(tail.next);
            }
            data = sc.nextInt();
        }
        return head;
    }
    /*

    public static void print(Node<Integer> head){
        Node<Integer> temp = head;

        while(temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node<Integer> insert(Node<Integer> head,int data,int pos){
        Node<Integer> newNode = new Node<>(data);
        if(pos==0){
            newNode.next = head;
            return newNode;
        }

        int i=0;
        Node<Integer> temp = head;
        while (i<pos-1){
            temp = temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next = newNode;

        return head;
    }

    public static void increment(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            temp.data++;
            temp = temp.next;
        }
    }

     */
/*

    public static int length(Node<Integer> head){
        //Your code goes here
        Node<Integer> temp = head;
        int cnt = 0;
        while(temp != null){
            cnt ++;
            temp =temp.next;
        }
        return cnt;
    }

    public static void main(String args[]){
        Node<Integer> head = takeInput();
        Scanner sc=new Scanner(System.in);
//        int data = sc.nextInt();
//        int position = sc.nextInt();
        int ans=length(head);
        System.out.println(ans);
//        head = insert(head,data,position);
//        print(head);
//
//        increment(head);
//        print(head);
    }
}

*/











//You have been given a singly linked list of integers. Write a function that returns the index/position of integer data denoted by 'N' (if it exists). Return -1 otherwise.
/*

package linkedList;
import java.util.Scanner;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        // next = null;
    }
}

class LinkedListUse{

    public static Node<Integer> takeInput(){
        Node<Integer> head =null,tail =null;
        Scanner sc =new Scanner(System.in);
        int data =sc.nextInt();
        while (data !=-1){
            Node<Integer> newNode = new Node<>(data);

            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail=newNode; // tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static int findNode(Node<Integer> head, int n){
        Node<Integer> temp = head;
        int cnt=0;
        int ans =-1;

        while(temp!=null){
            if (temp.data==n){
                ans = cnt;
                break;
            }
            cnt++;
            temp = temp.next;
        }
        return ans;
    }

    public static void main(String args[]){
        Node<Integer> head = takeInput();
        Scanner sc=new Scanner(System.in);
        int data = sc.nextInt();
        int ans = findNode(head,data);
        System.out.println(ans);
    }
}


 */










//You have been given a singly linked list of integers along with an integer 'N'. Write a function to append the last 'N' nodes towards the front of the singly linked list and returns the new head to the list.
/*

package linkedList;
import java.util.Scanner;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        // next = null;
    }
}

class LinkedListUse{

    public static Node<Integer> takeInput(){
        Node<Integer> head =null,tail =null;
        Scanner sc =new Scanner(System.in);
        int data =sc.nextInt();
        while (data !=-1){
            Node<Integer> newNode = new Node<>(data);

            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail=newNode; // tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
        //Your code goes here
        Node<Integer> node=head,checkNode=null,newHead=null;
        if (n==0){
            return head;
        }

        int count=0;
        while(node!=null) {
            node=node.next;
            count=count+1;
        }

        if (count<n) {
            return head;
        }

        n=count-n;
        node=head;
        for (int i=0;i<n-1;i++) {
            node=node.next;
        }

        checkNode=node.next;
        node.next=null;
        newHead=checkNode;

        while(checkNode.next != null) {
            checkNode=checkNode.next;
        }

        checkNode.next=head;
        head=newHead;
        return head;
    }


    public static void main(String args[]){
        Node<Integer> head = takeInput();
        Scanner sc=new Scanner(System.in);
        int position = sc.nextInt();
        Node<Integer> ans = appendLastNToFirst(head, position);

        while(ans != null){
            System.out.print(ans.data+" ");
            ans= ans.next;
        }

    }
}

 */











//You have been given a singly linked list of integers. Write a function to print the list in a reverse order.
/*

package linkedList;
import java.util.Scanner;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        // next = null;
    }
}

class LinkedListUse{

    public static Node<Integer> takeInput(){
        Node<Integer> head =null,tail =null;
        Scanner sc =new Scanner(System.in);
        int data =sc.nextInt();
        while (data !=-1){
            Node<Integer> newNode = new Node<>(data);

            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail=newNode; // tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static void printReverse(Node<Integer> root) {
        //Your code goes here
         Node<Integer> reverse = printReverseRecursion(root);
    }

    public static Node<Integer> printReverseRecursion(Node<Integer> node){

        if (node==null){
            return node;
        }

        Node<Integer> reverse=printReverseRecursion(node.next);
        System.out.print(node.data+" ");
        return reverse;
    }

    public static void main(String args[]){
        Node<Integer> head = takeInput();
        printReverse(head);
    }
}

 */










//You have been given a head to a singly linked list of integers. Write a function check to whether the list given is a 'Palindrome' or not.
/*

package linkedList;
import java.util.ArrayList;
import java.util.Scanner;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        // next = null;
    }
}

class LinkedListUse{

    public static Node<Integer> takeInput(){
        Node<Integer> head =null,tail =null;
        Scanner sc =new Scanner(System.in);
        int data =sc.nextInt();
        while (data !=-1){
            Node<Integer> newNode = new Node<>(data);

            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail=newNode; // tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static boolean isPalindrome(Node<Integer> head) {
        //Your code goes here
        Node<Integer> node = head;
        ArrayList<Integer> arrList = new ArrayList<>();

        while(node!=null){
            arrList.add(node.data);
            node = node.next;
        }

        int start = 0;
        int end = arrList.size()-1;
        while(start < end){
            if(arrList.get(start) != arrList.get(end)){
                return false;
            }
            else{
                start ++;
                end --;
            }
        }
        return true;
    }

    public static void main(String args[]){
        Node<Integer> head = takeInput();
        boolean ans = isPalindrome(head);
        System.out.println(ans);
    }
}

 */











//You have been given two sorted(in ascending order) singly linked lists of integers.
//Write a function to merge them in such a way that the resulting singly linked list is also sorted(in ascending order) and return the new head to the list.
/*

package linkedList;
import java.util.Scanner;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        // next = null;
    }
}

class LinkedListUse{

    public static Node<Integer> takeInput(){
        Node<Integer> head =null,tail =null;
        Scanner sc =new Scanner(System.in);
        int data =sc.nextInt();
        while (data !=-1){
            Node<Integer> newNode = new Node<>(data);

            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail=newNode; // tail = tail.next;
            }
            data = sc.nextInt();
        }
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

    public static void main(String args[]){
        Node<Integer> head1 = takeInput();
        Node<Integer> head2 = takeInput();

        Node<Integer> ans = mergeTwoSortedLinkedLists(head1,head2);

        while(ans != null){
            System.out.print(ans.data+" ");
            ans = ans.next;
        }
    }
}

 */










// Insert a element in a linked list recursively
/*

package linkedList;
import java.util.Scanner;

public class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        // next = null;
    }
}

class LinkedListUse{

    public static Node<Integer> takeInput(){
        Node<Integer> head =null,tail =null;
        Scanner sc =new Scanner(System.in);
        int data =sc.nextInt();
        while (data !=-1){
            Node<Integer> newNode = new Node<>(data);

            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail=newNode; // tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static Node<Integer> insertRecursively(Node<Integer> head, int pos,int element){
        if(pos == 0){
            Node<Integer> newNode = new Node<>(element);
            newNode.next = head;
            return newNode;
        }
        if(head == null){
            return head;
        }

        head.next = insertRecursively(head.next,pos-1,element);
        return head;
    }

    public static void main(String args[]){
        Node<Integer> head = takeInput();
        Scanner sc = new Scanner(System.in);
        int position = sc.nextInt();
        int node = sc.nextInt();
        Node<Integer> ans = insertRecursively(head,position,node);

        while(ans != null){
            System.out.print(ans.data+" ");
            ans = ans.next;
        }
    }
}

 */










// Eliminate duplicates elements from LinkedList
/*

package linkedList;
import java.util.Scanner;

public class Node<T>{
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
    }
}

class LinkedListUse{
    public static Node<Integer> takeInput(){
        Node<Integer> head = null;
        Node<Integer> tail = null;

        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        while (data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode; // tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head){

        Node<Integer> temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node<Integer> removeDuplicates(Node<Integer> head) {
        //Your code goes here
        if (head==null || head.next==null)
        {
            return head;
        }

        Node<Integer> uniqueNode=head.next,node=head;

        while (uniqueNode!=null) {

            if (!(uniqueNode.data).equals(node.data)) {
                node.next=uniqueNode;
                node=node.next;
            }

            uniqueNode=uniqueNode.next;
            //System.out.println();

        }
        node.next=uniqueNode;



        /*
            Node<Integer> node=head;
        	while(node.next!=null){
            	if(node.data==node.next.data){
                	node.next=node.next.next;
            	}
            	else{
            		node=node.next;
            	}
        	}


         */

/*
        return head;
    }

    public static void main(String [] args){
        Node<Integer> head = takeInput();
        Node<Integer> ans = removeDuplicates(head);
        print(ans);
    }
}

 */











//For a given singly linked list of integers, find and return the node present at the middle of the list.
/*

package linkedList;
import java.util.Scanner;

public class Node<T>{
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
    }
}

class LinkedListUse{
    public static Node<Integer> takeInput(){
        Node<Integer> head = null;
        Node<Integer> tail = null;

        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        while (data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode; // tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static Node<Integer> midPoint(Node<Integer> head) {
        //Your code goes here
        if(head == null){
            return head;
        }
        Node<Integer> slow = head;
        Node<Integer> fast = head;

        while( fast.next != null &&  fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    public static void main(String [] args){
        Node<Integer> head = takeInput();
        Node<Integer> ans = midPoint(head);
        System.out.println(ans.data);
    }
}

 */












// Merge two sorted linked list
/*

package linkedList;
import java.util.Scanner;

public class Node<T>{
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
    }
}

class LinkedListUse{
    public static Node<Integer> takeInput(){
        Node<Integer> head = null;
        Node<Integer> tail = null;

        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        while (data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode; // tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head){

        Node<Integer> temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
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


    public static void main(String [] args){
        Node<Integer> head1 = takeInput();
        Node<Integer> head2 = takeInput();
        Node<Integer> ans = mergeTwoSortedLinkedLists(head1,head2);
        print(ans);
    }
}


 */










// Reverse Recursively O(n) time complexity
/*

package linkedList;
import java.util.Scanner;

public class Node<T>{
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
    }
}

class LinkedListUse{
    public static Node<Integer> takeInput(){
        Node<Integer> head = null;
        Node<Integer> tail = null;

        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        while (data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode; // tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head){

        Node<Integer> temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
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


    public static void main(String [] args){
        Node<Integer> head = takeInput();
        Node<Integer> ans = reverseLLR(head);
        print(ans);

    }
}


 */










// Reverse iterative

/*
package linkedList;
import java.util.Scanner;

public class Node<T>{
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
    }
}

class LinkedListUse{
    public static Node<Integer> takeInput(){
        Node<Integer> head = null;
        Node<Integer> tail = null;

        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        while (data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode; // tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head){

        Node<Integer> temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node<Integer> reverse(Node<Integer> head){
        Node<Integer> curr = head;
        Node<Integer> prev = null;
        Node<Integer> temp;

        while (curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static void main(String [] args){
        Node<Integer> head = takeInput();
        Node<Integer> ans = reverse(head);
        print(ans);
    }

}

 */












//
/*
package linkedList;
import java.util.Scanner;

public class Node<T>{
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
    }
}

class LinkedListUse{
    public static Node<Integer> takeInput(){
        Node<Integer> head = null;
        Node<Integer> tail = null;

        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        while (data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode; // tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head){

        Node<Integer> temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node<Integer> mergeTwoSortedLinkedLists(Node<Integer> head1, Node<Integer> head2) {
        //Your code goes here
        if (head1==null)
        {
            return head2;
        }

        if (head2==null)
        {
            return head1;
        }

        Node<Integer> newHead=null,node1=head1,node2=head2,newNode=null;
        int data1=node1.data,data2=node2.data;
        if (data1<data2)
        {
            newHead=node1;
            node1=node1.next;
        }
        else
        {
            newHead=node2;
            node2=node2.next;
        }
        newNode=newHead;
        while(node1!=null && node2!=null)
        {
            data1=node1.data;
            data2=node2.data;
            if (data1<data2)
            {
                newNode.next=node1;
                newNode=newNode.next;
                node1=node1.next;
            }
            else
            {
                newNode.next=node2;
                newNode=newNode.next;
                node2=node2.next;
            }
        }

        while(node1!=null)
        {
            newNode.next=node1;
            newNode=newNode.next;
            node1=node1.next;
        }
        while (node2!=null)
        {
            newNode.next=node2;
            newNode=newNode.next;
            node2=node2.next;
        }
        return newHead;
    }

    public static Node<Integer> midPoint(Node<Integer> head) {
        //Your code goes here
        if (head==null || head.next==null)
        {
            return head;
        }
        Node<Integer> fast=head,slow=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static Node<Integer> mergeSort(Node<Integer> head) {
        //Your code goes here
        //Handling base case where length of linked is 0 or 1
        if (head==null || head.next==null)
        {
            return head;
        }
        Node<Integer> midNode=midPoint(head),part1Head=head,part2Head=null;
        part2Head=midNode.next;
        midNode.next=null;
        Node<Integer> head1=mergeSort(part1Head);
        Node<Integer> head2=mergeSort(part2Head);
        Node<Integer> newHead=mergeTwoSortedLinkedLists(head1,head2);
        return newHead;
    }

    public static void main(String [] args){
        Node<Integer> head = takeInput();
        Node<Integer> mergeSortAnswer = mergeSort(head);
        print(mergeSortAnswer);
    }

}

 */












//Given a singly linked list of integers and position 'i', delete the node present at the 'i-th' position in the linked list recursively.
/*

package linkedList;
import java.util.Scanner;

public class Node<T>{
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }
}

class LinkedListUse{

    public static Node<Integer> takeInput(){
        Node<Integer> head = null;
        Node<Integer> tail = null;

        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        while (data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                //tail = tail.next;
                tail = newNode;

            }

            data = sc.nextInt();
        }
        return head;

    }


    public static void print(Node<Integer> head){
        Node<Integer> temp = head;

        while(temp != null){
            System.out.print(temp.data+ " ");
            temp =  temp.next;
        }
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

    public static void main(String[] args){
        Scanner sc = new Scanner((System.in));
        Node<Integer> head = takeInput();
        int position = sc.nextInt();
        Node<Integer> ans = deleteNodeRec(head , position);
        print(ans);
    }
}

 */











//Reverse LL (Recursive)
/*

package linkedList;
import java.util.Scanner;

public class Node<T>{
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }
}

class LinkedListUse{

    public static Node<Integer> takeInput(){
        Node<Integer> head = null;
        Node<Integer> tail = null;

        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        while (data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                //tail = tail.next;
                tail = newNode;

            }

            data = sc.nextInt();
        }
        return head;

    }


    public static void print(Node<Integer> head){
        Node<Integer> temp = head;

        while(temp != null){
            System.out.print(temp.data+ " ");
            temp =  temp.next;
        }
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

    public static void main(String[] args){
        Node<Integer> head = takeInput();
        Node<Integer> ans = reverseLinkedListRec(head);
        print(ans);
    }
}

 */












//Reverse  LinkedList (Iterative)
/*

package linkedList;
import java.util.Scanner;

public class Node<T>{
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }
}

class LinkedListUse{

    public static Node<Integer> takeInput(){
        Node<Integer> head = null;
        Node<Integer> tail = null;

        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        while (data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                //tail = tail.next;
                tail = newNode;

            }

            data = sc.nextInt();
        }
        return head;

    }


    public static Node<Integer> reverse_I(Node<Integer> head){

        Node<Integer> curr = head;
        Node<Integer> prev = null;
        Node<Integer> temp;

        while (curr != null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }

    public static void print(Node<Integer> head){
        Node<Integer> temp = head;

        while(temp != null){
            System.out.print(temp.data+ " ");
            temp =  temp.next;
        }
    }

    public static void main(String[] args){
        Node<Integer> head = takeInput();
        Node<Integer> ans = reverse_I(head);
        print(ans);
    }
}

 */








//Find a node in LL (recursive)
/*

package linkedList;
import java.util.Scanner;

public class Node<T>{
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }
}

class LinkedListUse{

    public static Node<Integer> takeInput(){
        Node<Integer> head = null;
        Node<Integer> tail = null;

        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        while (data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                //tail = tail.next;
                tail = newNode;

            }

            data = sc.nextInt();
        }
        return head;

    }

/*
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
*/

/*
    static int cnt = 0;
    public static int findNodeRec(Node<Integer> head, int n) {
        //Your code goes here

        if(head == null){
            return -1;
        }

        if(head.data == n){
            return cnt;
        }
        else{
            cnt++;
        }

        int ans = findNodeRec(head.next,n);
        /*
        if(ans == -1){
            return ans;
        }
        else{
            return ans;
        }

         */
/*
        return ans;
    }


    public static void main(String[] args){
        Node<Integer> head = takeInput();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = findNodeRec(head,n);
        System.out.println(ans);
    }
}

*/










//For a given singly linked list of integers, arrange the elements such that all the even numbers are placed after the odd numbers.
/*
package linkedList;
import java.util.Scanner;

public class Node<T>{
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }
}

class LinkedListUse{

    public static Node<Integer> takeInput(){
        Node<Integer> head = null;
        Node<Integer> tail = null;

        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        while (data != -1){
            Node<Integer> newNode = new Node<>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                //tail = tail.next;
                tail = newNode;

            }

            data = sc.nextInt();
        }
        return head;

    }

    public static Node<Integer> evenAfterOdd(Node<Integer> head) {
        //Your code goes here
//         LinkedListNode<Integer> temp = head;

//         while(temp != null){
//             if(temp.data %2 != 0){
//                 temp = temp.next;
//             }else{

//                 temp = temp.next;
//                 temp.next =temp;
//             }

//         }

//         return temp;



        if (head==null || head.next==null) {
            return head;
        }

        Node<Integer> node=head;
        System.out.println("a) " + node);
        Node<Integer> evenNode=null;
        System.out.println("b) "+ evenNode);
        Node<Integer> oddNode=null;
        System.out.println("c) "+oddNode);
        Node<Integer> oddHead=null;
        System.out.println("d) "+oddHead);
        Node<Integer> evenHead=null;
        System.out.println("e) "+evenHead);

        while(node!=null)
        {
            int data=node.data;
            //System.out.println(data);

            if (data%2==0) {
                System.out.println(data+" is divisble by 2");
                if (evenNode==null) {
                    //System.out.println("Adding first node");
                    evenNode=node;
                    evenHead=node;
                }
                else {
                    evenNode.next=node;
                    evenNode=evenNode.next;
                }
                //System.out.println("Even numbers");
                //Runner.print(evenHead);

            }
            else
            {
                System.out.println(data+" is not divisble by 2");
                if (oddNode==null) {
                    //System.out.println("Adding first node");
                    oddNode=node;
                   // System.out.println("****"+oddNode);
                    oddHead=node;
                   // System.out.println("?????"+oddHead);
                }
                else {
                    oddNode.next=node;
                    oddNode=oddNode.next;
                }
                //System.out.println("Odd numbers");
                //Runner.print(oddHead);

            }

            //System.out.println();
            node=node.next;
        }
        //Runner.print(oddHead);
        //Runner.print(evenHead);
        if (oddHead==null)
        {
            return evenHead;
        }
        else
        {
            oddNode.next=evenHead;
        }

        if (evenNode!=null)
        {
            evenNode.next=null;
        }

        return oddHead;
    }

    public static void print(Node<Integer> head){
        Node<Integer> temp = head;

        while(temp != null){
            System.out.print(temp.data+ " ");
            temp =  temp.next;
        }
    }

    public static void main(String[] args){
        Node<Integer> head = takeInput();
        Node<Integer> ans = evenAfterOdd(head);
        print(ans);

    }
}


 */










//Print odd after even
//print even after odd
/*

package linkedList;
import java.util.Scanner;

public class Node<T>{
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
    }
}

class LinkedListUse{
    public static Node<Integer> takeInput(){
        Node<Integer> head = null;
        Node<Integer> tail = null;

        Scanner sc= new Scanner(System.in);
        int data = sc.nextInt();

        while (data != -1){
            Node<Integer> newNode = new Node<>(data);

            if (head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode;
            }
            data = sc.nextInt();
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

    public static Node<Integer> evenAfterOdd(Node<Integer> head){
        if(head == null || head.next == null){
            return head;
        }

        Node<Integer> node = head;
        Node<Integer> evenNode = null;
        Node<Integer> oddNode = null;
        Node<Integer> evenHead = null;
        Node<Integer> oddHead = null;

        while (node != null){
            int element = node.data;
            if(element % 2 == 0){
                if(evenNode == null){
                    evenHead = node;
                    evenNode = node;
                }
                else{
                    evenNode.next = node;
                    evenNode = evenNode.next;
                }
            }
            else{
                if (oddNode == null) {
                    oddNode = node;
                    oddHead = node;
                }
                else{
                    oddNode.next = node;
                    oddNode = oddNode.next;
                }
            }

            node = node.next;
        }

        if (oddHead==null) {
            return evenHead;
        }
        else {
            oddNode.next=evenHead;
        }

        if (evenNode!=null) {
            evenNode.next=null;
        }

        return oddHead;
    }


    public static Node<Integer> oddAfterEven(Node<Integer> head){
        if(head == null || head.next == null){
            return head;
        }

        Node<Integer> node = head;
        Node<Integer> evenNode = null;
        Node<Integer> oddNode = null;
        Node<Integer> evenHead = null;
        Node<Integer> oddHead = null;

        while (node != null){
            int element = node.data;
            if(element % 2 == 0){
                if(evenNode == null){
                    evenHead = node;
                    evenNode = node;
                }
                else{
                    evenNode.next = node;
                    evenNode = evenNode.next;
                }
            }
            else{
                if (oddNode == null) {
                    oddNode = node;
                    oddHead = node;
                }
                else{
                    oddNode.next = node;
                    oddNode = oddNode.next;
                }
            }

            node = node.next;
        }

        if (evenHead==null) {
            return oddHead;
        }
        else {
            evenNode.next=oddHead;
        }

        if (oddNode!=null) {
            oddNode.next=null;
        }

        return evenHead;
    }



    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        //print(head);
        Node<Integer> ans = evenAfterOdd(head);
        print(ans);
        System.out.println();
        Node<Integer> ans2 = oddAfterEven(head);
        print(ans2);
    }
}

 */













//You have been given a singly linked list of integers along with two integers, 'M,' and 'N.' Traverse the linked list such that you retain the 'M' nodes, then delete the next 'N' nodes. Continue the same until the end of the linked list.
/*

package linkedList;
import java.util.Scanner;

public class Node<T>{
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
    }
}

class LinkedListUse{
    public static Node<Integer> takeInput(){
        Node<Integer> head = null;
        Node<Integer> tail = null;

        Scanner sc= new Scanner(System.in);
        int data = sc.nextInt();

        while (data != -1){
            Node<Integer> newNode = new Node<>(data);

            if (head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {
        //Your code goes here
        if (M==0)
        {
            return null;
        }
        if (N==0)
        {
            return head;
        }

        Node<Integer> node=head,delNode=null;
        while(node!=null)
        {
            for (int i=0;i<M-1 && node!=null;i++)
            {
                //System.out.print(node.data+" ");
                node=node.next;
            }
            //System.out.println();
            if (node==null)
            {
                break;
            }

            delNode=node.next;
            for (int i=0;i<N && delNode!=null;i++)
            {
                //System.out.print(delNode.data+" ");
                delNode=delNode.next;
            }
            node.next=delNode;
            node=delNode;
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
        Node<Integer> head = takeInput();
        Scanner sc =new Scanner(System.in);
        int m =sc.nextInt();
        int n= sc.nextInt();
        Node<Integer> answerOfMDeleteN = skipMdeleteN(head,m,n);
        print(answerOfMDeleteN);
        //print(head);

    }
}

 */










//Given a singly linked list of integers, sort it using 'Bubble Sort.'
/*

package linkedList;
import java.util.Scanner;

public class Node<T>{
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
    }
}

class LinkedListUse{
    public static Node<Integer> takeInput(){
        Node<Integer> head = null;
        Node<Integer> tail = null;

        Scanner sc= new Scanner(System.in);
        int data = sc.nextInt();

        while (data != -1){
            Node<Integer> newNode = new Node<>(data);

            if (head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static int findLengthLL(Node<Integer> head)
    {
        int count=0;
        while(head.next!=null)
        {
            head=head.next;
            count=count+1;
        }
        return count;

    }

    public static Node<Integer> bubbleSort(Node<Integer> head) {
        //Your code goes here
        if (head==null || head.next==null)
        {
            return head;
        }
        int n=findLengthLL(head);
        Node<Integer> node1=null,node2=null,temp=null;
        int data1=0,data2=0;
        for (int i=0;i<n;i++)
        {
            node1=head;
            node2=head.next;
            for (int j=0;j<n-i;j++)
            {
                data1=node1.data;
                data2=node2.data;
                if (data1>data2)
                {
                    node1.data=data2;
                    node2.data=data1;
                }
                node1=node1.next;
                System.out.println("node1 = "+node1.data);
                node2=node2.next;
               // System.out.println("node2 = "+node2.data);

            }
            System.out.println("********************************************");
            //Runner.print(head);
        }
        //System.out.println();
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
        Node<Integer> head = takeInput();
        Node<Integer> ans = bubbleSort(head);
        print(ans);

    }
}

 */












//Given a singly linked list of integers, reverse the nodes of the linked list 'k' at a time and return its modified list.

/*
package linkedList;
import java.util.Scanner;

public class Node<T>{
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
    }
}

class LinkedListUse{
    public static Node<Integer> takeInput(){
        Node<Integer> head = null;
        Node<Integer> tail = null;

        Scanner sc= new Scanner(System.in);
        int data = sc.nextInt();

        while (data != -1){
            Node<Integer> newNode = new Node<>(data);

            if (head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                tail.next = newNode;
                tail = newNode;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static Node<Integer> reverseLinkedListRec(Node<Integer> head) {
        //Your code goes here

        if (head==null || head.next==null)
        {
            return head;
        }
        Node<Integer> smallerHead=reverseLinkedListRec(head.next);
        Node<Integer> node=smallerHead;
        while (node.next!=null)
        {
            node=node.next;
        }
        node.next=head;
        head.next=null;
        return smallerHead;
    }

    public static Node<Integer> findTail(Node<Integer> head, int k)
    {
        for (int i=0;i<k && head.next!=null;i++)
        {
            head=head.next;
        }
        return head;

    }

    public static int findLength(Node<Integer> head)
    {
        int count=0;
        while(head.next!=null)
        {
            head=head.next;
            count=count+1;
        }
        return count;
    }

    public static Node<Integer> kReverse(Node<Integer> head, int k) {
        //Your code goes here
        if (head==null || k==0 || k==1)
        {
            return head;
        }
        else if (k>findLength(head))
        {
            return reverseLinkedListRec(head);
        }

        Node<Integer> node=head;
        Node<Integer> nextNode=null;
        Node<Integer> tail=null;
        Node<Integer> prevTail=null;
        Node<Integer> newHead=null;

        while(node!=null)
        {
            tail=findTail(node,k-1);
            nextNode=tail.next;
            tail.next=null;
            newHead=reverseLinkedListRec(node);
            //Runner.print(newHead);
            if (node==head)
            {
                tail=head;
                tail.next=nextNode;
                head=newHead;

            }
            else
            {
                tail=node;
                tail.next=nextNode;
                prevTail.next=newHead;

            }
            node=nextNode;
            prevTail=tail;
            //Runner.print(head);

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
        Node<Integer> head = takeInput();
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Node<Integer> ans = kReverse(head,k);
        print(ans);

    }
}


 */





/*

package linkedList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Node{

    public static LinkedList<Integer> takeInput(){
        LinkedList<Integer> node = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while(data != -1){
            node.add(data);
            data = sc.nextInt();
        }
        return node;
    }

    public static void display(LinkedList<Integer> head){
        Iterator<Integer> it = head.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+ " ");
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> head = takeInput();
        display(head);
    }
}



 */


/*
package linkedList;

import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();

        while(t-- > 0){
            String parents = sc.next()+ sc.next();

            int child = sc.nextInt();
            String ch = "";
            for(int i = 0 ;i <child; i++){
                ch +=sc.next();
            }

//            System.out.println(parents);
//            System.out.println(ch);
            String PStr = new String();
            for(int i = 0 ;i < parents.length();i++){
                char Pc = parents.charAt(i);
                if(PStr.indexOf(Pc)<0){
                    PStr += Pc;
                }
            }
//            System.out.println(PStr);

            String ChStr = new String();
            for(int i = 0 ;i < ch.length();i++){
                char Chc = ch.charAt(i);
                if(ChStr.indexOf(Chc)<0){
                    ChStr += Chc;
                }
            }


//            System.out.println(ChStr);


            char tempParents[] = PStr.toCharArray();
            Arrays.sort(tempParents);
            String tParents = new String(tempParents);
//            System.out.println(tParents);

            char tempCh[] = ChStr.toCharArray();
            Arrays.sort(tempCh);
            String tCh = new String(tempCh);
//            System.out.println(tCh);

                int count = 0;
                for (int i = 0; i < tCh.length(); i++) {
                    for (int j = 0; j < tParents.length(); j++) {
                        if (tCh.charAt(i) == tParents.charAt(j)) {
                            count ++;
                        }
                    }

                }

                if (count == tCh.length()) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
//            }
        }
    }
}

 */







package linkedList;

import java.util.Arrays;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of your number : ");
        int n = sc.nextInt();
        if(n< 20)
        {
            System.out.println("kunal");
        }else{
            System.out.println("om");
        }
    }

}