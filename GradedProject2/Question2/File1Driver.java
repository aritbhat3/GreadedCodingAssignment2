package GradedProject2.Question2;

public class File1Driver {
    static File3BinaryTree tree = new File3BinaryTree();
    static int index = 0;
    public static void main(String args[]) {

        //Write a function to populate the Binary Tree input
        treeMaker();

        //Print the Input Tree
        System.out.print("\n\n\nInput Tree: ");
        File4TreePrinter.printTree(tree.root, 0, 5);

        //Write a function to turn the Binary Tree into a Binary Search Tree
        int[] sortedarr = File5BTtoBST.binaryTreeToBST(tree.root);

        //Write a function to Turn the Binary Search Tree into an Increasing Binary Search Tree
        tree.root=File8BSTtoIncreasingBST.createIncreasingBST(tree.root, sortedarr);

        //Print the Output Tree
        System.out.print("\n\n\nOutput Tree: ");
        File4TreePrinter.printTree(tree.root, 0, 5);

    }

    static void treeMaker() {
        tree.root = new File2Node(50);
        tree.root.right = new File2Node(30);
        tree.root.left = new File2Node(60);
        tree.root.left.left = new File2Node(10);
        tree.root.right.left= new File2Node(55);
    }
}
