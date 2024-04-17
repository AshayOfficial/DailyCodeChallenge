package practise.normalQuestions.arraysProblems;

import java.util.*;

public class LeastUniqueIntegersAfterKRemoval {
    public static void main(String[] args) {
        System.out.println(findLeastNumOfUniqueInts(new int[]{4, 3, 1, 1, 3, 3, 2}, 3));
    }

    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, List<Integer>> freqMap = new TreeMap<>();
        Set<Integer> countSet = new TreeSet<>();
        int i = 0;
        // adding logic
        while (i < arr.length) {
            int count = 0;
            int temp = arr[i];
            if (arr[i] != 0) {
                for (int j = i; j < arr.length; j++) {
                    if (temp == arr[j] && arr[j] != 0) {
                        arr[j] = 0;
                        count++;
                    }
                }
                if (freqMap.containsKey(count)) {
                    List<Integer> intList = freqMap.get(count);
                    intList.add(temp);
                    freqMap.put(count, intList);
                    countSet.add(count);
                } else {
                    countSet.add(count);
                    List<Integer> integers = new ArrayList<>();
                    integers.add(temp);
                    freqMap.put(count, integers);
                }
            }
            i++;
        }
        List<Integer> remove = new ArrayList<>();
        // removing logic
        while (k != 0) {
            for (Integer countInt : countSet) {
                List<Integer> intsList = freqMap.get(countInt);
                if (intsList != null && intsList.size() * countInt <= k) {
                    remove = freqMap.remove(countInt);
                    k -= remove.size() * countInt;
                }
                //change logic
                else {
                    int i1 = k / countInt;
                    remove.remove(0);
                }
            }
        }

        int ans = 0;
        for (Integer count: countSet) {
            List<Integer> integers = freqMap.get(count);
            ans = integers != null ? integers.size() : 0;
        }
        return ans;
    }
}
