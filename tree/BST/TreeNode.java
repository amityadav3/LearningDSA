package tree.BST;

public class TreeNode {
    private int value;
    private TreeNode leftChild;
    private TreeNode rightChild;
    public TreeNode(int value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "Data = " + value;
    }
    public void insert(int data){
        if(value == data){
            return;
        }
        if(value>data){
            if(leftChild == null){
                leftChild = new TreeNode(data);
            }
            else{
                leftChild.insert(data);
            }
        }else{
            if(rightChild == null){
                rightChild = new TreeNode(data);
            }else{
                rightChild.insert(data);
            }
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public void traversePreorder() {
        System.out.print(value + ", ");
        if(leftChild != null){
            leftChild.traversePreorder();
        }
        if(rightChild != null){
            rightChild.traversePreorder();
        }
    }

    public void traverseInorder() {
        if(leftChild != null){
            leftChild.traverseInorder();
        }
        System.out.print(value + ", ");
        if(rightChild != null){
            rightChild.traverseInorder();
        }
    }

    public void traversePostorder() {
        if(rightChild != null){
            rightChild.traverseInorder();
        }
        System.out.print(value + ", ");
        if(leftChild != null){
            leftChild.traverseInorder();
        }
    }

    public TreeNode get(int data){
        if(value == data){
            return this;
        }
        if(data < value){
            if(leftChild != null){
                return leftChild.get(data);
            }
        }else{
            if(rightChild != null){
                return rightChild.get(data);
            }
        }
        return null;
    }

    public int getMin(){
        if(leftChild == null)
            return value;
        else return leftChild.getMin();
    }
    public int getMax(){
        if(rightChild == null)
            return value;
        else return rightChild.getMax();
    }


}
