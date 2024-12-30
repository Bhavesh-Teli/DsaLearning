package Recursion;

public class practice {
    static void findoccurence(int a[], int key, int i) {
        if (i == a.length) {
            return;
        }
        if (a[i] == key) {
            System.out.println(i + " ");
        }
        findoccurence(a, key, i + 1);
    }

    static void numToString(int n) {
        String digits[] = { "zero", "one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine" };

        if (n == 0) {
            return;
        }
        int lastDigit = n % 10;
        numToString(n / 10);
        System.out.print(digits[lastDigit] + " ");

    }

    static int stringlength(String n) {
        if (n.length() == 0) {
            return 0;
        }

        return stringlength(n.substring(1)) + 1;
    }

    static int calcSubstring(String str, int i, int j, int n) {
        if (n == 1) {
            return 1;
        }
        if (n <= 0) {
            return 0;
        }

        int res = calcSubstring(str, i + 1, j, n - 1) + calcSubstring(str, i , j-1, n - 1)
                - calcSubstring(str, i + 1, j - 1, n - 2);
        if (str.charAt(i) == str.charAt(j)) {
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        int a[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        findoccurence(a, 2, 0);
        numToString(4056);
        System.out.println();
        System.out.println(stringlength("himesh"));
        String str = "abcab";
        int n = str.length();
        System.out.print(calcSubstring(str, 0, n - 1, n));
    }
}
