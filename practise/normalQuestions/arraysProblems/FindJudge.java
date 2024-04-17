package practise.normalQuestions.arraysProblems;

public class FindJudge {
    public static void main(String[] args) {
        System.out.println(findJudge(new int[][]{{1, 3}, {1, 4}, {2, 3}}, 4));
    }

    private static int findJudge(int[][] trust, int n) {
        int[] judge = new int[n];
        for (int[] ints : trust) {
            judge[ints[1] - 1] += 1;
        }
        for (int[] ints : trust) {
            judge[ints[0] - 1] = 0;
        }
        for (int i = 0; i < judge.length; i++) {
            if (judge[i] == n - 1) return i + 1;
        }
        return -1;
    }
}