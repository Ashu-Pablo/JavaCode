// Priority Queue Implementation

// This program is also called Heap sort
// Time Complexity of Heap sort is O(nlogn)
// Space Complexity of Heap sort is O(n)

/*
package pq;

import java.util.ArrayList;

 class PriorityQueue {
    private ArrayList<Integer> heap;

    public PriorityQueue(){
        heap = new ArrayList<>();
    }

    boolean isEmpty(){
        return heap.size() == 0;
    }

    int size(){
        return heap.size();
    }

    int getMin() throws PriorityQueueException {
        if (isEmpty()){
            throw new PriorityQueueException();
        }
        return heap.get(0);
    }


    void insert(int element){
        heap.add(element);
        int childIndex = heap.size() - 1;
        int parentIndex = (childIndex - 1)/2;

        while(childIndex > 0) {
            if (heap.get(childIndex) < heap.get(parentIndex)) {
                int temp = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                childIndex = parentIndex;
                parentIndex = (childIndex - 1)/2;
            }
            else{
                return;
            }
        }
    }

    int removeMin() throws PriorityQueueException {
        if (isEmpty()) {
            throw new PriorityQueueException();
        }

        int temp = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        int index = 0;
        int minIndex = 0;
        int leftChildIndex = 1;
        int rightChildIndex = 2;

        while (leftChildIndex < heap.size()) {
            if (heap.get(leftChildIndex) < heap.get(minIndex)) {
                minIndex = leftChildIndex;
            }
            if ( rightChildIndex < heap.size() && heap.get(rightChildIndex) < heap.get(minIndex)) {
                minIndex = rightChildIndex;
            }

            if (minIndex == index) {
                break;
            }
            else {
                int temp1 = heap.get(index);
                heap.set(index, heap.get(minIndex));
                heap.set(minIndex, temp1);
                index = minIndex;
                leftChildIndex = 2 * index + 1 ; // leftChildIndex = 2 * minIndex + 1 ;
                rightChildIndex = 2 * index + 2; // rightChildIndex = 2 * minIndex + 1 ;
            }
        }
        return temp;
    }

}

class PriorityQueueException extends Exception{

}

public class PriorityQueueUse{
    public static void main(String[] args) throws PriorityQueueException {
        PriorityQueue pq = new PriorityQueue();
        int arr[] = {5,1,9,2,0};
        for (int i=0;i<arr.length ;i++){
            pq.insert(arr[i]);
        }

        while(!pq.isEmpty()){
            System.out.print(pq.removeMin() + " ");
        }
        System.out.println();
    }
}

 */








/*


package pq;

import java.util.ArrayList;

class PriorityQueue {

//     * Time complexity:
//     * O(log(N)) [for insert and removeMax functions]
//     * O(1) [for all other functions]
//     * Space complexity : O(1) [for all functions]
//     *
//     * where N is the size of the Priority Queue

    private ArrayList<Integer> heap;

    public PriorityQueue() {
        heap = new ArrayList<Integer>();
    }

    boolean isEmpty() {
        return heap.size() == 0;
    }

    int getSize() {
        return heap.size();
    }

    int getMax() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        return heap.get(0);
    }

    void insert(int element) {
        heap.add(element);
        int childIndex = heap.size() - 1;
        int parentIndex = (childIndex - 1) / 2;
        while (childIndex > 0) {
            if (heap.get(childIndex) > heap.get(parentIndex)) {
                int temp = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            } else {
                return;
            }
        }
    }

    int removeMax() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        int ans = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        int index = 0;
        int maxIndex = index;
        int leftChildIndex = 1;
        int rightChildIndex = 2;

        while (leftChildIndex < heap.size()) {
            if (heap.get(leftChildIndex) > heap.get(maxIndex)) {
                maxIndex = leftChildIndex;
            }

            if (rightChildIndex < heap.size() && heap.get(rightChildIndex) > heap.get(maxIndex)) {
                maxIndex = rightChildIndex;
            }

            if (maxIndex == index) {
                break;
            } else {
                int temp = heap.get(index);
                heap.set(index, heap.get(maxIndex));
                heap.set(maxIndex, temp);
                index = maxIndex;
                leftChildIndex = 2 * index + 1;
                rightChildIndex = 2 * index + 2;
            }

        }
        return ans;
    }
}

public class PriorityQueueUse{
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        int arr[] = {5,1,9,2,0};
        for (int i=0;i<arr.length ;i++){
            pq.insert(arr[i]);
        }

        System.out.println(pq.getSize());
        System.out.println(pq.getMax());
        while(!pq.isEmpty()){
            System.out.print(pq.removeMax() + " ");
        }

        System.out.println();
        System.out.println(pq.getSize());
        System.out.println(pq.getMax());
    }
}

*/












// Given an integer array of size N. Sort this array (in decreasing order) using heap sort.
// Note: Space complexity should be O(1).

/*
package pq;

public class Main{

    private static void insertIntoVirtualHeap(int[] arr, int i) {
        int childIndex = i;
        int parentIndex = (childIndex - 1) / 2;
        while(childIndex > 0){
            if(arr[childIndex] < arr[parentIndex] ){
                int temp = arr[childIndex];
                arr[childIndex] = arr[parentIndex];
                arr[parentIndex] = temp;
                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            }else{
                return;
            }
        }

    }

    private static int removeMinFromVirtualHeap(int[] arr, int heapSize) {

        int temp = arr[0];
        arr[0] = arr[heapSize - 1];
        heapSize--;
        int index = 0;
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;

        while(leftChildIndex < heapSize){

            int minIndex = index;
            if(arr[leftChildIndex] < arr[minIndex]){
                minIndex = leftChildIndex;
            }
            if(rightChildIndex < heapSize && arr[rightChildIndex] < arr[minIndex]){
                minIndex = rightChildIndex;
            }
            if(minIndex != index){
                int temp1 = arr[index];
                arr[index] = arr[minIndex];
                arr[minIndex]  = temp1;
                index = minIndex;
                leftChildIndex = 2 * index + 1;
                rightChildIndex = 2 * index + 2;
            }else{
                break;
            }
        }
        return temp;
    }


    // 2nd METHOD OF HEAP SORT WITH O(1) SPACE COMPLEXITY
/*
    public static void inPlaceHeapSort(int arr[]) {
        // Build Heap
        for (int i = 1; i < arr.length; i++) {
            int childIndex = i;
            int parentIndex = (childIndex - 1) / 2;
            while (childIndex > 0) {
                if (arr[childIndex] > arr[parentIndex]) {
                    break;
                }
                int temp = arr[childIndex];
                arr[childIndex] = arr[parentIndex];
                arr[parentIndex] = temp;
                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            }
        }

        // Remove min
        for (int i = arr.length - 1; i >= 0; i--) {
            int min = arr[0];
            arr[0] = arr[i];
            arr[i] = min;
            int parentIndex = 0;
            int leftChildIndex = 2 * parentIndex + 1;
            int rightChildIndex = leftChildIndex + 1;
            while (parentIndex < i) {
                int minIndex = parentIndex;
                int minValue = arr[minIndex];
                if (leftChildIndex < i) {
                    int leftChild = arr[leftChildIndex];
                    if (leftChild < minValue) {
                        minIndex = leftChildIndex;
                        minValue = arr[minIndex];
                    }
                }
                if (rightChildIndex < i) {
                    int rightChild = arr[rightChildIndex];
                    if (rightChild < minValue) {
                        minIndex = rightChildIndex;
                        minValue = arr[minIndex];
                    }
                }
                if (parentIndex == minIndex) {
                    break;
                } else {
                    arr[minIndex] = arr[parentIndex];
                    arr[parentIndex] = minValue;
                }
                parentIndex = minIndex;
                leftChildIndex = 2 * parentIndex + 1;
                rightChildIndex = leftChildIndex + 1;
            }
        }
    }

 */
/*
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int arr[] = {5,1,9,2,0,6};
        for(int i = 0; i < arr.length; i++){
            insertIntoVirtualHeap(arr,i);
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < arr.length; i++){
            arr[arr.length - 1 - i] = removeMinFromVirtualHeap(arr, arr.length - i);
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}


 */











// K sorted array


package pq;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Main {

    public static void sortKSorted(int []arr ,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int  i =0;
        for( ;i < k; i++){
            pq.add(arr[i]);
        }

        for (; i< arr.length;i++){
            arr[i-k]= pq.remove();
            pq.add(arr[i]);
        }

        for(int j= arr.length -k; j< arr.length; j++){
            arr[j] =pq.remove();
        }

    }



    public static void main(String[] args) {

        int arr[] = {2,4,1,9,6,8};
        int k = 3;
        sortKSorted(arr,k);
        for (int i=0;i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }



        // In java there is already exist a PriorityQueue class exist
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int arr1[] = {9,1,0,4,7,3};
        for(int i=0;i<arr1.length;i++){
            pq.add(arr1[i]);
        }

       System.out.println(pq.element());

        while(! pq.isEmpty()){
            System.out.print(pq.remove()+" ");
        }
    }
}





/*


package pq;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;


class MinPQComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        // TODO Auto-generated method stub
        if(o1 < o2){
            return -1;
        }else if(o1 > o2){
            return 1;
        }
        return 0;
    }

}

class MaxPQComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        // TODO Auto-generated method stub
        if(o1 < o2){
            return 1;
        }else if(o1 > o2){
            return -1;
        }
        return 0;
    }

}

class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        if(o1.length() < o2.length()){
            return 1;
        }else if(o1.length() > o2.length()){
            return -1;
        }else{
            return 0;
        }
    }

}

public class PriorityQueueUse {

    private static void insertIntoVirtualHeap(int[] arr, int i) {
        int childIndex = i;
        int parentIndex = (childIndex - 1) / 2;
        while(childIndex > 0){
            if(arr[childIndex] < arr[parentIndex] ){ // compare(o1, o2) < 0
                int temp = arr[childIndex];
                arr[childIndex] = arr[parentIndex];
                arr[parentIndex] = temp;
                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            }else{
                return;
            }
        }

    }

    private static int removeMinFromVirtualHeap(int[] arr, int heapSize) {

        int temp = arr[0];
        arr[0] = arr[heapSize - 1];
        heapSize--;
        int index = 0;
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;

        while(leftChildIndex < heapSize){

            int minIndex = index;
            if(arr[leftChildIndex] < arr[minIndex]){
                minIndex = leftChildIndex;
            }
            if(rightChildIndex < heapSize && arr[rightChildIndex] < arr[minIndex]){
                minIndex = rightChildIndex;
            }
            if(minIndex != index){
                int temp1 = arr[index];
                arr[index] = arr[minIndex];
                arr[minIndex]  = temp1;
                index = minIndex;
                leftChildIndex = 2 * index + 1;
                rightChildIndex = 2 * index + 2;
            }else{
                break;
            }
        }
        return temp;
    }

    public static void sortKSorted(int arr[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0;
        for ( ; i < k; i++){
            pq.add(arr[i]);
        }

        for(; i < arr.length; i++){
            arr[i - k] = pq.remove();
            pq.add(arr[i]);
        }

        for(int j = arr.length - k; j < arr.length; j++){
            arr[j] = pq.remove();
        }
    }

    public static void main(String[] args) {

        String arr[] = {"this", "at", "a", "their", "queues"};
        StringLengthComparator stringComparator = new StringLengthComparator();
        PriorityQueue<String> pq = new PriorityQueue<>(stringComparator);
//		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        //MinPQComparator minComparator = new MinPQComparator();
//		MaxPQComparator maxPQComparator = new MaxPQComparator();
//		PriorityQueue<Integer> pq = new PriorityQueue<>(maxPQComparator);

        //	int arr[] = {9,1,0,4,7,3};
        for(int i = 0; i < arr.length; i++){
            pq.add(arr[i]);
        }

        //	System.out.println(pq.element());
        while(! pq.isEmpty()){
            System.out.print(pq.remove() + " ");
        }
    }
}


 */