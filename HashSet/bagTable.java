package HashSet;

import java.util.HashSet;

public class bagTable {
    public static int solution(int[] bag){
        HashSet<Integer> Table=new HashSet<>();
        int max=0;
        for (int i = 0; i < bag.length; i++) {
            int num=bag[i];
            if(Table.contains(num)){
                Table.remove(num);
            } else{
                Table.add(num);
                max=Math.max(max, Table.size());
            }
        }
        return max;
    }
 public static void main(String[] args) {
    int nums[]={2,1,1,1,3,3,2,2,3};
    System.out.println(solution(nums));
 }   
}
