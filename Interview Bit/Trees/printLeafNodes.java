static void printLeafNodes(Node root)
{
      
    // If node is null, return
    if (root == null)
        return;
      
    // If node is leaf node, print its data    
    if (root.left == null &&
        root.right == null)
    {
        System.out.print(root.data + " ");
        return;
    }
      
    // If left child exists, check for leaf
    // recursively
    if (root.left != null)
        printLeafNodes(root.left);
          
    // If right child exists, check for leaf
    // recursively
    if (root.right != null)
        printLeafNodes(root.right);
}
