package GradedProject2.Question2;

public class File4TreePrinter {
    public static void printTree(File2Node node, int padding, final int space) {
        if (node == null)
            return;

        //Print the rightmost element first, then
        printTree(node.right, (padding+space), space);

        //print next elements after each line
        System.out.println("");

        //print number of spaces as required
        for (int separator = space; separator < (padding+space); separator++)
            System.out.print(" ");

        //print Node value
        System.out.print(node.key);

        //iterate for left subtree
        printTree(node.left, (padding+space), space);
    }
}
