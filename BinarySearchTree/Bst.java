package BinarySearchTree;

import javax.swing.tree.TreeNode;

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class Bst {
    Node root;

    public Bst() {
        root = null;
    }

    // Insert a new key in the BST
    void insert(int data) {
        root = insertRec(root, data);
    }

    Node insertRec(Node root, int data) {
        if (root == null) return new Node(data);
        if (data < root.data) root.left = insertRec(root.left, data);
        else if (data > root.data) root.right = insertRec(root.right, data);
        return root;
    }

    // Inorder traversal (sorted order)
    void inorder() {
        inorderRec(root);
        System.out.println();
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }


    // Delete a node from BST
    public static Node deleteNode(Node root, int t) {
        if (root == null) return null;

        if (t < root.data) root.left = deleteNode(root.left, t);
        else if (t > root.data) root.right = deleteNode(root.right, t);
        else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;

            Node successor = findMin(root.right);
            root.data = successor.data;
            root.right = deleteNode(root.right, successor.data);
        }
        return root;
    }

    static Node findMin(Node root) {
        while (root.left != null) root = root.left;
        return root;
    }

    // Preorder traversal
    static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Finding Predecessor and Successor
    static int[] findPredSucc(Node root, int key) {
        int pred = -1, succ = -1;
        Node temp = null;
        boolean found = false;

        Node curr = root;
        while (curr != null) {
            if (curr.data == key) {
                if (curr.left != null) {
                    Node tempNode = curr.left;
                    while (tempNode.right != null) tempNode = tempNode.right;
                    pred = tempNode.data;
                }
                if (curr.right != null) {
                    Node tempNode = curr.right;
                    while (tempNode.left != null) tempNode = tempNode.left;
                    succ = tempNode.data;
                }
                break;
            } else if (curr.data < key) {
                pred = curr.data;
                curr = curr.right;
            } else {
                succ = curr.data;
                curr = curr.left;
            }
        }
        return new int[]{pred, succ};
    }


    //  public static void inorderMorris(Node root) {
    //     Node current = root;
        
    //     while (current != null) {
    //         if (current.left == null) {
    //             // Print the current node if there is no left subtree
    //             System.out.print(current.data + " ");
    //             current = current.right;
    //         } else {
    //             // Find the inorder predecessor of current
    //             Node predecessor = current.left;
    //             while (predecessor.right != null && predecessor.right != current) {
    //                 predecessor = predecessor.right;
    //             }

    //             if (predecessor.right == null) {
    //                 // Make current the right child of its inorder predecessor (threading)
    //                 predecessor.right = current;
    //                 current = current.left;
    //             } else {
    //                 // Revert changes (restore the original tree structure)
    //                 predecessor.right = null;
    //                 System.out.print(current.data + " ");
    //                 current = current.right;
    //             }
    //         }
    //     }
    // }

    public static void morristraversal(Node root){
        // if(root==null) return;
        Node current = root;

        while(current!=null){
            if(current.left!=null){
                Node pred=root.left;
                while(pred.right!=null && pred.right!=current){
                    pred=pred.right;
                }
    
                if(pred.right==null){
                    pred.right=current;
                    current=current.left;
                }else{
                    pred.right=null;
                    System.out.println(current.data);
                    current=current.right;
                }
            }
            else{
                System.out.print(current.data + " ");
                current=current.right;
            }
        }
       


    }

    public static void main(String[] args) {
        Bst bst = new Bst();

        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int value : values) {
            bst.insert(value);
        }

        System.out.println("Inorder before deletion:");
        bst.inorder();

        // Updating root after deletion
        bst.root = deleteNode(bst.root, 5);

        System.out.println("Inorder after deleting 5:");
        bst.inorder();

        System.out.println("Preorder after deleting 5:");
        preorder(bst.root);
        System.out.println();

        // Finding predecessor and successor
        int[] predSucc = findPredSucc(bst.root, 8);
        System.out.println("Predecessor of 8: " + predSucc[0]);
        System.out.println("Successor of 8: " + predSucc[1]);

        System.out.println();
        
        morristraversal(bst.root);

    }
}
