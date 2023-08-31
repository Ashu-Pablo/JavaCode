/*
package trees;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

//public class Main {
//
//}

class TreeNode<T>{
    T data;
    ArrayList<TreeNode<T>> children;

    public TreeNode(T data){
        this.data = data;
        children = new ArrayList<>();
    }
}

class TreeUse{


    public static TreeNode<Integer> takeInput(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the next node data");
        int n = sc.nextInt();

        TreeNode<Integer> root = new TreeNode<>(n);

        System.out.println("Enter number of children for "+n);
        int childCount = sc.nextInt();
        for(int i=0;i<childCount;i++){
            TreeNode<Integer> child = takeInput();
            root.children.add(child);
        }

        return root;
    }



    public static int numNodes(TreeNode<Integer> root){
        if(root ==null){
            return 0;
        }

        int count =1;
        for(int i=0;i<root.children.size();i++){
            count += numNodes(root.children.get(i));
        }
        return count;
    }

    public static TreeNode<Integer> takeInput(Scanner sc){
        System.out.println("Enter the next node data");
        int n = sc.nextInt();

        TreeNode<Integer> root = new TreeNode<>(n);

        System.out.println("Enter number of children for "+n);
        int childCount = sc.nextInt();
        for(int i=0;i<childCount;i++){
            TreeNode<Integer> child = takeInput(sc);
            root.children.add(child);
        }

        return root;
    }

    public static void print(TreeNode<Integer> root){
        String str = root.data+":";
        for(int i=0;i<root.children.size();i++){
            str = str +root.children.get(i).data+",";
        }
        System.out.println(str);

        for(int i=0;i<root.children.size();i++){
            print(root.children.get(i));
        }
    }

    public static TreeNode<Integer> takeInputLevelWise(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root data");

        int rootData = sc.nextInt();
        QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
        TreeNode<Integer> root = new TreeNode<>(rootData);

        pendingNodes.enqueue(root);

        while(!pendingNodes.isEmpty()){
            TreeNode<Integer> frontNode = pendingNodes.dequeue();
            System.out.println("Enter number of Children of "+ frontNode.data);
            int numChildren = sc.nextInt();

            for(int i=0;i<numChildren;i++){
                System.out.println("Enter "+(i+1)+"th child of "+frontNode.data);
                int child = sc.nextInt();
                TreeNode<Integer> childNode = new TreeNode<Integer>(child);
                frontNode.children.add(childNode);
                pendingNodes.enqueue(childNode);
            }
        }

        return root;
    }

    public static void main(String[] args) {
        // write your code here
//        Scanner sc = new Scanner(System.in);
//        TreeNode<Integer> root = takeInput(sc);
        TreeNode<Integer> root = takeInputLevelWise();
        print(root);
        System.out.println((numNodes(root)));

//        TreeNode<Integer> root = new TreeNode<>(4);
//        TreeNode<Integer> node1 = new TreeNode<>(2);
//        TreeNode<Integer> node2 = new TreeNode<>(3);
//        TreeNode<Integer> node3 = new TreeNode<>(5);
//        TreeNode<Integer> node4 = new TreeNode<>(6);
//
//
//        root.children.add(node1);
//        root.children.add(node2);
//        root.children.add(node3);
//
//        node2.children.add(node4);
//
//        System.out.println(root);
    }
}

*/

//package queues;
/*
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


 */








// Basic program of Tree
/*

package trees;

import java.util.ArrayList;

class TreeNode<T>{
    T data;
    ArrayList<TreeNode<T>> children;

    public TreeNode(T data){
        this.data = data;
        children = new ArrayList<>();
    }
}

class TreeUse{

    public static int numNodes(TreeNode<Integer> root){
        if(root ==null){
            return 0;
        }

        int count =1;
        for(int i=0;i<root.children.size();i++){
            count += numNodes(root.children.get(i));
        }
        return count;
    }

    public static void print(TreeNode<Integer> root){
        String str = root.data+":";
        for(int i=0;i<root.children.size();i++){
            str = str +root.children.get(i).data+",";
        }
        System.out.println(str);

        for(int i=0;i<root.children.size();i++){
            print(root.children.get(i));
        }
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(4);
        TreeNode<Integer> node1 = new TreeNode<>(2);
        TreeNode<Integer> node2 = new TreeNode<>(3);
        TreeNode<Integer> node3 = new TreeNode<>(5);
        TreeNode<Integer> node4 = new TreeNode<>(6);

        root.children.add(node1);
        root.children.add(node2);
        root.children.add(node3);
        node2.children.add(node4);

        System.out.println("representation of tree is:");
        print(root);
        System.out.print("number of nodes is -> ");
        System.out.println(numNodes(root));
    }
}

 */











// 1st method to take input of nodes of Tree
/*

package trees;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

class TreeNode<T>{
    T data;
    ArrayList<TreeNode<T>> children;

    public TreeNode(T data){
        this.data = data;
        children = new ArrayList<>();
    }
}

class TreeUse{


    public static TreeNode<Integer> takeInput(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the next node data");
        int n = sc.nextInt();

        TreeNode<Integer> root = new TreeNode<>(n);

        System.out.println("Enter number of children for "+n);
        int childCount = sc.nextInt();
        for(int i=0;i<childCount;i++){
            TreeNode<Integer> child = takeInput();
            root.children.add(child);
        }

        return root;
    }



    public static int numNodes(TreeNode<Integer> root){
        if(root ==null){
            return 0;
        }

        int count =1;
        for(int i=0;i<root.children.size();i++){
            count += numNodes(root.children.get(i));
        }
        return count;
    }


    public static void print(TreeNode<Integer> root){
        String str = root.data+":";
        for(int i=0;i<root.children.size();i++){
            str = str +root.children.get(i).data+",";
        }
        System.out.println(str);

        for(int i=0;i<root.children.size();i++){
            print(root.children.get(i));
        }
    }

    public static void main(String[] args) {
        // write your code here
//        Scanner sc = new Scanner(System.in);
        TreeNode<Integer> root = takeInput();

        print(root);
        System.out.println((numNodes(root)));

    }
}

 */














// 2nd method to take input of nodes of Tree
/*

package trees;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

class TreeNode<T>{
    T data;
    ArrayList<TreeNode<T>> children;

    public TreeNode(T data){
        this.data = data;
        children = new ArrayList<>();
    }
}

class TreeUse{

    public static TreeNode<Integer> takeInput(Scanner sc){
        System.out.println("Enter the next node data");
        int n = sc.nextInt();

        TreeNode<Integer> root = new TreeNode<>(n);

        System.out.println("Enter number of children for "+n);
        int childCount = sc.nextInt();
        for(int i=0;i<childCount;i++){
            TreeNode<Integer> child = takeInput(sc);
            root.children.add(child);
        }

        return root;
    }

    public static int numNodes(TreeNode<Integer> root){
        if(root ==null){
            return 0;
        }

        int count =1;
        for(int i=0;i<root.children.size();i++){
            count += numNodes(root.children.get(i));
        }
        return count;
    }


    public static void print(TreeNode<Integer> root){
        String str = root.data+":";
        for(int i=0;i<root.children.size();i++){
            str = str +root.children.get(i).data+",";
        }
        System.out.println(str);

        for(int i=0;i<root.children.size();i++){
            print(root.children.get(i));
        }
    }

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        TreeNode<Integer> root = takeInput(sc);

        print(root);
        System.out.println((numNodes(root)));

    }
}

 */











// Take input Level wise




/*
package trees;

import java.util.ArrayList;
import java.util.Scanner;


class TreeNode<T>{
    T data;
    ArrayList<TreeNode<T>> children;

    public TreeNode(T data){
        this.data = data;
        children = new ArrayList<>();
    }
}


class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
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

        while(!queue.isEmpty()){
            queue.dequeue();
        }
    }
}



class TreeUse{

    public static int numNodes(TreeNode<Integer> root){
        if(root ==null){
            return 0;
        }

        int count =1;
        for(int i=0;i<root.children.size();i++){
            count += numNodes(root.children.get(i));
        }
        return count;
    }

    public static TreeNode<Integer> takeInput(Scanner sc){
        System.out.println("Enter the next node data");
        int n = sc.nextInt();

        TreeNode<Integer> root = new TreeNode<>(n);

        System.out.println("Enter number of children for "+n);
        int childCount = sc.nextInt();
        for(int i=0;i<childCount;i++){
            TreeNode<Integer> child = takeInput(sc);
            root.children.add(child);
        }

        return root;
    }

//    public static int largest(TreeNode<Integer> root){
//        if(root == null){
//            return Integer.MIN_VALUE;
//        }
//
//        int ans = root.data;
//        for(int i=0;i<root.children.size();i++){
//            int childLargest = largest(root.children.get(i));
//            if(childLargest > ans ){
//                ans = childLargest;
//            }
//        }
//        return ans;
//    }

    public static void print(TreeNode<Integer> root){
        String str = root.data+":";
        for(int i=0;i<root.children.size();i++){
            str = str +root.children.get(i).data+",";
        }
        System.out.println(str);

        for(int i=0;i<root.children.size();i++){
            print(root.children.get(i));
        }
    }

    public static TreeNode<Integer> takeInputLevelWise(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root data");

        int rootData = sc.nextInt();
        QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
        TreeNode<Integer> root = new TreeNode<>(rootData);

        pendingNodes.enqueue(root);

        while(!pendingNodes.isEmpty()){
            TreeNode<Integer> frontNode = pendingNodes.dequeue();
            System.out.println("Enter number of Children of "+ frontNode.data);
            int numChildren = sc.nextInt();

            for(int i=0;i<numChildren;i++){
                System.out.println("Enter "+(i+1)+"th child of "+frontNode.data);
                int child = sc.nextInt();
                TreeNode<Integer> childNode = new TreeNode<Integer>(child);
                frontNode.children.add(childNode);
                pendingNodes.enqueue(childNode);
            }
        }

        return root;
    }

    public static void main(String[] args) {

        TreeNode<Integer> root = takeInputLevelWise();
        print(root);
        System.out.println((numNodes(root)));
        //System.out.println(largest(root));
    }
}


 */









/*
solve the question
        1. Take input level wise
        2. Print the tree structure
        3. Find number of nodes in tree structure
        4. Find largest Node of Tree
        5. Print nodes At K Position (printAtK)
        6. Print Pre Order
        7. Print Post Order
        8. Sum of all Nodes
        9. count number of Leaf Nodes
        10.count number of Nodes greater than a particular Node data
        11.Find Height of Tree

 */

/*
package trees;

import java.util.ArrayList;
import java.util.Scanner;


class TreeNode<T>{
    T data;
    ArrayList<TreeNode<T>> children;

    public TreeNode(T data){
        this.data = data;
        children = new ArrayList<>();
    }
}


class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
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

        while(!queue.isEmpty()){
            queue.dequeue();
        }
    }
}


class TreeUse{

    public static int numNodes(TreeNode<Integer> root){
        if(root ==null){
            return 0;
        }

        int count =1;
        for(int i=0;i<root.children.size();i++){
            count += numNodes(root.children.get(i));
        }
        return count;
    }

    public static int largest(TreeNode<Integer> root){
        if(root == null){
            return Integer.MIN_VALUE;
        }

        int ans = root.data;
        for(int i=0;i<root.children.size();i++){
            int childLargest = largest(root.children.get(i));
            if(childLargest > ans ){
                ans = childLargest;
            }
        }
        return ans;
    }

    public static void printAtK(TreeNode<Integer> root, int k){
        if(k<0){
            return;
        }
        if(k==0){
            System.out.println(root.data);
            return;
        }

        for(int i=0;i<root.children.size();i++){
            printAtK(root.children.get(i) , k-1);
        }
    }

    public static void printPreOrder(TreeNode<Integer> root){
        if(root == null){
            return;
        }

        System.out.print(root.data+" ");

        for(int i=0;i<root.children.size();i++){
            printPreOrder(root.children.get(i));
        }
    }

    public static void print(TreeNode<Integer> root){
        String str = root.data+":";
        for(int i=0;i<root.children.size();i++){
            str = str +root.children.get(i).data+",";
        }
        System.out.println(str);

        for(int i=0;i<root.children.size();i++){
            print(root.children.get(i));
        }
    }

    public static TreeNode<Integer> takeInputLevelWise(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root data");

        int rootData = sc.nextInt();
        QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
        TreeNode<Integer> root = new TreeNode<>(rootData);

        pendingNodes.enqueue(root);

        while(!pendingNodes.isEmpty()){
            TreeNode<Integer> frontNode = pendingNodes.dequeue();
            System.out.println("Enter number of Children of "+ frontNode.data);
            int numChildren = sc.nextInt();

            for(int i=0;i<numChildren;i++){
                System.out.println("Enter "+(i+1)+"th child of "+frontNode.data);
                int child = sc.nextInt();
                TreeNode<Integer> childNode = new TreeNode<Integer>(child);
                frontNode.children.add(childNode);
                pendingNodes.enqueue(childNode);
            }
        }

        return root;
    }

    public static int sumOfAllNode(TreeNode<Integer> root){

        if(root == null){
            return 0;
        }

        int sum = 0;

        for(int i=0; i<root.children.size(); i++){
            sum += sumOfAllNode(root.children.get(i));
        }

        return root.data + sum;

    }

    public static int numNodeGreater(TreeNode<Integer> root,int x){
        if(root == null){
            return 0;
        }

        int count = 0;

        if(root.data > x){
            count++;
        }

        for(TreeNode<Integer> node : root.children){
            count += numNodeGreater(node, x);
        }

        return count;


    }

    public static int getHeight(TreeNode<Integer> root){
        if (root == null)
            return 0;

        int max = 1;
        for (TreeNode<Integer> child : root.children) {
            int childHeight = 1 + getHeight(child);
            if (max < childHeight)
                max = childHeight;
        }
        return max;
    }

    public static int countLeafNodes(TreeNode<Integer> root){

        // Write your code here
        if(root == null){
            return 0;
        }

        int count = 0;

        if(root.children.size() == 0){
            count++;
        }

        for(TreeNode<Integer> child : root.children){
            count += countLeafNodes(child);
        }

        return count;

    }

    public static void printPostOrder(TreeNode<Integer> root){

        if(root == null){
            return;
        }

        for(TreeNode<Integer> child : root.children){
            printPostOrder(child);
        }

        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {

        TreeNode<Integer> root = takeInputLevelWise();
        print(root);
        System.out.println((numNodes(root)));
        System.out.println(largest(root));
        printAtK(root,1);
        printPreOrder(root);
        System.out.println();
        printPostOrder(root);
        System.out.println();
        System.out.println(sumOfAllNode(root));
        System.out.println(countLeafNodes(root));
        System.out.println(numNodeGreater(root,30));
        System.out.println(getHeight(root));

        //System.out.println(largest(root));
    }
}

 */













/*
solve the question
        1. Take input level wise
        2. Print the tree structure
        3. print input level wise
        4. Find number of nodes in tree structure
        5. Find largest Node of Tree
        6. Print nodes At K Position (printAtK)
        7. Print Pre Order
        8. Print Post Order
        9. Sum of all Nodes
        10. count number of Leaf Nodes
        11.count number of Nodes greater than a particular Node data
        12.Find Height of Tree
        13.check if x contains
        14.check if two trees are identical or not
        15.replace with depth value
        16.find next larger node from a particular data
 */
//
//package trees;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//
//
//class TreeNode<T>{
//    T data;
//    ArrayList<TreeNode<T>> children;
//
//    public TreeNode(T data){
//        this.data = data;
//        children = new ArrayList<>();
//    }
//}
//
//class TreeUse{
//
//    public static int numNodes(TreeNode<Integer> root){
//        if(root ==null){
//            return 0;
//        }
//
//        int count =1;
//        for(int i=0;i<root.children.size();i++){
//            count += numNodes(root.children.get(i));
//        }
//        return count;
//    }
//
//    public static int largest(TreeNode<Integer> root){
//        if(root == null){
//            return Integer.MIN_VALUE;
//        }
//
//        int ans = root.data;
//        for(int i=0;i<root.children.size();i++){
//            int childLargest = largest(root.children.get(i));
//            if(childLargest > ans ){
//                ans = childLargest;
//            }
//        }
//        return ans;
//    }
//
//    public static void printAtK(TreeNode<Integer> root, int k){
//        if(k<0){
//            return;
//        }
//        if(k==0){
//            System.out.println(root.data);
//            return;
//        }
//
//        for(int i=0;i<root.children.size();i++){
//            printAtK(root.children.get(i) , k-1);
//        }
//    }
//
//    public static void printPreOrder(TreeNode<Integer> root){
//        if(root == null){
//            return;
//        }
//
//        System.out.print(root.data+" ");
//
//        for(int i=0;i<root.children.size();i++){
//            printPreOrder(root.children.get(i));
//        }
//    }
//
//    public static void print(TreeNode<Integer> root){
//        String str = root.data+":";
//        for(int i=0;i<root.children.size();i++){
//            str = str +root.children.get(i).data+",";
//        }
//        System.out.println(str);
//
//        for(int i=0;i<root.children.size();i++){
//            print(root.children.get(i));
//        }
//    }
//
//    public static void printLevelWise(TreeNode<Integer> root){
//        Queue<TreeNode<Integer>> q = new LinkedList<>();
//        if(root == null) {
//            return;
//        }
//        q.add(root);
//        q.add(null);
//
//        while(!q.isEmpty()){
//            TreeNode<Integer> node = q.poll();
//
//            if(node != null) {
//                System.out.print(node.data + " ");
//
//                for(int i=0; i<node.children.size(); i++) {
//                    q.add(node.children.get(i));
//                }
//
//            }
//
//            else{
//                System.out.println();
//                if(!q.isEmpty()) {
//                    q.add(null);
//                }
//            }
//
//        }
//    }
//
//    public static TreeNode<Integer> takeInputLevelWise(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter root data");
//
//        int rootData = sc.nextInt();
//        Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
//        TreeNode<Integer> root = new TreeNode<>(rootData);
//
//        pendingNodes.add(root);
//
//        while(!pendingNodes.isEmpty()){
//            TreeNode<Integer> frontNode = pendingNodes.poll();
//            System.out.println("Enter number of Children of "+ frontNode.data);
//            int numChildren = sc.nextInt();
//
//            for(int i=0;i<numChildren;i++){
//                System.out.println("Enter "+(i+1)+"th child of "+frontNode.data);
//                int child = sc.nextInt();
//                TreeNode<Integer> childNode = new TreeNode<Integer>(child);
//                frontNode.children.add(childNode);
//                pendingNodes.add(childNode);
//            }
//        }
//
//        return root;
//    }
//
//
//    public static TreeNode<Integer> takeInput(Scanner sc){
//        System.out.println("Enter the next node data");
//        int n = sc.nextInt();
//
//        TreeNode<Integer> root = new TreeNode<>(n);
//
//        System.out.println("Enter number of children for "+n);
//        int childCount = sc.nextInt();
//        for(int i=0;i<childCount;i++){
//            TreeNode<Integer> child = takeInput(sc);
//            root.children.add(child);
//        }
//
//        return root;
//    }
//
//    public static int sumOfAllNode(TreeNode<Integer> root){
//
//        if(root == null){
//            return 0;
//        }
//
//        int sum = 0;
//
//        for(int i=0; i<root.children.size(); i++){
//            sum += sumOfAllNode(root.children.get(i));
//        }
//
//        return root.data + sum;
//
//    }
//
//    public static int numNodeGreater(TreeNode<Integer> root,int x){
//        if(root == null){
//            return 0;
//        }
//
//        int count = 0;
//
//        if(root.data > x){
//            count++;
//        }
//
//        for(TreeNode<Integer> node : root.children){
//            count += numNodeGreater(node, x);
//        }
//
//        return count;
//
//
//    }
//
//    public static int getHeight(TreeNode<Integer> root){
//        if (root == null)
//            return 0;
//
//        int max = 1;
//        for (TreeNode<Integer> child : root.children) {
//            int childHeight = 1 + getHeight(child);
//            if (max < childHeight)
//                max = childHeight;
//        }
//        return max;
//    }
//
//    public static int countLeafNodes(TreeNode<Integer> root){
//
//        // Write your code here
//        if(root == null){
//            return 0;
//        }
//
//        int count = 0;
//
//        if(root.children.size() == 0){
//            count++;
//        }
//
//        for(TreeNode<Integer> child : root.children){
//            count += countLeafNodes(child);
//        }
//
//        return count;
//
//    }
//
//    public static void printPostOrder(TreeNode<Integer> root){
//
//        if(root == null){
//            return;
//        }
//
//        for(TreeNode<Integer> child : root.children){
//            printPostOrder(child);
//        }
//
//        System.out.print(root.data+" ");
//    }
//
//    public static boolean checkIfContainsX(TreeNode<Integer> root, int x){
//        // Write your code here
//
//        if(root == null){
//            return false;
//        }
//
//        if(root.data == x){
//            return true;
//        }
//
//        for(TreeNode<Integer> child : root.children){
//            if(checkIfContainsX(child,x)){
//                return true;
//            }
//        }
//
//        return false;
//    }
//
//    public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){
//
//        // Write your code here
//        if(root1 == null && root2 == null){
//            return true;
//        }
//
//        if(root1 == null || root2 == null){
//            return false;
//        }
//        if(!root1.data.equals(root2.data)){
//            return false;
//        }
//        if(root1.children.size() != root2.children.size()){
//            return false;
//        }
//
//        for(int i = 0; i < root1.children.size(); i++) {
//            if(!checkIdentical(root1.children.get(i), root2.children.get(i))) {
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static void replaceWithDepthValue(TreeNode<Integer> root){
//        // Write your code here
//        if(root==null) {
//            return;
//        }
//        replaceWithDepthValue(root,0);
//
//    }
//
//    public static void replaceWithDepthValue(TreeNode<Integer>root,int depth) {
//        root.data=depth;
//        for(TreeNode<Integer>child : root.children){
//            replaceWithDepthValue(child,depth+1);
//        }
//
//    }
//
////    public static TreeNode<Integer> replaceWithDepthValue(TreeNode<Integer>root,int depth) {
////
////        root.data=depth;
////        for(TreeNode<Integer>child : root.children){
//            replaceWithDepthValue(child,depth+1);
//        }
//
//        return root;
//    }


//    public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
//
//        // Write your code here
//        if(root == null) {
//            return null;
//        }
//
//        TreeNode<Integer> nextLargerNode = null;
//
//        if(root.data > n) {
//            nextLargerNode = root;
//        }
//
//        for(int i = 0; i < root.children.size(); i++) {
//            TreeNode<Integer> nextLargerInChild = findNextLargerNode(root.children.get(i), n);
//            if(nextLargerInChild != null) {
//                if(nextLargerNode == null || nextLargerInChild.data < nextLargerNode.data) {
//                    nextLargerNode = nextLargerInChild;
//                }
//            }
//        }
//        return nextLargerNode;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        TreeNode<Integer> root = takeInputLevelWise();
//
////        TreeNode<Integer> root = takeInput(sc);
//        print(root);
//        printLevelWise(root);
//        System.out.println((numNodes(root)));
//        System.out.println(largest(root));
//        printAtK(root,1);
//        printPreOrder(root);
//        System.out.println();
//        printPostOrder(root);
//        System.out.println();
//        System.out.println(sumOfAllNode(root));
//        System.out.println(countLeafNodes(root));
//        System.out.println(numNodeGreater(root,30));
//        System.out.println(getHeight(root));
//        System.out.println(checkIfContainsX(root,30));
//        System.out.println(checkIdentical(root,root));
//
////        System.out.println(findNextLargerNode(root,20));
//        System.out.println(findNextLargerNode(root,20).data);
//        replaceWithDepthValue(root);
//        printLevelWise(root);
//        //System.out.println(largest(root));
//    }
//}




//package oops;














/*


package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class TreeNode<T>{
    T data;
    ArrayList<TreeNode<T>> children;

    public TreeNode(T data){
        this.data = data;
        children = new ArrayList<>();
    }
}


class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
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

//class Pair {
//    TreeNode<Integer> node;
//    int xSum;
//}

class QueueUses{
    public static void main(String[] args) {

        QueueUsingLL<Integer> queue = new QueueUsingLL<>();

        while(!queue.isEmpty()){
            queue.dequeue();
        }
    }
}


class TreeUse{

    public static void print(TreeNode<Integer> root){
        String str = root.data+":";
        for(int i=0;i<root.children.size();i++){
            str = str +root.children.get(i).data+",";
        }
        System.out.println(str);

        for(int i=0;i<root.children.size();i++){
            print(root.children.get(i));
        }
    }

//    static int mSum = Integer.MIN_VALUE;
//    static int mSumNode = Integer.MIN_VALUE;
//    public static int nodeWithMaximumSubtreeSum(TreeNode<Integer> node) {
//        int sum = node.data;
//
//        for (TreeNode<Integer> child : node.children) {
//            int cstSum = nodeWithMaximumSubtreeSum(child);
//            sum += cstSum;
//        }
//
//        if (sum > mSum) {
//            mSum = sum;
//            mSumNode = node.data;
//        }
//
//        return sum;
//    }


    public static TreeNode<Integer> takeInputLevelWise(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root data");

        int rootData = sc.nextInt();
        QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
        TreeNode<Integer> root = new TreeNode<>(rootData);

        pendingNodes.enqueue(root);

        while(!pendingNodes.isEmpty()){
            TreeNode<Integer> frontNode = pendingNodes.dequeue();
            System.out.println("Enter number of Children of "+ frontNode.data);
            int numChildren = sc.nextInt();

            for(int i=0;i<numChildren;i++){
                System.out.println("Enter "+(i+1)+"th child of "+frontNode.data);
                int child = sc.nextInt();
                TreeNode<Integer> childNode = new TreeNode<Integer>(child);
                frontNode.children.add(childNode);
                pendingNodes.enqueue(childNode);
            }
        }

        return root;
    }

    public static void printLevelWise(TreeNode<Integer> root){

        Queue<TreeNode<Integer>> q = new LinkedList<>();
        if(root == null)
            return;
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            TreeNode<Integer> node = q.poll();
            if(node != null)
            {
                System.out.print(node.data + " ");
                for(int i=0; i<node.children.size(); i++)
                    q.add(node.children.get(i));
            }
            else{
                System.out.println();
                if(!q.isEmpty())
                    q.add(null);
            }
        }
    }

    static class Pair {
        TreeNode<Integer> node;
        int xSum;
    }
    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
        // Write your code here

        if(root == null){
            return null;
        }
        Pair ans = helper(root);
        return ans.node;
    }

    public static Pair helper(TreeNode<Integer> root) {
        Pair ans = new Pair();
        ans.node = root;
        int sum = root.data;
        for(int i = 0; i < root.children.size(); i++) {
            sum += root.children.get(i).data;
        }
        ans.xSum = sum;

        for(int i = 0; i < root.children.size(); i++) {
            Pair smallAns = helper(root.children.get(i));
            if(smallAns.xSum > ans.xSum) {
                ans.xSum = smallAns.xSum;
                ans.node = smallAns.node;
            }
        }
        return ans;
    }

    public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){

        // Write your code here
        if(root == null) {
            return null;
        }

        TreeNode<Integer> nextLargerNode = null;

        if(root.data > n) {
            nextLargerNode = root;
        }

        for(int i = 0; i < root.children.size(); i++) {
            TreeNode<Integer> nextLargerInChild = findNextLargerNode(root.children.get(i), n);
            if(nextLargerInChild != null) {
                if(nextLargerNode == null || nextLargerInChild.data < nextLargerNode.data) {
                    nextLargerNode = nextLargerInChild;
                }
            }
        }
        return nextLargerNode;
    }

    static class Pairs<T>{
        T first;
        T second;
        Pairs(T first,T second){
            this.first = first;
            this.second = second;
        }
    }

    public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){


        // Write your code here

        return findSecondLargestT(root).second;
    }

    public static Pairs<TreeNode<Integer>> findSecondLargestT(TreeNode<Integer> root){
        Pairs<TreeNode<Integer>> output;
        if(root == null){
            output = new Pairs<TreeNode<Integer>>(null,null);
            return output;
        }
        output = new Pairs<TreeNode<Integer>>(root,null);
        for(TreeNode<Integer> child : root.children){
            Pairs<TreeNode<Integer>> childPair = findSecondLargestT(child);
            if(childPair.first.data > output.first.data){
                if(childPair.second==null||childPair.second.data < output.first.data){
                    output.second = output.first;
                    output.first = childPair.first;
                } else {
                    output.first = childPair.first;
                    output.second = childPair.second;
                }
            } else if(childPair.first.data.equals(output.first.data) && childPair.second != null){
                output.second = childPair.second;
            } else if(output.first.data != childPair.first.data && (output.second == null || childPair.first.data>output.second.data)){
                output.second = childPair.first;
            }
        }
        return output;
    }

    public static void main(String[] args) {

        TreeNode<Integer> root = takeInputLevelWise();
        print(root);
        printLevelWise(root);

        TreeNode<Integer> ans1 = maxSumNode(root);
        System.out.println(ans1.data);
        TreeNode<Integer> ans2 = findSecondLargest(root);
        System.out.println(ans2.data);
        TreeNode<Integer> ans3 = findNextLargerNode(root,21);
        System.out.println(ans3.data);

//        System.out.println(nodeWithMaximumSubtreeSum(root));
//        System.out.println(mSumNode+"@"+mSum);

    }
}



 */












/*


package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class TreeNode<T>{
    T data;
    ArrayList<TreeNode<T>> children;

    public TreeNode(T data){
        this.data = data;
        children = new ArrayList<>();
    }
}

class TreeUse{

//    public static void print(TreeNode<Integer> root){
//        String str = root.data+":";
//        for(int i=0;i<root.children.size();i++){
//            str = str +root.children.get(i).data+",";
//        }
//        System.out.println(str);
//
//        for(int i=0;i<root.children.size();i++){
//            print(root.children.get(i));
//        }
//    }

//    static int mSum = Integer.MIN_VALUE;
//    static int mSumNode = Integer.MIN_VALUE;
//    public static int nodeWithMaximumSubtreeSum(TreeNode<Integer> node) {
//        int sum = node.data;
//
//        for (TreeNode<Integer> child : node.children) {
//            int cstSum = nodeWithMaximumSubtreeSum(child);
//            sum += cstSum;
//        }
//
//        if (sum > mSum) {
//            mSum = sum;
//            mSumNode = node.data;
//        }
//
//        return sum;
//    }


    public static TreeNode<Integer> takeInputLevelWise(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root data");

        int rootData = sc.nextInt();
        Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
        TreeNode<Integer> root = new TreeNode<>(rootData);

        pendingNodes.add(root);

        while(!pendingNodes.isEmpty()){
            TreeNode<Integer> frontNode = pendingNodes.poll();
            System.out.println("Enter number of Children of "+ frontNode.data);
            int numChildren = sc.nextInt();

            for(int i=0;i<numChildren;i++){
                System.out.println("Enter "+(i+1)+"th child of "+frontNode.data);
                int child = sc.nextInt();
                TreeNode<Integer> childNode = new TreeNode<Integer>(child);
                frontNode.children.add(childNode);
                pendingNodes.add(childNode);
            }
        }

        return root;
    }

    public static void printLevelWise(TreeNode<Integer> root){

        Queue<TreeNode<Integer>> q = new LinkedList<>();
        if(root == null)
            return;
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            TreeNode<Integer> node = q.poll();
            if(node != null)
            {
                System.out.print(node.data + " ");
                for(int i=0; i<node.children.size(); i++)
                    q.add(node.children.get(i));
            }
            else{
                System.out.println();
                if(!q.isEmpty())
                    q.add(null);
            }
        }
    }

    static class Pair {
        TreeNode<Integer> node;
        int xSum;
    }
    public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
        // Write your code here

        if(root == null){
            return null;
        }
        Pair ans = helper(root);
        return ans.node;
    }

    public static Pair helper(TreeNode<Integer> root) {
        Pair ans = new Pair();
        ans.node = root;
        int sum = root.data;
        for(int i = 0; i < root.children.size(); i++) {
            sum += root.children.get(i).data;
        }
        ans.xSum = sum;

        for(int i = 0; i < root.children.size(); i++) {
            Pair smallAns = helper(root.children.get(i));
            if(smallAns.xSum > ans.xSum) {
                ans.xSum = smallAns.xSum;
                ans.node = smallAns.node;
            }
        }
        return ans;
    }

    public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){

        // Write your code here
        if(root == null) {
            return null;
        }

        TreeNode<Integer> nextLargerNode = null;

        if(root.data > n) {
            nextLargerNode = root;
        }

        for(int i = 0; i < root.children.size(); i++) {
            TreeNode<Integer> nextLargerInChild = findNextLargerNode(root.children.get(i), n);
            if(nextLargerInChild != null) {
                if(nextLargerNode == null || nextLargerInChild.data < nextLargerNode.data) {
                    nextLargerNode = nextLargerInChild;
                }
            }
        }
        return nextLargerNode;
    }

    static class Pairs<T>{
        T first;
        T second;
        Pairs(T first,T second){
            this.first = first;
            this.second = second;
        }
    }

    public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){
        // Write your code here
        return findSecondLargestT(root).second;
    }

    public static Pairs<TreeNode<Integer>> findSecondLargestT(TreeNode<Integer> root){
        Pairs<TreeNode<Integer>> output;
        if(root == null){
            output = new Pairs<TreeNode<Integer>>(null,null);
            return output;
        }
        output = new Pairs<TreeNode<Integer>>(root,null);
        for(TreeNode<Integer> child : root.children){
            Pairs<TreeNode<Integer>> childPair = findSecondLargestT(child);
            if(childPair.first.data > output.first.data){
                if(childPair.second==null||childPair.second.data < output.first.data){
                    output.second = output.first;
                    output.first = childPair.first;
                } else {
                    output.first = childPair.first;
                    output.second = childPair.second;
                }
            } else if(childPair.first.data.equals(output.first.data) && childPair.second != null){
                output.second = childPair.second;
            } else if(output.first.data != childPair.first.data && (output.second == null || childPair.first.data>output.second.data)){
                output.second = childPair.first;
            }
        }
        return output;
    }

    public static void main(String[] args) {

        TreeNode<Integer> root = takeInputLevelWise();
//        print(root);
        printLevelWise(root);

        TreeNode<Integer> ans1 = maxSumNode(root);
        System.out.println(ans1.data);
        TreeNode<Integer> ans2 = findSecondLargest(root);
        System.out.println(ans2.data);
        TreeNode<Integer> ans3 = findNextLargerNode(root,21);
        System.out.println(ans3.data);

//        System.out.println(nodeWithMaximumSubtreeSum(root));
//        System.out.println(mSumNode+"@"+mSum);

    }
}

*/








package oops;




















