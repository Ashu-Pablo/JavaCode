//Get keypad combination
/*

package com.company;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        ArrayList<String> words = getKPC(str);
        System.out.println(words);
    }

    static String[] codes ={".;","abc", "def", "ghi", "jkl", "mno","pqrs", "tu", "vwx", "yz"};

    public static ArrayList<String> getKPC(String str){

        if(str.length()==0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch=str.charAt(0);
        String ros=str.substring(1);

        ArrayList<String> rres=getKPC(ros);
        ArrayList<String> mres = new ArrayList<>();

        String codeforch = codes[ch - '0'];
        for(int i=0;i<codeforch.length();i++){
            char chcode = codeforch.charAt(i);

            for(String rstr : rres){
                mres.add(chcode + rstr);
            }
        }

        return mres;
    }
}

 */






//Get Stairs Paths
/*

package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> paths= getStairPaths(n);
        System.out.println(paths);
    }

    public static ArrayList<String> getStairPaths(int n){

        if(n==0){
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
        }
        else if(n<0){
            ArrayList<String> bres=new ArrayList<>();
            return bres;
        }
        ArrayList<String> path1 = getStairPaths(n-1);
        ArrayList<String> path2 = getStairPaths(n-2);
        ArrayList<String> path3 = getStairPaths(n-3);

        ArrayList<String> paths=new ArrayList<>();

        for(String path:path1){
            paths.add(1+path);
        }
        for(String path:path2){
            paths.add(2+path);
        }
        for(String path:path3){
            paths.add(3+path);
        }

        return paths;

    }
}

 */




//Get Maze path
/*

package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<String> paths = getMazePaths(1,1,n,m);
        System.out.println(paths);
    }

    public static ArrayList<String> getMazePaths(int sr,int sc,int dr,int dc){

        if(sr==dr && sc==dc){
            ArrayList<String> bres= new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();

        if(sr<dr){
            vpaths = getMazePaths(sr+1,sc,dr,dc);  //Vertical call

        }
        if(sc<dc){
            hpaths = getMazePaths(sr,sc+1,dr,dc);  //Horizontal call

        }

        ArrayList<String> paths = new ArrayList<>();

        for(String hpath:hpaths){
            paths.add("h"+ hpath);
        }

        for(String vpath:vpaths){
            paths.add("v"+ vpath);
        }

        return paths;

    }
}

 */




//Get Maze Paths with jump
/*

package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<String> paths = getMazePaths(1,1,n,m);
        System.out.println(paths);
    }

    public static ArrayList<String> getMazePaths(int sr,int sc,int dr,int dc){

        if(sr == dr && sc==dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add(" ");
            return bres;
        }

        ArrayList<String> paths = new ArrayList<>();

        //horizontal moves
        for(int h=1;h<=dc-sc;h++){
            ArrayList <String> hpaths=getMazePaths(sr,sc+h,dr,dc);
            for(String hpath:hpaths){
                paths.add("h" + h + hpath);
            }
        }

        //vertical moves
        for(int v=1;v<=dr-sr;v++){
            ArrayList <String> vpaths=getMazePaths(sr+v,sc,dr,dc);
            for(String vpath:vpaths){
                paths.add("v" + v + vpath);
            }
        }

        for(int d=1;d<=dc-sc && d<= dr-sr;d++){
            ArrayList <String> dpaths=getMazePaths(sr+d,sc+d,dr,dc);
            for(String dpath:dpaths){
                paths.add("d" + d + dpath);
            }
        }
        return paths;
    }
}

 */





//print subsequence

/*

package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        printSS(str, "");

    }
    public static void printSS(String Ques,String Ans){
        if(Ques.length()==0){
            System.out.println(Ans);
            return;
        }
        char ch=Ques.charAt(0);
        String roq= Ques.substring(1);

        printSS(roq,Ans+ch);
        printSS(roq,Ans+"");
    }
}

 */




//print keypad combination
/*
package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        printKPC(str, "");

    }
    static String[] codes ={".;","abc", "def", "ghi", "jkl", "mno","pqrs", "tu", "vwx", "yz"};

    public static void printKPC(String Ques,String Ans){
        if(Ques.length()==0){
            System.out.println(Ans);
            return;
        }
        char ch=Ques.charAt(0);
        String roq= Ques.substring(1);

        String codeforch = codes[ch-'0'];
        for(int i=0;i<codeforch.length();i++){
            char cho = codeforch.charAt(i);
            printKPC(roq,Ans+cho);
        }

    }
}

 */





// print stair paths
/*

package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        printStairPaths(n," ");

    }

    public static void printStairPaths(int n,String paths){
        if(n==0){
            System.out.println(paths);
            return;
        }
        if (n<0){
            return;
        }

        printStairPaths(n-1,paths+"1");
        printStairPaths(n-2,paths+"2");
        printStairPaths(n-3,paths+"3");

    }
}

 */





//print Maze Paths
/*

package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        printMazePaths(1,1,n,m,"");
    }

    public static void  printMazePaths(int sr,int sc,int dr,int dc,String psf){

        if (sr==dr && sc==dc){
            System.out.println(psf);
            return;
        }
        if (sr>dr || sc>dc){
            return;
        }

        printMazePaths(sr,sc+1,dr,dc,psf+"h");
        printMazePaths(sr+1,sc,dr,dc,psf+"v");

    }
}

 */





//print Maze Paths with jump
/*

package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        printMazePaths(1,1,n,m,"");
    }

    public static void  printMazePaths(int sr,int sc,int dr,int dc,String psf){

        if(sr == dr && sc==dc){
            System.out.println(psf);
            return;
        }

        //horizontal moves
        for(int h=1;h<=dc-sc;h++){
            printMazePaths(sr,sc+1,dr,dc,psf+"h"+h);
        }

        //vertical moves
        for(int v=1;v<=dr-sr;v++){
            printMazePaths(sr+1,sc,dr,dc,psf+"v"+v);
        }

        //Diagonal moves
        for(int d=1;d<=dc-sc && d<= dr-sr;d++){
            printMazePaths(sr+1,sc+1,dr,dc,psf+"d"+d);
        }

    }
}

 */





//permutations of a String
/*


package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printPermutations(str, "");

    }

    public static void printPermutations(String Ques, String Asf) {

        if(Ques.length()==0){
            System.out.println(Asf);
            return;
        }
        for (int i = 0; i < Ques.length(); i++) {
            char ch = Ques.charAt(i);
            String QLPart = Ques.substring(0, i);
            String QRPart = Ques.substring(i + 1);
            String roq = QLPart + QRPart;
            printPermutations(roq, Asf + ch);
        }
    }
}

 */





//Target sum subsets
/*

package com.company;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int target=sc.nextInt();
        printTargetSumSubsets(arr,0,"",0,target);

    }

    public static void printTargetSumSubsets(int []arr,int idx,String set,int sos,int target){


        if(idx==arr.length){
            if(sos==target){
                System.out.println(set+".");

            }
            return;
        }
        printTargetSumSubsets(arr,idx+1,set+arr[idx]+",",sos+arr[idx],target);
        printTargetSumSubsets(arr,idx+1,set,sos,target);
    }
}

 */




package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][] chess = new int[n][n];
        printNQueens(chess,"",0);
    }

    public static void printNQueens(int[][] chess,String qsf,int row){

        if(row == chess.length){
            System.out.println(qsf+".");
            return;
        }

        for(int col=0;col<chess.length;col++) {
            if (isItSafePlaceForTheQueen(chess, row, col) == true) {
                chess[row][col] = 1;
                printNQueens(chess, qsf + row + "-" + col + ",", row + 1);
                chess[row][col] = 0;
            }
        }
    }

    public static boolean isItSafePlaceForTheQueen(int [][] chess,int row,int col){
        for(int i = row-1,j=col;i>=0;i--){
            if(chess[i][j] == 1){
                return false;
            }
        }

        for(int i = row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(chess[i][j] == 1){
                return false;
            }
        }

        for(int i = row-1,j=col+1; i>=0 && j<chess.length;i--,j++){
            if(chess[i][j] == 1){
                return false;
            }
        }
        return true;
    }
}