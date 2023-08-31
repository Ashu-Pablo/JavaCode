/*
package binaryTree;

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
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        System.out.println("Enter root data");
        int rootData = sc.nextInt();

        if(rootData == -1){
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        pendingNodes.add(root);

        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> front = pendingNodes.poll();
            System.out.println("Enter left child of "+ front.data);
            int leftChild = sc.nextInt();
            if (leftChild != -1){
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(leftChild);
                pendingNodes.add(child);
                front.left = child;
            }

            System.out.println("Enter right child of "+ front.data);
            int rightChild = sc.nextInt();
            if (rightChild != -1){
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightChild);
                pendingNodes.add(child);
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

//        if(root == null){
//            return false;
//        }
//
//        BinaryTreeNode<Integer> ans = new BinaryTreeNode<Integer>(root.data);
//
//        if(ans.data == x){
//            return true;
//        }
//
//        isNodePresent(root.left,x);
//        isNodePresent(root.right,x);
//
//        return false;


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

    public static BinaryTreeNode<Integer> removeLeafNodes(BinaryTreeNode<Integer> root){
        if(root == null){
            return null;
        }

        if(root.left == null && root.right == null){
            return null;
        }

        root.left = removeLeafNodes(root.left);
        root.right = removeLeafNodes(root.right);
        return root;
    }


    public static int height(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int realHeight = 1 + Math.max(leftHeight,rightHeight);
        return realHeight;
    }

    public static boolean isBalanced(BinaryTreeNode<Integer> root){
        if(root == null){
            return true;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(Math.abs(leftHeight - rightHeight) >1){
            return false;
        }

        boolean isLeftBalanced = isBalanced(root.left);
        boolean isRightBalanced = isBalanced(root.left);

        return isLeftBalanced && isRightBalanced;
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

        System.out.print("Check the node is present in Binary Tree or not: ");
        System.out.println(isNodePresent(root,30));

        System.out.print("The number of leaves in binary tree is:");
        System.out.println(numLeaves(root));

        System.out.println("print the element at depth k");
        printAtDepthK(root,2);

        System.out.println("Print the Node without sibling");
        printNodesWithoutSibling(root);

        System.out.println("change nodes into its level");
        changeToDepthTree(root);
        inOrder(root);
        printLevelWise(root);

        System.out.println("order is: ");
        inOrder(root);

        System.out.println("height of binary tree is: " + height(root));

        System.out.println("check tree is balance or not: " + isBalanced(root));

        System.out.println("After removal of leaf node of Binary tree ");
        removeLeafNodes(root);
        printLevelWise(root);

    }
}


*/











/*

package binaryTree;

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

class BinaryTreeUse{

    public static BinaryTreeNode<Integer> takeInputLevelWise(){
        Scanner sc = new Scanner(System.in);
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        System.out.println("Enter root data");
        int rootData = sc.nextInt();

        if(rootData == -1){
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        pendingNodes.add(root);

        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> front = pendingNodes.poll();
            System.out.println("Enter left child of "+ front.data);
            int leftChild = sc.nextInt();
            if (leftChild != -1){
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(leftChild);
                pendingNodes.add(child);
                front.left = child;
            }

            System.out.println("Enter right child of "+ front.data);
            int rightChild = sc.nextInt();
            if (rightChild != -1){
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightChild);
                pendingNodes.add(child);
                front.right = child;
            }
        }

        return root;

    }

    public static void printLevelWise(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if (root == null)
            return;
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
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

//    public static void printTree(BinaryTreeNode<Integer> root){
//        if(root == null){
//            return;
//        }
//
//        String toBePrinted = root.data +"->";
//
//        if(root.left != null){
//            toBePrinted +="L:" + root.left.data+",";
//        }
//
//        if(root.right!= null){
//            toBePrinted += "R:" + root.right.data;
//        }
//        System.out.println(toBePrinted);
//
//        printTree(root.left);
//        printTree(root.right);
//    }

    public static int height(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int realHeight = 1 + Math.max(leftHeight,rightHeight);
        return realHeight;
    }

    public static boolean isBalanced(BinaryTreeNode<Integer> root){
        if(root == null){
            return true;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(Math.abs(leftHeight - rightHeight) >1){
            return false;
        }

        boolean isLeftBalanced = isBalanced(root.left);
        boolean isRightBalanced = isBalanced(root.left);

        return isLeftBalanced && isRightBalanced;
    }

    //Better time complexity O(n).

    static class BalancedTreeReturn {
        int height;
        boolean isBalancedCheck;
    }

    public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root){
        if(root==null){
            int height= 0;
            boolean isBal= true;
            BalancedTreeReturn ans= new BalancedTreeReturn();
            ans.height= height;
            ans.isBalancedCheck= isBal;
            return ans;
        }
        BalancedTreeReturn leftOutput= isBalancedBetter(root.left);
        BalancedTreeReturn rightOutput= isBalancedBetter(root.right);
        boolean isBal= true;
        int height= 1+Math.max(leftOutput.height, rightOutput.height);

        if(Math.abs(leftOutput.height-rightOutput.height)>1){
            isBal= false;
        }
        if(!leftOutput.isBalancedCheck || !rightOutput.isBalancedCheck){
            isBal=false;
        }
        BalancedTreeReturn ans= new BalancedTreeReturn();
        ans.height= height;
        ans.isBalancedCheck= isBal;
        return ans;
    }


    public static int diameter(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        int option1 = heights(root.left) + heights(root.right);
        int option2 = diameter(root.left);
        int option3 = diameter(root.right);
        return Math.max(option1, Math.max(option2, option3));
    }
    public static int heights(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return 1 + Math.max(lh, rh);
    }


    static class Pair<T,V> {
        public T first;
        public V second;
    }
    public static Pair<Integer, Integer> heightDiameter(BinaryTreeNode<Integer> root) {
        if (root == null) {
            Pair<Integer,Integer> output = new Pair<>();
            output.first = 0;
            output.second = 0;
            return output;
        }
        Pair<Integer, Integer> lo = heightDiameter(root.left);
        Pair<Integer, Integer> ro = heightDiameter(root.right);
        int height = 1 + Math.max(lo.first, ro.first);
        int option1 = lo.first + ro.first;
        int option2 = lo.second;
        int option3 = ro.second;
        int diameter = Math.max(option1, Math.max(option2, option3));
        Pair<Integer,Integer> output = new Pair<>();
        output.first = height;
        output.second = diameter;
        return output;
    }



//    public static BinaryTreeNode<Integer> buildTree(int in[],int []pre){
//        return buildTreeHelper(in , pre , 0 , in.length - 1 , 0 , pre.length - 1);
//    }
//
//    public static BinaryTreeNode<Integer> buildTreeHelper(int in[],int pre[],int inS,int inE,int preS,int preE){
//        if (inS>inE){
//            return null;
//        }
//
//        int rootData = pre[preS];
//        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
//        int rootIndex = -1;
//        for(int i = inS; i <= inE ; i++){
//            if(in[i] == rootData){
//                rootIndex = i;
//                break;
//            }
//        }
//
//        if (rootIndex == -1){
//            return null;
//        }
//
//        int leftInS = inS;
//        int leftInE = rootIndex-1;
//        int leftPreS = preS+1;
//        int leftPreE =  leftInE - leftInS + leftPreS;
//
//        int rightInS = rootIndex+1;
//        int rightInE = inE;
//        int rightPreS = leftPreE + 1;
//        int rightPreE = preE;
//
//        root.left = buildTreeHelper(in, pre, leftInS, leftInE, leftPreS, leftPreE);
//        root.right = buildTreeHelper(in, pre, rightInS,rightInE,rightPreS,rightPreE);
//
//        return root;
//    }

    public static BinaryTreeNode<Integer> buildTreeHelper(int in[], int pre[], int inS, int inE, int preS, int preE) {
        if (inS > inE) {
            return null;
        }
        int rootData = pre[preS];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        int rootInIndex = -1;
        for (int i = inS; i <= inE; i++) {
            if (in[i] == rootData) {
                rootInIndex = i;
                break;
            }
        }
        if (rootInIndex == -1) {
            return null;
        }

        int leftInS = inS;
        int leftInE = rootInIndex - 1;
        int leftPreS = preS + 1;
        int leftPreE = leftInE - leftInS + leftPreS;
        int rightInS = rootInIndex + 1;
        int rightInE = inE;
        int rightPreS = leftPreE + 1;
        int rightPreE = preE;
        root.left = buildTreeHelper(in, pre, leftInS, leftInE, leftPreS, leftPreE);
        root.right = buildTreeHelper(in, pre, rightInS, rightInE, rightPreS, rightPreE);
        return root;
    }

    public static BinaryTreeNode<Integer> buildTree(int in[], int pre[]) {
        return buildTreeHelper(in, pre, 0, in.length - 1, 0, pre.length -1);
    }

    public static void printTree(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return;
        }
        String toBePrinted = root.data + "";
        if (root.left != null) {
            toBePrinted += "L:" + root.left.data + ",";
        }

        if (root.right != null) {
            toBePrinted += "R:" + root.right.data;
        }
        System.out.println(toBePrinted);
        printTree(root.left);
        printTree(root.right);
    }
    public static void main(String[] args) {
        // write your code here

//        System.out.println("******TAKE INPUT LEVEL WISE******");
//        BinaryTreeNode<Integer> root = takeInputLevelWise();
//
//        System.out.println("Print Tree Structure");
//        printTree(root);
//
//        System.out.println("Print Tree Structure LevelWise");
//        printLevelWise(root);
//
//        System.out.println(isBalanced(root));
//        System.out.println(isBalancedBetter(root).isBalancedCheck);
//
//        System.out.println("diameter:" + heightDiameter(root).second);
//        System.out.println("Height:" + heightDiameter(root).first);

        int in[] = {4,2,5,1,3,7};
        int pre[] = {1,2,4,5,3,7};

        BinaryTreeNode<Integer> root = buildTree(in,pre);
        printTree(root);
    }
}


 */









//Print level wise After and before removal of leaf nodes of binary tree
/*

package binaryTree;

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

class BinaryTreeUse{
    public static BinaryTreeNode<Integer> removeLeafNodes(BinaryTreeNode<Integer> root){
        if(root == null){
            return null;
        }

        if(root.left == null && root.right == null){
            return null;
        }

        root.left = removeLeafNodes(root.left);
        root.right = removeLeafNodes(root.right);
        return root;
    }

    public static BinaryTreeNode<Integer> takeInputLevelWise(){
        Scanner sc = new Scanner(System.in);
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        System.out.println("Enter root data");
        int rootData = sc.nextInt();

        if(rootData == -1){
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        pendingNodes.add(root);

        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> front = pendingNodes.poll();
            System.out.println("Enter left child of "+ front.data);
            int leftChild = sc.nextInt();
            if (leftChild != -1){
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(leftChild);
                pendingNodes.add(child);
                front.left = child;
            }

            System.out.println("Enter right child of "+ front.data);
            int rightChild = sc.nextInt();
            if (rightChild != -1){
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightChild);
                pendingNodes.add(child);
                front.right = child;
            }
        }

        return root;

    }

    public static void printLevelWise(BinaryTreeNode<Integer> root){
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        pendingNodes.add(null);

        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> frontNode = pendingNodes.poll();

            if(frontNode == null){
                System.out.println();

                if (!pendingNodes.isEmpty()){
                    pendingNodes.add(null);
                }
            }
            else{
                System.out.print(frontNode.data + " ");

                if(frontNode.left != null){
                    pendingNodes.add(frontNode.left);
                }
                if (frontNode.right != null){
                    pendingNodes.add(frontNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        System.out.println("this is to printing to level wise");
        printLevelWise(root);
        removeLeafNodes(root);
        System.out.println("After removal of leaf nodes");
        printLevelWise(root);
    }
}

*/










/* check the tree is balanced or not by two method
        1. with bad timeComplexity
        2. with better time complexity { O(n) }
 */
/*

package binaryTree;

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

class BinaryTreeUse{

    public static BinaryTreeNode<Integer> takeInputLevelWise(){
        Scanner sc = new Scanner(System.in);
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        System.out.println("Enter root data");
        int rootData = sc.nextInt();

        if(rootData == -1){
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        pendingNodes.add(root);

        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> front = pendingNodes.poll();
            System.out.println("Enter left child of "+ front.data);
            int leftChild = sc.nextInt();
            if (leftChild != -1){
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(leftChild);
                pendingNodes.add(child);
                front.left = child;
            }

            System.out.println("Enter right child of "+ front.data);
            int rightChild = sc.nextInt();
            if (rightChild != -1){
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightChild);
                pendingNodes.add(child);
                front.right = child;
            }
        }

        return root;

    }

    public static int height(BinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int realHeight = 1 + Math.max(leftHeight,rightHeight);
        return realHeight;
    }

    public static boolean isBalanced(BinaryTreeNode<Integer> root){
        if(root == null){
            return true;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(Math.abs(leftHeight - rightHeight) >1){
            return false;
        }

        boolean isLeftBalanced = isBalanced(root.left);
        boolean isRightBalanced = isBalanced(root.right);

        return isLeftBalanced && isRightBalanced;
    }

    //Better time complexity O(n).

    static class BalancedTreeReturn {
        int height;
        boolean isBalancedCheck;
    }

    public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root){
        if(root==null){
            int height= 0;
            boolean isBal= true;
            BalancedTreeReturn ans= new BalancedTreeReturn();
            ans.height= height;
            ans.isBalancedCheck= isBal;
            return ans;
        }
        BalancedTreeReturn leftOutput= isBalancedBetter(root.left);
        BalancedTreeReturn rightOutput= isBalancedBetter(root.right);
        boolean isBal= true;
        int height= 1+Math.max(leftOutput.height, rightOutput.height);

        if(Math.abs(leftOutput.height-rightOutput.height)>1){
            isBal= false;
        }
        if(!leftOutput.isBalancedCheck || !rightOutput.isBalancedCheck){
            isBal=false;
        }
        BalancedTreeReturn ans= new BalancedTreeReturn();
        ans.height= height;
        ans.isBalancedCheck= isBal;
        return ans;
    }


    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        System.out.println(height(root));
        System.out.println(isBalanced(root));
        System.out.println(isBalancedBetter(root).isBalancedCheck);
    }
}

 */












// Find Diameter of a Binary Tree
/*

package binaryTree;

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

class BinaryTreeUse{

    public static BinaryTreeNode<Integer> takeInputLevelWise(){
        Scanner sc = new Scanner(System.in);
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        System.out.println("Enter root data");
        int rootData = sc.nextInt();

        if(rootData == -1){
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        pendingNodes.add(root);

        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> front = pendingNodes.poll();
            System.out.println("Enter left child of "+ front.data);
            int leftChild = sc.nextInt();
            if (leftChild != -1){
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(leftChild);
                pendingNodes.add(child);
                front.left = child;
            }

            System.out.println("Enter right child of "+ front.data);
            int rightChild = sc.nextInt();
            if (rightChild != -1){
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightChild);
                pendingNodes.add(child);
                front.right = child;
            }
        }

        return root;

    }

    public static int diameter(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        int option1 = height(root.left) + height(root.right);
        int option2 = diameter(root.left);
        int option3 = diameter(root.right);
        return Math.max(option1, Math.max(option2, option3));
    }
    public static int height(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return 1 + Math.max(lh, rh);
    }


    static class Pair<T,V> {
        public T first;
        public V second;
    }
    public static Pair<Integer, Integer> heightDiameter(BinaryTreeNode<Integer> root) {
        if (root == null) {
            Pair<Integer,Integer> output = new Pair<>();
            output.first = 0;
            output.second = 0;
            return output;
        }
        Pair<Integer, Integer> lo = heightDiameter(root.left);
        Pair<Integer, Integer> ro = heightDiameter(root.right);
        int height = 1 + Math.max(lo.first, ro.first);
        int option1 = lo.first + ro.first;
        int option2 = lo.second;
        int option3 = ro.second;
        int diameter = Math.max(option1, Math.max(option2, option3));
        Pair<Integer,Integer> output = new Pair<>();
        output.first = height;
        output.second = diameter;
        return output;
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        System.out.println(height(root));
        System.out.println(diameter(root));
        System.out.println("diameter:" + heightDiameter(root).second);
        System.out.println("Height:" + heightDiameter(root).first);
    }
}

*/










// Mirror of a Binary Tree
/*

package binaryTree;

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

class BinaryTreeUse{

    public static BinaryTreeNode<Integer> takeInputLevelWise(){
        Scanner sc = new Scanner(System.in);
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        System.out.println("Enter root data");
        int rootData = sc.nextInt();

        if(rootData == -1){
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        pendingNodes.add(root);

        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> front = pendingNodes.poll();
            System.out.println("Enter left child of "+ front.data);
            int leftChild = sc.nextInt();
            if (leftChild != -1){
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(leftChild);
                pendingNodes.add(child);
                front.left = child;
            }

            System.out.println("Enter right child of "+ front.data);
            int rightChild = sc.nextInt();
            if (rightChild != -1){
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightChild);
                pendingNodes.add(child);
                front.right = child;
            }
        }

        return root;

    }

    public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
        //Your code goes here
        if(root == null){
            return;
        }

        BinaryTreeNode<Integer> temp=root.left;
        root.left=root.right;
        root.right=temp;
        mirrorBinaryTree(root.left);
        mirrorBinaryTree(root.right);
    }

    public static void printLevelWise(BinaryTreeNode<Integer> root){
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        pendingNodes.add(null);

        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> frontNode = pendingNodes.poll();

            if(frontNode == null){
                System.out.println();

                if (!pendingNodes.isEmpty()){
                    pendingNodes.add(null);
                }
            }
            else{
                System.out.print(frontNode.data + " ");

                if(frontNode.left != null){
                    pendingNodes.add(frontNode.left);
                }
                if (frontNode.right != null){
                    pendingNodes.add(frontNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        mirrorBinaryTree(root);
        printLevelWise(root);
    }
}

 */












// Print the pre Order ,post Order and inOrder of a Binary Tree
/*

package binaryTree;

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

class BinaryTreeUse{

    public static BinaryTreeNode<Integer> takeInputLevelWise(){
        Scanner sc = new Scanner(System.in);
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        System.out.println("Enter root data");
        int rootData = sc.nextInt();

        if(rootData == -1){
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        pendingNodes.add(root);

        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> front = pendingNodes.poll();
            System.out.println("Enter left child of "+ front.data);
            int leftChild = sc.nextInt();
            if (leftChild != -1){
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(leftChild);
                pendingNodes.add(child);
                front.left = child;
            }

            System.out.println("Enter right child of "+ front.data);
            int rightChild = sc.nextInt();
            if (rightChild != -1){
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightChild);
                pendingNodes.add(child);
                front.right = child;
            }
        }

        return root;

    }

    public static void preOrder(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if(root == null){
            return;
        }

//         first print data of node
        System.out.print(root.data + " ");

        preOrder(root.left);
        preOrder(root.right);

    }

    public static void postOrder(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if(root == null){
            return;
        }

        postOrder(root.left);
        postOrder(root.right);

        System.out.print(root.data + " ");
    }

    public static void inOrder(BinaryTreeNode<Integer> root) {
        //Your code goes here
        if(root == null){
            return;
        }

        postOrder(root.left);
        System.out.print(root.data + " ");
        postOrder(root.right);
    }


    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        inOrder(root);
    }
}
*/











//Construct Tree from Preorder and Inorder
//Construct Tree from Postorder and Inorder
/*

package binaryTree;

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

class BinaryTreeUse{

    public static void printLevelWise(BinaryTreeNode<Integer> root){
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        pendingNodes.add(null);

        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> frontNode = pendingNodes.poll();

            if(frontNode == null){
                System.out.println();

                if (!pendingNodes.isEmpty()){
                    pendingNodes.add(null);
                }
            }
            else{
                System.out.print(frontNode.data + " ");

                if(frontNode.left != null){
                    pendingNodes.add(frontNode.left);
                }
                if (frontNode.right != null){
                    pendingNodes.add(frontNode.right);
                }
            }
        }
    }


    public static BinaryTreeNode<Integer> buildTree(int in[],int []pre){
        return buildTreeHelper(in , pre , 0 , in.length - 1 , 0 , pre.length - 1);
    }

    public static BinaryTreeNode<Integer> buildTreeHelper(int in[],int pre[],int inS,int inE,int preS,int preE){
        if (inS>inE){
            return null;
        }

        int rootData = pre[preS];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        int rootIndex = -1;
        for(int i = inS; i <= inE ; i++){
            if(in[i] == rootData){
                rootIndex = i;
                break;
            }
        }

        if (rootIndex == -1){
            return null;
        }

        int leftInS = inS;
        int leftInE = rootIndex-1;
        int leftPreS = preS+1;
        int leftPreE =  leftInE - leftInS + leftPreS;

        int rightInS = rootIndex+1;
        int rightInE = inE;
        int rightPreS = leftPreE + 1;
        int rightPreE = preE;

        root.left = buildTreeHelper(in, pre, leftInS, leftInE, leftPreS, leftPreE);
        root.right = buildTreeHelper(in, pre, rightInS,rightInE,rightPreS,rightPreE);

        return root;
    }


    public static BinaryTreeNode<Integer> buildTrees(int[] postOrder, int[] inOrder) {
        //Your code goes here

        BinaryTreeNode<Integer> root = buildTree(postOrder, inOrder, 0 ,postOrder.length-1, 0, inOrder.length-1);
        return root;
    }

    public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder,int siPost, int eiPost, int siIn, int eiIn) {
        // TODO Auto-generated method stub

        //Base case - If number of elements in the post-order is 0
        if (siPost>eiPost)
        {
            return null;
        }

        //Defining the root node for current recursion
        int rootData=postOrder[eiPost];
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

        //Finding root data's location in Inorder (Assuming root data exists in Inorder)
        int rootIndex=-1;
        for (int i=siIn;i<=eiIn;i++)
        {
            if (rootData==inOrder[i])
            {
                rootIndex=i;
                break;
            }
        }

        //Defining index limits for Left Subtree Inorder
        int siInLeft=siIn;
        int eiInLeft=rootIndex-1;

        //Defining the index limits for Left Subtree Preorder
        int siPostLeft=siPost;
        int leftSubTreeLength = eiInLeft - siInLeft + 1;
        int eiPostLeft=(siPostLeft)+(leftSubTreeLength-1);

        //Defining index limits for Right Subtree Inorder
        int siInRight=rootIndex+1;
        int eiInRight=eiIn;

        //Defining index limits for Right Subtree Preorder
        int siPostRight=eiPostLeft+1;
        int eiPostRight=eiPost-1;

        BinaryTreeNode<Integer> leftChild = buildTree(postOrder, inOrder, siPostLeft, eiPostLeft, siInLeft, eiInLeft);
        BinaryTreeNode<Integer> rightChild = buildTree(postOrder, inOrder, siPostRight, eiPostRight, siInRight, eiInRight);

        root.left=leftChild;
        root.right=rightChild;
        return root;
    }

    public static void insertDuplicateNode(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }

        BinaryTreeNode<Integer> newNode = new BinaryTreeNode<>(root.data);
        BinaryTreeNode<Integer> rootLeft = root.left;

        root.left = newNode;
        newNode.left = rootLeft;

        insertDuplicateNode(rootLeft);
        insertDuplicateNode(root.right);
    }

    public static void main(String[] args) {
        int inOrder[] = {4,2,5,1,3,7};
        int preOrder[] = {1,2,4,5,3,7};

        BinaryTreeNode<Integer> root = buildTree(inOrder,preOrder);
        printLevelWise(root);

        int postOrder[] = {2,9,3,6,10,5 };
        int InOrder [] = {2, 6 ,3 ,9 ,5 ,10 };
        BinaryTreeNode<Integer> rootNode = buildTrees(postOrder,InOrder);
        printLevelWise(rootNode);
    }
}
 */













/* There are two Questions
       1.For a given a Binary Tree of type integer, duplicate every node of the tree and attach it to the left of itself.
       2.Minimum and Maximum in the Binary Tree
 */
/*

package binaryTree;

import java.util.ArrayList;
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

class BinaryTreeUse{

    public static BinaryTreeNode<Integer> takeInputLevelWise(){
        Scanner sc = new Scanner(System.in);
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        System.out.println("Enter root data");
        int rootData = sc.nextInt();

        if(rootData == -1){
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        pendingNodes.add(root);

        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> front = pendingNodes.poll();
            System.out.println("Enter left child of "+ front.data);
            int leftChild = sc.nextInt();
            if (leftChild != -1){
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(leftChild);
                pendingNodes.add(child);
                front.left = child;
            }

            System.out.println("Enter right child of "+ front.data);
            int rightChild = sc.nextInt();
            if (rightChild != -1){
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightChild);
                pendingNodes.add(child);
                front.right = child;
            }
        }
        return root;

    }

    public static void printLevelWise(BinaryTreeNode<Integer> root){
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        pendingNodes.add(root);
        pendingNodes.add(null);

        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> frontNode = pendingNodes.poll();

            if(frontNode == null){
                System.out.println();

                if (!pendingNodes.isEmpty()){
                    pendingNodes.add(null);
                }
            }
            else{
                System.out.print(frontNode.data + " ");

                if(frontNode.left != null){
                    pendingNodes.add(frontNode.left);
                }
                if (frontNode.right != null){
                    pendingNodes.add(frontNode.right);
                }
            }
        }
    }

    public static void insertDuplicateNode(BinaryTreeNode<Integer> root){
        if(root == null){
            return;
        }

        BinaryTreeNode<Integer> newNode = new BinaryTreeNode<>(root.data);
        BinaryTreeNode<Integer> rootLeft = root.left;

        root.left = newNode;
        newNode.left = rootLeft;

        insertDuplicateNode(rootLeft);
        insertDuplicateNode(root.right);
    }

    static class Pair<T, U> {
        T minimum;
        U maximum;

        public Pair(T minimum, U maximum) {
            this.minimum = minimum;
            this.maximum = maximum;
        }

    }

    public static Pair<Integer,Integer> getMinAndMax(BinaryTreeNode<Integer> root){
        if(root == null){
            return new Pair<> (Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Pair<Integer,Integer> leftPair = getMinAndMax(root.left);
        Pair<Integer,Integer> rightPair = getMinAndMax(root.right);

        int minimum = Math.min(root.data, Math.min(leftPair.minimum,rightPair.minimum));
        int maximum = Math.max(root.data, Math.max(leftPair.maximum,rightPair.maximum));

        return new Pair<>(minimum,maximum);
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
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        insertDuplicateNode(root);
        printLevelWise(root);
        System.out.println(getMinAndMax(root).minimum);
        System.out.println(getMinAndMax(root).maximum);

    }
}

 */











/*
there are two question
       1. For a given Binary Tree of type integer and a number K, print out all root-to-leaf paths where the sum of all the node data along the path is equal to K.
       2. Print nodes at distance k from node
 */

/*

package binaryTree;

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

class BinaryTreeUse{

    public static BinaryTreeNode<Integer> takeInputLevelWise(){
        Scanner sc = new Scanner(System.in);
        Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<>();
        System.out.println("Enter root data");
        int rootData = sc.nextInt();

        if(rootData == -1){
            return null;
        }

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
        pendingNodes.add(root);

        while(!pendingNodes.isEmpty()){
            BinaryTreeNode<Integer> front = pendingNodes.poll();
            System.out.println("Enter left child of "+ front.data);
            int leftChild = sc.nextInt();
            if (leftChild != -1){
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(leftChild);
                pendingNodes.add(child);
                front.left = child;
            }

            System.out.println("Enter right child of "+ front.data);
            int rightChild = sc.nextInt();
            if (rightChild != -1){
                BinaryTreeNode<Integer> child = new BinaryTreeNode<>(rightChild);
                pendingNodes.add(child);
                front.right = child;
            }
        }
        return root;

    }


    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k, String path, int currSum){
        if(root == null){
            return;
        }

        if(root.left == null && root.right == null){
            currSum += root.data;
            if(currSum == k){
                System.out.println(path + root.data + " ");
            }
            return;
        }

        rootToLeafPathsSumToK(root.left, k , (path + root.data + " "), (currSum + root.data));
        rootToLeafPathsSumToK(root.right, k , (path + root.data + " "), (currSum + root.data));
    }
    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root , int k){
        String str = "";
        rootToLeafPathsSumToK(root,k,str,0);
    }


    private static int nodesAtDistanceKHelper(BinaryTreeNode<Integer> root, int target, int k) {
        if (root == null) {
            return -1;
        }
        if (root.data == target) {
            nodesAtDistanceKDown(root, k);
            return 0;
        }
        int leftD = nodesAtDistanceKHelper(root.left, target, k);
        if (leftD != -1) {
            if (leftD + 1 == k) {
                System.out.println(root.data);
            } else {
                nodesAtDistanceKDown(root.right, k - leftD - 2);
            }
            return 1 + leftD;
        }

        int rightD = nodesAtDistanceKHelper(root.right, target, k);
        if (rightD != -1) {
            if (rightD + 1 == k) {
                System.out.println(root.data);
            } else {
                nodesAtDistanceKDown(root.left, k - rightD - 2);
            }
            return 1 + rightD;
        }
        return -1;
    }
    private static void nodesAtDistanceKDown(BinaryTreeNode<Integer> root, int k) {
        if (root == null) {
            return;
        }
        if (k == 0) {
            System.out.println(root.data);
            return;
        }
        nodesAtDistanceKDown(root.left, k - 1);
        nodesAtDistanceKDown(root.right, k - 1);
    }
    public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
        nodesAtDistanceKHelper(root, node, k);
    }


    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        rootToLeafPathsSumToK(root,13);
        BinaryTreeNode<Integer> root1 = takeInputLevelWise();
        nodesAtDistanceK(root,3,1);
    }

}

*/