package tree.BSTPractice;

public class TreeNode {
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if(data == value) {
            return;
        } else if(value < data) {
            if(leftChild == null) {
                leftChild = new TreeNode(value);
            }else {
                leftChild.insert(value);
            }
        } else if (value > data) {
            if(rightChild == null){
                rightChild = new TreeNode(value);
            }else {
                rightChild.insert(value);
            }
        }
    }
    public void traverseInorder() {
        if(leftChild!=null){
            leftChild.traverseInorder();
        }
        System.out.print(data + ", ");
        if(rightChild!=null){
            rightChild.traverseInorder();
        }
    }

    public void traversePreorder() {
        System.out.print(data + ", ");
        if(leftChild!=null){
            leftChild.traversePreorder();
        }
        if(rightChild!=null){
            rightChild.traversePreorder();
        }
    }

    public void traversePostorder() {
        if(leftChild!=null){
            leftChild.traversePostorder();
        }
        if(rightChild!=null){
            rightChild.traversePostorder();
        }
        System.out.print(data + ", ");
    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
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

    public int getMin() {
        if(leftChild == null)
            return data;
        else return leftChild.getMin();
    }

    public int getMax() {
        if(rightChild == null)  return data;
        else return rightChild.getMax();
    }

    public boolean find(int value) {
        if(data == value)   return true;
        else if(value < data){
            if(leftChild != null)
                return leftChild.find(value);
        } else if(value > data){
            if(rightChild != null)
                return rightChild.find(value);
        }
        return false;
    }
}
