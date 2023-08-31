//Implementation of trie Node

/*

package trie;

class TrieNode{
    char data;
    boolean isTerminating;
    TrieNode children[];
    int childCount;


    public TrieNode(char data){
        this.data = data;
        isTerminating = false;
        children = new TrieNode[26];
        childCount = 0;
    }
}


public class Trie {

    private static TrieNode root;

    public Trie(){
        root = new TrieNode('\0');
    }


    public void add(String word){
        add(root, word);
    }
    private void add(TrieNode root, String word){

        if(word.length() == 0){
            root.isTerminating = true;
            return;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        System.out.println(child);
        if(child == null){
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;
        }

        add(child,word.substring(1));
    }



    public boolean search(String word){
        return search(root,word);
    }
    public boolean search(TrieNode root,String word){
        if(word.length() == 0){
             return root.isTerminating;
        }

        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if(child == null){
            return false;
        }

        return search(child , word.substring(1));
    }



    public void remove(String word){
        remove(root , word);
    }

    public void remove(TrieNode root , String word){
        if(word.length() == 0){
            root.isTerminating = false;
            return;
        }

        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if(child == null ){
            return ;
        }

        remove(child , word.substring(1));

        // we can remove child node only if it is non-terminating and its no. of children is 0

        if(!child.isTerminating && child.childCount == 0){
            root.children[childIndex] = null;
            child = null;
             root.childCount --;
        }

//        if(!child.isTerminating){
//            int numChild = 0;
//            for(int i = 0;i<26;i++){
//                if(child.children[i] != null){
//                    numChild ++;
//                }
//            }
//
//            if(numChild == 0){
//                // we can delete it
//                root.children[childIndex] = null;
//                child = null;
//                root.childCount --;
//            }
//        }
    }


    public static void main(String[] args) {
	// write your code here
        Trie t = new Trie();
        t.add("this");
        t.add("news");
        System.out.println(t.search("new"));
    }
}


 */









// Count number of words in trie
/*

package trie;

class TrieNode{
    char data;
    boolean isTerminating;
    TrieNode children[];
    int childCount;
    public TrieNode(char data) {
        this.data = data;
        isTerminating = false;
        children = new TrieNode[26];
        childCount = 0;
    }
}
public class Trie {
    private TrieNode root;
    private int numWords;

    public Trie() {
        root = new TrieNode('\0');
        numWords = 0;
    }

    public void remove(String word){
        if(remove(root, word)) {
            numWords--;
        }
    }
    private boolean remove(TrieNode root, String word) {
        if(word.length() == 0){
            if(root.isTerminating) {
                root.isTerminating = false;
                return true;
            }
            else {
                return false;
            }
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if(child == null){
            return false;
        }
        boolean ans = remove(child, word.substring(1));
// We can remove child node only if it is non-terminating and its number of children are 0
        if(!child.isTerminating && child.childCount == 0){
            root.children[childIndex] = null;
            child = null;
            root.childCount--;
        }
        return ans;
    }


    public void add(String word){
        if(add(root, word)) {
            numWords++;
        }
    }
    private boolean add(TrieNode root, String word){
        if(word.length() == 0){

            if(root.isTerminating) {
                return false;
            }
            else {
                root.isTerminating = true;
                return true;
            }
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if(child == null){
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;
        }
        return add(child, word.substring(1));
    }


    public int countWords() {
        return numWords;
    }


    public static void main(String[] args) {
        // write your code here
        Trie t = new Trie();
        t.add("this");
        t.add("news");
        t.remove("thi");
        System.out.println(t.numWords);
    }
}

 */









package trie;

import java.util.ArrayList;
class TrieNode{
    char data;
    boolean isTerminating;
    TrieNode children[];
    int childCount;

    public TrieNode(char data) {
        this.data = data;
        isTerminating = false;
        children = new TrieNode[26];
        childCount = 0;
    }
}
public class Trie {
    private TrieNode root;
    public int count;

    public Trie() {
        root = new TrieNode('\0');
    }

    public boolean search(String word){
        return search(root, word);
    }
    private boolean search(TrieNode root, String word) {
        if(word.length() == 0){
            return true;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if(child == null){
            return false;
        }
        return search(child, word.substring(1));
    }

    private void add(TrieNode root, String word){
        if(word.length() == 0){
            root.isTerminating = true;
            return;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if(child == null){
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;
        }
        add(child, word.substring(1));
    }
    public void add(String word){
        add(root, word);
    }


    public boolean patternMatching(ArrayList<String> vect, String pattern) {
        for (int i = 0; i < vect.size(); i++) {
            String word = vect.get(i);
            for (int j = 0; j < word.length(); j++) {
                add(word.substring(j));
            }
        }
        return search(pattern);
    }


    public String reverse(String word) {

        String xString="";
        for(int i=word.length()-1;i>=0;i--) {
            xString+=word.charAt(i);
        }
        return xString;

    }
    public boolean isPalindromePair(ArrayList<String> words) {
        //	System.out.println(words.size());
        for(int i=0;i<words.size();i++) {
            System.out.println(words.get(i));
            String str = reverse(words.get(i));


            Trie suffixTrie= new Trie();
            for(int j=0;j<str.length();j++) {
                suffixTrie.add(str.substring(j));
            }
            for(String word : words) {
                if(suffixTrie.search(word)) {
                    return true;
                }
            }


        }
        return false;

    }

    public void main(String[] args) {
        Trie t = new Trie();
    }
}

