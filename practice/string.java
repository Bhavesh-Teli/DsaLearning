
public class string {

    static void fn(String i){
        
          StringBuilder s= new StringBuilder();
          Integer count =1;
          for (int j = 0; j < i.length(); j++) {
            while (j<i.length()-1 && i.charAt(j)==i.charAt(j+1)) {
                count++;
                j++;
            }
            System.out.println(j);
            s.append(i.charAt(j));
            if(count>1){
                s.append(count);
            }
          }
System.out.println(s);
    }
    public static void main(String[] args) {
        String j ="wwwrrrooppss";
        // fn(j);
        System.out.println(1%2);
    }
}

