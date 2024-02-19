import java.util.Scanner;

public class RightRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        System.out.println(leftRotateNum(n, k));
        System.out.println(rightRotateNum(n, k));
    }

    private static int rightRotateNum(int n, int k) {
        int len = String.valueOf(n).length();
        k = k % len;
        len--;

        while (k > 0) {
            n = ((n % 10) * (int) Math.pow(10, len)) + (n / 10);
            k--;
        }

        return n;
    }

    private static int leftRotateNum(int n, int k) {
        int len = String.valueOf(n).length();
        k = k % len;
        len--;

        while (k > 0) {
            n = (n % (int) Math.pow(10, len)) * 10 + (n / (int) Math.pow(10, len));
            k--;
        }

        return n;
    }
}
