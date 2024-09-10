package data.structure;

import data.structure.linkedlist.RemoveDup;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class RemoveDupTest {

    @Test
    public void removeDupTest() {
        final LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(3);
        linkedList.add(6);
        linkedList.add(2);

        RemoveDup removeDup = new RemoveDup();
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

        RemoveDup removeDup = new RemoveDup();
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

    public RemoveDup.Node makeDoublyCustomLinkedList(final LinkedList<Integer> linkedList) {
        final RemoveDup.Node root = new RemoveDup.Node();

        RemoveDup.Node child = root;
        for (int i = 0; i < linkedList.size(); i++) {
            int value = linkedList.get(i);
            child.value = value;
            RemoveDup.Node prev = child;

            if (i != linkedList.size() - 1) { // last loop
                child.next = new RemoveDup.Node();
                child = child.next;
                child.prev = prev;
            }

        }

        return root;
    }

}
