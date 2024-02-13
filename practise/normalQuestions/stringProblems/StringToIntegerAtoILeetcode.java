package practise.normalQuestions.stringProblems;

import java.util.function.Consumer;

public class StringToIntegerAtoILeetcode {
    public static int myAtoi(String s) {
        if (s.length() == 0)
            return 0;
        StringBuilder intString = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 65 && s.charAt(i) <= 90) || (s.charAt(i) >= 97 && s.charAt(i) <= 122))
                break;
            if (s.charAt(i) == '.') {
                if (intString.length() == 1)
                    return Integer.parseInt(intString.substring(0, 1));
                return Integer.parseInt(intString.length() == 0 ? "0" : intString.toString());
            }

            if (s.charAt(i) == '-' || s.charAt(i) == '+') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == '+' || s.charAt(i + 1) == '.' || s.charAt(i + 1) == ' ' || s.charAt(i + 1) == '-')
                        break;
                    if (s.charAt(i + 1) >= 49 && s.charAt(i + 1) <= 57) {
                        intString.append(s.charAt(i));
                        intString.append(s.charAt(i + 1));
                        i++;
                    }
                } else if (s.charAt(i) == '+' || s.charAt(i) == '.' || s.charAt(i) == ' ' || s.charAt(i) == '-')
                    break;
                else intString.append(s.charAt(i));
            } else if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == ' ' || s.charAt(i) == '.') {
                        intString.append(s.charAt(i));
                        break;
                    }
                }
                intString.append(s.charAt(i));

            }
        }

        if (intString.length() < 12) {
            if (intString.toString().equals(Integer.MAX_VALUE + ""))
                return Integer.MAX_VALUE;
            else if (s.charAt(0) == '-' && s.substring(1).equals(Integer.MIN_VALUE + ""))
                return Integer.MIN_VALUE;
            else if (s.charAt(0) == '+' && s.substring(1).equals(Integer.MAX_VALUE + ""))
                return Integer.MAX_VALUE;
            else {
                if (intString.length() == 0)
                    return 0;
                else if (intString.length() < 11 && intString.charAt(0) == '-' || intString.charAt(0) == '+')
                    return Integer.parseInt(intString.toString());
            }
        } else if (intString.charAt(0) == '-') return Integer.MIN_VALUE;
        else return Integer.MAX_VALUE;
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("42"));
    }
}
