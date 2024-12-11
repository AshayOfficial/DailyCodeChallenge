package practise.normalQuestions.numbersQuestions;

public class NumToExcelColumn {
    public static void main(String[] args) {
        System.out.println(convertToTitle(52));
    }

    public static String convertToTitle(int columnNumber) {
        int rem = 0;
        StringBuilder builder = new StringBuilder();
        boolean flag = false;
        if (columnNumber % 26 == 0) {
            builder.insert(0, "Z");
            while (columnNumber > 0) {
                columnNumber /= 26;
                if (columnNumber > 26) {
                    rem = columnNumber % 26;
                    builder.insert(0, (char) (rem + 64));
                }
                if (columnNumber <= 26 && columnNumber > 0) {
                    builder.insert(0, (char) (columnNumber + 64));
                }
            }
            return builder.toString();
        } else {
            if (columnNumber > 26) flag = true;
            while (columnNumber != 0) {
                if (columnNumber <= 26 && columnNumber > 0) {
                    builder.insert(0, (char) (columnNumber + 64));
                    break;
                }
                rem = columnNumber % 26;
                if (rem == 0)
                    builder.insert(0, "Z");
                else
                    builder.insert(0, (char) (rem + 64));
                columnNumber = columnNumber / 26;
            }
            if (flag && columnNumber != 1) {
                if (columnNumber <= 702)
                    return builder.replace(0, 1, (char) (columnNumber + 64) + "").toString();
                else return builder.replace(0, 1, (char) (columnNumber - 1 + 64) + "").toString();
            } else return builder.toString();
        }
    }
}
