package String;

public class strinCompress {
    public static void fn(String str){
        StringBuilder stri=new StringBuilder("");
        for (int  i = 0; i < str.length(); i++) {
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            stri.append( str.charAt(i));
            if(count>1){
                stri.append(count.toString());
            }
        }
        System.out.println(stri);
    }
        public static void main(String[] args) {
            // Test with a sample path
            String path = "WNEENESENNN"; // Example input
           fn(path);
        }
}
