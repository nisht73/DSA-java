public class Questions {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean univalued(Node root) {
        if (root == null) {
            return true;
        }

        return check(root, root.data);
    }

    private static boolean check(Node node, int value) {
        if (node == null) {
            return true;
        }

        if (node.data != value) {
            return false;
        }

        return check(node.left, value) &&
                check(node.right, value);
    }

    public static Node invertTree(Node root) {
        if (root == null) {
            return null;
        }

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public static void preorder(Node root) {
        if (root == null) {
            // System.out.print(-1);
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static Node deleteLeafNode(Node root , int x) {
        if(root == null) {
            return null;
        }
        root.left = deleteLeafNode(root.left, x);
        root.right = deleteLeafNode(root.right, x);

        if(root.left == null && root.right == null && root.data == x) {
            return null;
        }

        return root;
    }


static int maxSum;

public static int PathSum(Node root) {
    maxSum = Integer.MIN_VALUE;
    maxGain(root);
    return maxSum;
}

private static int maxGain(Node root) {
    if (root == null) {
        return 0;
    }

    int leftSum = Math.max(0, maxGain(root.left));
    int rightSum = Math.max(0, maxGain(root.right));

    int currentPath = root.data + leftSum + rightSum;

    maxSum = Math.max(maxSum, currentPath);

    return root.data + Math.max(leftSum, rightSum);
}

    public static void main(String[] args) {
        /*
         * 1
         * / \
         * 2 3
         * / \
         * 5 2
         * 
         */

        Node root = new Node(2);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(5);
        root.left.right = new Node(2);
        // System.out.println(univalued(root));

        // invertTree(root);
        // deleteLeafNode(root, 5);
        // preorder(root);

        System.out.println(PathSum(root));

    }
}
