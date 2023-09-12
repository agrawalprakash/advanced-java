package app;

import java.util.ArrayList;

public class BoundaryOfBinaryTree {

      class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

      }

       public void addLeftBoundary(Node node, ArrayList<Integer> answer) {
        
        Node curr = node.left;
        
        while (curr != null) {
            
            if (isLeaf(curr) == false) answer.add(curr.data);
            
            if (curr.left != null) {
                curr = curr.left;
            }
            else {
                curr = curr.right;
            }
            
        }
        
    }
    
    public void addLeafNodes(Node node, ArrayList<Integer> answer) {
        
        if (isLeaf(node) == true) answer.add(node.data);
        
        if (node.left != null) addLeafNodes(node.left, answer);
        
        if (node.right != null) addLeafNodes(node.right, answer);
        
    }
    
    public void addRightBoundaryReverse(Node node, ArrayList<Integer> answer) {
        
        
        ArrayList<Integer> temp = new ArrayList<>();
        
        Node curr = node.right;
        
        while (curr != null) {
            
            if (isLeaf(curr) == false) temp.add(curr.data);
            
            if (curr.right != null) {
                curr = curr.right;
            } else {
                curr = curr.left;
            }
            
        }
        
        for (int i = temp.size()-1; i >= 0; i--) {
            answer.add(temp.get(i));
        }
        
    }
    
    public boolean isLeaf (Node node) {
        
        if (node.left == null && node.right == null) return true;
        
        return false;
        
    }
    
	ArrayList <Integer> boundary(Node node)
	{
	    if (node == null) {
	        return new ArrayList<Integer>();
	    }
	    
	    ArrayList<Integer> answer = new ArrayList<>();
	    
	    if (node.left == null && node.right == null) {
	        
	        answer.add(node.data);
	        return answer;
	        
	    }
	    

	    
	    if (isLeaf(node) == false) answer.add(node.data);
	    
	    addLeftBoundary(node, answer);
	    
	    addLeafNodes(node, answer);
	    
	    addRightBoundaryReverse(node, answer);
	    
	    return answer;
	    
	}
    
}
