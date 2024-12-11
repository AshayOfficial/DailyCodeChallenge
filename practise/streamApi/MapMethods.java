package practise.streamApi;

import java.util.List;

public class MapMethods {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);
        // limit() used to limit the size of the stream
        List<Integer> integers1 = integers.stream().limit(3).toList();
        System.out.println(integers1);

        // squares of list integers
        integers.stream().map(integer -> integer * integer).forEach(System.out::println);

        //
//        integers.stream().mapToInt(value -> value + 1).collect();
    }
}
