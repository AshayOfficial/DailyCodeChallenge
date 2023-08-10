package practise.dailyQuestionsBySir;

public class DigitDivisibleNo {
    public static void main(String[] args) {
        int no = 245;
        System.out.println(digitDivisibleNo(no));
    }

    public static int digitDivisibleNo(int no) {
        int temp = no;
        int rem;
        int count = 0;

        while (no != 0) {
            rem = no % 10;
            no = no / 10;
            if (temp % rem == 0)
                count++;
        }
        return count;
    }
}
