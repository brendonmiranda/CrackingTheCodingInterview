package cracking.the.code.interview.chapter4;

public class SinglyLinkedList {


    public static void main(String... args) {

        Node root = new Node();

        insert(root, 1);
        insert(root, 2);
        insert(root, 3);
        insert(root, 4);
        insert(root, 5);


    }

    private static class Node {
        private Node next;
        private Integer value;
    }

    private static Node insert(Node node, int v) {
        var child = node;
        if(child.value == null) {
            child.value = v;
            return child;
        }

        if(child.next == null) {
            child.next = new Node();
        }

        child.next = insert(child.next, v);

        return node;
    }

}
