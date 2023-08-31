/*
package BST;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

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

class BinaryTreeUse {

    public static BinaryTreeNode<Integer> takeInputLevelWise() {
        Scanner sc = new Scanner(System.in);
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        System.out.println("Enter root data");
        int rootData = sc.nextInt();

        if (rootData == -1) {
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        pendingNodes.add(root);

        while (!pendingNodes.isEmpty()) {
            BinaryTreeNode<Integer> front = pendingNodes.poll();
            System.out.println("Enter left child of " + front.data);
            int leftChild = sc.nextInt();
            if (leftChild != -1) {
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(leftChild);
                pendingNodes.add(child);
                front.left = child;
            }

            System.out.println("Enter right child of " + front.data);
            int rightChild = sc.nextInt();
            if (rightChild != -1) {
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightChild);
                pendingNodes.add(child);
                front.right = child;
            }
        }

        return root;

    }

    public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
		if ( root == null){
            return false;
        }
        if(root.data == k){
            return true;
        }

        boolean ans;
        if(root.data>k){
           ans= searchInBST(root.left,k);
        }
        else{
           ans =  searchInBST(root.right,k);
        }

        return ans;
	}

    public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root,int k1,int k2){
        if(root==null){
            return ;
        }

        if(k1< root.data ) {
            elementsInRangeK1K2(root.left, k1, k2);
        }

        if(root.data >=k1 && root.data <=k2) {
            System.out.print(root.data+" ");
        }

        if(k2>root.data) {
            elementsInRangeK1K2(root.right, k1, k2);
        }
    }


    public static int minimum(BinaryTreeNode<Integer> root){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data, Math.min(minimum(root.left), minimum(root.right)));
    }

    public static int maximun(BinaryTreeNode<Integer> root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(maximun(root.left), maximun(root.right)));
    }

    public static boolean isBST(BinaryTreeNode<Integer> root){
        if(root == null){
            return true;
        }

        int leftMax = maximun(root.left);
        int rightMin = minimum(root.right);

        if(root.data <= leftMax) {
            return false;
        }

        if(root.data > rightMin) {
            return false;
        }

        boolean isLeftBST = isBST(root.left);
        boolean isRightBST = isBST(root.right);

        if(isLeftBST && isRightBST){
            return true;
        }
        else{
            return false;
        }
    }


    static class Pair<T,V>{
        public T first;
        public V second;
    }

//    public static Pair<Boolean , Pair<Integer,Integer>> isBST2(BinaryTreeNode<Integer> root){
//        if(root == null){
//            Pair<Boolean , Pair<Integer,Integer>> output = new Pair<Boolean , Pair<Integer,Integer>>();
//            output.first = true;
//            output.second = new Pair<Integer, Integer>();
//            output.second.first = Integer.MAX_VALUE;
//            output.second.second = Integer.MIN_VALUE;
//            return output;
//        }
//
//        Pair<Boolean , Pair<Integer,Integer>> leftOutput = isBST2(root.left);
//        Pair<Boolean , Pair<Integer,Integer>> rightOutput =isBST2(root.left);
//
//        int min = Math.min(root.data, Math.min(leftOutput.second.first,rightOutput.second.first));
//        int max = Math.max(root.data, Math.max(leftOutput.second.first,rightOutput.second.first));
//
//        boolean isBST = (root.data>leftOutput.second.second) && (root.data <= rightOutput.second.first) && leftOutput.first && rightOutput.first;
//        Pair<Boolean , Pair<Integer,Integer>> output = new Pair<Boolean , Pair<Integer,Integer>>();
//        output.first = isBST;
//        output.second = new Pair<Integer, Integer>();
//        output.second.first = min;
//        output.second.second = max;
//        return output;
//    }

    public static Pair<Boolean, Pair<Integer, Integer>> isBST2(BinaryTreeNode<Integer> root) {
        if (root == null) {
            Pair<Boolean, Pair<Integer, Integer>> output = new Pair<Boolean, Pair<Integer, Integer>>();
            output.first = true;
            output.second = new Pair<Integer, Integer>();
            output.second.first = Integer.MAX_VALUE;
            output.second.second = Integer.MIN_VALUE;
            return output;
        }
        Pair<Boolean, Pair<Integer, Integer>> leftOutput = isBST2(root.left);
        Pair<Boolean, Pair<Integer, Integer>> rightOutput = isBST2(root.right);
        int min = Math.min(root.data, Math.min(leftOutput.second.first, rightOutput.second.first));
        int max = Math.max(root.data, Math.max(leftOutput.second.second, rightOutput.second.second));
        boolean isBST = (root.data > leftOutput.second.second)
                && (root.data <= rightOutput.second.first)
                && leftOutput.first && rightOutput.first;
        Pair<Boolean, Pair<Integer, Integer>> output = new Pair<Boolean, Pair<Integer, Integer>>();
        output.first = isBST;
        output.second = new Pair<Integer, Integer>();
        output.second.first = min;
        output.second.second = max;
        return output;
    }

    public static boolean isBST3(BinaryTreeNode<Integer> root, int min,int max){
        if(root == null){
            return true;
        }
        if(root.data < min || root.data > max){
            return false;
        }

        boolean isLeftOk = isBST3(root.left,min,root.data -1);
        boolean isRightOk = isBST3(root.right,root.data,max);

        return isLeftOk && isRightOk;
    }

    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr,int si,int ei){

        if(si>ei){
            return null;
        }

        int mid=(si+ei)/2;
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(arr[mid]);

        root.left=SortedArrayToBST(arr,si,mid-1);
        root.right=SortedArrayToBST(arr,mid+1,ei);
        return root;

    }
    public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
        return SortedArrayToBST(arr, 0, n-1);
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        System.out.println(isBST(root));
        System.out.println(isBST2(root).first);
        System.out.println(isBST3(root,6,15));
        System.out.println("return true or false: ");
        System.out.println(searchInBST(root,98));
        elementsInRangeK1K2(root,6,10);
    }
}

 */









//Check if a Binary Tree is BST
//Given a binary tree with N number of nodes, check if that input tree is BST (Binary Search Tree). If yes, return true, return false otherwise.
/*

package BST;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

class BinaryTreeNode<T> {
    T data;
    public BinaryTreeNode<T> left;
    public BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}


public class BinaryTreeUse {

    public static BinaryTreeNode<Integer> takeInputLevelWise() {
        Scanner sc = new Scanner(System.in);
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        System.out.println("Enter root data");
        int rootData = sc.nextInt();

        if (rootData == -1) {
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        pendingNodes.add(root);

        while (!pendingNodes.isEmpty()) {
            BinaryTreeNode<Integer> front = pendingNodes.poll();

            System.out.println("Enter left child of " + front.data);
            int leftChild = sc.nextInt();
            if (leftChild != -1) {
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(leftChild);
                pendingNodes.add(child);
                front.left = child;
            }

            System.out.println("Enter right child of " + front.data);
            int rightChild = sc.nextInt();
            if (rightChild != -1) {
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightChild);
                pendingNodes.add(child);
                front.right = child;
            }
        }

        return root;

    }


    public static int minimum(BinaryTreeNode<Integer> root){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data, Math.min(minimum(root.left), minimum(root.right)));
    }

    public static int maximun(BinaryTreeNode<Integer> root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(maximun(root.left), maximun(root.right)));
    }

    public static boolean isBST(BinaryTreeNode<Integer> root){
        if(root == null){
            return true;
        }

        int leftMax = maximun(root.left);
        int rightMin = minimum(root.right);

        if(root.data <= leftMax) {
            return false;
        }

        if(root.data > rightMin) {
            return false;
        }

        boolean isLeftBST = isBST(root.left);
        boolean isRightBST = isBST(root.right);

        if(isLeftBST && isRightBST){
            return true;
        }
        else{
            return false;
        }
    }


    static class Pair<T,V>{
        public T first;
        public V second;
    }

    public static Pair<Boolean, Pair<Integer, Integer>> isBST2(BinaryTreeNode<Integer> root) {
        if (root == null) {
            Pair<Boolean, Pair<Integer, Integer>> output = new Pair<Boolean, Pair<Integer, Integer>>();
            output.first = true;
            output.second = new Pair<Integer, Integer>();
            output.second.first = Integer.MAX_VALUE;
            output.second.second = Integer.MIN_VALUE;
            return output;
        }
        Pair<Boolean, Pair<Integer, Integer>> leftOutput = isBST2(root.left);
        Pair<Boolean, Pair<Integer, Integer>> rightOutput = isBST2(root.right);
        int min = Math.min(root.data, Math.min(leftOutput.second.first, rightOutput.second.first));
        int max = Math.max(root.data, Math.max(leftOutput.second.second, rightOutput.second.second));
        boolean isBST = (root.data > leftOutput.second.second)
                && (root.data <= rightOutput.second.first)
                && leftOutput.first && rightOutput.first;
        Pair<Boolean, Pair<Integer, Integer>> output = new Pair<Boolean, Pair<Integer, Integer>>();
        output.first = isBST;
        output.second = new Pair<Integer, Integer>();
        output.second.first = min;
        output.second.second = max;
        return output;
    }

    public static boolean isBST3(BinaryTreeNode<Integer> root, int min,int max){
        if(root == null){
            return true;
        }
        if(root.data < min || root.data > max){
            return false;
        }

        boolean isLeftOk = isBST3(root.left,min,root.data -1);
        boolean isRightOk = isBST3(root.right,root.data,max);

        return isLeftOk && isRightOk;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        System.out.println(isBST(root));
        System.out.println(isBST2(root).first);
        System.out.println(isBST2(root).second.second);
        System.out.println(isBST3(root,6,15));
    }
}

 */









/*

package BST;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

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

//class LinkedListNode<T> {
//    T data;
//    LinkedListNode<T> next;
//
//    public LinkedListNode(T data) {
//        this.data = data;
//    }
//}

class BinaryTreeUse {

    public static BinaryTreeNode<Integer> takeInputLevelWise() {
        Scanner sc = new Scanner(System.in);
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        System.out.println("Enter root data");
        int rootData = sc.nextInt();

        if (rootData == -1) {
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        pendingNodes.add(root);

        while (!pendingNodes.isEmpty()) {
            BinaryTreeNode<Integer> front = pendingNodes.poll();
            System.out.println("Enter left child of " + front.data);
            int leftChild = sc.nextInt();
            if (leftChild != -1) {
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(leftChild);
                pendingNodes.add(child);
                front.left = child;
            }

            System.out.println("Enter right child of " + front.data);
            int rightChild = sc.nextInt();
            if (rightChild != -1) {
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightChild);
                pendingNodes.add(child);
                front.right = child;
            }
        }

        return root;

    }

    private static void preOrder(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static BinaryTreeNode<Integer> sortedArrayToBST(int[] arr,int si,int ei){

        if(si>ei){
            return null;
        }

        int mid=(si+ei)/2;
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(arr[mid]);

        root.left=sortedArrayToBST(arr,si,mid-1);
        root.right=sortedArrayToBST(arr,mid+1,ei);
        return root;

    }
    public static BinaryTreeNode<Integer> sortedArrayToBST(int[] arr, int n){
        return sortedArrayToBST(arr, 0, n-1);
    }



    static class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;

        public LinkedListNode(T data) {
            this.data = data;
        }
    }
    static class PairLinkedList{
        LinkedListNode<Integer> head;
        LinkedListNode<Integer> tail;
    }

    public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
        return helper(root).head;

    }
    public static PairLinkedList helper(BinaryTreeNode<Integer> root){
        if(root == null){
            PairLinkedList pair = new PairLinkedList();
            pair.head = null;
            pair.tail = null;
            return pair;
        }

        LinkedListNode<Integer> newHead = new LinkedListNode<>(root.data);
        PairLinkedList leftTree = helper(root.left);//get left tree
        PairLinkedList rightTree = helper(root.right);//get right tree
        PairLinkedList pair = new PairLinkedList();

       // attach left tree to root and root to right tree

        //if left is not null attach root to right and return
        if(leftTree.head != null){
            pair.head = leftTree.head;
            pair.tail = leftTree.tail;
            pair.tail.next = newHead;
            pair.tail = newHead;
            if(rightTree.head == null){//if right is null, return
                pair.tail.next = null;
                return pair;
            }
        }
        //attach right tree to root
        if(rightTree.head != null && leftTree.head != null){
            pair.tail.next = rightTree.head;
            pair.tail = rightTree.tail;
            return pair;
        }
        //if left is null just attach right to root and return
        if(rightTree.head != null && leftTree.head == null){
            pair.head = newHead;
            newHead.next = rightTree.head;
            pair.tail = rightTree.tail;
            return pair;
        }
        //if both are null, simply return the current node
        else{
            pair.head = newHead;
            pair.tail = newHead;
        }
        return pair;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of array");
        int len = sc.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter array element");
        for(int i = 0 ;i < len ;i++){
            arr[i] = sc.nextInt();
        }
        BinaryTreeNode<Integer> ans = sortedArrayToBST(arr,len);
        preOrder(ans);

        System.out.println();
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        LinkedListNode<Integer> Ans = constructLinkedList(root);
        while(Ans != null){
            System.out.print(Ans.data + " ");
            Ans = Ans.next;
        }

    }
}


 */









/*
package BST;

import java.util.LinkedList;
import java.util.Queue;

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

class BinarySearchTree{

    BinaryTreeNode<Integer> root;

    private BinaryTreeNode<Integer> insertDataHelper(int data, BinaryTreeNode<Integer> root) {
        if (root == null) {
            BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(data);
            return newNode;
        }
        if (data < root.data) {
            // insert in the left
            insertDataHelper(data, root.left);
        } else {
            // if data >= root.data
            // insert it on the right side
            insertDataHelper(data, root.right);
        }
        return root;
    }
    public void insertData(int data){
        insertDataHelper(data,root);
    }


    public void deleteData(int data){
       deleteData(data,root);
    }
    private BinaryTreeNode<Integer> deleteData(int data, BinaryTreeNode<Integer> root) {
        // TODO Auto-generated method stub

        if (root == null) {
            return null;
        }
        if (data < root.data) {
            root.left = deleteData(data, root.left);
            return root;
        } else if (data > root.data) {
            root.right = deleteData(data, root.right);
            return root;
        } else { // if (data == root.data)
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                // if both left and right are not null, pick minimum from right subtree and make
                // that as root
                BinaryTreeNode<Integer> minNode = root.right;
                while (minNode.left != null) {
                    minNode = minNode.left;
                }
                root.data = minNode.data;
                root.right = deleteData(minNode.data, root.right);
                return root;
            }
        }
    }


    private boolean hasDataHelper(int data,BinaryTreeNode<Integer> root){
        if (root == null){
            return false;
        }

        if(root.data == data){
            return true;
        }
        else if(data>root.data){
            // call right
            return hasDataHelper(data,root.right);
        }
        else{
            // call left
            return hasDataHelper(data,root.left);
        }

    }
    public boolean hasData(int data){
        return hasDataHelper(data,root);
    }


    private void printTree(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode<Integer> frontNode = queue.poll();
            System.out.print(frontNode.data + ":");
            if (frontNode.left != null) {
                System.out.print("L:" + frontNode.left.data + ",");
                queue.add(frontNode.left);

            }
            if (frontNode.right != null) {
                System.out.print("R:" + frontNode.right.data);
                queue.add(frontNode.right);
            }
            System.out.println();
        }
    }
    public void printTree() {
        printTree(root);
    }

    public static void main(String[] args) {

    }
}

 */











/*

package BST;

import java.util.ArrayList;

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

class BinarySearchTree {

    private static BinaryTreeNode<Integer> root;

    private static BinaryTreeNode<Integer> insertData(int data,BinaryTreeNode<Integer> root){
        if (root == null){
            BinaryTreeNode<Integer> newNode = new BinaryTreeNode<>(data);
            return newNode;
        }

        if(root.data>=data){
            root.left = insertData(data,root.left);
        }
        else{
            root.right = insertData(data,root.right);
        }
        return root;
    }
    public static void insertData(int data) {
        root = insertData(data,root);
    }


    public static BinaryTreeNode<Integer> deleteData(int data, BinaryTreeNode<Integer> root){
        if(root == null){
            return null;
        }

        if(data< root.data){
            root.left = deleteData(data,root.left);
            return root;
        }
        else if(data>root.data){
            root.right = deleteData(data,root.right);
            return root;
        }
        else{ // data == root.data
            if(root.left == null && root.right == null){
                return null;
            }
            else if (root.left == null){
                return root.right;
            }
            else if (root.right == null){
                return root.left;
            }
            else {
                BinaryTreeNode<Integer> minNode = root.right;
                while(minNode.left != null){
                    minNode = minNode.left;
                }
                root.data = minNode.data;
                root.right = deleteData(minNode.data, root.right);
                return root;
            }
        }
    }
    public static void deleteData(int data) {
        root = deleteData(data,root);
    }

    private static boolean hasDataHelper(int data, BinaryTreeNode<Integer> root) {
        if (root == null) {
            return false;
        }

        if (root.data == data) {
            return true;
        } else if (data > root.data) {
            // call right
            return hasDataHelper(data, root.right);
        } else {
            // call left
            return hasDataHelper(data, root.left);
        }
    }
    public static boolean hasData(int data) {
        return hasDataHelper(data, root);
    }


//    public static void printTree(BinaryTreeNode<Integer> root){
//        if (root == null){
//            return;
//        }
//
//        String toBePrinted = root.data+ ":";
//        if(root.left != null){
//            toBePrinted += "L:"+root.left.data+",";
//        }
//        if(root.right != null){
//            toBePrinted += "R:" + root.right.data;
//        }
//        System.out.println(toBePrinted);
//        printTree(root.left);
//        printTree(root.right);
//    }
//    public static void print(){
//        printTree(root);
//    }

    private static void printTree(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + ":");
        if (root.left != null) {
            System.out.print("L:" + root.left.data + ",");
        }
        if (root.right != null) {
            System.out.print("R:" + root.right.data);
        }
        System.out.println();
        printTree(root.left);
        printTree(root.right);
    }


    public static ArrayList<Integer> getRootToNodePath(BinaryTreeNode<Integer> root, int data){
        if(root == null){
            return null;
        }

        if(root.data == data){
            ArrayList<Integer> output = new ArrayList<>();
            output.add(root.data);
            return output;
        }

        ArrayList<Integer> leftOutput = getRootToNodePath(root.left,data);
        if(leftOutput != null){
            leftOutput.add(root.data);
            return leftOutput;
        }

        ArrayList<Integer> rightOutput = getRootToNodePath(root.right,data);
        if(rightOutput != null){
            rightOutput.add(root.data);
            return rightOutput;
        }
        else{
            return null;
        }
    }

    public static void main(String[] args) {
//        BinaryTreeNode<Integer> bst = new BinaryTreeNode<>()
        BinarySearchTree bst = new BinarySearchTree();
        bst.insertData(10);
        bst.insertData(20);
        bst.insertData(5);
        bst.insertData(15);
        bst.insertData(3);
        bst.insertData(7);
        bst.printTree(root);
        System.out.println();
        bst.deleteData(10);
        bst.printTree(root);

        System.out.println(hasData(20));

    }
}

 */













package BST;

//import java.util.*;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Collections;

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

class BinarySearchTree {


    public static BinaryTreeNode<Integer> takeInputLevelWise() {
        Scanner sc = new Scanner(System.in);
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        System.out.println("Enter root data");
        int rootData = sc.nextInt();

        if (rootData == -1) {
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        pendingNodes.add(root);

        while (!pendingNodes.isEmpty()) {
            BinaryTreeNode<Integer> front = pendingNodes.poll();
            System.out.println("Enter left child of " + front.data);
            int leftChild = sc.nextInt();
            if (leftChild != -1) {
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(leftChild);
                pendingNodes.add(child);
                front.left = child;
            }

            System.out.println("Enter right child of " + front.data);
            int rightChild = sc.nextInt();
            if (rightChild != -1) {
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightChild);
                pendingNodes.add(child);
                front.right = child;
            }
        }

        return root;

    }


    public static ArrayList<Integer> getRootToNodePath(BinaryTreeNode<Integer> root, int data){
        if(root == null){
            return null;
        }

        if(root.data == data){
            ArrayList<Integer> output = new ArrayList<>();
            output.add(root.data);
            return output;
        }

        ArrayList<Integer> leftOutput = getRootToNodePath(root.left,data);
        if(leftOutput != null){
            leftOutput.add(root.data);
            return leftOutput;
        }

        ArrayList<Integer> rightOutput = getRootToNodePath(root.right,data);
        if(rightOutput != null){
            rightOutput.add(root.data);
            return rightOutput;
        }
        else{
            return null;
        }
    }


    public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        BinaryTreeNode<Integer> newNode = new BinaryTreeNode<>(root.data);
        BinaryTreeNode<Integer> rootLeft = root.left;
        root.left = newNode;
        newNode.left = rootLeft;
        insertDuplicateNode(rootLeft);
        insertDuplicateNode(root.right);
    }


//    public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
//        if(root == null){
//            return -1;
//        }
//
//        if(a == root.data || b == root.data){
//            return root.data;
//        }
//
//        int leftLca = getLCA(root.left,a,b);
//        int rightLca = getLCA(root.right,a,b);
//
//        if(leftLca==-1 && rightLca ==-1) {
//            return -1;
//        }
//        else if(leftLca==-1) {
//            return rightLca;
//        }
//        else if(rightLca==-1) {
//            return leftLca;
//        }
//        else {
//            return root.data;
//        }
//
//    }


    public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {

        if(root==null) {
			return -1;
		}
		if(a < root.data && b < root.data ) {
			return getLCA(root.left, a, b);
		}
		if(a>root.data && b > root.data) {
			return getLCA(root.right, a, b);
		}
		if(root.data == a || root.data == b) {
			return root.data;
		}
		int leftLca = getLCA(root.left, a, b);
		int rightLca = getLCA(root.right, a, b);
		if(leftLca==-1 && rightLca==-1) {
			return -1;
		}
		else if(leftLca==-1) {
			return rightLca;
		}
		else if(rightLca==-1) {
			return leftLca;
		}
		else {
			return root.data;
		}

    }


    private static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k, String path, int currSum) {
        if(root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            currSum += root.data;
            if (currSum == k) {
                System.out.println((path + root.data + " "));
            }
            return;
        }
        rootToLeafPathsSumToK(root.left, k, (path + root.data + " "), (currSum + root.data));
        rootToLeafPathsSumToK(root.right, k, (path + root.data + " "), (currSum + root.data));
    }
    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
        rootToLeafPathsSumToK(root, k, "", 0);
    }




//    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
//        //Your code goes here
//        helper(root,k,"");
//    }
//
//    private static void helper(BinaryTreeNode<Integer> root,int k,String s){
//        if(root==null){
//            return;
//        }
//
//        if(root.left==null && root.right==null && root.data==k){
//            System.out.println(s+root.data);
//            return;
//        }
//
//        s=s+root.data+" ";
//
//        helper(root.left,k-root.data,s);
//        helper(root.right,k-root.data,s);
//
//    }



    public static void pairSum(BinaryTreeNode<Integer> root, int sum) {

        if(root==null) {
            return ;
        }
        ArrayList<Integer> arr = convertTreeToArray(root);
        Collections.sort(arr);
        int i=0,j=arr.size()-1;
        while(i<j) {

            if(arr.get(i)+ arr.get(j)==sum) {
                System.out.println(arr.get(i) +" " + arr.get(j));
                i++;
                j--;
            }
            else if(arr.get(i) + arr.get(j) < sum ) {
                i++;
            }
            else {
                j--;
            }

        }

    }
    //helper function to convert  tree into Array.
    private static ArrayList<Integer> convertTreeToArray(BinaryTreeNode<Integer> root) {

        if(root==null) {
            return new ArrayList<>();
        }

        ArrayList<Integer> leftArrayList = convertTreeToArray(root.left);
        ArrayList<Integer> rightArrayList = convertTreeToArray(root.right);
        ArrayList<Integer> ansArrayList = new ArrayList<>();
        for(int i : leftArrayList) {
            ansArrayList.add(i);
        }
        for(int i : rightArrayList) {
            ansArrayList.add(i);
        }
        ansArrayList.add(root.data);
        return ansArrayList;

    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        System.out.println();

        insertDuplicateNode(root);
        System.out.println();

        System.out.println(getLCA(root,2,6));
        System.out.println();

        System.out.println(getRootToNodePath(root, 2));
        System.out.println();

        rootToLeafPathsSumToK(root, 5);
        System.out.println();

        pairSum(root, 52);
    }
}

