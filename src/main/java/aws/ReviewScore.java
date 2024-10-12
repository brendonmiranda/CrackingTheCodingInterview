package aws;

public class ReviewScore {

    private class Trie {
        Trie[] alpha = new Trie[26];
        boolean leaf;
    }

    public int amazonReviewScore(String review, String[] prohibitedWords) {

        final Trie root = new Trie();
        for (String prohibitedWord : prohibitedWords) {

            insert(root, prohibitedWord);
        }

        int max = 0;
        for (int i = 0; i < review.length(); i++) {

            int count = 0;
            Trie child = root;
            for (int j = i; j < review.length(); j++) {

                int rep = review.toUpperCase().charAt(j) - 'A';
                if (child.alpha[rep] != null) {

                    child = child.alpha[rep];

                    if (child.leaf) {
                        max = Math.max(count, max);
                        break;
                    } else {
                        count += 1;
                    }

                } else {
                    child = root;
                    if (child.alpha[rep] != null) {
                        // copy paste logic above
                        child = child.alpha[rep];

                        if (child.leaf) {
                            max = Math.max(count, max);
                            break;
                        } else {
                            count += 1;
                        }
                        //
                    } else {
                        count += 1;
                    }
                }
                max = Math.max(count, max);
            }
        }

        return max;
    }

    private Trie insert(Trie root, String key) {

        Trie child = root;

        for (int i = 0; i < key.length(); i++) {

            int l = key.toUpperCase().charAt(i) - 'A';

            if (child.alpha[l] == null) {
                child.alpha[l] = new Trie();
                child = child.alpha[l];
            } else {
                child = child.alpha[l];
            }
        }
        child.leaf = true;

        return root;
    }


}
