package LinkedList;

public class linkedListOddEven {
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public Node head;
    public Node tail;

    public void insert(int data) {
        
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public Node split(){

        Node oddHead=head;
        Node evenHead=head.next;

        Node odd=oddHead;
        Node even=evenHead;

        while(even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }

        odd.next=evenHead;

      return oddHead;
    }
public void print(Node head){
    while(head!=null){
        System.out.print(head.data+"->");
        head=head.next;
    }
    System.out.println("null");
}
    public static void main(String[] args) {
        linkedListOddEven ll=new linkedListOddEven();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.insert(6);
        ll.insert(7);
       
        ll.print(ll.head);

        ll.print(ll.split());
    }
}
