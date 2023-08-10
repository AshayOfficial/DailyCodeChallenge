package practise.dailyQuestionsBySir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Que_01_08_23 {

//    Given a list of tasks with deadlines and total profit earned on completing a task, find the maximum profit earned
//    by executing the tasks within the specified deadlines. Assume that each task takes one unit of time to complete,
//    and a task can’t execute beyond its deadline. Also, only a single task will be executed at a time.
//
//    For example, consider the following set of tasks with a deadline and the profit associated with it. If we choose
//    tasks 1, 3, 4, 5, 6, 7, 8, and 9, we can achieve a maximum profit of 109. Note that task 2 and task 10 are left
//    out.
//    Tasks	Deadlines	  Profit
//      1	    9	        15
//      2	    2	        2
//      3	    5	        18
//      4	    7	        1
//      5	    4	        25
//      6	    2	        20
//      7	    5	        8
//      8	    7	        10
//      9	    4	        12
//      10	    3	        5
    public static void maxProfitDeadline(List<DeadlineProfitTask> deadlineProfitTasks) {
        int maxProfit = 0;
        int maxDeadline = Integer.MIN_VALUE;
        for (DeadlineProfitTask deadlineProfitTask: deadlineProfitTasks) {      //max deadline value
            if (deadlineProfitTask.deadline > maxDeadline)
                maxDeadline = deadlineProfitTask.deadline;
        }

        int[] tasksList = new int[maxDeadline];
        Collections.sort(deadlineProfitTasks);
        for (int i = 0; i < deadlineProfitTasks.size(); i++) {
            DeadlineProfitTask deadlineProfitTask = deadlineProfitTasks.get(i);
            if (tasksList[deadlineProfitTask.deadline - 1] == 0) {
                tasksList[deadlineProfitTask.deadline - 1] = deadlineProfitTask.tasks;
                maxProfit = deadlineProfitTask.profit + maxProfit;
            }
            else if (tasksList[deadlineProfitTask.deadline - 1] != 0) {
                for (int j = deadlineProfitTask.deadline - 2; j >= 0 ; j--) {
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
        Que_01_08_23.maxProfitDeadline(deadlineProfitTasks);
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
    }
}
