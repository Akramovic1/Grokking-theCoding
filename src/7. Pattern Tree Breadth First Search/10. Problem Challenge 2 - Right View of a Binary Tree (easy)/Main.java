import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null)
            return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int levelSize = q.size();
            for(int i = 0; i < levelSize; i++){
                TreeNode curr = q.poll();
                if(i == levelSize - 1)
                    result.add(curr.val);
                if(curr.left != null)
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
            }
        }
        return result;
    }

    public static void main(String[]args) {

    }
}
