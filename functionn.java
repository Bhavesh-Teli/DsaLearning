public class functionn {

    public void factorial(int num) {
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f = f * i;
        }
        System.out.println(f);
    }

    public boolean prime(int num) {
        boolean isprime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isprime = false;
                break;
            }

        }
        return isprime;
    }

    public void primeInRange(int num) {

        for (int j = 2; j <= num; j++) {
            boolean isprime = true;
            for (int i = 2; i <= Math.sqrt(j); i++) {
                if (j % i == 0) {
                    isprime = false;
                    break;
                }

            }
            if (isprime) {

                System.out.print(j + " ");
            }

        }

    }

    public void BinarytoDecimal(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("decimal of " + myNum + " =  " + decNum);

    }

    public void DecimalToBinary(int dec) {

        int myNum = dec;
        int pow = 0;
        int binNum = 0;

        while (dec > 0) {
            int rem = dec % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            dec = dec / 2;
        }
        System.out.println("binary of " + myNum + " =  " + binNum);

    }

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean palindrome(int n) {
        int originalnum = n;
        int reverse = 0;

        while (n > 0) {
            int lastdigit = n % 10;
            // System.out.println(reverse*10);
            reverse = reverse * 10 + lastdigit;

            n = n / 10;
        }

        return originalnum == reverse;
    }

    public static void digitsum(int n) {
        int on = n;
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum=sum+digit;
            n=n/10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        functionn obj = new functionn();
        obj.DecimalToBinary(8);
        obj.digitsum(899);
        System.out.println();
    }
}