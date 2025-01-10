package LinkedList;
public class removeDuplicates {
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

    public Node removeDup(Node head) {
        if (head == null)
            return null;
        Node temp = head;
        while (temp != null && temp.next != null) {
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;

            } else {
                temp = temp.next;
            }
        }
        return head;
    }

    public Node reverse(Node head) {
        if (head == null || head.next == null)
            return head;
        Node newNode = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
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

    public void print(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        removeDuplicates ll = new removeDuplicates();
        ll.insert(1);
        ll.insert(1);
        ll.insert(3);
        ll.insert(4);
        ll.insert(4);
        ll.insert(6);
        ll.insert(6);

        // ll.print(ll.head);
        // Node a=ll.removeDup(ll.head);
        // System.out.println("hi");
        // ll.print(a);

        // Node b = ll.reverse(ll.head);
        // ll.print(b);
System.out.println();
        ll.print(ll.head);
        Node A = ll.iterative_reverse(ll.head);
        ll.print(A);

    }
}
