package tree.BSTPractice;

public class Tree {
    private TreeNode root;
    public void insert(int value) {
        if (root == null){
            root = new TreeNode(value);
        }
        else {
            root.insert(value);
        }
    }

    public void traverseInorder() {
        if(root!=null){
            root.traverseInorder();
        }
    }

    public void traversePreorder() {
        if(root!=null){
            root.traversePreorder();
        }
    }

    public void traversePostorder() {
        if(root!=null){
            root.traversePostorder();
        }
    }

    public int getMin() {
        if(root == null){
            return Integer.MIN_VALUE;
        }
       else return root.getMin();
    }

    public int getmax() {
        if(root != null)    return root.getMax();
        else return Integer.MAX_VALUE;
    }

    public boolean find(int value) {
        if(root!=null)  return root.find(value);
        return false;
    }

    public void delete(int value) {
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subtreeRoot, int value) {
        if(subtreeRoot == null) {
            return null;
        }

        if(value < subtreeRoot.getData()){
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
        } else if (value > subtreeRoot.getData()) {
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
        } else {
            // Case 1 and 2 : node to delete has 0 or 1 child
            if(subtreeRoot.getLeftChild() == null){
                return subtreeRoot.getRightChild();
            } else if (subtreeRoot.getRightChild() == null) {
                return subtreeRoot.getLeftChild();
            }
            // Case 3 : node to delete has 2 children
            // Replace the value in the subtree node with the smallest value from the right subtree
                subtreeRoot.setData(subtreeRoot.getRightChild().getMin());
            // Delete the node that has smallest value in right subtree
                subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), subtreeRoot.getData()));
        }
        return subtreeRoot;
    }
}
