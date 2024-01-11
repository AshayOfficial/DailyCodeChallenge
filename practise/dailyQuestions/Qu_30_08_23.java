package practise.dailyQuestions;

public class Qu_30_08_23 {
    public static void main(String[] args) {
        String command = "G()()(al)()";
        System.out.println(goalParser(command));
    }

    private static String goalParser(String command) {
        command = command.replaceAll("[(]+[)]", "o");
        command = command.replaceAll("[(]+a+l+[)]", "al");
        return command;
    }
}
