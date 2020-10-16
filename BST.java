public class BST<E>{
  
  Node<E> root;
  private class Node<E>{
    E data;
    Node left, right;
    Node(E data){
      this.data = data;
      left = right = null;
    }
  }
}

