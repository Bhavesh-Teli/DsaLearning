import java.util.*;

public class BalancedBackets {
    public static boolean isBoolean(String str) {

        Stack<Character> st = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else {
                if (st.size() == 0)
                    return false;
                if (st.peek() == '(')
                    st.pop();
            }
        }
        if (st.size() > 0)
            return false;
        else
            return true;
    }

    public static boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
           char ch=s.charAt(i);
           if(ch=='('|| ch=='{'|| ch=='['){
               st.push(ch);
           }else{
               if(st.size()==0) return false;
               char top=st.peek();
               if((ch==')' && top=='(') ||(ch==']' && top=='[') || (ch=='}' && top=='{') )st.pop();
               else{
                return false;
               }
           }
        }  
        if(st.size()>0) return false;
        else return true;
       }
       

   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // System.out.println(isBoolean(str));

        // System.out.println(isValid(str));
        System.out.println(isValid("()"));        // true
        System.out.println(isValid("()[]{}"));    // true
        System.out.println(isValid("(]"));        // false
        System.out.println(isValid("([)]"));      // false
        System.out.println(isValid("{[]}"));      
    }
}
