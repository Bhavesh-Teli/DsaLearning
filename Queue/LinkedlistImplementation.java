package Queue;

public class LinkedlistImplementation {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class queueb{
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int x) {
            Node newNode = new Node(x);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
                
            }
            size++;
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.val;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }

            int temp = head.val;
            head = head.next;
            size--;
            return temp;
        }
        public void display() {
            Node temp=head;
            if (size == 0) {
                System.out.println("Queue is empty");
                return ;
            }
            while (temp!=null) {
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        public boolean isEmpty() {
            if (size == 0)
                return true;
            else
                return false;
        }

    }

   

    public static void main(String[] args) {
        queueb q1 = new queueb();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.display();
        q1.remove();
        q1.display();
        System.out.println(q1.peek());
        System.out.println(q1.size);
    }
}
