package String;

public class palindrome {
    public static void main(String[] args) {
        String a ="bahvesh";
        for (int i = 0; i < a.length()/2; i++) {
            if (a.charAt(i)!=a.charAt(a.length()-i-1)) {
                System.out.println("not palinedrome");
               return;
            }
           
        }
        System.out.println("palindrome");
        

    }

}
