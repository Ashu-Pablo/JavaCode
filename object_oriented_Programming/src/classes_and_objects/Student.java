
package classes_and_objects;
import java.util.Scanner;
public class Student {
    public String name;
    //if a datatype is default (ie not public and not private) then it is access only in the same package.
    //if a datatype is private then it is only access in same class.
    // if datatype is public then it is access anywhere

    //    private final int roll_no = 0;
    private final int roll_no ;//Final Keyword


    //static int numstudents;
    private static int numstudents;
    public static int getNumstudents(){
        return numstudents;
    }

    public Student(){
        roll_no=100;
    }

    //Constructor
//    public Student(String n,int rn){
//        name=n;
//        roll_no=rn;
//    }

    //uses of this keyword
    //this keyword is used to create same name of datatype and data variable;
    public Student(String name,int rollno){
        System.out.println(this);



       this.name/* datatype */=name /* variable*/ ;

        this.roll_no=rollno;
        numstudents++;
    }

//    public void setRollno(int rn){
//        if(rn<=0){
//            return;
//        }
//        roll_no=rn;
//    }
//

    public int getRollno(){
        return roll_no;
    }



    public void print(){
        System.out.println(name+","+roll_no);
    }
}

