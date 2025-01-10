package LinkedList;

public class basics {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public Node size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addlast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;

        }
        tail.next = newNode;
        tail = newNode;
    }

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
    }

    public void printR(Node temp) {
        if (temp == null) {
            return;
        }

        System.out.print(temp.data + "->");
        printR(temp.next);
    }

    public void printReverse(Node temp) {
        if (temp == null) {
            return;
        }
        printReverse(temp.next);
        System.out.print(temp.data + "->");
    }

    public int length() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public void delete (int idx){
        if (idx < 0 || idx >= length()) {
            System.out.println("Index out of bounds");
            return;
        }
    
        if (idx == 0) {
            head = head.next;  // Remove the first node
            return;
        }
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
        if (temp.next == tail) {
            tail = temp;
        }
        return;
    }


    public void add(int data,int idx){
        if (idx==0) {
            addFirst(data);
            return;
        }
        if (idx == length()) {
            addlast(data);
            return;
        }
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while (i<idx-1) {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public static void main(String[] args) {
        basics ll = new basics();
        ll.addFirst(1);
        ;
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.addlast(6);
        ll.addlast(7);
        ll.add(10,5);
        ll.print();
        System.out.println();
        ll.printR(ll.head);
        System.out.println();
        ll.printReverse(ll.head);
        // System.out.println(a.data);
        System.out.println();
        System.out.print(ll.length());
        System.out.println();
        System.out.println(ll.tail.data);
        ll.delete(1);
        ll.print();
        System.out.println();
        System.out.println(ll.tail.data);
    }
}
