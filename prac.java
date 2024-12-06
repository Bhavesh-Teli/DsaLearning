public class prac {
    public static void prime(int num) {
        int n = 13;
        boolean isPrime = true;
        while (num < n) {

            if (n % num == 0) {
                System.out.println("not a priame");
                isPrime = false;
                break;
            }
            num = num + 1;

        }
        if (isPrime) {
            System.out.println("prime");
        }
    }

    public static void star(int num) {
        for (int i = num; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void star1(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void halfPyrmaid(int num) {

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void charPyramid(int num) {
        char cha = 'A';
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(cha);
                cha++;

            }
            System.out.println();
        }
    }

    public static void star2(int num) {

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        for (int i = 1; i < num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void star3(int num) {

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void star4(int num) {

        for (int i = 1; i <= num; i++) {

            for (int k = 3; k >= i; k--) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void star5(int num) {

        for (int i = 1; i <= num; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print("w");

            }
            for (int j = 1; j <= 2 * (num - i) + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void star6(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = num - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= num; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = num - 1; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void star7(int num) {

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <=num; j++) {
                if (i==j || i + j == num + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
               
            }
            System.out.println();
        }

    }
    public static void star8(int num) {

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <=num; j++) {
                if (j==1 || j==num || i==1 || i==num) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
               
            }
            System.out.println();
        }

    }
    public static void starButterfly(int num) {
        for (int i = 1; i <=num; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < 2*(num-i)+1; j++) {
                System.out.print(" ");
            }
            for (int k =1; k <=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <=num; i++) {
            for (int j = num; j >= i; j--) {
                System.out.print('*');
            }
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print(' ');
            }
            for (int j = num; j >= i; j--) {
                System.out.print('*');
            }
            System.out.println();
        }
  
        }
        public static void num1(int num) {

            for (int i = 1; i <= num; i++) {
              for (int k = 1; k <=num-i; k++) {
                System.out.print(" ");
              }
                for (int j = 1; j <=i; j++) {
                  System.out.print(j+" ");
                }

                System.out.println();
            }
    
        }


    
    public static  void main(String args[]) {
        prac obj = new prac();
        // obj.num1(4);
        // obj.star3(7);
        starButterfly(5);
    }

}
