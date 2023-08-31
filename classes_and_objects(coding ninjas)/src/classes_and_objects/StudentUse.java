package classes_and_objects;

import java.util.Scanner;

public class StudentUse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Student s1 = new Student("dixit",5);
        Student s3 = new Student("om",9);
//        System.out.println(s1.name);
//        System.out.println(s1.getRollNumber());
        Student s2 = new Student("nath",7);

        //s1.name ="om";
        //s1.setRollNumber(5);
//        System.out.println(s1.name);
//        System.out.println(s1.getRollNumber());



        s1.print();
        s2.print();
        s3.print();

//        System.out.println(s1.numStudents);
//        System.out.println(s2.numStudents);
        //System.out.println(Student.numStudents);
        System.out.println(Student.getNumStudents());
        System.out.println(s1.name);
        //s2.name ="dixit";
        //s2.setRollNumber(3);
//        System.out.println(s2.name);
//        System.out.println(s2.getRollNumber());

        //System.out.println(s1);
    }
}
