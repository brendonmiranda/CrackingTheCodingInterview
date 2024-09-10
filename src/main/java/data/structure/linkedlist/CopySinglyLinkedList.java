package data.structure.linkedlist;

import java.util.LinkedList;

/**
 * You'll receive a singly linked list that points to only one direction. You need to return a copy of the singly linked list.
 * e.g. 1 -> 5 -> 3 -> 6 -> 2
 * - Not reuse any pre-made data structure from java or any other language
 */
public class CopySinglyLinkedList {

    public static class Node {
        public int value;
        public Node next;
    }

    public Node copySinglyLinkedList(final LinkedList<Integer> linkedList) {
        final Node root = new Node();

        Node child = root;
        for (int i = 0; i < linkedList.size(); i++) {
            int value = linkedList.get(i);
            child.value = value;

            if (i != linkedList.size() - 1) { // last loop
                child.next = new Node();
                child = child.next;
            }
        }

        return root;
    }


}
