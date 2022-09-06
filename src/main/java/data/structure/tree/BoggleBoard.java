package data.structure.tree;

import java.util.HashSet;
import java.util.Set;

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

    private static final Set<String> WORDS = new HashSet<>();

    static class Trie {

        Trie[] child = new Trie[26]; // english alphabet

        boolean leaf;

    }

    /**
     * @param board boggleBoard
     * @param d     dictionary
     */
    public Set<String> boggle(char[][] board, String[] d) {

        /*
         - create a tree (trie data structure) using the dictionary words
         - loop through the board
         - consider only the characters that are in the first layer of children in the tree
         - for each character recursively loop through the possibilities
         - if any word is formed add to the hashset and return it
         */

        Trie root = new Trie();

        for (String s : d) { // create trie based on the dictionary
            insert(s, root);
        }

        for (int i = 0; i < board.length; i++) { // i = line
            for (int j = 0; j < board[i].length; j++) { // j = element

                int index = board[i][j] - 'A';
                if (root.child[index] != null) { // consider only the chars that are child of the root

                    boolean[][] visited = new boolean[board.length][board[0].length];

                    String word = String.valueOf(board[i][j]);

                    visited[i][j] = true;

                    findWord(board, root.child[index], visited, word, i, j);

                }
            }
        }

        return WORDS;

    }

    private void findWord(char[][] board, Trie tree, boolean[][] temp, String word, int i, int j) {

        temp[i][j] = true;

        if (tree.leaf)
            WORDS.add(word);

        for (int k = 0; k < 26; k++) { // traverse the trie

            if (tree.child[k] != null) {

                char v = (char) (k + 'A'); // next character of the dictionary word

                // i, j-1 (left)
                if (i >= 0 && i < board.length &&
                        j - 1 >= 0 && j - 1 < board[0].length &&
                        board[i][j - 1] == v) {
                    findWord(board, tree.child[k], temp, word + v, i, j - 1);
                }

                // i, j+1 (right)
                if (i >= 0 && i < board.length &&
                        j + 1 >= 0 && j + 1 < board[0].length &&
                        board[i][j + 1] == v) {
                    findWord(board, tree.child[k], temp, word + v, i, j + 1);
                }

                // i-1, j (up)
                if (i - 1 >= 0 && i - 1 < board.length &&
                        j >= 0 && j < board[0].length &&
                        board[i - 1][j] == v) {
                    findWord(board, tree.child[k], temp, word + v, i - 1, j);
                }

                // i+1, j (down)
                if (i + 1 >= 0 && i + 1 < board.length &&
                        j >= 0 && j < board[0].length &&
                        board[i + 1][j] == v) {
                    findWord(board, tree.child[k], temp, word + v, i + 1, j);
                }

            }
        }

    }

    private void insert(String key, Trie root) {

        Trie child = root;

        for (int i = 0; i < key.length(); i++) {

            int index = key.toUpperCase().charAt(i) - 'A';
            if (child.child[index] == null) {
                child.child[index] = new Trie();
            }

            child = child.child[index];
        }

        child.leaf = true;
    }

}
