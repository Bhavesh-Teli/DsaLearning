public class LinkedListImplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public static class LLStack{
       private Node head=null;
        private int size=0;
        void push(int x){
            Node  temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        void displayRev(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
        }
        void displayRec(Node h){
            if(h==null) return;
            displayRec(h.next);
           System.out.print(h.val+" ");
        }
        void display(){
            displayRec(head);
        }
        int size(){
            return size;
        }
        int pop(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            int x=head.val;
           head=head.next;
           return x;
        }
        int peek(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.val;
        }
        boolean isEmpty(){
            if(size==0) return true;
           else  return false;
        }


    }

    public static void main(String[] args) {
        LLStack st=new LLStack();
        st.push(1);
        st.display();
        System.out.println();
        st.push(2);
        st.display();
        System.out.println();
        st.pop();
        st.display();
        System.out.println(st.peek());
        System.out.println(st.size());
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(6);
        st.push(7);
       
        st.display();
    }
}
