import java.util.*;
// Java program to find height using parent array
class BinaryTree {

    // This function fills depth of i'th element in
    // parent[]. The depth is filled in depth[i].
    void fillDepth(int parent[], int i, int depth[])
    {

        // If depth[i] is already filled
        if (depth[i] != 0) {
            return;
        }

        // If node at index i is root
        if (parent[i] == -1) {
            depth[i] = 1;
            return;
        }

        // If depth of parent is not evaluated before, then
        // evaluate depth of parent first
        if (depth[parent[i]] == 0) {
            fillDepth(parent, parent[i], depth);
        }

        // Depth of this node is depth of parent plus 1
        depth[i] = depth[parent[i]] + 1;
    }

    // This function returns height of binary tree
    // represented by parent array
    int findHeight(int parent[], int n)
    {

        // Create an array to store depth of all nodes/ and
        // initialize depth of every node as 0 (an invalid
        // value). Depth of root is 1
        int depth[] = new int[n];
        for (int i = 0; i < n; i++) {
            depth[i] = 0;
        }

        // fill depth of all nodes
        for (int i = 0; i < n; i++) {
            fillDepth(parent, i, depth);
        }

        // The height of binary tree is maximum of all
        // depths. Find the maximum value in depth[] and
        // assign it to ht.
        int ht = depth[0];
        for (int i = 1; i < n; i++) {
            if (ht < depth[i]) {
                ht = depth[i];
            }
        }
        return ht;
    }

    // Driver program to test above functions
    public static void main(String args[])
    {

        BinaryTree tree = new BinaryTree();

        // int parent[] = {1, 5, 5, 2, 2, -1, 3};
        int parent[] = new int[] { 1,-1,3,-1};

        int n = parent.length;
        System.out.println("Height is "
                + tree.findHeight(parent, n));
    }
}
