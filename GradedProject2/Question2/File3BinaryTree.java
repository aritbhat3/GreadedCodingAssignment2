package GradedProject2.Question2;

//Structure of Binary Tree along with a few constructors.
public class File3BinaryTree {
    static File2Node root;
    File3BinaryTree(int key) {
        root = new File2Node(key);
    }

    File3BinaryTree() {
        root=null;
    }
}
