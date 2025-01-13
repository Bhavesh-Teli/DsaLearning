import java.util.*;

public class stacks {

    public static void insertAtIdx(Stack<Integer> st,int idx,int p){
        Stack<Integer> gt = new Stack<>();
        int n=st.size()-idx+1;
        while(st.size()>n){
            gt.push(st.pop());
        }
        gt.push(p);

        while (gt.size()>0) {
            st.push(gt.pop());
        }
        System.out.println(st);
    }

    public static void displayRec(Stack<Integer> st){
        if(st.size()==0) return;
        int top=st.pop();
        System.out.print(top+" ");
        displayRec(st);
        st.push(top);
       
    }

    public static void pushAtBottom(Stack<Integer> st,int x){
        if (st.size()==0) {
            st.push(x);
            return;
        };
        int top=st.pop();
        pushAtBottom(st, x);
        st.push(top);
    }
    public static void reverse(Stack<Integer> st){
        if(st.size()==1) return;
        int top=st.pop();
        reverse(st);
        pushAtBottom(st, top);

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        // int n;
        // System.out.println("Enter the number of element you want to insert");
        // n = sc.nextInt();
        // System.out.println("Enter the elements");
        // for (int i = 1; i <= n; i++) {
        // int x = sc.nextInt();
        // st.push(x);
        // }
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.print(st);

        //reverse order
        Stack<Integer> gt = new Stack<>();
        while (st.size()>0) {
            // int x=st.peek();
            // rt.push(x);
            // st.pop();

            // second way
            gt.push(st.pop());
        }
        System.out.println(gt);
        

        Stack<Integer> rt = new Stack<>();
        while(gt.size()>0){
            rt.push(gt.pop());
        }
        System.out.println(rt);
       
        insertAtIdx(rt, 1, 9);
        System.out.println(rt);
        displayRec(rt);
        System.out.println(rt);
        System.out.println();
        
        reverse(rt);
        System.out.println(rt);
    }
}

