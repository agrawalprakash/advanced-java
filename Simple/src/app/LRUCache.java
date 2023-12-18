package app;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
        class Node {
        
        Node prev, next;
        int key, value;
        
        Node (int key, int value) {
            
            this.key = key;
            this.value = value;
            
        }
        
    }
    
    Node head = new Node(0, 0);
    Node tail = new Node(0, 0);
    
    Map<Integer, Node> map = new HashMap<>();
    int capacity;
    
    

    public LRUCache(int capacity) {
        
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
        
    }
    
    public int get(int key) {
        
        if (map.containsKey(key)) {
            
            Node node = map.get(key);
            
            remove(node);
            
            insert(node);
            
            return node.value;
            
        }
        
        return -1;
        
    }
    
    public void put(int key, int value) {
        
        if (map.containsKey(key)) {
            
            remove(map.get(key));
        }
        
       if (capacity == map.size()) {
           
           remove(tail.prev);
       }
        
       insert (new Node (key, value));
        
    }
    
    void remove(Node node) {
        
        map.remove(node.key);
        
        node.prev.next = node.next;
        node.next.prev = node.prev;
        
    }
    
    void insert (Node node) {
        
        map.put(node.key, node);
        
        Node headNext = head.next;
        head.next = node;
        node.prev = head;
        
        headNext.prev = node;
        node.next = headNext;
        
    }
}
