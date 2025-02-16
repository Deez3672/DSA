package bstwithrecursive;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sehan
 */
public class BinarySearchTree {
   Node2 root;

    public BinarySearchTree() {
        root = null;
    }

    // Method to insert a new node with given key
    public void insert(int key) {
        root = insertRec(root, key);
    }

    private Node2 insertRec(Node2 root, int key) {
        Node2 newNode = new Node2(key); //create a node using the key
        if (root == null) {
            root = newNode;
            return root;
        }

        if (key < root.data)
            root.leftChild = insertRec(root.leftChild, key);
        else if (key > root.data)
            root.rightChild = insertRec(root.rightChild, key);

        return root;
    }

    public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node2 root) {
        if (root != null) {
            inorderRec(root.leftChild);
            System.out.print(root.data + " ");
            inorderRec(root.rightChild);
        }
    }

    public boolean search(int key) {
        return searchRec(root, key);
    }

    private boolean searchRec(Node2 root, int key) {
        if (root == null)
            return false;

        if (root.data == key)
            return true;

        if (key < root.data)
            return searchRec(root.leftChild, key);
        else
            return searchRec(root.rightChild, key);
    }

    public int findMin() {
        return findMinRec(root);
    }

    private int findMinRec(Node2 root) {
        if (root == null)
            throw new IllegalStateException("Tree is empty");

        if (root.leftChild == null)
            return root.data;

        return findMinRec(root.leftChild);
    }

    public int findMax() {
        return findMaxRec(root);
    }

    private int findMaxRec(Node2 root) {
        if (root == null)
            throw new IllegalStateException("Tree is empty");

        if (root.rightChild == null)
            return root.data;

        return findMaxRec(root.rightChild);
    }

    // Method to delete a node
    public void delete(int key) {
        root = deleteRec(root, key);
    }

    private Node2 deleteRec(Node2 root, int key) {
        // Base case: if the tree is empty
        if (root == null) {
            return root;
        }
        // Recur down the tree
        if (key < root.data) {
            root.leftChild = deleteRec(root.leftChild, key);
        } else if (key > root.data) {
            root.rightChild = deleteRec(root.rightChild, key);
        } else {
            // Node with only one child or no child
            if (root.leftChild == null) {
                return root.rightChild;
            } else if (root.rightChild == null) {
                return root.leftChild;
            }
            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.data = findMinRec(root.rightChild);

            // Delete the inorder successor
            root.rightChild = deleteRec(root.rightChild, root.data);
        }
        return root;
    }  
}
