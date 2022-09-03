package data.structure.tree;

import java.util.ArrayList;
import java.util.List;

/*
You are given a Boggle board, ie a rectangular table filled with letters, like the following:
E.g. Board =
+-------------------+
|  A |  B |  R |  Z |
|----+----+----+----|
|  R |  U |  E |  A |
|----+----+----+----|
|  G |  E |  D |  D |
|----+----+----+----|
|  S |  R |  L |  T |
|----+----+----+----|
|  O |  M |  A |  K |
+-------------------+

And you are also provided a dictionary of valid words.
For example the list [APPLE, BURGER, NOTE, MALT, PAPER, READ, RADAR, SORT]

The task is to write an algorithm to find all the valid words from the given list,
hidden in the board. Starting from any letter you are allowed to move in horizontal
and vertical directions with the only constraint that you can use each board cell only
once for a particular word.

In the above example the correct output would be the list [BURGER, MALT, READ]
*/
public class BoggleBoard {

    static class Trie {

        Trie[] child = new Trie[26]; // english alphabet size

        boolean leaf;

    }

    public List<String> boggle(List<List<Character>> board, List<String> dictionary) {

        List<String> wordsList = new ArrayList<>();

        Trie root = new Trie();

        // create trie based on the dictionary
        for (String s : dictionary) {
            insert(root, s);
        }

        // verify if each letter in the board is a child of the root of the trie
        // consider the ones tha are child of the root. ignore the others
        for (int i = 0; i < board.size(); i++) {
            List<Character> line = board.get(i);

            for (int j = 0; j < line.size(); j++) {

                char character = line.get(j);

                Trie prefixChild =
                        searchPrefix(root, String.valueOf(character));

                if (prefixChild == null)
                    continue;

                if(prefixChild.leaf)
                    wordsList.add(String.valueOf(character));

                // get the children that has been considered and traverse
                int index = character - 'A';
                Trie rootChild = root.child[index];

                // traverse the rootChild
                for (int k = 0; k < 26; k++) {
                    if (rootChild.child[k] != null) {

//                        board.get



                    }
                }


            }
        }

        return wordsList;
    }

    public void insert(Trie root, String key) {

        Trie child = root;

        for (int i = 0; i < key.length(); i++) {

            int index = key.charAt(i) - 'A';

            if (child.child[index] == null)
                child.child[index] = new Trie();

            child = child.child[index];
        }

        child.leaf = true;

    }

    public boolean search(Trie root, String key) {

        Trie child = root;

        for (int i = 0; i < key.length(); i++) {

            int index = key.charAt(i) - 'A';

            if (child.child[index] == null)
                return false;


            child = child.child[index];

        }

        return child.leaf;
    }

    /**
     * return null when the prefix is not contained in the trie. otherwise, return the child ,so you can check the leaf.
     * @param root trie root
     * @param key
     * @return
     */
    public Trie searchPrefix(Trie root, String key) {

        Trie child = root;

        for (int i = 0; i < key.length(); i++) {

            int index = key.charAt(i) - 'A';

            if (child.child[index] == null)
                return null;


            child = child.child[index];

        }

        return child;
    }

}
