package practise.normalQuestions.stringProblems;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseWord("Geeks"));
    }

    private static String reverseWord(String str)
    {
        char[] array = str.toCharArray();
        int i = 0;
        int j = array.length - 1;
        char temp;
        while (i < j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }

        StringBuilder sb = new StringBuilder();
        for (char c: array) {
            sb.append(c);
        }

        return sb.toString();
    }
}
