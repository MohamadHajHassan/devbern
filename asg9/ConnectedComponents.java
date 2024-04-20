package devbern.asg9;

import java.util.LinkedList;

public class ConnectedComponents {
    public static void visitRecursiveDFS(int root, boolean visited[], LinkedList<Integer>[] adjacencyList) {
        visited[root] = true;
        for (int node : adjacencyList[root]) {
            if (!visited[node]) {
                visitRecursiveDFS(node, visited, adjacencyList);
            }
        }
    }

    public static int countConnectedComponents(int root, int size, LinkedList<Integer>[] adjacencyList) {
        boolean visited[] = new boolean[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (!visited[i]) {
                visitRecursiveDFS(i, visited, adjacencyList);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}