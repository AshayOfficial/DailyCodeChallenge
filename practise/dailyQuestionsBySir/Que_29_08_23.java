package practise.dailyQuestionsBySir;

public class Que_29_08_23 {
    /*
    Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
    Example 1:
    Input: s = "Let's take LeetCode contest"
    Output: "s'teL ekat edoCteeL tsetnoc"

    Example 2:
    Input: s = "God Ding"
    Output: "doG gniD"
    */
    public static void main(String[] args) {
        String sentence = "God Ding";
        System.out.println(reverseString(sentence));
    }

    public static String reverseString(String sentence) {
        String[] splitStrings = sentence.split(" ");
        sentence = "";
        for (int i = 0; i < splitStrings.length; i++) {
            StringBuilder builder = new StringBuilder(splitStrings[i]).reverse();
            if (i == splitStrings.length - 1) {
                sentence = sentence.concat(builder.toString());
                return sentence;
            }
            sentence = sentence.concat(builder.toString()).concat(" ");
        }
        return sentence;
    }
}
