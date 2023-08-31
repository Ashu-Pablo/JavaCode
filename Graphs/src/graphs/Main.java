// Print DFS

/*
package graphs;

import java.util.Scanner;

public class Main {

    public static void printDFSHelper (int edges[][], int sv, boolean visited[]) {
        System.out.println(sv);
        visited [sv] = true;
        int n = edges.length;
        for (int i = 0; i<n ;i++){
            if (edges[sv][i] == 1 && !visited[i]) {
                printDFSHelper(edges,i,visited);
            }
        }
    }

    public static void DFS (int edges[][]) {
        boolean visited[] = new boolean[edges.length];

        for(int i=0 ;i < edges.length;i++){
            if(!visited[i]){
//                System.out.println("not visited = "+i);
                printDFSHelper(edges,i,visited);
            }
        }

    }

    public static void main(String[] args) {
	// write your code here
        int n;
        int e;
        Scanner sc =new Scanner(System.in);
        n = sc.nextInt();
        e = sc.nextInt();
        int edges[][] = new int[n][n];
        for (int i = 0; i < e; i++){
            int fv = sc.nextInt(); // fv = first vertex
            int sv = sc.nextInt(); // sv = second vertex

            edges[fv][sv] = 1;
            edges[sv][fv] = 1;
        }

        DFS(edges);
    }
}

 */







// BFS Traversal

/*
package graphs;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;
//import java.util.*;

public class Main {

    public static void printHelperBFS(int edges[][], int sv,boolean visited[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(sv);
        visited[sv] = true;
        while(q.size()!=0){
            int front = q.remove();
            System.out.print(front+" ");
            for(int i=0; i<edges.length; i++){
                if(edges[front][i]==1 && !visited[i]){
                    q.add(i);
                    visited[i]=true;
                }
            }
        }
    }

    public static void BFS(int edges[][]){
        boolean visited[] = new boolean[edges.length];
        for(int i=0; i< edges.length; i++){
            if(!visited[i]){
                printHelperBFS(edges, i, visited);
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int V = s.nextInt();
        int E = s.nextInt();
        int edges[][] = new int[V][V];
        for(int i =0; i< E; i++){
            int fv = s.nextInt();
            int sv = s.nextInt();
            edges[fv][sv] = 1;
            edges[sv][fv] =1;
        }
        BFS(edges);
    }

}


 */









// has path exist or not in graph b/w two nodes
/*
package graphs;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Main{
    public static void hasPath(int graph[][],int start,int dest, boolean []visited){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while(q.size()!=0){
            int removedElem = q.remove();
//            System.out.println(removedElem);
            visited[removedElem] = true;
            if(removedElem == dest){
                System.out.println("True");
                return;
            }

            for (int i = 0; i < visited.length; i++) {
                if(!visited[i]){
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
        System.out.println("False");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v= sc.nextInt();
        int e= sc.nextInt();

        int graph[][]= new int[v][v];
        for (int i = 0; i < e; i++){
            int fv = sc.nextInt();
            int sv = sc.nextInt();
            graph[fv][sv] = 1;
            graph[sv][fv] = 1;
        }

        int start = sc.nextInt();
        int dest = sc.nextInt();

        boolean visited[] = new boolean[v];
        hasPath(graph,start,dest,visited);

    }
}


 */





//Find the path using DFS and print the first path that you encountered.
/*
package graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int V = s.nextInt(); //here V is the no. of vertices
        int E = s.nextInt(); //here E is the no. of edges
        int edges[][]=new int[V][V]; //we have created an adjacency matrix of v*v
        //taking input for the graph, loop through the edges
        for(int i=0;i<E;i++){
            int sv=s.nextInt();
            int ev=s.nextInt();

            edges[sv][ev]=1; //this works only in a undirected graph
            edges[ev][sv]=1;
        }

        int V1=s.nextInt(); //the source from where you need to find the path
        int V2=s.nextInt(); //the destination to which you need to find the path
        boolean visited[]=new boolean[V]; //create a boolean Array of size V
        ArrayList<Integer> ans=getPathDFS(edges,visited,V1,V2);
        if(ans!=null){
            for(int elem:ans) {
                System.out.print(elem+" ");
            }
        }
    }


    public static ArrayList<Integer> getPathDFS(int[][] edges,boolean[] visited,int V1,int V2){
        if(V1==V2){ //if start and end are same add start to the answer and return
            ArrayList<Integer> ans=new ArrayList<>();
            visited[V1]=true;
            ans.add(V1);
            return ans;
        }

        visited[V1]=true;

        for(int i=0;i<edges.length;i++){

            if(edges[V1][i]==1 && !visited[i]) {   //here we are calling recursion for children of start to end.
                ArrayList<Integer> arr=getPathDFS(edges,visited,i,V2);
                if(arr!=null) {
                    arr.add(V1);
                    return arr;
                }
            }
        }
        //if no naswer is found return null
        return null;
    }
}

 */







// Find the path using BFS and print the shortest path available.
/*
package graphs;
import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int V = s.nextInt();
        int E = s.nextInt();
        int edges[][]=new int[V][V];
        for(int i=0;i<E;i++){
            int sv=s.nextInt();
            int ev=s.nextInt();
            edges[sv][ev]=1;
            edges[ev][sv]=1;
        }
        int V1=s.nextInt();
        int V2=s.nextInt();
        boolean visited[]=new boolean[V];
        ArrayList<Integer> ans=getPathBFS(edges,visited,V1,V2);
        if(ans!=null){
            for(int elem:ans)
            {
                System.out.print(elem+" ");
            }
        }
    }
    public static ArrayList<Integer> getPathBFS(int[][] edges,boolean[] visited,int V1,int V2){
        //if start and end is same just ass v1 to answrer arraylist and return it.
        if(V1==V2)
        {
            ArrayList<Integer> ans=new ArrayList<Integer>();
            ans.add(V1);
            visited[V1]=true;
            return ans;
        }

        Queue<Integer> q=new LinkedList<Integer>(); //q for all vertices of graphs
        HashMap<Integer,Integer> h=new HashMap<>(); //an intger hashmap to know which the source and destination vertex
        ArrayList<Integer> ans=new ArrayList<>(); //an answer arraylist to store the naswer

        q.add(V1); //add the source to the queue
        visited[V1]=true; //mark visited as true

        while(!q.isEmpty() ){
            int first=q.remove();

            for(int i=0;i<edges.length;i++){
                if(edges[first][i]==1 && !visited[i]){
                    visited[i]=true;
                    q.add(i);
                    h.put(i,first); //here we are connecting the start and destination vertex
                    if(i==V2) {
                        ans.add(i);  //if end vertex matches i put it in arraylist output
                        while(!ans.contains(V1)){ //now we loop throgh hashmap until we reach the source

                            int b=h.get(i); //give sthe parent of i
                            ans.add(b); //add the parent to arraylist
                            i=b; //update i to b
                        }

                        return ans;
                    }

                }

            }

        }
        //if no route is found return null
        return null;
    }

}

 */









// print all paths using BFS traversal
/*
package graphs;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void printAllPaths(ArrayList<Edge>[] graph,int src,int dest,boolean[] visited, String path){
        if(src == dest){
            System.out.println(path);
            return;
        }
        
        visited[src] = true;
        for(Edge e : graph[src]){
            if(!visited[e.nbr]){
                printAllPaths(graph,e.nbr,dest, visited,path+"->"+e.nbr);
            }
        }
        visited[src] = false;

    }

    public static class Edge{
        int src;
        int nbr;
        Edge(int src,int nbr){
            this.src = src;
            this.nbr = nbr;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v= sc.nextInt();
        int e = sc.nextInt();

        ArrayList<Edge> []graph = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < e; i++) {
            int fv = sc.nextInt();
            int sv = sc.nextInt();

            graph[fv].add(new Edge(fv,sv));
            graph[sv].add(new Edge(sv,fv));
        }

        int src = sc.nextInt();
        int dest = sc.nextInt();
        
        boolean []visited = new boolean[v];
        printAllPaths(graph,src,dest,visited,src+"");
    }
}


 */










//check wheather the Graph is connected or not
/*
package graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();

        int [][]graph = new int[v][v];

        for (int i = 0; i < e; i++) {
            int sv = sc.nextInt();
            int ev = sc.nextInt();

            graph[sv][ev] = 1;
            graph[ev][sv] = 1;
        }

        boolean visited[] = new boolean[v];
        boolean ans = isConnected(graph,visited,0);
        System.out.println(ans);
    }

    public static boolean isConnected(int [][]graph, boolean [] visited, int sv){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(sv);
        visited[sv] = true;
        while(!queue.isEmpty()) {
            int front = queue.poll();
            for(int i=0;i<graph.length;i++) {
                if(!visited[i] && graph[front][i] ==1) {
                    queue.add(i);
                    visited[i]=true;
                }
            }
        }
        //now loop through visited array if you have any invisited that is false value means graph is not connected
        for(boolean b : visited) {
            if(!b) {
                return false;
            }
        }
        //if all values are true, means graph is connected
        return true;
    }
}

 */













// Kruskals Algorithm
 /*
package graphs;
import java.util.Scanner;
import java.util.Arrays;

class Edge implements Comparable<Edge>{
    int source;
    int dest;
    int weight;

    @Override
    public int compareTo(Edge o) {
        return this.weight - o.weight;
    }
}

public class Main{

    public static void krusklas(Edge []input, int n){
        Arrays.sort(input);

        Edge output[] = new Edge[n-1];

        int parent[] = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        int count = 0;
        int i = 0;
        while(count != n-1){
            Edge currentEdge = input[i];

            int sourceParent = findParent(currentEdge.source, parent);
            int destParent = findParent(currentEdge.dest, parent);

            if(sourceParent != destParent){
                output[count] = currentEdge;
                count ++;
                parent[sourceParent] = destParent;
            }

            i++;
        }

        for (int j = 0; j < n - 1; j++) {
            if(output[j].source < output[j].dest){
                System.out.println(output[j].source+" "+output[j].dest+" "+output[j].weight);
            }
            else{
                System.out.println(output[j].dest+" "+output[j].source+" "+output[j].weight);
            }

        }
    }

    private static int findParent(int v, int[] parent) {
        if(parent[v] == v){
            return v;
        }

        return findParent(parent[v],parent);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();

        Edge input[] = new Edge[e];
        for(int i = 0 ; i < e; i++){
            input[i] = new Edge();
            input[i].source = sc.nextInt();
            input[i].dest = sc.nextInt();
            input[i].weight = sc.nextInt();
        }
        krusklas(input,n);
//        for (int i = 0; i < e; i++) {
//            System.out.println(input[i].source+" "+ input[i].dest+" "+input[i].weight);
//        }
    }
}
*/











// Prims algorithm
/*
package graphs;
import java.util.Scanner;

public class Main{

    private static void prims(int[][] adjacencyMatrix) {
        int v = adjacencyMatrix.length;
        boolean visited[] = new boolean[v];
        int weight[] = new int[v];
        int parent[] = new int[v];
        weight[0] = 0;
        parent[0] = -1;
        for(int i = 1; i < v; i++){
            weight[i] = Integer.MAX_VALUE;
        }
        for(int i = 0; i < v; i++){
            // Pick vertex with min weight
            int minVertex = findMinVertex(weight, visited);
            visited[minVertex] = true;
            // Explore its unvisited neighbors
            for(int j = 0; j < v; j++){
                if(adjacencyMatrix[minVertex][j] != 0 && !visited[j]){
                    if(adjacencyMatrix[minVertex][j] < weight[j]){
                        weight[j] = adjacencyMatrix[minVertex][j];
                        parent[j] = minVertex;
                    }
                }
            }
        }

        // Print edges of MST
        for(int i = 1; i < v; i++){
            if(parent[i] < i){
                System.out.println(parent[i] + " "+ i +" "+ weight[i]);
            }else{
                System.out.println(i + " "+ parent[i] +" "+ weight[i]);
            }
        }

    }

    private static int findMinVertex(int[] weight, boolean visited[]) {

        int minVertex = -1;
        for(int i = 0; i < weight.length; i++){
            if(!visited[i]  && (minVertex == -1 || weight[i] < weight[minVertex])){
                minVertex = i;
            }
        }
        return minVertex;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int v = s.nextInt();
        int e = s.nextInt();
        int adjacencyMatrix[][] = new int[v][v];
        for(int i = 0; i < e; i++){
            int v1 = s.nextInt();
            int v2 = s.nextInt();
            int weight = s.nextInt();
            adjacencyMatrix[v1][v2] = weight;
            adjacencyMatrix[v2][v1] = weight;
        }

        prims(adjacencyMatrix);
    }

}


 */


/*
package graphs;
import java.util.Scanner;

public class Main {

    private static void dijkstra(int[][] adjacencyMatrix) {
        int v = adjacencyMatrix.length;
        boolean visited[] = new boolean[v];
        int distance[] = new int[v];
        distance[0] = 0;
        for(int i = 1; i < v; i++){
            distance[i] = Integer.MAX_VALUE;
        }

        for(int i = 0; i < v - 1; i++){
            // Find Vertex with Min distance
            int minVertex = findMinVertex(distance, visited);
            visited[minVertex] = true;
            // Explore neighbors
            for(int j = 0; j < v; j++){
                if(adjacencyMatrix[minVertex][j] != 0 && !visited[j] && distance[minVertex] != Integer.MAX_VALUE){
                    int newDist = distance[minVertex] + adjacencyMatrix[minVertex][j];
                    if(newDist < distance[j]){
                        distance[j] = newDist;
                    }
                }
            }
        }

        // Print
        for(int i = 0; i < v; i++){
            System.out.println(i + " "+ distance[i]);
        }

    }

    private static int findMinVertex(int[] distance, boolean visited[]) {

        int minVertex = -1;
        for(int i = 0; i < distance.length; i++){
            if(!visited[i]  && (minVertex == -1 || distance[i] < distance[minVertex])){
                minVertex = i;
            }
        }
        return minVertex;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int v = s.nextInt();
        int e = s.nextInt();
        int adjacencyMatrix[][] = new int[v][v];
        for(int i = 0; i < e; i++){
            int v1 = s.nextInt();
            int v2 = s.nextInt();
            int weight = s.nextInt();
            adjacencyMatrix[v1][v2] = weight;
            adjacencyMatrix[v2][v1] = weight;
        }
        dijkstra(adjacencyMatrix);
    }


}

 */



/*
package graphs;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        System.out.println("enter the no. of processor");
        int pro = sc.nextInt();
        System.out.println("the entered processor are : ");
        int p[] = new int[pro];
        for (int i = 0; i < pro; i++) {
            p[i] = sc.nextInt();
        }

        int wt[] = new int[pro];
        wt[0] = 0;
        for (int i = 1; i < pro; i++) {
            wt[i] = p[i-1] + wt[i-1];
        }

        System.out.println("wating time is : ");
        for (int i = 0; i < wt.length; i++) {
            System.out.println("w"+(i+1)+" = "+wt[i]);
        }

        System.out.print("Average of wating time = ");
        System.out.println();
        int avg = 0;
        for (int i = 0; i < wt.length; i++) {
            avg += wt[i];
        }
        System.out.println(avg/wt.length);

        int []tt = new int[pro];
        int om = 0 ;
        for (int i = 0; i < tt.length; i++) {
            tt[i] = om + p[i];
            om = tt[i];
        }

        System.out.println("turn around time is : ");
        for (int i = 0; i < tt.length; i++) {
            System.out.println("tt"+(i+1)+" = "+tt[i]);
        }


        int avgTT = 0;
        for (int i = 0; i < tt.length; i++) {
            avgTT += tt[i];
        }

        System.out.print("Avg ttt = ");
        System.out.print(avgTT/tt.length);

    }
}

*/







/*

package graphs;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc  = new Scanner (System.in);
        System.out.println("enter the no. of processor");
        int pro = sc.nextInt();
        System.out.println("the entered processor are : ");
        int p[] = new int[pro];

        int []tt = new int[pro];
        int om = 0 ;
        int avgTT = 0;
        for (int i = 0; i < pro; i++) {
            p[i] = sc.nextInt();
            tt[i] = om + p[i];
            om = tt[i];
            avgTT += tt[i];
        }

        int wt[] = new int[pro];
        wt[0] = 0;
        int avg = 0;
        for (int i = 1; i < pro; i++) {
            wt[i] = p[i-1] + wt[i-1];
            avg += wt[i];
        }

        System.out.println("wating time and turn around time is : ");
        for (int i = 0; i < wt.length; i++) {
            System.out.println("w"+(i+1)+" = "+wt[i]);
            System.out.println("tt"+(i+1)+" = "+tt[i]);
        }
        System.out.print("Average  vof wating time = ");
        System.out.println(avg/wt.length);
        System.out.println();

        System.out.print("Avg ttt = ");
        System.out.print(avgTT/tt.length);

    }
}

 */







//package graphs;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main{
//    public static void main(String[] args){
//        Scanner sc  = new Scanner(System.in);
//        System.out.println("enter the number of processor");
//        int n = sc.nextInt();
//
//        int []bt = new int[n];
//        int []wt = new int[n];
//        wt[0] = 0;
//        int helper = 0;
//        System.out.println("enter the buust time : ");
//        for(int i = 0 ; i <n ;i++){
//            bt[i] = sc.nextInt();
//        }
//        Arrays.sort(bt);
//        System.out.println("waiting times of processor are : ");
//        int avg = 0;
//        for(int i = 1 ; i < n ;i++){
//            wt[i] = wt[i-1]+ bt[i-1];
//        }
//
//        for(int i = 0 ; i < n ;i++){
//            System.out.print(wt[i]+" ");
//            avg = avg + wt[i];
//        }
//        System.out.println();
//        System.out.println("avg wating "+ avg/n);
//    }
//}





// priority scheduling program



//Priority  Scheduling
/*
package graphs;
import java.util.*;

public class Main {
    static HashMap<Integer,Integer> processPriorityBurstTime = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
//        HashMap<Integer,Integer> processPriorityBurstTime = new HashMap<>();
        System.out.println("enter the no. of processor ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int priority = sc.nextInt();
            int burstTime = sc.nextInt();
            processPriorityBurstTime.put(priority,burstTime);
        }

        sortMap();

    }

    public static void sortMap() {
        Scanner s = new Scanner(System.in);
        TreeMap<Integer,Integer> sorted = new TreeMap<>(processPriorityBurstTime);

        System.out.println();
        System.out.println("the sorted map is : ");
        for (Map.Entry<Integer, Integer> entry : sorted.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        System.out.println();
        System.out.println("no. of processor : ");
        int n = s.nextInt();

        int wt1[] = new int[n];
        int k = 0;
        for (Map.Entry<Integer, Integer> entry : sorted.entrySet()) {
            wt1[k] = entry.getValue();
            k++;
        }

        int []wt = new int[n];
        wt[0] = 0;
        int sum = 0;
        double avg = 0;

        System.out.println("The wating time is : ");
        for(int i = 1 ; i < n ; i++){
            wt[i] = sum + wt1[i-1];
            sum = wt[i];
            avg += sum;
            System.out.println(wt[i-1]);
        }
        System.out.println(wt[n-1]);

        System.out.print("the average of wating time is : ");
        System.out.println(avg/n);

    }

}


 */









//Round Robin
//
//package graphs;
//
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of time generation");
//        int TG = sc.nextInt();
//
//        System.out.println("enter the number of processor");
//        int p = sc.nextInt();
//        int []bt = new int[p];
//        int wt[] = new int[p];
//        int size = 0;
//        int max = Integer.MIN_VALUE;
//
//        for (int i = 0; i < p; i++) {
//            bt[i] = sc.nextInt();
//            size += bt[i];
//            if(max < bt[i]){
//                max = bt[i];
//            }
//        }
//
//        // this is the array for storing the waiting time
//        while(max-- != 0){
//            for(int i = 0 ; i < p ;i++){
//                wt[i] =
//            }
//        }
//    }
//}








/*
package graphs;

import java.util.*;


public class Main
{
    // Method to find the waiting time for all
    // processes
    static void findWaitingTime(int processes[], int n,
                                int bt[], int wt[], int quantum)
    {
        // Make a copy of burst times bt[] to store remaining
        // burst times.
        int rem_bt[] = new int[n];
        for (int i = 0 ; i < n ; i++)
            rem_bt[i] =  bt[i];

        int t = 0; // Current time

        // Keep traversing processes in round-robin manner
        // until all of them are not done.
        while(true)
        {
            boolean done = true;

            // Traverse all processes one by one repeatedly
            for (int i = 0 ; i < n; i++)
            {
                // If burst time of a process is greater than 0
                // then only need to process further
                if (rem_bt[i] > 0)
                {
                    done = false; // There is a pending process

                    if (rem_bt[i] > quantum)
                    {
                        // Increase the value of t i.e. shows
                        // how much time a process has been processed
                        t += quantum;

                        // Decrease the burst_time of current process
                        // by quantum
                        rem_bt[i] -= quantum;
                    }

                    // If burst time is smaller than or equal to
                    // quantum. Last cycle for this process
                    else
                    {
                        // Increase the value of t i.e. shows
                        // how much time a process has been processed
                        t = t + rem_bt[i];

                        // Waiting time is current time minus time
                        // used by this process
                        wt[i] = t - bt[i];

                        // As the process gets fully executed
                        // make its remaining burst time = 0
                        rem_bt[i] = 0;
                    }
                }
            }

            // If all processes are done
            if (done == true)
                break;
        }
    }

    // Method to calculate turnaround time
    static void findTurnAroundTime(int processes[], int n,
                                   int bt[], int wt[], int tat[])
    {
        // calculating turnaround time by adding
        // bt[i] + wt[i]
        for (int i = 0; i < n ; i++)
            tat[i] = bt[i] + wt[i];
    }

    // Method to calculate average time
    static void findavgTime(int processes[], int n, int bt[],
                            int quantum)
    {
        int wt[] = new int[n], tat[] = new int[n];
        int total_wt = 0, total_tat = 0;

        // Function to find waiting time of all processes
        findWaitingTime(processes, n, bt, wt, quantum);

        // Function to find turnaround time for all processes
        findTurnAroundTime(processes, n, bt, wt, tat);

        // Display processes along with all details
        System.out.println("Processes " + " Burst time" + " Waiting time " + " Turnaround time");

        // Calculate total waiting time and total turn
        // around time
        for (int i=0; i<n; i++)
        {
            total_wt = total_wt + wt[i];
            total_tat = total_tat + tat[i];
            System.out.println(" " + (i+1) + "\t\t" + bt[i] +"\t " +
                    wt[i] +"\t\t " + tat[i]);
        }

        System.out.println("Average waiting time = " +
                (float)total_wt / (float)n);
        System.out.println("Average turnaround time = " +
                (float)total_tat / (float)n);
    }

    // Driver Method
    public static void main(String[] args)
    {
        // process id's
        int processes[] = { 1, 2, 3};
        int n = processes.length;

        // Burst time of all processes
        int burst_time[] = {10, 5, 8};

        // Time quantum
        int quantum = 2;
        findavgTime(processes, n, burst_time, quantum);
    }
}
*/







/*
package graphs;

import java.util.*;


public class Main
{
    // Method to find the waiting time for all
    // processes
    static void findWaitingTime(int processes[], int n, int bt[], int wt[], int quantum) {
        // Make a copy of burst times bt[] to store remaining
        // burst times.
        int rem_bt[] = new int[n];
        for (int i = 0 ; i < n ; i++)
            rem_bt[i] =  bt[i];

        int t = 0; // Current time

        // Keep traversing processes in round-robin manner
        // until all of them are not done.
        while(true)
        {
            boolean done = true;

            // Traverse all processes one by one repeatedly
            for (int i = 0 ; i < n; i++)
            {
                // If burst time of a process is greater than 0
                // then only need to process further
                if (rem_bt[i] > 0)
                {
                    done = false; // There is a pending process

                    if (rem_bt[i] > quantum)
                    {
                        // Increase the value of t i.e. shows
                        // how much time a process has been processed
                        t += quantum;

                        // Decrease the burst_time of current process
                        // by quantum
                        rem_bt[i] -= quantum;
                    }

                    // If burst time is smaller than or equal to
                    // quantum. Last cycle for this process
                    else
                    {
                        // Increase the value of t i.e. shows
                        // how much time a process has been processed
                        t = t + rem_bt[i];

                        // Waiting time is current time minus time
                        // used by this process
                        wt[i] = t - bt[i];

                        // As the process gets fully executed
                        // make its remaining burst time = 0
                        rem_bt[i] = 0;
                    }
                }
            }

            // If all processes are done
            if (done == true)
                break;
        }
    }

    // Method to calculate turnaround time
    static void findTurnAroundTime(int processes[], int n,
                                   int bt[], int wt[], int tat[])
    {
        // calculating turnaround time by adding
        // bt[i] + wt[i]
        for (int i = 0; i < n ; i++) {
            tat[i] = bt[i] + wt[i];
        }
    }

    // Method to calculate average time
    static void findavgTime(int processes[], int n, int bt[], int quantum) {
        int wt[] = new int[n];
        int tat[] = new int[n];
        int total_wt = 0, total_tat = 0;

        findWaitingTime(processes, n, bt, wt, quantum);

        findTurnAroundTime(processes, n, bt, wt, tat);

        System.out.println("Processes " + " Burst time" + " Waiting time " + " Turnaround time");

        // Calculate total waiting time and total turn
        // around time
        for (int i=0; i<n; i++)
        {
            total_wt = total_wt + wt[i];
            total_tat = total_tat + tat[i];
            System.out.println(" " + (i+1) + "\t\t" + bt[i] +"\t " + wt[i] +"\t\t " + tat[i]);
        }

        System.out.println("Average waiting time = " +
                (float)total_wt / (float)n);
        System.out.println("Average turnaround time = " +
                (float)total_tat / (float)n);
    }


    public static void main(String[] args)
    {
        // process id's
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of processor");
        int p = sc.nextInt();
        int processes[] = new int[p];

        System.out.println("enter the value of process");
        for(int i = 0 ; i< p ;i++){
            processes[i] = sc.nextInt();
        }
        int n = processes.length;

        // Burst time of all processes
        int burst_time[] = new int[p];
        System.out.println("enter the value of burst time");
        for(int i = 0 ; i< p ;i++){
            burst_time[i] = sc.nextInt();
        }

        // Time quantum
        System.out.println("enter the value of time generation");
        int quantum = sc.nextInt();

        findavgTime(processes, n, burst_time, quantum);
    }
}

 */









/*

package graphs;

import java.util.*;


public class Main {
    public static void findWaitingTime(int processes[], int n, int bt[], int wt[], int quantum) {

        int rem_bt[] = new int[n];
        for (int i = 0 ; i < n ; i++) {
            rem_bt[i] = bt[i];
        }

        int t = 0; // Current time

        while(true)
        {
            boolean done = true;

            for (int i = 0 ; i < n; i++) {
                if (rem_bt[i] > 0) {
                    done = false; // There is a pending process
                    if (rem_bt[i] > quantum) {
                        t += quantum;
                        rem_bt[i] -= quantum;
                    }

                    else {
                        t = t + rem_bt[i];
                        wt[i] = t - bt[i];
                        rem_bt[i] = 0;
                    }
                }
            }

            if (done == true) {
                break;
            }
        }
    }

    // Method to calculate average time
    public static void findavgTime(int processes[], int n, int bt[], int quantum) {
        int wt[] = new int[n];
        int total_wt = 0;

        findWaitingTime(processes, n, bt, wt, quantum);

        System.out.println("Processes " + " Burst time" + " Waiting time ");

        // Calculate total waiting time and total turn
        // around time
        for (int i=0; i<n; i++) {
            total_wt = total_wt + wt[i];
            System.out.println(" " + (i+1) + "\t\t\t\t" + bt[i] +"\t\t\t " + wt[i] +"\t\t\t\t ");
        }

        System.out.println("Average waiting time = " + (float)total_wt / (float)n);

    }


    public static void main(String[] args)
    {
        // process id's
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of processor");
        int p = sc.nextInt();
        int processes[] = new int[p];

        System.out.println("enter the value of process");
        for(int i = 0 ; i< p ;i++){
            processes[i] = sc.nextInt();
        }
        int n = processes.length;

        // Burst time of all processes
        int burst_time[] = new int[p];
        System.out.println("enter the value of burst time");
        for(int i = 0 ; i< p ;i++){
            burst_time[i] = sc.nextInt();
        }

        // Time quantum
        System.out.println("enter the value of time generation");
        int quantum = sc.nextInt();

        findavgTime(processes, n, burst_time, quantum);
    }
}

 */



//package graphs;
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        double a, b, c; // a, b and c have the usual meaning
//        double f_of_a, f_of_b; // f_of_a, f_of_b store values of f(a) and f(b)
//        // respectively
//        int highest_degree;
//        System.out.println("What is the highest degree of your polynomial? ");
//        Scanner input = new Scanner(System.in);
//        highest_degree = input.nextInt();
//        for (int i = highest_degree; i >= 0; i--) {
//            int coeff_deg_i;
//            coeff_deg_i = poly_input(i);
//            // System.out.println(coeff_deg_i);
//        }
//        // The following do-while loop keeps asking the user for a and b until
//        // f(a)f(b) does not become negative
//        do {
//            a = input();
//            b = input();
//            if (f(a) * f(b) >= 0) {
//                System.out.println("Sorry the two numbers are not bracketing the root.  Please try again ");
//            }
//        } while (f(a) * f(b) >= 0);
//        f_of_a = f(a);
//        f_of_b = f(b);
//        double root = bisectionMethod(f_of_a, f_of_b, a, b);
//        System.out.println("Root is : " + root);
//    }
//
//    public static double input() { // Reads in the bracketing number i.e a and b
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a bracketing number");
//        return (input.nextDouble());
//    }
//
//    public static double f(double num) { // Calculates f(x) given x and returns
//        // f(x)
////        final int COEFF_DEG_3 = 1; // Coefficient of x^3
////        final int COEFF_DEG_2 = -3; // Coefficient of x^2
////        final int COEFF_DEG_0 = -5; // Coefficient of x^0
//        Scanner sc = new Scanner(System.in);
//        System.out.println("coeff of deg 3 :");
//        int COEFF_DEG_3 = sc.nextInt();
//
//        System.out.println("coeff of deg 2 :");
//        int COEFF_DEG_2 = sc.nextInt();
//
//        System.out.println("coeff of deg 1 :");
//        int COEFF_DEG_1 = sc.nextInt();
//
//        System.out.println("coeff of deg 0 :");
//        int COEFF_DEG_0 = sc.nextInt();
//
//        return (COEFF_DEG_3 * Math.pow(num, 3) + COEFF_DEG_2 * Math.pow(num, 2) + COEFF_DEG_1 * Math.pow(num, 1) + COEFF_DEG_0
//                * Math.pow(num, 0));
//    }
//
//    public static double bisectionMethod(double f_of_a, double f_of_b, double a,
//                                         double b) { // Does the actual work of evaluating
//        double c; // the root using the method of bisection.
//        double f_of_c;
//        final double TOLERANCE = 0.0001;
//        while (Math.abs(a - b) > TOLERANCE) {
//            c = (a + b) / 2;
//            f_of_c = f(c);
//            if (f_of_c * f(a) == 0 || f_of_c * f(b) == 0) {
//                return c;
//            } else if (f_of_c * f(a) > 0) {
//                a = c;
//            } else {
//                b = c;
//            }
//        }
//        return (a + b) / 2;
//    }
//
//    public static int poly_input(int degree) {
//        System.out.println("Please enter coefficient for degree " + degree);
//        Scanner input = new Scanner(System.in);
//        int coefficient;
//        coefficient = input.nextInt();
//        return coefficient;
//    }
//}








// This ia a code for Bisection Method in  Mathematics
/*
package graphs;
import java.util.*;

public class Bisection {

    private static Scanner input = new Scanner(System.in);
    private static List<Double> coefficients = new ArrayList<>();

    private static double epsilon = 0.00001;

    private void inputPolynomial() {
        System.out.print("Enter the order of the polynomial: ");
        int order = input.nextInt();

//        System.out.print("Enter the coefficient of terms of the function: ");

        while (order >= 0) {
            System.out.print("Please Enter the coefficient of degree "+order+": ");
            double value = input.nextDouble();
            coefficients.add(value);
            order--;
//            System.out.println();
        }
    }

    private double function(double x) {
        double result = 0.0;
        for (int index = 0, order = coefficients.size()-1; index < coefficients.size(); order--, index++) {
            result += coefficients.get(index) * (Math.pow(x, order));
        }
        return result;
    }

    private void calculateRoot() {
        double a, b;
        // Ask user for a and b until f(a) * f(b) > 0

        do {
            System.out.print("Enter the start of the interval: ");
            a = input.nextDouble();
            System.out.print("Enter the end of the interval: ");
            b = input.nextDouble();

            if (function(a) * function(b) >= 0) {
                System.out.println("Sorry, the root is not within the 2 numbers.\nDo try again.");
            }
        } while(function(a)*function(b) >= 0);

        long startTime = System.nanoTime();
        double root = bisectionMethod(a, b);
        long timeUsed = System.nanoTime() - startTime;
        System.out.printf("\nThe root is: %.6f.\n", root);
        System.out.println("Time used is " + timeUsed/1000 + " milliseconds.");
    }

    private double bisectionMethod(double start, double end) {
        double middle = (start + end)/2.0;

        System.out.println("start\t\t\t\t\t" + "end\t\t\t\t\t"+ "middle");
        while (Math.abs(start - end) > epsilon) {
            //System.out.println("x: " + middle);

            if ((function(start) * function(middle) == 0.0) || (function(end) * function(middle) == 0.0)) {
                break;
            } else if (function(start) * function(middle) > 0.0) {
                start = middle;
            } else {
                end = middle;
            }
            middle = (start + end)/2.0;

            System.out.println(start + "\t\t\t\t\t\t " + end + "\t\t\t\t\t\t " + middle);
        }
        return middle;
    }

    public static void main(String[] args) {
        Bisection bisection = new Bisection();
        bisection.inputPolynomial();
        bisection.calculateRoot();
    }
}

 */










package graphs;
import java.util.Scanner;

public class Main {

    public static void printDFSHelper (int edges[][], int sv, boolean visited[]){
        System.out.println(sv);
        visited [sv] = true;
        int n = edges.length;
        for (int i = 0; i<n ;i++){
            if (edges[sv][i] == 1 && !visited[i]) {
                printDFSHelper(edges,i,visited);
            }
        }
    }

    public static void DFS (int edges[][]) {
        boolean visited[] = new boolean[edges.length];

        for(int i=0 ;i < edges.length;i++){
            if(!visited[i]){
//                System.out.println("not visited = "+i);
                printDFSHelper(edges,i,visited);
            }
        }

    }

    public static void main(String[] args) {
        // write your code here
        int n;
        int e;
        Scanner sc =new Scanner(System.in);
        n = sc.nextInt();
        e = sc.nextInt();
        int edges[][] = new int[n][n];
        for (int i = 0; i < e; i++){
            int fv = sc.nextInt(); // fv = first vertex
            int sv = sc.nextInt(); // sv = second vertex

            edges[fv][sv] = 1;
            edges[sv][fv] = 1;
        }

        DFS(edges);
    }
}