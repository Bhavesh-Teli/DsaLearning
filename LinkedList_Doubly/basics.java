package LinkedList_Doubly;

public class basics {
    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }

    public Node head;
    public Node tail;
    public Node prev;

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void add(int data ,int idx){
        Node newNode=new Node(data);
        if(idx==0){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node curr=head;
        int i=0;
            while(curr != null && i<=idx-1){
                curr=curr.next;
                i++;
        }
        newNode.next = curr.next;
        newNode.prev = curr;

        if (curr.next != null) {
            curr.next.prev = newNode;
        } else {
            tail = newNode; // Update tail if inserted at the end
        }

        curr.next = newNode;

    } 

    public void targetSum(int target){
        Node t1=head,t2=tail;
        while(t1 != t2 && t1 != null && t2 != null){
            if(t1.val+t2.val==target){
                System.out.println(t1.val+" "+t2.val);
                return;
            }  
            if(t1.val+t2.val<target){
               
                t1=t1.next;
              
            } 
            else{
                t2=t2.prev;
               
            }   
        }
        System.out.println("No pair found with the target sum.");


    }

    public void printForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void printBackward() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public void print(Node random){
       Node curr=head;
        while(curr.prev!=null){
            curr=curr.prev;
        }

        while(curr!=null){
            System.out.print(curr.val+"->");
            curr=curr.next;
        }
    }

    public static void main(String[] args) {
        basics list = new basics();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        System.out.println("List printed forward:");
        list.printForward();

        System.out.println("List printed backward:");
        list.printBackward();

        list.print(list.tail.prev);;
        System.out.println();
        // list.add(1,2);
        list.printForward();
        System.out.println(list.head.val);

        list.targetSum(30);
        list.targetSum(60);
    }


}
