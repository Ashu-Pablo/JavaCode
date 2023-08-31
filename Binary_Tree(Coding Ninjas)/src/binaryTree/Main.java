package binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

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


class BinaryTreeNode<T>{
    T data;
    public BinaryTreeNode<T> left;
    public BinaryTreeNode<T> right;

    public BinaryTreeNode(T data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTreeUse{

    public static BinaryTreeNode<Integer> takeInput(Scanner sc){
        System.out.println("Enter root data");
        int rootData = sc.nextInt();

        if(rootData == -1){
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        root.left = takeInput(sc);
        root.right = takeInput(sc);
        return root;
    }

    public static BinaryTreeNode<Integer> takeInputLevelWise(){
        Scanner sc = new Scanner(System.in);
        QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
        System.out.println("Enter root data");
        int rootData = sc.nextInt();

        if(rootData == -1){
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        pendingNodes.enqueue(root);

        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> front = pendingNodes.dequeue();
            System.out.println("Enter left child of "+ front.data);
            int leftChild = sc.nextInt();
            if (leftChild != -1){
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(leftChild);
                pendingNodes.enqueue(child);
                front.left = child;
            }

            System.out.println("Enter right child of "+ front.data);
            int rightChild = sc.nextInt();
            if (rightChild != -1){
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightChild);
                pendingNodes.enqueue(child);
                front.right = child;
            }
        }

        return root;

    }

    public static int numNodes(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        int ans = 1;
        ans += numNodes(root.left);
        ans += numNodes(root.right);
        return ans;
    }

    public static int getSum(BinaryTreeNode<Integer> root) {
        //Your code goes here.
        if(root == null){
            return 0;
        }

        int ans = root.data;
        ans += getSum(root.left);
        ans += getSum(root.right);
        return ans;
    }

    public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {

        //Your code goes here.
        /*
        if(root == null){
            return false;
        }

        BinaryTreeNode<Integer> ans = new BinaryTreeNode<Integer>(root.data);

        if(ans.data == x){
            return true;
        }

        isNodePresent(root.left,x);
        isNodePresent(root.right,x);

        return false;

         */

        if (root==null){
            return false;
        }

        if (root.data==x){
            return true;
        }
        else{
            return (isNodePresent(root.left,x)||isNodePresent(root.right,x));
        }
    }

    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if (root == null)
            return;
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
//        Queue<BinaryTreeNode<Integer>> pendingNodes = new ArrayList<>(root);
        pendingNodes.add(root);

        while (!pendingNodes.isEmpty()) {
            BinaryTreeNode<Integer> front = pendingNodes.poll();
            if (front != null) {
                System.out.print(front.data + ":");
                if (front.left == null)
                    System.out.print("L:-1");
                else
                    System.out.print("L:" + front.left.data);
                if (front.right == null)
                    System.out.print(",R:-1");
                else
                    System.out.print(",R:" + front.right.data);
                System.out.println();
                pendingNodes.add(front.left);
                pendingNodes.add(front.right);
            }
        }
    }

    public static void printTree(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }

        String toBePrinted = root.data +"->";

        if(root.left != null){
            toBePrinted +="L:" + root.left.data+",";
        }

        if(root.right!= null){
            toBePrinted += "R:" + root.right.data;
        }
        System.out.println(toBePrinted);

        printTree(root.left);
        printTree(root.right);
    }

    public static int largest(BinaryTreeNode<Integer> root){
        if(root == null){
            return -1;
        }
        int largestLeft = largest(root.left);
        int largestRight = largest(root.right);

        int ans = Math.max(root.data,Math.max(largestLeft,largestRight));
        return ans;
    }

    public static int numLeaves(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }

        return numLeaves(root.left)+numLeaves(root.right);
    }

    public static void printAtDepthK(BinaryTreeNode<Integer> root,int k){
        if(root == null){
            return;
        }
        if(k==0){
            System.out.println(root.data);
            return;
        }

        printAtDepthK(root.left,k-1);
        printAtDepthK(root.right,k-1);
    }


    public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
        //Your code goes here
        changeToDepthTree(root,0);
    }
    public static void changeToDepthTree(BinaryTreeNode<Integer> root, int depth){
        if (root==null){
            return;
        }

        root.data=depth;
        changeToDepthTree(root.left,depth+1);
        changeToDepthTree(root.right,depth+1);
    }

    public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if (root==null){
            return;
        }

        if (root.left==null && root.right==null){
            return;
        }

        if (root.left==null){
            System.out.print(root.right.data+" ");
            printNodesWithoutSibling(root.right);
        }
        else if (root.right==null){
            System.out.print(root.left.data+" ");
            printNodesWithoutSibling(root.left);

        }
        else{
            printNodesWithoutSibling(root.left);
            printNodesWithoutSibling(root.right);
        }

    }

    public static void inOrder(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }

    public static void main(String[] args) {
        // write your code here

        System.out.println("******TAKE INPUT LEVEL WISE******");
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        System.out.println("Print Tree Structure");
        printTree(root);
        System.out.println("Print Tree Structure LevelWise");
        printLevelWise(root);
        System.out.print("The number of nodes in binary Tree is:");
        System.out.println(numNodes(root));
        System.out.print("Total sum of all the nodes of Binary Tree is:");
        System.out.println(getSum(root));
        System.out.print("The largest element of the binary Tree is:");
        System.out.println(largest(root));
        System.out.print("Check the node is present in Binary Tree or not");
        System.out.println(isNodePresent(root,30));
        System.out.print("The number of leaves in binary tree is:");
        System.out.println(numLeaves(root));
        System.out.println("print the element at depth k");
        printAtDepthK(root,2);
        System.out.print("Print the Node without sibling");
        printNodesWithoutSibling(root);

        System.out.println("change nodes into its level");
        changeToDepthTree(root);
        inOrder(root);
    }
}