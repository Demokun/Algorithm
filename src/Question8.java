import java.util.*;
public class Question8 {
    public TreeNodeWithParent nextNode(TreeNodeWithParent root){
        if(root == null){
            return root;
        }
        //System.out.println(root.val);
        if(root.right != null){
            TreeNodeWithParent pNode = root.right;
            while(pNode.left != null){
                pNode = pNode.left;
            }
            return pNode;
        }
        TreeNodeWithParent parentNode = root.parent;
        if(parentNode.left == root){
            return parentNode;
        }
        while(parentNode != null){
            if(parentNode.parent.left == parentNode){
                return parentNode.parent;
            }
            parentNode = parentNode.parent;
        }
        return null;
    }
    public static void main(String[] args){
        TreeNodeWithParent root = new TreeNodeWithParent(1);
        TreeNodeWithParent b = new TreeNodeWithParent(2);
        TreeNodeWithParent c = new TreeNodeWithParent(3);
        TreeNodeWithParent d = new TreeNodeWithParent(4);
        TreeNodeWithParent e = new TreeNodeWithParent(5);
        TreeNodeWithParent f = new TreeNodeWithParent(6);
        TreeNodeWithParent g = new TreeNodeWithParent(7);
        TreeNodeWithParent h = new TreeNodeWithParent(8);
        TreeNodeWithParent i = new TreeNodeWithParent(9);
        root.left = b;
        root.right = c;
        root.parent = null;
        b.right = e;
        b.left = d;
        b.parent = root;
        c.left = f;
        c.right = g;
        c.parent = root;
        d.right = null;
        d.left = null;
        d.parent = b;
        e.left = h;
        e.right = i;
        e.parent = b;
        f.right =null;
        f.left = null;
        f.parent = c;
        g.left = null;
        g.right = null;
        g.parent = c;
        h.right = null;
        h.left = null;
        h.parent = e;
        i.left = null;
        i.right = null;
        i.parent = e;
        Question8 q = new Question8();
        System.out.println(q.nextNode(h).val);

    }
}
