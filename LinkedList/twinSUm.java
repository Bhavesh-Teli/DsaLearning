package LinkedList;

public class twinSUm {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public Node head;
    public Node tail;

    public void insert(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public Node iterative_reverse(Node head) {
        Node prev = null, curr = head, Next = null;
        while (curr != null) {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;

        }
        return prev;

    }

    public int twin_Sum(Node head) {
        Node slow=head,fast=head;

        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }

        //reverse
        Node prev=null,curr=slow,Next=null;

        while(curr!=null){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        print(prev);

        Node left=head,right=prev;
        int max_sum=0;
        while(right!=null){
            int sum=left.data+right.data;
            if(max_sum<sum){
                max_sum=sum;
            }
            right=right.next;
            left=left.next;
        }
        return max_sum;
    }

    public void print(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        twinSUm ll = new twinSUm();
        ll.insert(10);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(2);
        ll.insert(1);

        System.out.println();
        ll.print(ll.head);

        System.out.println(ll.twin_Sum(ll.head));

    }

}
