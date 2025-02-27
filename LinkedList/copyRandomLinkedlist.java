package LinkedList;

public class copyRandomLinkedlist {
    class Node {
        int val;
        Node next;
        Node random;
    
        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    
        public Node copyRandomList(Node head) {
            if (head == null) {
                return null;
            }
    
            // Step 1: Clone nodes and insert them in the list
            Node current = head;
            while (current != null) {
                Node cloned = new Node(current.val);
                cloned.next = current.next;
                current.next = cloned;
                current = cloned.next;
               
            }
    
            // Step 2: Assign random pointers for the cloned nodes
            current = head;
            while (current != null) {
                if (current.random != null) {
                    current.next.random = current.random.next;
                }
                current = current.next.next;
            }
    
            // Step 3: Separate the cloned list from the original list
            Node original = head;
            Node copy = head.next;
            Node clonedHead = copy;
    
            while (original != null) {
                original.next = original.next.next;
                if (copy.next != null) {
                    copy.next = copy.next.next;
                }
                original = original.next;
                copy = copy.next;
            }
    
            return clonedHead;
        }
    
    public static void main(String[] args) {

        copyRandomLinkedlist list = new copyRandomLinkedlist();
        Node head = list.new Node(7);
        head.next = list.new Node(13);
        head.next.random = head;
        head.next.next = list.new Node(11);
        head.next.next.random = head.next.next;
        head.next.next.next = list.new Node(10);
        head.next.next.next.random = head.next.next;
        head.next.next.next.next = list.new Node(1);
        head.next.next.next.next.random = head;
    
        
        Node clonedHead = list.copyRandomList(head);
                          
        // Print the cloned list to verify
        Node current = clonedHead;
        while (current != null) {
            System.out.println("Value: " + current.val + ", Random: " +
                (current.random != null ? current.random.val : "null"));
            current = current.next;
        }
    }
    
    
}
