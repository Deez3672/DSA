/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BSTSample;

/**
 *
 * @author sehan
 */
public class BST {
 
    Node1 root;
    
    public BST(){
        root = null;
    }
    
    public void delete(int key){
        root = deleteNode(root, key);
    }
    // Function to delete a node in BST
    public Node1 deleteNode(Node1 root, int key) {
        if (root == null) {
            return root;
        }
        if (key < root.key) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.key) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // Node with two children: Get the inorder successor (smallest
            // in the right subtree)
            root.key = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteNode(root.right, root.key);
        }

        return root;
    }
    
    // Function to find the minimum value node in the tree
    public int minValue(Node1 root) {
        int minValue = root.key;
        while (root.left != null) {
            minValue = root.left.key;
            root = root.left;
        }
        return minValue;
    }
    
    // A utility function to insert a new key in BST
    public void insert(int key) {
        root = insertRec(root, key);
    }

    public Node1 insertRec(Node1 root, int key) {
        // If the tree is empty, return a new node
        if (root == null) {
            root = new Node1(key);
            return root;
        }

        // Otherwise, recur down the tree
        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    // This method mainly calls inorderRec()
    public void inOrder() {
        inOrderRec(root);
        System.out.println();
    }

    // A utility function to do inorder traversal of BST
    public void inOrderRec(Node1 root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.key + " ");
            inOrderRec(root.right);
        }
    }
    
    public void postOrder() {
        postOrderRec(root);
        System.out.println();
    }
    
    // A utility function to do inorder traversal of BST
    void postOrderRec(Node1 root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.key + " ");
        }
    }
    
    public void preOrder() {
        preOrderRec(root);
        System.out.println();
    }
    
    // A utility function to do inorder traversal of BST
    public void preOrderRec(Node1 root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
