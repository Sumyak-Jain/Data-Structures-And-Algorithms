//queue implementation using array in java
class queue {
   static  int front,rear,capacity;
    static int Queue[];
    queue(int c){//constructor
        front=rear=0;
        capacity=c;
        Queue=new int[capacity];
    }
    static void Enqueue(int n){
        if(capacity==rear){
            System.out.println("Queue is full");
            return;
        }
        else{
            Queue[rear]=n;
            rear++;
        }
        return;
    }
    static void Dequeue(){
        if(front==rear){
            System.out.println("Queue is empty");
            return;
        }
        else{
            for(int i=0;i<rear-1;i++){
                Queue[i]=Queue[i+1];
            }
            if(rear<capacity)
                Queue[rear]=0;
                rear--;
            
            return;
        }
        
    }
    static void display(){
         int i; 
        if (front == rear) { 
            System.out.println("Queue is Empty"); 
            return; 
        } 
        for (i = front; i < rear; i++) { 
            System.out.println( Queue[i]); 
        } 
        return; 
    }}
    public class queue_java{
    public static void main(String[] args) {
        queue obj=new queue(5);
        obj.display();
        obj.Enqueue(10);
        obj.Enqueue(20);
        obj.Enqueue(30);
        obj.Enqueue(40);
        obj.Enqueue(50);
        
        System.out.println("queue after insertion");
        
        obj.display();
        
        obj.Dequeue();
        obj.Dequeue();
        System.out.println("queue after deletion");
        obj.display();
        
    }
    
}
