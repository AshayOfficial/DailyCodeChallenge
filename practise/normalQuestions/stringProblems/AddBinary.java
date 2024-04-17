package practise.normalQuestions.stringProblems;

public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011"));
    }

    public static String addBinary(String a, String b) {
        Integer num1 = Integer.valueOf(a, 2);
        Integer num2 = Integer.valueOf(b, 2);
        return Integer.toBinaryString(num2 + num1);
    }
}
