package cracking.the.code.interview.chapter4;

public class DoublyLinkedList {


    public static void main (String... args) {

        Node n = new Node();
        insert(n,1);
        insert(n,2);
        insert(n,3);
        insert(n,4);
        insert(n,5);

    }

    private static class Node {
        Node next;
        Node previous;
        Integer value;
    }

    private static Node insert(Node node, int v) {

        if (node.value == null) {
            node.value = v;
            return node;
        }

        if (node.next == null) {
            node.next = new Node();
            node.next.previous = node;
        }

        node.next = insert(node.next, v);

        return node;
    }


}
