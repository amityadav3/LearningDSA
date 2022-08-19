package tree.BST;

public class Main {
    public static void main(String[] args) {
        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);
        intTree.insert(17);

        intTree.traverseInorder();
        System.out.println();
        intTree.traversePostorder();
        System.out.println();
        intTree.traversePreorder();
        System.out.println();
        System.out.println(intTree.get(32));
        System.out.println(intTree.get(22));
        System.out.println(intTree.get(322));
        System.out.println();
        System.out.println("Min Value : "+intTree.getMin());
        System.out.println();
        System.out.println("Max Value : "+intTree.getMax());

        System.out.println();

        intTree.delete(15);
        intTree.traverseInorder();
        System.out.println();
    }
}
