package LinkedList;


public class MergeSort {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    public void addLast(int data){
   
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;

    }

    public void print(){
       Node current=head;
       while(current!=null){
        System.out.print(current.data+"->");
        current=current.next;
       }
      
    }

    public Node sortingOpt(Node head1, Node head2){
      
        Node p1=head1;
        Node p2=head2;
        Node head=new Node(-1);
        Node temp=head;

        while (p1!=null && p2!=null) {
            if(p1.data<p2.data){
                temp.next=p1;
                p1=p1.next;
            }
            else{
                temp.next=p2;
                p2=p2.next;
            }
            temp=temp.next;
        }
        if (p1 != null) {
            temp.next = p1;
        } else if (p2 != null) {
            temp.next = p2;
        }
        return head.next;

    }

    public Node sorting(Node head1,Node head2){
        if (head1 == null) return head2;
        if (head2 == null) return head1;
        if (head1.data < head2.data) {
            head = head1;
            head1 = head1.next;
        } else {
            head = head2;
            head2 = head2.next;
        }
        Node t=head;

        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                t.next = head1;
                head1 = head1.next;
            } else {
                t.next = head2;
                head2 = head2.next;
            }
            t = t.next; // Move the pointer
        }
        if (head1 != null) {
            t.next = head1;
        } else {
            t.next = head2;
        }
        return head;

    }
    
 public static void main(String[] args) {
    MergeSort ll=new MergeSort();
    MergeSort ll2=new MergeSort();

   
    ll.addLast(1);
    ll.addLast(3);
    ll.addLast(5);
    ll.addLast(7);
    ll.addLast(9);
    ll.addLast(11);

    ll2.addLast(2);
    ll2.addLast(4);
    ll2.addLast(6);
    ll2.addLast(8);
    ll2.addLast(10);
    ll2.addLast(12);

    ll.print();
    System.out.println();
    ll2.print();
  
    Node mergedHead = ll.sorting(ll.head, ll2.head);

        System.out.println("Merged Linked List:");
        Node current = mergedHead;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("Null");

        
        Node mergedHead1 = ll.sortingOpt(ll.head, ll2.head);
        System.out.println("Merged Linked List (sortingOpt):");

    
    Node current1 = mergedHead1;
    while (current1 != null) {
        System.out.print(current1.data + " -> ");
        current1 = current1.next;
        
    }
    System.out.println("Null");
   
       
    }

    
}
