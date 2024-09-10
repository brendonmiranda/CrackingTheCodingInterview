package cracking.the.code.interview.chapter2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class RemoveDupQuestion21Test {

    @Test
    public void removeDupTest() {
        final LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(3);
        linkedList.add(6);
        linkedList.add(2);

        RemoveDupQuestion21 removeDup = new RemoveDupQuestion21();
        var removedDuplicatedDoublyLinkedList =
                removeDup.removeDup(makeDoublyCustomLinkedList(linkedList));

        Assertions.assertEquals(1, removedDuplicatedDoublyLinkedList.value);
        removedDuplicatedDoublyLinkedList= removedDuplicatedDoublyLinkedList.next;

        Assertions.assertEquals(5, removedDuplicatedDoublyLinkedList.value);
        removedDuplicatedDoublyLinkedList= removedDuplicatedDoublyLinkedList.next;

        Assertions.assertEquals(6, removedDuplicatedDoublyLinkedList.value);
        removedDuplicatedDoublyLinkedList= removedDuplicatedDoublyLinkedList.next;

        Assertions.assertEquals(3, removedDuplicatedDoublyLinkedList.value);
        removedDuplicatedDoublyLinkedList= removedDuplicatedDoublyLinkedList.next;

        Assertions.assertEquals(2, removedDuplicatedDoublyLinkedList.value);
        Assertions.assertEquals(3, removedDuplicatedDoublyLinkedList.prev.value);
        Assertions.assertNull(removedDuplicatedDoublyLinkedList.next);
    }

    @Test
    public void removeDupWithNoBufferTest() {
        final LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(3);
        linkedList.add(6);
        linkedList.add(2);

        RemoveDupQuestion21 removeDup = new RemoveDupQuestion21();
        var removedDuplicatedDoublyLinkedList =
                removeDup.removeDupWithNoBuffer(makeDoublyCustomLinkedList(linkedList));

        Assertions.assertEquals(1, removedDuplicatedDoublyLinkedList.value);
        removedDuplicatedDoublyLinkedList= removedDuplicatedDoublyLinkedList.next;

        Assertions.assertEquals(5, removedDuplicatedDoublyLinkedList.value);
        removedDuplicatedDoublyLinkedList= removedDuplicatedDoublyLinkedList.next;

        Assertions.assertEquals(6, removedDuplicatedDoublyLinkedList.value);
        removedDuplicatedDoublyLinkedList= removedDuplicatedDoublyLinkedList.next;

        Assertions.assertEquals(3, removedDuplicatedDoublyLinkedList.value);
        removedDuplicatedDoublyLinkedList= removedDuplicatedDoublyLinkedList.next;

        Assertions.assertEquals(2, removedDuplicatedDoublyLinkedList.value);
        Assertions.assertEquals(3, removedDuplicatedDoublyLinkedList.prev.value);
        Assertions.assertNull(removedDuplicatedDoublyLinkedList.next);
    }

    public RemoveDupQuestion21.Node makeDoublyCustomLinkedList(final LinkedList<Integer> linkedList) {
        final RemoveDupQuestion21.Node root = new RemoveDupQuestion21.Node();

        RemoveDupQuestion21.Node child = root;
        for (int i = 0; i < linkedList.size(); i++) {
            int value = linkedList.get(i);
            child.value = value;
            RemoveDupQuestion21.Node prev = child;

            if (i != linkedList.size() - 1) { // last loop
                child.next = new RemoveDupQuestion21.Node();
                child = child.next;
                child.prev = prev;
            }

        }

        return root;
    }

}
