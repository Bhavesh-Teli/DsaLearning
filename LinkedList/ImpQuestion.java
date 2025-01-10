package LinkedList;


public class ImpQuestion {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public Node head;
    public Node tail;
    public int size;

    public void addToLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public void getNode(int data) {

    }

    // leetcode question

    // Q- 237 delte node in linkedlist

    void Q237(Node node) {
        if (node == null || node.next == null)
            return;
        node.data = node.next.data;
        node.next = node.next.next;
        size--;
    }

    // find Nth node fron last
    public Node NthFromLast(int n) {
        if (n > size || n <= 0) {
            System.out.println("Invalid value of n: " + n);
            return null;
        }
        Node current = head;
        for (int i = 0; i < size - n; i++) {
            current = current.next;
        }
        return current;
    }

    // more optimized two pointer or slow-fast approach

    public Node slowFast(int n) {
        if (n > size || n <= 0) {
            System.out.println("Invalid value of n: " + n);
            return null;
        }
        Node fast = head, slow = head;
        for (int i = 0; i < n; i++) {
            if (fast == null) {
                System.out.println("n is larger than the size of linkedlist");
            }
            fast = fast.next;

        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    // deleteing Nth node from last

    void deleteNth(int n) {
        Node fast = head, slow = head, prev = null;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            prev = slow;

            slow = slow.next;
            fast = fast.next;
        }
        // slow.next=slow.next.next;
        if (prev == null) {
            head = head.next; // Move head to the next node
        } else {
            // Remove the slow node by bypassing it
            prev.next = slow.next;
        }
        size--;

    }

    // FINDING INTERSECTION OF TWO LINKEDLIST
    public Node intersection(Node head1, Node head2) {
        if (head1 == null || head2 == null)
            return null;

        int size1 = 0, size2 = 0;
        Node temp1 = head1, temp2 = head2;

        while (temp1 != null) {
            size1++;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            size2++;
            temp2 = temp2.next;
        }
        temp1 = head1;
        temp2 = head2;
        if (size1 > size2) {
            for (int i = 0; i < size1 - size2; i++) {
                temp1 = temp1.next;
            }
        } else {
            for (int i = 0; i < size2 - size1; i++) {
                temp2 = temp2.next;
            }
        }

        while (temp1!= temp2) {
           
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
    }


    //finding middle element
    public Node middle(){
        Node slow=head,fast=head;

        while(fast.next.next!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
       return slow;

    }

    //delete middle element
    public void Delmiddle(){
        Node slow=head,fast=head;
        Node prev=slow;
        while(fast.next.next!=null &&fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
      prev.next=slow.next;

    }
      public Node removeNthFromEnd(Node head, int n) {
        Node slow=head,fast=head,prev=slow;
        if(head==null ||head.next==null){
            return null;
        }
        int i=1;
        while(i<=n){
            fast=fast.next;
            i++;
        }
        while(fast!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=slow.next;
        return head;
        
    }
     
    public static void main(String[] args) {
        ImpQuestion ll = new ImpQuestion();
        ImpQuestion ll2 = new ImpQuestion();
        ll.addToLast(1);
        ll.addToLast(2);
        ll.addToLast(3);
        ll.addToLast(4);
        ll.addToLast(5);
        ll.addToLast(6);
        ll.print();

        ll2.addToLast(9);
        ll2.addToLast(8);

        Node intersectionNode = ll.head.next.next;

        ll2.tail.next = intersectionNode;
        ll2.tail = intersectionNode;


        // ll.Q237(ll.head.next);
        // ll.print();
        System.out.println(ll.NthFromLast(2).data);
        System.out.println(ll.slowFast(2).data);
        // // ll.deleteNth(5);
        ll.print();
       
        ll2.print();

        System.out.println(ll.intersection(ll.head, ll2.head).data);
        ll.print();
        System.out.println(ll.middle().data);
        ll.Delmiddle();
        ll.print();

        ll.removeNthFromEnd(ll.head, 2);
        ll.print();
    }

}
