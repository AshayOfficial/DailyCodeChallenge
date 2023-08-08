package practise;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        int reverse = 0;
        int storage;
        int temp = x;
        if (x < 0)
            return false;

        if (x < 10)
            return true;

        while (x > 0) {
            storage = x % 10;
            reverse = (reverse * 10) + storage;
            x = x / 10;
        }

        return temp == reverse;
    }

    public static void main(String[] args) {
        int x = 11;
        System.out.println(isPalindrome(x));
    }
}
