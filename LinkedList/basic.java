package LinkedList;



public class basic {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public  Node head;
    public  Node tail;
    public  int size;

    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if (head==null) {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        size++;

        if (head==null) {
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void add(int idx,int data){
        if (idx==0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;

        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int removeFirst(){
        if(size==0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if(size==1){
        int val=head.data;
        head=tail=null;
        size=0;
        return val;
        }
        int val = head.data;
        head=head.next;
        size--;
        return val;
    }

    
    public int removeLast(){
        if(size==0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if(size==1){
        int val=head.data;
        head=tail=null;
        size=0;
        return val;
        }
       Node prev=head;
       for (int i = 0; i <size-2; i++) {
        prev=prev.next;
       }
       int val=prev.next.data;
       prev.next=null;
       tail=prev;
       size--;
       return val;
    }

    public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }


    //search using recuursion


    public void print(){
        if (head==null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        basic ll = new basic();
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();

        ll.add(2, 9);
        ll.print();
        System.out.println(ll.size);


        ll.removeFirst();
       ll.print();

       ll.removeLast();
       ll.print();
       System.out.println(ll.size);

        System.out.println(ll.itrSearch(3));
        System.out.println(ll.itrSearch(10));
    }

}
