package devbern.asg9;

public class LinkedListRotate {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node rotateByKNode(Node head, int k) {
        if (head == null || k == 0) {
            return head;
        }

        Node currentNode = head;
        int count = 1;
        while (count < k) {
            currentNode = currentNode.next;
            count++;
        }

        Node newHead = currentNode.next;
        currentNode.next = null;

        Node temp = newHead;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;

        return newHead;
    }
}
