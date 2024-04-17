package practise.normalQuestions;

import java.util.ArrayList;
import java.util.List;

public class HeapDumpExample {

    public static void main(String[] args) {
        int i = 0;
        List<Integer> list = new ArrayList<>();
        while (true) {
//            List<List<Integer>> integers = new ArrayList<>();
//            integers.add(List.of(1,2,3,4,5,6,7,8,9,0,7,4,2,1,1,3,4,6,7,7,5,4,3,2,2,2,3,3,33,3,3,3,3,3));
            list.add(i);
            System.out.println(i);
        }
    }
}
