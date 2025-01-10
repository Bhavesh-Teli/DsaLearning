package LinkedList;

public class checkPalindrome {
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
    public void rev(Node head){
        if(head==null) return;
        rev(head.next);
        System.out.println(head.data);
    }
    public Boolean checkPaindrome(Node head){
        if (head==null || head.next==null) {
            return true;
        }
     Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

            System.out.println(slow.data);
        Node curr=slow,Next=null,prev=null;
        while(curr!=null){
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }


        Node right=prev,left=head;
        while(right!=null){
            if(right.data!=left.data){
                return false;
            }
            right=right.next;
            left=left.next;
        }
        return true;
    }

    public void print(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        checkPalindrome ll = new checkPalindrome();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(2);
        ll.insert(1);
        

        System.out.println();
        ll.print(ll.head);

        System.out.println(ll.checkPaindrome(ll.head));

        ll.rev(ll.head);
        ll.print(ll.head);
        // Node A = ll.iterative_reverse(ll.head);
        // ll.print(A);

    }

}
