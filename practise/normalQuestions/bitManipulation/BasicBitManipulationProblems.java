package practise.normalQuestions.bitManipulation;

public class BasicBitManipulationProblems {
    public static void main(String[] args) {
        // print Even or Odd
//        printEvenOdd(10);
        // print number in binary acc to bit size
//        printBitsOfANumber(12, 4);
//        printBitsOfANumberInReverseOrder(32, 8);
        // print If the ith bit is set or not
        printSetBit(0, 12);
    }

    private static void printSetBit(int pos, int num) {
        int result = num & (1 << pos);
        if (result == 0) System.out.println("Not Set Bit at position :: " + pos);
        else System.out.println("Set bit at position :: " + pos);
    }

    private static void printBitsOfANumberInReverseOrder(int num, int size) {
        for (int j = 0; j < size; j++) {
            System.out.print((num >> j) & 1);
        }
    }

    private static void printBitsOfANumber(int num, int size) {
        for (int j = size - 1; j >= 0; j--) {
            System.out.print((num >> j) & 1);
        }
        System.out.println();
    }

    private static void printEvenOdd(int num) {
        if ((num & 1) == 1) System.out.println("Odd");
        else System.out.println("Even");
    }
}
