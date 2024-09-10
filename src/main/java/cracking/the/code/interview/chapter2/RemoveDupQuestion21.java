package cracking.the.code.interview.chapter2;

import java.util.HashSet;
import java.util.Set;

/**
 * Write code to remove duplicates from an unsorted linked list.
 */
public class RemoveDupQuestion21 {

    public static class Node {
        public Node prev;
        public Node next;
        public int value;
    }

    public Node removeDup(final Node doublyLinkedList) {

        final Set<Integer> dupSet = new HashSet<>();

        Node child = doublyLinkedList;
        while (child != null) {
            int v = child.value;
            if(dupSet.contains(v)) {

                if(child.prev != null)
                    child.prev.next = child.next;

                if(child.next != null)
                    child.next.prev = child.prev;

            } else {
                dupSet.add(v);
            }

            child = child.next;
        }

        return doublyLinkedList; // root
    }

    /**
     * How would you solve this problem if a temporary buffer is not allowed.
     */
    public Node removeDupWithNoBuffer(final Node doublyLinkedList) {

        Node child1 = doublyLinkedList;
        while (child1 != null) {
            int v = child1.value;
            Node child2 = child1.next; // one node ahead

            while (child2 != null) {
                if (child2.value == v) {
                    if (child2.prev != null)
                        child2.prev.next = child2.next;

                    if (child2.next != null)
                        child2.next.prev = child2.prev;
                }
                child2 = child2.next;
            }

            child1= child1.next;
        }

        return doublyLinkedList;
    }


}
