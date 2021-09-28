public void push(int new_data)
{

    Node new_node = new Node(new_data);
    new_node.next = head;
 
   
    head = new_node;
}
