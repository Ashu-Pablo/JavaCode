//KNOW ABOUT DATE
/*
package com.company;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;

public class Main{
    public static void main(String[] args){
        System.out.println(java.time.LocalDate.now());
    }
}
*/

//KNOW ABOUT TIME
/*
package com.company;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main{
    public static void main(String[] args){
        //DateTimeFormatter dtf=DateTimeFormatter.ofPattern("xxxx/kk/ll jj:oo:pp");
        //LocalDateTime now=LocalDateTime.now();
        System.out.println(java.time.LocalDateTime.now());
        //System.out.println(dtf.format(now));
    }
}
*/


//KNOW ABOUT DATE AND TIME
/*
package com.company;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class Main {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
  }

 */



//CALCULATE NPR
/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int nfact=1;
        for(int i=1;i<=n;i++){
            nfact *=i;
        }

        int nmrfact=1;
        for(int i=1;i<=n-r;i++){
            nmrfact *=i;
        }
        int npr=nfact/nmrfact;

        System.out.println(n+"p"+r+"="+npr);
    }
}
*/



//CALCULATE nCr
/*
package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int nfact=1;
        for(int i=1;i<=n;i++){
            nfact *=i;
        }

        int nmrfact=1;
        for(int i=1;i<=n-r;i++){
            nmrfact *=i;
        }

        int rfact=1;
        for(int i=1;i<=r;i++){
            rfact *=i;
        }
        int nCr=nfact/((nmrfact)*(rfact));
        //System.out.println(nfact);
        //System.out.println(rfact);
        //System.out.println(nmrfact);

        System.out.println(n+"C"+r+"="+nCr);
    }
}

 */

/*
package com.company;
import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static  double area(double r,double h){
        double pi=3.14;
        double area=(pi*r*r)+ (2*pi*r*h);
        System.out.println(area);
        return area;


    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        float  radius = sc.nextInt();
        float height = sc.nextInt();
        area(radius, height);
        System.out.println();


    }
}

 */


package com.company;
import java.util.Scanner;
import java.lang.Math;


public class Main{
    public static  double area(double r,double h){
        double pi=3.14;
        double area=(pi*r*r)+ (2*pi*r*h);
        System.out.println("area is:");
        System.out.println(area);
        return area;

    }
    public static double torque(double m1, double m2){
        double g=9.81;
        double torque=(2*m1*m2*g)/(m1+m2);
        System.out.println("torque =");
        System.out.println(torque);
        return torque;
    }

    public static double energy(double m,double a,double h,double v){
        double energy=m*((a*h)+(v*v)/2);
        System.out.println("energy is:");
        System.out.println(energy);
        return energy;
    }
   /* public static double side (double a,double b,double x){
        x=45.0;
        double cos=Math.cos(x);
        double side =sqrt(a*a+b*b-2*a*b*cos);
        return side;
    }

    */

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        float  o = sc.nextInt();
        float p= sc.nextInt();
        float  ma = sc.nextInt();
        float ac= sc.nextInt();
        float ve= sc.nextInt();
        /*float a=sc.nextInt();
        float b=sc.nextInt();
        float cos=Math.cos(x);
        */

        area(o,p);
        torque(o,p);
        energy(ma,ac,o,ve);
    }
}