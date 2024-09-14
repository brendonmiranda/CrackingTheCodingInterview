package cracking.the.code.interview.chapter4;

public class BinaryTree {

    public static class Node {

        Node left;
        Node right;
        Integer value;

        Node(int value) {
            this.value = value;
        }

    }

    public Node insert(Node root, int v) {

        if (root == null) {
            root = new Node(v);
            return root;
        }

        if (v < root.value)
            root.left = insert(root.left, v);
        else if (v > root.value)
            root.right = insert(root.right, v);

        return root;
    }

    public Node search(Node root, int v) {

        if (root == null) {
            throw new RuntimeException(v + " Not found.");
        }

        if (v == root.value) {
            return root;
        }else if (v < root.value ) {
            return search(root.left, v);
        } else {
            return search(root.right, v);
        }

    }

    public void inOrderTraversal(Node n) {
        if (n != null) {
            inOrderTraversal(n.left);
            System.out.println(n.value);
            inOrderTraversal(n.right);
        }
    }

    public void preOrderTraversal(Node n) {
        if (n != null) {
            System.out.println(n.value);
            preOrderTraversal(n.left);
            preOrderTraversal(n.right);
        }
    }

    public void postOrderTraversal(Node n) {
        if (n != null) {
            postOrderTraversal(n.left);
            postOrderTraversal(n.right);
            System.out.println(n.value);
        }
    }

}
