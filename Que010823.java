import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Que010823 {

    public static void maxProfitDeadline(List<DeadlineProfitTask> deadlineProfitTasks) {
        int maxProfit = 0;
        int maxDeadline = Integer.MIN_VALUE;
        for (DeadlineProfitTask deadlineProfitTask: deadlineProfitTasks) {
            if (deadlineProfitTask.deadline > maxDeadline)
                maxDeadline = deadlineProfitTask.deadline;
        }

        int[] tasksList = new int[maxDeadline];
        Collections.sort(deadlineProfitTasks);
        for (int i = 0; i <= tasksList.length; i++) {
            DeadlineProfitTask deadlineProfitTask = deadlineProfitTasks.get(i);
            if (tasksList[deadlineProfitTask.deadline - 1] == 0) {
                tasksList[deadlineProfitTask.deadline - 1] = deadlineProfitTask.tasks;
                maxProfit = deadlineProfitTask.profit+maxProfit;
            }
            else if (tasksList[deadlineProfitTask.deadline - 1] != 0) {
                for (int j = deadlineProfitTask.deadline - 1; j >= 0 ; j--) {
                    if (tasksList[j] == 0) {
                        tasksList[j] = deadlineProfitTask.tasks;
                        maxProfit = deadlineProfitTask.profit+maxProfit;
                        break;
                    }
                }
            }
        }

        System.out.println("MAXIMUM PROFIT :: " + maxProfit);
    }

    public static void main(String[] args) {
        List<DeadlineProfitTask> deadlineProfitTasks = new ArrayList<>();
        deadlineProfitTasks.add(new DeadlineProfitTask(9, 1, 15));
        deadlineProfitTasks.add(new DeadlineProfitTask(2, 2, 2));
        deadlineProfitTasks.add(new DeadlineProfitTask(5, 3, 18));
        deadlineProfitTasks.add(new DeadlineProfitTask(7, 4, 1));
        deadlineProfitTasks.add(new DeadlineProfitTask(4, 5, 25));
        deadlineProfitTasks.add(new DeadlineProfitTask(2, 6, 20));
        deadlineProfitTasks.add(new DeadlineProfitTask(5, 7, 8));
        deadlineProfitTasks.add(new DeadlineProfitTask(7, 8, 10));
        deadlineProfitTasks.add(new DeadlineProfitTask(4, 9, 12));
        deadlineProfitTasks.add(new DeadlineProfitTask(3, 10, 5));
        Que010823.maxProfitDeadline(deadlineProfitTasks);
    }

    static class DeadlineProfitTask implements Comparable<DeadlineProfitTask> {
        public int deadline;
        public int tasks;
        public int profit;

        DeadlineProfitTask(int deadline, int tasks, int profit) {
            this.deadline = deadline;
            this.profit = profit;
            this.tasks = tasks;
        }

        @Override
        public int compareTo(DeadlineProfitTask deadlineProfitTask) {
            return deadlineProfitTask.profit - this.profit;
        }

        @Override
        public String toString() {
            return "DeadlineProfitTask{" +
                    "deadline=" + deadline +
                    ", tasks=" + tasks +
                    ", profit=" + profit +
                    '}';
        }
    }
}
