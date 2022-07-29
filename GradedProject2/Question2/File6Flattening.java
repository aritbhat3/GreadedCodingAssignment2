package GradedProject2.Question2;

public class File6Flattening {
    static int index = 0;
    static int[] flattenTree(File2Node root, int[] arr){
        //return statement for final node
        if (root == null)
            return null;

        //flatten the tree into an array that will then be sorted and used for creating the final tree
        flattenTree(root.right, arr);
        arr[index] = root.key;
        index++;
        flattenTree(root.left, arr);
        return arr;
    }
}
