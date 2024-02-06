package app;

public class ImplementTrie {
    private Node root;
    
    class Node {
        
        char ch;
        boolean isWord;
        Node[] children;
        
        public Node (char ch) {
            
            this.ch  = ch;
            this.isWord = false;
            this.children = new Node[26];
            
        }
    }

    public ImplementTrie() {
        
        root = new Node('\0');
        
    }
    
    public void insert(String word) {
        
        Node curr = root;
        
        for (int i = 0; i < word.length(); i++) {
            
            char ch = word.charAt(i);
            
            if (curr.children[ch-'a'] == null) {
                curr.children[ch-'a'] = new Node(ch);
            }
            
            curr = curr.children[ch-'a'];
        }
        
        curr.isWord = true;
        
    }
    
    public boolean search(String word) {
        
        Node found = null;
        
        if (word != null && word.length() != 0) {
            
            found = helper(word);
            
        }
            
        return (found != null && found.isWord == true);
            
        
        
    }
    
    public boolean startsWith(String prefix) {
        
        Node found = null;
        
        if (prefix != null && prefix.length() != 0) {
            
            found = helper(prefix);
            
        }
        
        return found != null;
        
    }
    
    private Node helper(String word) {
        
        Node curr = root;
        
        for (int i = 0; i < word.length(); i++) {
            
            char ch = word.charAt(i);
            
            if (curr.children[ch-'a'] == null) {
                return null;
            }
            
            curr = curr.children[ch-'a'];
            
        }
        
        return curr;
        
    }
    
}
