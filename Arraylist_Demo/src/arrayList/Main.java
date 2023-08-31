package arrayList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // By default it takes space for 10 elements
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2= new ArrayList<>();

        list2.add("how to");
        System.out.println(list2.get(0));
        //this is used to know about the size of array
        System.out.println(list1.size());

        //this is the method to add element in array list
        list1.add(15);
        list1.add(5);
        list1.add(65);

        //this gives us "IndexOutOfBoundsException" error because the element at 4th index is not present in arraylist
        // System.out.println(list1.get(4));

        //this is used to know about the size of array
        System.out.println(list1.size());

        //this is how to get value at any index from an arraylist
        System.out.println(list1.get(2));

        //this is how to add an element into an arraylist at any index
        list1.add(2,500);
        System.out.println(list1.get(2));
        System.out.println(list1.size());

        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();

        //this is used to remove the element from an index
        list1.remove(1);
        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+" ");
        }

        System.out.println();

        //this is used to set an element at any index
        list1.set(1,103);
        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+" ");
        }

        System.out.println();
        //for each loop (used only traverse)
        for(int element:list1){
            System.out.print(element+" ");
        }

    }
}
