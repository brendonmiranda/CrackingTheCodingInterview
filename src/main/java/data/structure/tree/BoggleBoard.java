package data.structure.tree;

import java.util.HashSet;
import java.util.List;
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

    private static final Set<String> stringSet = new HashSet<>();

    static class Trie {
        Trie[] child = new Trie[26]; // english alphabet size

        boolean leaf;
    }

    public Set<String> boggle(char[][] board, List<String> dictionary) {

        Trie root = new Trie();

        for (String s : dictionary) // create trie based on the dictionary
            insert(root, s);

        for (int i = 0; i < board.length; i++) { // each line

            for (int j = 0; j < board[i].length; j++) { // each element

                if (root.child[board[i][j] - 'A'] != null) { // consider only the chars that are child of the root

                    boolean[][] visited = new boolean[board.length][board[i].length];

                    visited[i][j] = true;

                    String word = String.valueOf(board[i][j]);

                    stringSet.addAll(findWord(root.child[board[i][j] - 'A'], board, i, j, word, visited));

                }
            }
        }

        return stringSet;
    }

    /**
     * @param child   the trie that contains the parent as board[i][j]
     * @param board   the board
     * @param i       line
     * @param j       element
     * @param word
     * @param visited
     */
    public Set<String> findWord(Trie child, char[][] board, int i, int j, String word, boolean[][] visited) {

        if (child.leaf)
            stringSet.add(word);

        visited[i][j] = true;

        for (int k = 0; k < 26; k++) { // traverse the trie

            if (child.child[k] != null) {

                char c = (char) (k + 'A'); // next character of the dictionary word

                // directions
                // recursive call

                // right
                if (i < board.length && i >= 0 // safe check
                        && j + 1 < board[0].length && j + 1 >= 0 // safe check
                        && !visited[i][j + 1] // safe check
                        && c == board[i][j + 1])  // is the next char of the dictionary word in the right ?
                {
                    findWord(child.child[k], board, i, j + 1, word + board[i][j + 1], visited);
                }

                // down
                if (i + 1 < board.length && i + 1 >= 0
                        && j < board[0].length && j >= 0
                        && !visited[i + 1][j]
                        && c == board[i + 1][j]) {
                    findWord(child.child[k], board, i + 1, j, word + board[i + 1][j], visited);
                }

                // up
                if (i - 1 < board.length && i - 1 >= 0
                        && j < board[0].length && j >= 0
                        && !visited[i - 1][j]
                        && c == board[i - 1][j]) {
                    findWord(child.child[k], board, i - 1, j, word + board[i - 1][j], visited);
                }

                // left
                if (i < board.length && i >= 0
                        && j - 1 < board[0].length && j - 1 >= 0
                        && !visited[i][j - 1]
                        && c == board[i][j - 1]) {
                    findWord(child.child[k], board, i, j - 1, word + board[i][j - 1], visited);
                }
            }
        }

        return stringSet;
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

}
