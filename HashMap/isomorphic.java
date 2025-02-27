package HashMap;

import java.util.HashMap;

public class isomorphic {
    public static boolean isIsomorphic(String s,String t){
        HashMap<Character,Character> mp=new HashMap<>();
        for (int j = 0; j < s.length(); j++) {
            Character sCh=s.charAt(j);
            Character tCh=t.charAt(j);

            if (mp.containsKey(sCh)) {
                if (mp.get(sCh)!=tCh) return false;
            } else if (mp.containsValue(tCh)) {
                return false;
            } else{
                mp.put(sCh,tCh);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isIsomorphic("aay","xxz"));
       
    }
}
