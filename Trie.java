public class Trie {

    static class Node {// create

        Node[] children;
        boolean eow;// eend of word

        Node() {
            children = new Node[26];
            for (int i = 0; i < children.length - 1; i++) {
                children[i] = null;
            }
            eow = false;

        }
    }

    static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;

        for (int i = 0; i < word.length(); i++) {

            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {// in this case add new node
                curr.children[idx] = new Node();
            }

            if (i == word.length() - 1) {
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx];
        }
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {

            int idx = key.charAt(i) - 'a';
            Node node = curr.children[idx];
            if (node == null) {
                return false;
            }

            if (i == key.length() - 1 && curr.children[idx].eow == false) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;

    }

    // Q.Wordbreak problem
    public static boolean wordBreak(String key) {
        if (key.length() == 0) {
            return true;
        }
        for (int i = 1; i <= key.length(); i++) {
            String firstPart = key.substring(0, i);
            String secondpart = key.substring(i);
            if (search(firstPart) && wordBreak(secondpart)) {
                return true;
            }
        }
        return false;
    }

    // Q.startsWith problem
    public static boolean startsWith(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static int countNode(Node root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                count += countNode(root.children[i]);
            }
        }
        return count + 1;
    }

    /*
     * public static int prefix(Node root){
     * if(root==null){
     * return 0;
     * }
     * 
     * int count=0;
     * for(int i=0;i<26;i++){
     * if (root.children[i] != null) {
     * System.out.println(root.data);
     * count += countNode(root.children[i]);
     * }
     * }
     * 
     * 
     * }
     */

    public static void main(String[] args) {
        /*
         * String words[]={"the","a","there","their","any"};
         * for(int i=0;i<words.length-1;i++){
         * insert(words[i]);
         * }
         * System.out.println(search("there"));
         * System.out.println(search("thorn"));
         * System.out.println(search("an"));
         */

        // wordbreak problem
        /*
         * String words[]={"i","like","sam","samsung","mobile"};
         * String key="ilikesamsung";
         * 
         * for(int i=0;i<words.length;i++){
         * insert(words[i]);
         * }
         * System.out.println(wordBreak(key));
         */

        // startsWith
        /*
         * String words[]={"apple","app","mango","man","woman"};
         * String prefix="asd";
         * 
         * for(int i=0;i<words.length;i++){
         * insert(words[i]);
         * }
         * System.out.println(startsWith(prefix));
         */

        // Count unique substrings
        String str = "ababa";
        for (int i = 0; i < str.length(); i++) {
            String suffix = str.substring(i);// It means: create a new string suffix containing all characters of str
                                             // starting from index i to the end.
            System.out.println(suffix);
            insert(suffix);

        }

        System.out.println("Count of nodes are:" + countNode(root));

    }

}
