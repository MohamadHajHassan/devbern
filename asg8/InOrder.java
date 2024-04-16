package devbern.asg8;

public class InOrder {
    public static void inOrderRecursive(Node root) {
        if (root == null) {
            return;
        }
        inOrderRecursive(root.getLeftChild());
        System.out.println(root.getData());
        inOrderRecursive(root.getRightChild());
    }

    public static void main(String[] args) {
        Node f = new Node(null, null, 'f');
        Node c = new Node(f, null, 'c');
        Node d = new Node(null, null, 'd');
        Node e = new Node(null, null, 'e');
        Node b = new Node(d, e, 'b');
        Node a = new Node(b, c, 'a');

        inOrderRecursive(a);
    }
}
