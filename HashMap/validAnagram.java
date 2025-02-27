package HashMap;

import java.util.HashMap;

public class validAnagram {
    static HashMap<Character,Integer> makeFreqMap(String str){
        HashMap<Character,Integer> mp=new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch=str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch, 1);
            } else{
                int currFreq=mp.get(ch);
                mp.put(ch, currFreq+1);
            }
        }
        return mp;
    }
    public static boolean isAnagaram(String s,String t){
        if (s.length()!=t.length())  return false;
        HashMap<Character,Integer> mp1=makeFreqMap(s);
        HashMap<Character,Integer> mp2=makeFreqMap(t);
        return mp1.equals(mp2);
    }
    public static boolean isAnagaram2(String s,String t){
        if (s.length()!=t.length())  return false;
        HashMap<Character,Integer> mp=makeFreqMap(s);
       for (int i = 0; i < t.length(); i++) {
        Character ch=t.charAt(i);
        if (!mp.containsKey(ch)) return false;
        int currFreq=mp.get(ch);
        mp.put(ch,currFreq-1);
       }
       for (Integer i:mp.values()) {
        if(i!=0) return false;
       }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAnagaram("listen", "dsilent"));
        System.out.println(isAnagaram2("listen", "dsilent"));
        
    }
}
