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


}
