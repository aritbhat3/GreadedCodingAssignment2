package GradedProject2.Question2;

public class File8BSTtoIncreasingBST {

    //Write a function to create a right skewed increasing Binary Search Tree
    public static File2Node createIncreasingBST(File2Node root, int[] SortedList) {
        File2Node placeholder = new File2Node(0);
        File2Node current = placeholder;
        for (int increasingElement : SortedList) {

            //create right nodes in increasing order as present in sorted array
            current.right = new File2Node(increasingElement);
            current = current.right;
        }

        //return original head node of new tree
        return placeholder.right;
    }
}