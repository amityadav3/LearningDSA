package tree.BST;

public class Tree {
    private TreeNode root;
    public void insert(int value){
        if(root == null){
            root = new TreeNode(value);
        }else{
            root.insert(value);
        }
    }
    public void traversePreorder() {
        if(root != null){
            root.traversePreorder();
        }
    }
    public void traverseInorder(){
        if(root != null){
            root.traverseInorder();
        }
    }

    public void traversePostorder(){
        if(root != null){
            root.traversePostorder();
        }
    }

    public TreeNode get(int data){
        if(root != null){
            return root.get(data);
        }
        return null;
    }
    public int getMin(){
        if(root == null)    return Integer.MIN_VALUE;
        else return root.getMin();
    }
    public int getMax(){
        if(root == null)    return Integer.MAX_VALUE;
        else return root.getMax();
    }

    public void delete(int data) {
        root = delete(root, data);
    }

    private TreeNode delete(TreeNode subtreeRoot, int data) {
        if(subtreeRoot == null) return null;

        if(data < subtreeRoot.getValue()){
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), data));
        } else if (data > subtreeRoot.getValue()) {
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), data));
        } else{
            if(subtreeRoot.getLeftChild() == null){
                return subtreeRoot.getRightChild();
            } else if (subtreeRoot.getRightChild() == null) {
                return subtreeRoot.getLeftChild();
            }else {
                // Case: 0,1 children
                subtreeRoot.setValue(subtreeRoot.getRightChild().getMin());
                subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), subtreeRoot.getValue()));
            }
        }
        return subtreeRoot;
    }
}
