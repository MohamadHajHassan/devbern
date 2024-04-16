package devbern.asg8;

public class PostOrder {
    public static void postOrderRecursive(Node root) {
        if (root == null) {
            return;
        }
        postOrderRecursive(root.getLeftChild());
        postOrderRecursive(root.getRightChild());
        System.out.println(root.getData());
    }

    public static void main(String[] args) {
        Node f = new Node(null, null, 'f');
        Node c = new Node(f, null, 'c');
        Node d = new Node(null, null, 'd');
        Node e = new Node(null, null, 'e');
        Node b = new Node(d, e, 'b');
        Node a = new Node(b, c, 'a');

        postOrderRecursive(a);
    }
}
