package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class DistanceKNodesInBinaryTree {

public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
 


    private void markParents(TreeNode root, Map<TreeNode, TreeNode> parent_track) {

        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.offer(root);

        while (!queue.isEmpty()) {

            TreeNode current = queue.poll();

            if (current.left != null) {
                parent_track.put(current.left, current);
                queue.offer(current.left);
            }

            if (current.right != null) {
                parent_track.put(current.right, current);
                queue.offer(current.right);
            }

        }

    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        Map<TreeNode, TreeNode> parent_track = new HashMap<>();

        markParents(root, parent_track);

        Map<TreeNode, Boolean> visited = new HashMap<>();

        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.offer(target);

        visited.put(target, true);

        int curr_level = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();

            if (curr_level == k) break;

            curr_level++;

            for (int i = 0; i < size; i++) {

                TreeNode current = queue.poll();

                if (current.left != null && visited.get(current.left) == null) {
                    queue.add(current.left);
                    visited.put(current.left, true);
                }

                if (current.right != null && visited.get(current.right) == null) {
                    queue.add(current.right);
                    visited.put(current.right, true);
                }

                if (parent_track.get(current) != null && visited.get(parent_track.get(current)) == null) {

                    queue.add(parent_track.get(current));
                    visited.put(parent_track.get(current), true);

                }

            }


        }

        List<Integer> answer = new ArrayList<>();

        while (!queue.isEmpty()) {

            TreeNode current = queue.poll();

            answer.add(current.val);

        }

        return answer;

    }
    
}
