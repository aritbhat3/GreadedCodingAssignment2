package GradedProject2.Question2;

import java.util.Arrays;

public class File5BTtoBST {
    static int[] binaryTreeToBST(File2Node root) {

        //return clause for last Node
        if(root == null)
            return null;

        //creating an array to store the values
        int arrTreeEls[] = new int[nodeCount(root)];

        //flattening tree and storing the values
        int[] arr = File6Flattening.flattenTree(root, arrTreeEls);

        //Sort the array in ascending order
        Arrays.sort(arrTreeEls);

        //create a binary search tree with the array elements
        File7CreateBST.BSTmaker(arrTreeEls, root);

        return arr;
    }

    //Small function to return number of nodes in a tree
    static int nodeCount(File2Node root) {
        if (root==null)
            return 0;
        return nodeCount(root.left)+nodeCount(root.right)+1;
    }
}
