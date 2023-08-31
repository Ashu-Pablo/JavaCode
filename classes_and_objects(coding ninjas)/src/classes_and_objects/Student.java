package classes_and_objects;

import java.util.Scanner;

public class Student {
    public String name;
    //final data members can be initialized as soon as they are declared
    private final int rollNumber;

    private static int numStudents;

    public static int getNumStudents(){
        return numStudents;
    }

    //Constructor
    /*
    public Student(String s,int rn){
        name =s;
        rollNumber =rn;
    }

     */

    //Constructor
    /*
    public Student(String n){
        name =n;
    }
     */


    /*
    public void setRollNumber(int rn){
        if(rollNumber<=0){
            return;
        }
        rollNumber=rn;
    }

     */

    public Student(String name,int rollNumber){
//        System.out.println(this);
        this.name =name;
        this.rollNumber=rollNumber;
        numStudents++;
    }


    public int getRollNumber(){
        return rollNumber;
    }



    public void print(){
        System.out.println(name +":"+rollNumber);
    }


/*
class StudentUse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name ="om";
        s1.rollNumber=5;
        System.out.println(s1.name);
        System.out.println(s1.rollNumber);

        s2.name ="dixit";
        s2.rollNumber=3;
        System.out.println(s2.name);
        System.out.println(s2.rollNumber);

        //System.out.println(s1);
    }

 */
}

