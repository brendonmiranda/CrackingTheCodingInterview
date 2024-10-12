package aws;

import java.util.Comparator;
import java.util.List;

public class GetMaxCharge {

    private class Node {
        Node left;
        Node right;
        Integer value;
    }

    public long getMaxCharge(List<Integer> charge) {

        Node root = new Node();

        Node child = root;
        Node prev = null;
        for (int i = 0; i < charge.size(); i++) {
            child.left = prev;
            child.value = charge.get(i);
            prev = child;

            if (!(i == charge.size() - 1)) {
                child.right = new Node();
                child = child.right;
            }
        }

        charge.sort(Comparator.naturalOrder());

        for (int i = 0; i < charge.size() - 1; i++) {

            child = root;
            while (child.value != charge.get(i)) {
                child = child.right;
                if (child == null)
                    break;
            }
            if (child == null)
                continue;

            if (child.left != null
                    && child.right != null) {
                child.left.value += child.right.value;

                child.right.left = child.left;
                child.left.right = child.right;
                child = child.left;

                child.right = child.right.right;

                if(child.right != null)
                    child.right.left = child;
                continue;
            }


            if (child.left == null) {
                root = child.right;
                root.left = null;
            } else if (child.right == null) {
                child = child.left;
                child.right = null;
            }

        }

        return root.value;


    }

}
