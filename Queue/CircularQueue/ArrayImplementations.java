public class ArrayImplementations {
    public static class Cqa{
       int front=-1;
       int rear=-1;
       int size=0;
       int[] arr=new int[4];
       public void add(int val){
        if (size==arr.length) {
            System.out.println("Queue is full");
        } else if (size==0) {
            front=rear=0;
            arr[0]=val;
        } else if (rear<arr.length-1) {
            arr[++rear]=val;
        } else if (rear==arr.length-1) {
            rear=0;
            arr[0]=val;
        }
        size++;
        
       }  
       public int remove(){
        if (size==0) {
            System.out.println("queue is empty");
            return -1;
        }
        else{
            int val=arr[front];
            if(front==arr.length-1) front=0;
            else front++;
            size--;
            return val;
        }
       
    }
        public int peek(){
            if(size==0) {
                System.out.println("queue is empty");
            return -1; 
            }
            return arr[front];
        }

        public boolean isEmpty(){
            if(size==0) return true;
            else return  false;
        }
        public void display(){
            if(size==0) {
                System.out.println("queue is empty");
            return ; 
            }
            else{
                if(front<rear){
                    for ( int i = front; i <= rear; i++) {
                        System.out.print(arr[i]+" ");
                    }
                } else{
                    for ( int i = front; i < arr.length; i++) {
                        System.out.print(arr[i]+" ");
                    }
                    for ( int i = 0; i <= rear; i++) {
                        System.out.print(arr[i]+" ");
                    }
                }
            }
            System.out.println();
        }


       
    }
    public static void main(String[] args) {
        Cqa q=new Cqa();
         
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.remove();
        q.add(5);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
        System.out.println(q.size);
    }
}
