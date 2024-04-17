package practise.recursion;

public class PalindromeSequence {
    public static void main(String[] args) {
        String s = "NASHASAN";
        isPalindrome(s.toLowerCase().toCharArray(), 0, false);
    }

    private static void isPalindrome(char[] s, int first, boolean isPalindrome) {
        if (first == s.length / 2) {
            System.out.println(isPalindrome);
            return;
        }
        if (s[first] == s[s.length - first - 1]) {
            isPalindrome = true;
            isPalindrome(s, ++first, isPalindrome);
        }
        else {
            System.out.println(false);
        }
    }
}
