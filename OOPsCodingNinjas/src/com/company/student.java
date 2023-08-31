package com.company;

import java.util.Scanner;

public class student {
    String name;
    int rollnumber;

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        student s1=new student();
        s1.name="Ashu";
        s1.rollnumber=123;
        System.out.println(s1);
        student s2=new student();
        //System.out.println(student);
    }
}
