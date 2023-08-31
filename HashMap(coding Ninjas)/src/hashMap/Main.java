/*

package hashMap;
import java.util.HashMap;
import java.util.Set;

class MapUse{
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // insert
        map.put("abc", 1);
        map.put("dbjc", 2);
        map.put("abc11", 1);
        map.put("dbjc", 2);

        System.out.println("size = "+map.size());

        // check Presence
        if(map.containsKey("abc")){
            System.out.println("Has abc");
        }
        if (map.containsKey("abc1")){
            System.out.println("Has abc1");
        }

        if(map.containsValue(2)){
            System.out.println("has 2 as value");
        }

        // get Value
        int v =0;
        if(map.containsKey("abc1")){
            v = map.get("abc1");
        }
        System.out.println(v);

        // remove
        int s = map.remove("abc");
        System.out.println(s);


        // iterate
        Set<String> keys = map.keySet();
        for (String str: keys) {
            System.out.println(str);
        }
    }
}

 */








/*

package hashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static ArrayList<Integer> removeDuplicates(int a[]) {
        ArrayList<Integer> output = new ArrayList<>();
        HashMap<Integer, Boolean> seen = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (seen.containsKey(a[i])) {
                continue;
            }
            output.add(a[i]);
            seen.put(a[i], true);

        }
        return output;

    }

    public static void main(String[] args) {
        int a[] = {1,3,2,4,1,2,2,2,10000,3,2};
        ArrayList<Integer> output = removeDuplicates(a);
        for (int i = 0; i < output.size(); i++) {
            System.out.println(output.get(i));
        }
    }

}

 */




// Implementation of hash Map
/*

package hashMap;

import java.util.ArrayList;

class MapNode<K,V>{
    K key;
    V value;
    MapNode<K,V> next;

    public MapNode(K key,V value) {
        this.key = key;
        this.value = value;
    }

}

class Map<K,V>{
    ArrayList<MapNode<K,V>> buckets;
    int size;
    int numBuckets;

    public Map(){
        numBuckets = 20;
        buckets = new ArrayList<>();
        for(int i=0;i<20;i++){
            buckets.add(null);
        }
    }


    private int getBucketIndex(K key){
        int hashCode = key.hashCode();
        return hashCode % numBuckets;
    }

    public int size() {
        return size;
    }

    public void insert(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> head = buckets.get(bucketIndex);
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        head = buckets.get(bucketIndex);
        MapNode<K, V> newElementNode = new MapNode<K, V>(key , value);
        size++;
        newElementNode.next = head;
        buckets.set(bucketIndex, newElementNode);
        double loadFactor = (1.0*size)/numBuckets;
        if (loadFactor > 0.7) {
            rehash();
        }
    }

    private void rehash() {
        System.out.println("Rehashing: buckets" + numBuckets + " size " + size);
        ArrayList<MapNode<K, V>> temp = buckets;
        buckets = new ArrayList<>();
        for (int i = 0; i < 2*numBuckets; i++) {
            buckets.add(null);
        }
        size = 0;
        numBuckets *= 2;
        for (int i = 0; i < temp.size(); i++) {
            MapNode<K, V> head = temp.get(i);
            while (head != null) {
                K key = head.key;
                V value = head.value;
                insert(key, value);
                head = head.next;
            }
        }
    }

    public V removeKey(K key) {
        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> head = buckets.get(bucketIndex);
        MapNode<K, V> prev = null;
        while (head != null) {
            if (head.key.equals(key)) {
                size--;
                if (prev == null) {
                    buckets.set(bucketIndex, head.next);
                } else {
                    prev.next = head.next;
                }
                return head.value;
            }
            prev = head;
            head = head.next;
        }
        return null;
    }

    public V getValue(K key) {
        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> head = buckets.get(bucketIndex);
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public double loadFactor() {
        return (1.0 * size)/numBuckets;
    }

}

class OurMapUse {

    public static void main(String[] args) {
        Map<String, Integer> map = new Map<>();
        for (int i = 0; i < 20; i++) {
            map.insert("abc" + i, 1 + i);
            System.out.println("i = " +  i + " lf = " + map.loadFactor());
        }

        map.removeKey("abc3");
        map.removeKey("abc7");

        for (int i = 0; i < 20; i++) {
            System.out.println("abc" + i + ":" + map.getValue("abc" + i));
        }
    }

}


 */




package hashMap;

import java.util.HashMap;

public class Main{
    public static void printIntersection(int arr1[] , int arr2[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i < arr1.length ;i++){
            if(map.containsKey(arr1[i])){
                int value = map.get(arr1[i]);
                map.put(arr1[i],value + 1);
            }else{
                map.put(arr1[i],1);
            }
        }

        for (int i=0; i <arr2.length ;i++){
            if(map.containsKey(arr2[i])){
                int frequency  = map.get(arr2[i]);
                if(frequency > 0){
                    System.out.print(arr2[i] + " ");
                    map.put(arr2[i],frequency-1);
                }
            }
        }

    }

    public static void main(String args[]){
        int arr1[] = {1,4,5,2,2,3,6,5,3,2};
        int arr2[] = {0,2,3,2,6,6,5,1};

        printIntersection(arr1,arr2);
    }
}