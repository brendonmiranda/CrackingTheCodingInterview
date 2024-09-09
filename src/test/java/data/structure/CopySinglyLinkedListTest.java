package data.structure;

import data.structure.tree.CopySinglyLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CopySinglyLinkedListTest {

    @Test
    public void test() {

        final CopySinglyLinkedList copySinglyLinkedList = new CopySinglyLinkedList();

        CopySinglyLinkedList.Node n = copySinglyLinkedList.copySinglyLinkedList(List.of(1, 5, 3, 6, 2));

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
