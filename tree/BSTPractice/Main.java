package tree.BSTPractice;

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

        System.out.println("Inorder Traversal: ");
        intTree.traverseInorder();
        System.out.println("\nPreorder Traversal: ");
        intTree.traversePreorder();
        System.out.println("\nPostorder Traversal: ");
        intTree.traversePostorder();

        System.out.println("Minimum value: ");
        System.out.println(intTree.getMin());

        System.out.println("Maximum value: ");
        System.out.println(intTree.getmax());

        System.out.println();
        System.out.println(intTree.find(222));


    }
}
