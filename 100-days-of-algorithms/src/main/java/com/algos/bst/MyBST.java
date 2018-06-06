package com.algos.bst;

public class MyBST {
    public static void main(String[] args) {
        MyBST bst = new MyBST();


        bst.insert(4);
        bst.insert(5);
        bst.insert(1);
        bst.insert(2);
        bst.insert(3);

        bst.inorder();

        System.out.println();

        //bst.delete(3);

        //bst.deleteRange(2,4);

        bst.inorder();

        System.out.println();

        System.out.println(bst.isBalanced());

        //System.out.println(bst.getDepth());
    }

    Node root;
    class Node {
        int data;
        Node right;
        Node left;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public void insert(int data) {
        Node node = new Node(data);

        if(root == null) {
            root = node;
            return;
        }

        Node parent = root;
        Node current = null;

        while(true) {
            current = parent;

            if(data < current.data) {
                current = current.left;

                if(current == null) {
                    parent.left = node;
                    return;
                }
            } else {
                current = current.right;

                if(current == null) {
                    parent.right = node;
                    return;
                }
            }
            parent = current;
        }
    }


    public void deleteRange(int min, int max) {
        this.root = deleteRange(this.root, min, max);
    }

    private Node deleteRange(Node node, int min, int max) {
        if(node == null) {
            return node;
        }

        node.left = deleteRange(node.left, min, max);
        node.right = deleteRange(node.right, min, max);

        if(node.data < min) {
            return node.right;
        }

        if(node.data > max) {
            return node.left;
        }

        return node;
    }

    public void delete(int data) {
        root = delete(root, data);
    }

    private Node delete(Node root, int data) {
        if(root == null) {
            return root;
        }

        if(data < root.data) {
            root.left = delete(root.left, data);
        } else if(data > root.data) {
            root.right = delete(root.right, data);
        } else {
            if(root.left == null) {
                return root.right;
            } else if(root.right == null) {
                return root.left;
            }

            root.data = minValue(root.right);;

            root.right = delete(root.right, root.data);
        }

        return root;
    }

    private int minValue(Node root) {
        int minValue = root.data;

        while (root.left != null) {
            minValue = root.data;
            root = root.left;
        }

        return minValue;
    }

    public void inorder() {
        inorder(root);
    }

    public void inorder(Node node) {
        if(node == null) {
            return;
        }

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public boolean isBalanced() {
        return (getHeight(this.root) == -1) ? false : true;
    }

    private int getHeight(Node node) {
        if(node == null) {
            return 0;
        }

        int leftHeight = getHeight(node.left);
        if(leftHeight == -1) {
            return -1;
        }

        int rightHeight = getHeight(node.right);
        if(rightHeight == -1) {
            return -1;
        }

        if(Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public int getDepth() {
        return getDepth(root);
    }

    private int getDepth(Node node) {
        if(node == null) {
            return 0;
        }

        return 1 + Math.max(getDepth(node.left), getDepth(node.right));
    }
}
