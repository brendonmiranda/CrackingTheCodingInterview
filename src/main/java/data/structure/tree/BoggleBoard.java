package data.structure.tree;

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

    public void boggle(char[][] board, List<String> dictionary) {

        Trie root = new Trie();

        // create trie based on the dictionary
        for (String s : dictionary)
            insert(root, s);


        // verify if each letter in the board is a child of the root of the trie
        // consider the ones tha are child of the root. ignore the others
        for (int i = 0; i < board.length; i++) { // loop through lines

            for (int j = 0; j < board[i].length; j++) { // loop through chars


                if (root.child[board[i][j] - 'A'] != null) { // if the char [i][j] is a child of the root

                    boolean[][] visited = new boolean[board.length][board[i].length];
                    visited[i][j] = true;

                    String word = String.valueOf(board[i][j]);

                    traverse(root.child[board[i][j] - 'A'], board, i, j, word, visited);

                }
            }
        }

    }

    /**
     * @param child   the trie that contains the parent as board[i][j]
     * @param board   the board
     * @param i       line
     * @param j       element
     * @param word
     * @param visited
     */
    public void traverse(Trie child, char[][] board, int i, int j, String word, boolean[][] visited) {

        if (child.leaf)
            System.out.println(word);

        visited[i][j] = true;

        for (int k = 0; k < 26; k++) {
            if (child.child[k] != null) {

                char c = (char) (k + 'A');

                if (i < board.length && i >= 0
                        && j + 1 < board[1].length && j + 1 >= 0
                        && !visited[i][j + 1]
                        && c == board[i][j + 1]) {
                    traverse(child.child[k], board, i, j + 1, word + board[i][j + 1], visited);
                }

                if (i + 1 < board.length && i + 1 >= 0
                        && j < board[1].length && j >= 0
                        && !visited[i + 1][j]
                        && c == board[i + 1][j]) {
                    traverse(child.child[k], board, i + 1, j, word + board[i + 1][j], visited);
                }

                if (i - 1 < board.length && i - 1 >= 0
                        && j < board[1].length && j >= 0
                        && !visited[i - 1][j]
                        && c == board[i - 1][j]) {
                    traverse(child.child[k], board, i - 1, j, word + board[i - 1][j], visited);
                }

                if (i < board.length && i >= 0
                        && j - 1 < board[1].length && j - 1 >= 0
                        && !visited[i][j - 1]
                        && c == board[i][j - 1]) {
                    traverse(child.child[k], board, i, j - 1, word + board[i][j - 1], visited);
                }

            }
        }

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
