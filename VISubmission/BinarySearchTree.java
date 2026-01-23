/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VISubmission;

/**
 *
 * @author user
 */
public class BinarySearchTree {

    class Node {
        int key;
        Node left, right;

        Node(int item) {
            key = item;
        }
    }

    Node root;

    Node insert(Node root, int key) {
        if (root == null)
            return new Node(key);

        if (key < root.key)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);

        return root;
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }
    
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        System.out.print("Inorder traversal: ");
        tree.inorder(tree.root);
    }
    
}
