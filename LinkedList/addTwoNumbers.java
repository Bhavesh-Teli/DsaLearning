package LinkedList;

public class addTwoNumbers {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void preverse(Node temp) {

        if (temp == null)
            return;
       
            preverse(temp.next);
        

        System.out.print(temp.data + "->");
    }

   

    public  Node addTwoNumbers(Node l1, Node l2) {
       Node dummyHead=new Node(0);
       Node p=l1,q=l2,current=dummyHead;
       int carry=0;
       while(p!=null ||q!=null){
        int x=(p!=null)?p.data:0;
        int y=(q!=null)?q.data:0;
        int sum=carry+x+y;
        carry=sum/10;
        current.next=new Node(sum%10);
        current=current.next;
        if(p!=null) p=p.next;
        if(q!=null) q=q.next;
       }
    //    if(carry>0){
    //     current.next=new Node(carry);
    //    }
       return dummyHead.next;
    }
    

    public static void main(String[] args) {
        addTwoNumbers ll = new addTwoNumbers();
        addTwoNumbers ll1 = new addTwoNumbers();
        ll.addLast(2);
        ll.addLast(4);
        ll.addLast(3);

        ll1.addLast(5);
        ll1.addLast(6);
        ll1.addLast(4);
       
        Node result = ll.addTwoNumbers(ll.head, ll1.head);
        System.out.println("Result:");
        while (result != null) {
            System.out.print(result.data + "->");
            result = result.next;
        }
        System.out.println("null");
    }
}
