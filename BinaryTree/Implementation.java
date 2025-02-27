import java.util.*;

public class Implementation {

    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    public static int size;

    // pre order traversal
    public static void display(Node root) {

        if (root == null)
            return;
        System.out.print(root.val + "->");
        if (root.left != null)
            System.out.print(root.left.val + "->");
        if (root.right != null)
            System.out.print(root.right.val + "->");
        System.out.println();
        display(root.left);
        display(root.right);
    }

    public static void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.val + "->");
        size++;
        preOrder(root.left);
        preOrder(root.right);
    }

    public static int size(Node root) {
        if (root == null)
            return 0;
        return 1 + size(root.left) + size(root.right);

    }

    public static int sum(Node root) {
        if (root == null)
            return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    public static int max(Node root) {
        if (root == null)
            return 0;

        return Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }

    public static int height(Node root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 0;
            
        return 1 + Math.max(height(root.left), height(root.right));
    }

    // level order traversal
    public static void nthLevel(Node root, int n) {
        if (root == null)
            return;
        if (n == 1)
            System.out.print(root.val + " ");
        nthLevel(root.left, n - 1);
        nthLevel(root.right, n - 1);
    }

    public static void bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.peek();
            if (temp.left != null)
                q.add(temp.left);
            if (temp.right != null)
                q.add(temp.right);

            System.out.print(temp.val + " ");
            q.remove();
        }

    }
 static int cur=0;
    public static int diameter(Node root) {
        if (root == null)
        return 0;
    if (root.left == null && root.right == null)
        return 0;

        int leftAns=diameter(root.left);
        int rightAns=diameter(root.right);

        int mid = height(root.left)+height(root.right);
        if(root.right!=null) mid++;
        if(root.left!=null) mid++;
        int max=Math.max(leftAns, Math.max(rightAns, mid));
        return max;
    }

    public static boolean balanceTree(Node root){
        if (root==null) return true;
        int lh=height(root.left);
        if(root.left!=null) lh++;
        int rh=height(root.right);
        if(root.right!=null) rh++;
        int d=lh-rh;
        if (d<0) d=-d;
        if (d>1) return false;
        return (balanceTree(root.left) && balanceTree(root.right));
    }

    public static void mirrorTree(Node root){
        if(root==null) return ;
       Node temp=root.left;
       root.left=root.right;
       root.right=temp;
       mirrorTree(root.left);
       mirrorTree(root.right);

    }
    public static void main(String[] args) {
        Node root = new Node(2);
        Node a = new Node(4);
        Node b = new Node(10);
        root.left = a;
        root.right = b;
        Node c = new Node(6);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(11);
        b.right = e;
        Node f = new Node(11);
        e.right=f;
        Node g = new Node(11);
        f.right=g;
        display(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        System.out.println(size);
        System.out.println(size(root));
        System.out.println(sum(root));
        System.out.println(max(root));
        System.out.println(height(root));
        nthLevel(root, 3);
        System.out.println();
        bfs(root);
        System.out.println();
        System.out.println(diameter(root));
        System.out.println(balanceTree(root));
       mirrorTree(root);
       System.out.println(root.left.val);
    }
}
