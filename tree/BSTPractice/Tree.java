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
}
