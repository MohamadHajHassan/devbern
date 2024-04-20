package devbern.asg9;

import java.util.LinkedList;

public class DFSGraph {
    public static void dfsRecursiveHelper(int root, boolean visited[], LinkedList<Integer>[] adjacencyList) {
        visited[root] = true;
        System.out.println(root);
        for (int n : adjacencyList[root]) {
            if (!visited[n]) {
                dfsRecursiveHelper(n, visited, adjacencyList);
            }
        }
    }

    public static void dfs(int root, int size, LinkedList<Integer>[] adjacencyList) {
        boolean visited[] = new boolean[size];
        dfsRecursiveHelper(root, visited, adjacencyList);

    }

    public static void main(String[] args) {
        
    }

}
