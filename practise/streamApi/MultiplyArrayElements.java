package practise.streamApi;

import java.util.Arrays;
import java.util.Optional;

public class MultiplyArrayElements {
    public static void main(String[] args) {
        Integer[] numArr = {1,2,3,4,5,6};
        Optional<Integer> mul = Arrays.stream(numArr).reduce((num1, num2) -> num1 * num2);
        if (mul.isEmpty()) System.out.println("Empty array");
        else System.out.println("Multiplication of array elements :: " + mul.get());
    }
}
