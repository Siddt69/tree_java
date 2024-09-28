public class basic2 {
    public static class Node{
        int val;
        Node left,right;
        public Node(int val){
            this.val = val;
            left=right=null;
        }
    }
    public static class binarytree {
        Node root;

        public binarytree() {
            root = null;
        }

        public void insert(int val) {
            root = insertrec(root, val);
        }

        public Node insertrec(Node root, int val) {
            if (root == null) {
                root = new Node(val);
                return root;
            }
            if (val < root.val) {
                root.left = insertrec(root.left, val);
            } else if (val > root.val) {
                root.right = insertrec(root.right, val);
            }
            return root;
        }

        public void preorder(Node root) {
            if (root != null) {
                System.out.print(root.val + " ");
                preorder(root.left);
                preorder(root.right);
            }
        }
    }

    public static void main(String[] args) {
        binarytree tree = new binarytree();
        tree.insert(50);
        tree.insert(40);
        tree.insert(30);
        tree.insert(20);
        tree.insert(60);
        tree.insert(70);
        System.out.print("preorder traversal: ");
        tree.preorder(tree.root);
    }

}
