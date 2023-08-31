//Duplicates Bracket
/*

package stacks;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> st = new Stack<>();
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if (ch == ')'){
                if (st.peek() == '(') {
                    System.out.println("true");
                    return;
                }
                else{
                    while (st.peek() != '(') {
                        st.pop();
                    }
                    st.pop();
                }
            }
            else{
                st.push(ch);
            }
        }
        System.out.println(false);
    }
}

 */












// Balanced Brackets
/*

package stacks;
import java.util.AbstractCollection;
import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> st = new Stack<>();
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch =='{' || ch == '['){
                st.push(ch);
            }
            else if (ch == ')'){
                boolean val = handelClosing(st,'(');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            }

            else if (ch == '}'){
                boolean val = handelClosing(st,'{');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            }

            else if(ch == ']'){
                boolean val = handelClosing(st,'[');
                if(val == false){
                    System.out.println(val);
                    return;
                }
            }

        }
        if(st.size() == 0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

    public static boolean handelClosing(Stack<Character> st, char corresoch){
        if(st.size() == 0){
//            System.out.println(false);
            return false;
        }
        else if(st.peek() != corresoch){
//            System.out.println(false);
            return false;
        }
        else{
            st.pop();
            return true;
        }
    }
}

 */












