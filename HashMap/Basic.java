package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Basic {
    static void HashMapMethods() {
        Map<String, Integer> mp = new HashMap<>();
        mp.put("Akash", 21);
        mp.put("Bhavesh", 21);
        mp.put("Sahil", 22);
        mp.put("Vinay", 23);
        mp.put("Aristha", 20);
        mp.put("Ahan", 21);
        mp.put("Ram", 18);

        System.out.println (mp.get("Ram"));
        System.out.println(mp.get("sam"));
        System.out.println(mp.get("Akash"));
        mp.put("Akash",22);
        System.out.println(mp.get("Akash"));
        System.out.println(mp.remove("Akash"));
        System.out.println(mp.remove("Akash"));
        System.out.println(mp.containsKey("Bhavesh"));
        mp.putIfAbsent("Bhavesh", 22);
        System.out.println(mp.get("Bhavesh"));
        System.out.println(mp.entrySet());
        System.out.println(mp.values());
        System.out.println(mp.keySet());

        for (String key : mp.keySet()) {
            System.out.printf("Age of %s id %d\n",key,mp.get(key));
        }
        System.out.println();
        for (Map.Entry<String,Integer> key : mp.entrySet()) {
            System.out.printf("Age of %s id %d\n",key.getKey(),key.getValue());
        }
    }

    public static void maxFrequncy(){
        int arr[]={1,4,2,5,1,4,4,6,4,4,4};
        Map<Integer,Integer> freq=new HashMap<>();
        for (int el : arr) {
            if(!freq.containsKey(el)){
                freq.put(el, 1);
            } else{
                freq.put(el, freq.get(el)+1);
            }
        }
       System.out.println(freq.entrySet());
        int maxFreq=0,ansKey=-1;
       for (var i : freq.entrySet()) {
        if (i.getValue()>maxFreq) {
            maxFreq=i.getValue();
            ansKey=i.getKey();
        }
       }
       System.out.println(ansKey);
        }

    public static void main(String[] args) {
        HashMapMethods();
        maxFrequncy();
    }
}
