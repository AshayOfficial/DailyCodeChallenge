package practise.dailyQuestionsBySir;

public class Que_08_09_23 {
    public static void main(String[] args) {
        int number = 0;
        countSetBit(number);
    }

    private static void countSetBit(int number) {
        if (number == 0) {
            System.out.println(0);
            return;
        }
         int count = 0;
        while (number > 0) {
            if (number % 2 == 1)
                count++;

            number /= 2;
        }
        System.out.println(count);
    }
}
