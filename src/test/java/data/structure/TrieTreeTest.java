package data.structure;

import data.structure.tree.TrieTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrieTreeTest {

    @Test
    public void test() {

        String[] d = new String[]{"foo", "bar"};

        TrieTree.Trie root = new TrieTree.Trie();

        for (String v : d) {
            TrieTree.insert(root, v);
        }

        Assertions.assertTrue(TrieTree.search(root, "foo"));
        Assertions.assertTrue(TrieTree.search(root, "bar"));
        Assertions.assertFalse(TrieTree.search(root, "fo"));
        Assertions.assertFalse(TrieTree.search(root, "fooo"));
        Assertions.assertFalse(TrieTree.search(root, "barr"));

    }

}
