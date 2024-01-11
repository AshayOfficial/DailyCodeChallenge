package practise.dailyQuestions;

/*Given an integer N and an integer D, rotate the binary representation of the integer N by D digits to the left as well as right and return the results in their decimal representation after each of the rotation.
        Note: Integer N is stored using 16 bits. i.e. 12 will be stored as 0000000000001100.

        Example 1:
        Input:
        N = 28, D = 2
        Output:
        112
        7
        Explanation:
        28 in Binary is: 0000000000011100
        Rotating left by 2 positions, it becomes 0000000001110000 = 112 (in decimal).
        Rotating right by 2 positions, it becomes 0000000000000111 = 7 (in decimal).

        Example 2:
        Input:
        N = 29, D = 2
        Output:
        116
        16391
        Explanation:
        29 in Binary is: 0000000000011101
        Rotating left by 2 positions, it becomes 0000000001110100 = 116 (in decimal).
        Rotating right by 2 positions, it becomes 100000000000111 = 16391 (in decimal).*/
public class Que_20_09_23 {
    public static void main(String[] args) {
        int n = 28;
        int d = 2;
        decimalRepresentationAfterRotationOfBits(n, d);
    }

    private static void decimalRepresentationAfterRotationOfBits(int n, int d) {
        int remainder;
        int i = 1;
        StringBuilder binary = new StringBuilder();

//        binary conversion
        while (binary.length() != 16) {
            remainder = n % 2;
            binary.append(remainder);
            n /= 2;
        }

        // decimal conversion
        binary.reverse();
        String leftShift = binary.substring(d) + binary.substring(0, d);
        System.out.println(Integer.parseInt(leftShift, 2));
        String rightShift = binary.substring(16 - d) + binary.substring(0, 16 - d);
        System.out.println(Integer.parseInt(rightShift, 2));

    }
}
