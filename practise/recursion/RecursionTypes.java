package practise.recursion;

public class RecursionTypes {
    public static void main(String[] args) {
        System.out.println("----------parameterized recursion-------------");
        paramterized(3, 3);
    }

    private static void paramterized(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        paramterized(i - 1, sum + i);
    }
}
