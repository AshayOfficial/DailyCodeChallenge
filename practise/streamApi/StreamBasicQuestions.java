package practise.streamApi;

import java.util.stream.Stream;

public class StreamBasicQuestions {
    public static void main(String[] args) {
//        // Even numbers
//        List<Integer> collect = Stream.of(2, 1, 35, 64, 223, 54, 6, 8, 29)
//                .filter(integer -> integer % 2 == 0)
//                .toList();  // can use collect(Collectors.toList())
//        System.out.println(collect);
//
//        // Sum of All Nummbers
//        Optional<Integer> reduce = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//                .reduce((integer, integer2) -> integer + integer2);
//
//        // ------------ OR -------------
//        Optional<Integer> reduce1 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//                .reduce(Integer::sum);
//
//        System.out.println("sum of all numbers in Stream 1 :: " + reduce.get());
//        System.out.println("sum of all numbers in Stream 2 :: " + reduce1.get());
//
//        // Numbers having 1 at tens place :: Eg - 10,11,12,13,14,15,16,17,18,19
//        List<Integer> integers = Stream.of(10, 15, 8, 49, 25, 98, 32, 14, 20)
//                .filter(integer -> 20 - integer > 0 && 20 - integer <= 10)
//                .toList();
//        System.out.println("Numbers having 1 at tens place :: " + integers);
//
//        // ---------- ANOTHER METHOD ------------
//        List<String> tens1 = Stream.of(10, 15, 8, 49, 25, 98, 32, 14, 20)
//                .map(Object::toString)
//                .filter(s -> s.startsWith("1"))
//                .toList();
//        System.out.println("Numbers having 1 at tens place :: " + tens1);
//
//        // find duplicates in Array
//        Set<Integer> integersSet = new HashSet<>();
//        List<Integer> integerList = Stream.of(10, 15, 8, 49, 25, 98, 98, 32, 15)
//                .filter(integer -> !integersSet.add(integer))
//                .toList();
//        System.out.println("Duplicates in Array :: " + integerList);
//
//        // Count total number of elements
//        long count = Stream.of(10, 15, 8, 49, 25, 98, 98, 32, 15)
//                .count();
//        System.out.println("Total elements in Array :: " + count);

//        // find first Element in stream
//        Optional<Integer> first = Stream.of(15, 8, 49, 25, 98, 98, 32, 15)
//                .findFirst();
//        System.out.println("First element :: " + first.get());
        Integer integer = Stream.of(10, 15, 8, 49, 25, 98, 98, 32, 15).max(Integer::compare).get();
        System.out.println("Max element :: " + integer);
    }
}
