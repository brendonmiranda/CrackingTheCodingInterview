package data.structure.tree;

/**
 * Very commonly, a trie is used to store the entire (English) language for quick prefix lookup.
 * While a hash table can quickly look up whether a string is a valid word, it cannot tell us if a string is a prefix of any valid words.
 * A trie can do this very quickly.
 */
public class TrieTree {

    public static class Trie {

        public Trie[] child = new Trie[26]; // 26 = alphabet size

        public boolean leaf;

    }

    /**
     * O(K) where K = key length
     *
     * @param root trie root
     * @param key  string
     */
    public static void insert(Trie root, String key) {

        Trie child = root;

        for (int i = 0; i < key.length(); i++) {

            int index = key.toUpperCase().charAt(i) - 'A';

            if (child.child[index] == null)
                child.child[index] = new Trie();

            child = child.child[index];
        }

        child.leaf = true;

    }

    /**
     * O(K) where K = key length
     *
     * @param root trie root
     * @param key  string
     * @return boolean indicating if the trie contains or not the key
     */
    public static boolean search(Trie root, String key) {

        for (int i = 0; i < key.length(); i++) {

            int k = key.toUpperCase().charAt(i) - 'A';

            if (root.child[k] == null)
                return false;

            root = root.child[k];
        }

        return root.leaf;
    }


}
