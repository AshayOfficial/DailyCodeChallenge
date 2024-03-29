package practise.dailyQuestions;

import java.util.Arrays;
import java.util.HashSet;

public class Que_28_08_23 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(isPangram(sentence));
    }

    public static Boolean isPangram(String sentence) {
        String stringReplaced = sentence.replaceAll(" ", "");
        if (!stringReplaced.isEmpty())
            return Arrays.stream(stringReplaced.chars().toArray()).collect(HashSet::new, HashSet::add, HashSet::addAll).size() == 26;

        return false;
    }
}
