//package oops;
//
//class Main{
//     int a ;
//     String b ;
//
//     private Main(){
//         a = 30;
//         b = "vmkfn";
//     }
//
//     void show(){
//        System.out.println(a+" "+b);
//    }
//
//    public static void main(String[] args) {
//        Main d = new Main();
//        d.show();
//    }
//}

//public class Main {
//
//    public static void main(String[] args) {
//	// write your code here
//        Demo obj = new Demo();
//        obj.show();
//    }
//}









package oops;
import java.util.Scanner;

public class CircleEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the x-coordinate of the center: ");
        double a = sc.nextDouble();

        System.out.print("Enter the y-coordinate of the center: ");
        double b = sc.nextDouble();

        System.out.print("Enter the radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter the value of y: ");
        double y = sc.nextDouble();

        double discriminant = Math.pow(r, 2) - Math.pow(y - b, 2);
        if (discriminant < 0) {
            System.out.println("No real solutions.");
        } else {
            double x1 = Math.sqrt(discriminant) + a;
            double x2 = a - Math.sqrt(discriminant);   

            System.out.println("The solutions are:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
































