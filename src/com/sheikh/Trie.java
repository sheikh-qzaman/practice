package com.sheikh;

class Trie {
    private Trie[] childs;
    private boolean wordEnds;

    public Trie() {
        childs  = new Trie[26];
    }

    public void insert(String word) {
        Trie root = this;
        for (char c : word.toCharArray()) {
            Trie trie = null;
            if ((trie = root.childs[c - 'a']) == null) {
                trie = new Trie();
                root.childs[c - 'a'] = trie;
            }
           root = trie;
        }

        root.wordEnds = true;
    }

    private Trie searchPrefix(String prefix) {
        Trie root = this;
        for (char c : prefix.toCharArray()) {
            if (root.childs[c - 'a'] == null) return null;
            else root = root.childs[c - 'a'];
        }

        return root;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Trie node = searchPrefix(word);

        return node != null && node.wordEnds;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Trie node = searchPrefix(prefix);

        return node != null;
    }
}
