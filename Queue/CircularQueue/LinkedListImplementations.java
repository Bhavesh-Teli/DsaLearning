
public class LinkedListImplementations {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static class queue {
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int val) {
            Node newNode = new Node(val);
            if (size == 0) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
                tail.next = head;
            }
            size++;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("queue is empty");
                return -1;
            }
            int temp = head.val;
            if (size == 1) {

                head = tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            size--;
            return temp;
        }

        public int peek() {
            if (size == 0) {
                System.out.println("queue is empty");
                return -1;
            }
            return head.val;
        }

        public boolean isEmpty() {
            if (size == 0)
                return true;
            else
                return false;
        }

        public void display() {
            if (size == 0) {
                System.out.println("queue is empty");
                return;
            }
            Node temp = head;
            do {
                System.out.print(temp.val + " ");
                temp = temp.next;
            } while (temp != head);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        queue q1 = new queue();
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
