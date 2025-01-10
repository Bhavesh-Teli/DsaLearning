package LinkedList;

public class SplitLinkedListoddEven {
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

    public void print(Node head){
       Node current=head;
       while(current!=null){
        System.out.print(current.data+"->");
        current=current.next;
       }
      
    }
    public class SplitResult {
        Node oddHead;
        Node evenHead;
    
        // Constructor to initialize both heads
        public SplitResult(Node oddHead, Node evenHead) {
            this.oddHead = oddHead;
            this.evenHead = evenHead;
        }
    }
    
    public SplitResult split(Node head){
        SplitLinkedListoddEven ll=new SplitLinkedListoddEven();
        // SplitLinkedListoddEven ll2=new SplitLinkedListoddEven();

       
        Node oddHead=null;
        Node evenHead=null;
        while (head!=null) {
            if(head.data%2==0){
                if(oddHead==null){
                    oddHead=head;
                }else{
                    oddHead.next=head;
                }
            } else{
                if(evenHead==null){
                    evenHead=head;
                }else{
                    oddHead.next=head;
                }
            }
        }
        
        // ll.print();
        // System.out.println();
       return new SplitResult(oddHead,evenHead);
    }
    public static void main(String[] args) {
        SplitLinkedListoddEven ll=new SplitLinkedListoddEven();
        // MergeSort ll2=new MergeSort();
    
       
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.addLast(9);
        ll.addLast(10);
        ll.addLast(11);
    
        SplitResult res=ll.split(ll.head);
    
        ll.print(ll.head);
        System.out.println();
        
        ll.print(res.oddHead);

        ll.print(res.evenHead);
        
    }
}
