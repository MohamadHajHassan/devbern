package devbern.asg8;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void bfsTraversal(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.println(current.getData());

            if (current.getLeftChild() != null) {
                queue.add(current.getLeftChild());
            }
            if (current.getRightChild() != null) {
                queue.add(current.getRightChild());
            }
        }
    }

    public static void main(String[] args) {
        Node f = new Node(null, null, 'f');
        Node c = new Node(f, null, 'c');
        Node d = new Node(null, null, 'd');
        Node e = new Node(null, null, 'e');
        Node b = new Node(d, e, 'b');
        Node a = new Node(b, c, 'a');

        bfsTraversal(a);
    }
}
