package Arraylist;

import java.util.ArrayList;

public class pairSum {
    static boolean pairsum1(ArrayList<Integer> list, int target) {

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }
                System.out.println("(" + list.get(i) + "," + list.get(j) + ")");
            }
        }
        return false;
    }

    ///optimized solution two pointer approach

    static boolean pairsum2(ArrayList<Integer> list, int target) {
        int l = 0;
        int r = list.size() - 1;
        while (l != r) {
            if (list.get(l) + list.get(r) == target) {
                System.out.println(list.get(l) + "," + list.get(r));
                return true;
            } else if (list.get(l) + list.get(r) < target) {
                l++;
            } else if (list.get(l) + list.get(r) > target) {
                r--;
            }
        }

        return false;
    }

    // sorted and roted arraylist
    static boolean pairsum3(ArrayList<Integer> list, int target) {
        int pivot = -1;
        int n=list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivot = i;
                break;
            }
        }
        int lp = pivot + 1;
        int rp = pivot;

        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                System.out.println(list.get(lp) + "," + list.get(rp));
                return true;
            } else if (list.get(lp) + list.get(rp) < target) {
               lp=(lp+1)%n;
            } else if (list.get(lp) + list.get(rp) > target) {
                rp=(n+rp-1)%n;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(11);
        list1.add(15);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);

        System.out.println(pairsum1(list, 5));
        System.out.println(pairsum2(list, 6));
        System.out.println(pairsum3(list1, 16));
    }
}
