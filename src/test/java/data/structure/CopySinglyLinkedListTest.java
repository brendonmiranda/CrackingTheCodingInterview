package data.structure;

import data.structure.linkedlist.CopySinglyLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class CopySinglyLinkedListTest {

    @Test
    public void test() {

        final CopySinglyLinkedList copySinglyLinkedList = new CopySinglyLinkedList();

        final LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(5);
        linkedList.add(3);
        linkedList.add(6);
        linkedList.add(2);

        CopySinglyLinkedList.Node n = copySinglyLinkedList.copySinglyLinkedList(linkedList);

        Assertions.assertEquals(1, n.value);
        n = n.next;
        Assertions.assertEquals(5, n.value);
        n = n.next;
        Assertions.assertEquals(3, n.value);
        n = n.next;
        Assertions.assertEquals(6, n.value);
        n = n.next;
        Assertions.assertEquals(2, n.value);

        Assertions.assertNull(n.next);
    }
}
