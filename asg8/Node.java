package devbern.asg8;

public class Node {
    private Node leftChild;
    private Node rightChild;
    private char data;

    public Node getLeftChild() {
        return this.leftChild;
    }

    public Node getRightChild() {
        return this.rightChild;
    }

    public char getData() {
        return this.data;
    }

    public Node(Node leftChild, Node rightChild, char data) {
        this.leftChild = leftChild;
        this.rightChild = rightChild;
        this.data = data;
    }
}
