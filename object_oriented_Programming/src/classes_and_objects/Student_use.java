package classes_and_objects;

import java.util.Scanner;

public class Student_use {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student s1=new Student("ankush",15);
        s1.print();
       // s1.name="ankush";
        //s1.roll_no=123;
       // s1.setRollno(13);

        Student s2=new Student("ovnd",56);
        s2.print();
        //s2.name="ffff";
        //s2.roll_no=04;

//        System.out.println(s2.name);
//        System.out.println(s1.getRollno());
//        System.out.println(s1);


//        System.out.println(s1.numstudents); // 2
//        System.out.println(s2.numstudents); // 2
        //  System.out.println(Student.numstudents); // 2
        System.out.println(Student.getNumstudents());


    }
}
