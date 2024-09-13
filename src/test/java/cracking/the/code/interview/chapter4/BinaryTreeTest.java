package cracking.the.code.interview.chapter4;

import org.junit.jupiter.api.Test;

public class BinaryTreeTest {

    @Test
    public void test() {
        final BinaryTree binaryTree = new BinaryTree();
        final BinaryTree.Node root = new BinaryTree.Node(8);

        // this is an example of a binary search tree
        binaryTree.insert(root, 10);
        binaryTree.insert(root, 4);
        binaryTree.insert(root, 2);
        binaryTree.insert(root, 1);
        binaryTree.insert(root, 6);
        binaryTree.insert(root, 20);

        binaryTree.inOrderTraversal(root);
    }

}
