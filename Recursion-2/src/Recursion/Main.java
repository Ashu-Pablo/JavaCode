//remove x from the string
/*
package Recursion;

public class Main {

    public static String removeX(String str){
        if(str.length()==0){
            return str;
        }
        String ans="";
        if(str.charAt(0)!='x'){
            ans = ans + str.charAt(0);
        }

        String smallAns = removeX(str.substring(1));
        return ans+smallAns;
    }

    public static void main(String[] args) {
	// write your code here
        String str ="xxdgxxffsx";
        System.out.println(removeX(str));
    }
}


 */






//Given an input string S and two characters c1 and c2, you need to replace every occurrence of character c1 with character c2 in the given string.
/*

package Recursion;

public class Main {

    public static String replaceXharacter(String str,char c1,char c2){
        if(str.length()==0){
            return str;
        }

        String ans="";
        if(str.charAt(0) == c1){
            ans =ans+c2;
        }else{
            ans = ans+ str.charAt(0);
        }

        String smallAns=replaceXharacter( str.substring(1), c1, c2);

        return ans+smallAns;
    }

    public static void main(String[] args) {
        String str = "abacd";
        char c1 = 'a';
        char c2 = 'x';
        System.out.println(replaceXharacter(str,c1,c2));
    }
}


 */






//remove consecutive duplicates
/*
package Recursion;

public class Main {

    public static String removeConsecutiveDuplicates(String str) {
        if(str.length()==1){
            return str;
        }

        String ans = "";
        if(str.charAt(0)!=str.charAt(1)){
            ans = ans + str.charAt(0);
        }

        String smallAns = removeConsecutiveDuplicates(str.substring(1));
        return ans+smallAns;
    }

    public static void main(String[] args) {
        String str = "xxxyyyzwwzz";
        System.out.println(removeConsecutiveDuplicates(str));
    }
}

 */



/*
package Recursion;

public class Main {
    public static void mergeSort(int input[]){
        mergeSortHelper(input,0, input.length-1);
    }

    public static void mergeSortHelper(int []input,int sI,int eI){
        if(sI>=eI){
            return;
        }
        int mid = (sI+eI)/2;
        // part1
        mergeSortHelper(input,sI,mid);
        //part2
        mergeSortHelper(input,mid+1,eI);
        merge(input,sI,eI);

    }

    private static void merge(int[] input,int sI,int eI){
        int mid=(sI+eI)/2;

        int ans[] = new int[eI-sI+1];
        int i=sI;
        int j=mid+1;
        int k=0;

        while (i<=mid && j<=eI){
            if(input[i]<input[j]){
                ans[k]=input[i];
                i++;
                k++;
            }
            else{
                ans[k]=input[j];
                j++;
                k++;
            }
        }

        while (i<=mid){
            ans[k]=input[i];
            i++;
            k++;
        }

        while(j<=eI){
            ans[k]=input[j];
            j++;
            k++;
        }

        for (int idx=0;idx<ans.length;idx++){
            input[sI+idx]=ans[idx];
        }
    }

    public static void main(String[] args) {
        int []arr={1,5,2,6,8,0};
        mergeSort(arr);
        //System.out.println(mergeSort(mergeSort(arr)));
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}

 */









/*
package Recursion;
import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr={1,2,3,4,5,6};
        System.out.println("batting or bowling");
        String str = sc.nextLine();
       // int run=0;
        int score=0;
        if(str.equals("batting")){
            System.out.println("Batting");

            while(true){
                int run =sc.nextInt();
                int random = arr[new Random().nextInt(arr.length)];
                if(run==random || run==100){
                    System.out.println(random);
                    System.out.println("you are out and your score is:"+score);
                    break;
                }
                else{
                    System.out.println("computers choose"+random);
                    score +=run;
                }
            }
        }

    }
}

 */





/*
package Recursion;

public class Main {

    public static void quickSort(int[] input) {
        quickSortHelper(input,0,input.length-1);

    }

    public static void quickSortHelper(int []arr,int lo,int hi){
        if(lo>hi){
            return;
        }

        int pivot = arr[hi];
        int pi =partition(arr,pivot,lo,hi);
        quickSortHelper(arr,lo,pi-1);
        quickSortHelper(arr,pi+1,hi);

    }

    public static int partition(int [] arr,int pivot,int lo,int hi){
        int i=lo;
        int j=hi;
        while(i<arr.length){
            if(arr[i]>pivot){
                i++;
            }
            else{
                swap(arr,i,j);
                i++;
                j++;
            }
        }
        return (j-i);
    }

    public static void swap(int []arr,int i,int j) {
       // System.out.println("swapping"+arr[i]+"and"+arr[j]);
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        int []arr={2,6,8,5,4,3};
       // int pivot=6;
       // partition(arr,pivot);
        quickSort(arr);

    }
}

 */






//subsequences of String
/*
package Recursion;

public class Main{

    public static String [] findSubsequences(String str){
        if(str.length()==0){
            String ans[] = {""};
            return ans;
        }

        String smallAns[]=findSubsequences(str.substring(1));
        String ans[] =new String[2*smallAns.length];

        int k=0;
        for(int i=0;i<smallAns.length;i++){
            ans[k]=smallAns[i];
            k++;
        }

        for(int i=0;i<smallAns.length;i++){
            //ans[i+smallAns.length]
            ans[k] =str.charAt(0)+ smallAns[i];
            k++;
        }

        return ans;
    }

    public static void main(String[] args) {
        String str ="xyz";
        String ans[] = findSubsequences(str);
        for (int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }

    }
}

*/







//keypad combination code
/*

package Recursion;

public class Main {
    public static String[] keypad(int n){
        int k=0;
        if(n==0){
            String []str ={""};
            return str;
        }
        String smallresult[] = keypad(n/10);
        String code = getcode(n%10);
        String[] result = new String[smallresult.length*code.length()];
        for(int i=0;i<smallresult.length;i++){
            for(int j=0;j<code.length();j++){
                result[k++]=smallresult[i]+code.charAt(j);
            }
        }
        return result;
    }
    public static String getcode(int num){
        switch (num) {
            case 1:
                return "";
            case 2:
                return "abc";
            case 3:
                return "def";
            case 4:
                return "ghi";
            case 5:
                return "jkl";
            case 6:
                return "mno";
            case 7:
                return "pqrs";
            case 8:
                return "tuv";
            case 9:
                return "wxyz";
        }
        return "";
    }

    public static void main(String[] args) {
        int n=23;
        String ans[]=keypad(n);
        for (int i=0;i< ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}

 */







//print subsequences
/*
package Recursion;

public class Main{

    public static void printSubsequences(String input,String outputSoFar){
        if(input.length()==0){
            System.out.println(outputSoFar);
            return;
        }

        //we choose not to include the first character
        printSubsequences(input.substring(1),outputSoFar);
        //we choose to include the first character
        printSubsequences(input.substring(1),outputSoFar+input.charAt(0));
    }

    public static void printSubsequences(String input){
        printSubsequences(input,"");
    }

    public static void main(String[] args) {
        printSubsequences("xyz");
    }
}

 */




/*
package Recursion;

public class Main {
    public static void printKeypad(int input){
        // Write your code here
        printKeypadHelper(input,"");
    }

    static String s[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public static void printKeypadHelper(int num,String out){
        if(num==0) {
            System.out.println(out);
            return ;
        }
        //String s[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String input =s[num%10];
        for(int i=0;i<input.length();i++){
            printKeypadHelper(num/10,input[i]+out);
        }
    }

    public static void main(String[] args) {
        int n=23;
        printKeypad(n);
    }
}

 */







package Recursion;

public class Main {
    public static int binarySearch(int input[], int element) {
        // Write your code here
        int ans = binarySearchHelper(input,element,0,input.length-1);
        return ans;
    }

    public static int binarySearchHelper(int arr[],int x,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid =(si+ei)/2;

        if(arr[mid]==x){
            return mid;
        }
        else if(arr[mid]>x){
            binarySearchHelper(arr,x,si,mid-1);

        }else{
            binarySearchHelper(arr,x,mid+1,ei);
        }
        return mid;
    }
}