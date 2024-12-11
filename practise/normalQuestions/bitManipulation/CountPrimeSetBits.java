package practise.normalQuestions.bitManipulation;

import java.util.ArrayList;
import java.util.List;

public class CountPrimeSetBits {
    public static void main(String[] args) {
        countPrimeSetBits(6,10);
    }
    public static int countPrimeSetBits(int left, int right) {
        List<Integer> setBitList = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int quo = i;
            int rem;
            int count = 0;
            while (quo >= 1) {
                rem = quo % 2;
                quo /= 2;
                if (rem == 1)
                    count++;
            }
            setBitList.add(count);
        }
        System.out.println(setBitList);
        return 0;
    }
}
