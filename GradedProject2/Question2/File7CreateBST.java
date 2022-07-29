package GradedProject2.Question2;

public class File7CreateBST {
    static int index=0;
    static void BSTmaker(int[] arrEls, File2Node root) {
        //return statement for final node
        if (root == null)
            return;

        //Iterate for left subtree first
        BSTmaker(arrEls, root.left);

        //copy value into node
        root.key=arrEls[index];
        index++;

        //Iterate for right subtree
        BSTmaker(arrEls, root.right);
    }
}
