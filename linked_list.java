import java.util.*;
public class linked_list {
    public static void main(String[] args) {
        LinkedList<String> object =new LinkedList<String>();//creating a obj of class linked list
        object.add("A");//adding elements in linked list
        object.add("B");
        object.addLast("C");
        object.addFirst("D");
        object.add("F");
        object.add("G");
        object.add(2,"E");//adding element at second possition
        System.out.println("linked list : " + object);
        
        object.remove("B");//removing element 
        object.remove(3);//removing third element
        object.removeFirst();//removing the first element
        object.removeLast();//removing the last element
        System.out.println("linked list after deletion : " + object);
        
        boolean status = object.contains("E");//checking the element in the list
        if(status)
            System.out.println("list contain the element 'E' ");
        else
            System.out.println("list dont contain the element 'E' ");
        
        int size = object.size();//getting the size of the list
        System.out.println("size of the list is :" + size);
        
        object.set(2, "Y");//changing the element
        System.out.println("linked list after change" + object);
        
        
    }
    
}
