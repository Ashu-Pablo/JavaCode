/*
package oops;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        // just declaring
        Student kunal = new Student();
        kunal.rno = 10;
        kunal.name = "Om";
//        kunal.marks = 58.4f;
        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

    }
    // create a class
    static class Student{
        int rno;
        String name;
        float marks= 50;
    }
}

 */

/*
package oops;

import java.util.Scanner;

public class Main {
    static class StackUsingArray {
        int[] data; // Dynamic array created serving as stack
        int nextIndex;// To keep the track of current top index
        int capacity; // To keep the track of total size of stack

        public StackUsingArray(int totalSize) { //Constructor
            data = new int[totalSize];
            nextIndex = 0;
            capacity = totalSize;
        }

        public int size() {
            return nextIndex;
        }

        public boolean isEmpty() {
            return nextIndex == 0;
        }

        // insert element
        public void push(int element) {
            if (nextIndex == capacity) {
                System.out.println("Stack full");
                return;
            }
            data[nextIndex] = element;
            nextIndex++;
        }

        // delete element
        public int pop() {
            //Before deletion check for empty to prevent underflow
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return Integer.MIN_VALUE;
            }
            nextIndex--; //Conditioned satisfied so deleted
            return data[nextIndex];
        }

        //to return the top element of the stack
        public int top() {
            if (isEmpty()) { // checked for empty stack
                System.out.println("Stack is empty");
                return Integer.MIN_VALUE;
            }
            return data[nextIndex - 1];
        }

    }

    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        StackUsingArray ans = new StackUsingArray(size);
        ans.push(5);
        ans.pop();
    }



}

 */




package oops;

import java.util.*;
//abstract class
abstract class Shapes
{
    public double circle(int r)
    {
        double area = (22*r*r)/7;
        return area;
    }

    abstract double triangle(int b, int h);
}

class RightTriangle extends Shapes
{

    double triangle(int b, int h)
    {
        double area = b*h/2;
        return area;
    }
}

class EquilateralTriangle extends Shapes
{
    double triangle(int b, int h)
    {
        double area = 1.732*b*b/4;
        return area;
    }
}
public class Main
{
    public static void main(String args[])
    {
        Shapes a;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base and height of the triangle ");
        int base = sc.nextInt();
        int height = sc.nextInt();
        a = new RightTriangle();
        System.out.println("Area of right triangle is "+a.triangle(base,height));

        a = new RightTriangle();
        System.out.println("Enter the radius of the circle ");
        int radius = sc.nextInt();
        System.out.println("Area of circle is "+a.circle(radius));

        System.out.println("Enter the side of the equilateral triangle ");
        int side = sc.nextInt();
        a = new EquilateralTriangle();
        System.out.println("Area of equilateral triangle is "+a.triangle(side,side));
    }
}