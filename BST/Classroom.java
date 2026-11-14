package BST;

import java.util.ArrayList;
public class Classroom {

    static  class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static void preorder(Node root) {
        if(root == null) {
            return;
        }
        System.out.println(root.data + " ");
        preorder(root.left);
        preorder(root.right);

    }
    public static Node createMirror(Node root) {
        if(root == null) {
            return null;
        }
        Node leftSubtree = createMirror(root.left);
        Node rightSubtree = createMirror(root.right);
        
        root.left = rightSubtree;
        root.right = leftSubtree;
        return root;
    }
    // public static Node createBst(int arr[], int st, int end) {
    //     if(st>end){
    //         return null;
    //     }
    //     int mid = (st+end)/2;
    //     Node root = new Node(arr[mid]);
    //     root.left = createBst(arr, st, mid-1);
    //     root.right = createBst(arr, mid+1, end);
    //     return root;

    // }
    public static Node createBst(ArrayList<Integer> inorder, int st, int end) {
        if(st>end){
            return null;
        }
        int mid = (st+end)/2;
        Node root = new Node(inorder.get(mid));
        root.left = createBst(inorder, st, mid-1);
        root.right = createBst(inorder, mid+1, end);
        return root;

    }

    public static void getInorder(Node root , ArrayList<Integer> inorder) {
        if(root == null) {
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }
    public static Node balancedBst(Node root) {
        //inorder seq
        ArrayList<Integer> inorder = new ArrayList<>();
        getInorder(root, inorder);

        // sorted inorder -> balanced BST 
        root = createBst(inorder, 0, inorder.size()-1);
        return root;
    }
     
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        
        // root = createMirror(root);
        // preorder(root);

        // int arr[] = {3,5,6,8,10,11,12};
        // Node root = createBst(arr, 0, arr.length-1);
        // preorder(root);
        root = balancedBst(root);
        preorder(root);
    }

}
