package practise.normalQuestions.arraysProblems;

import com.sun.source.tree.IfTree;

public class CanPlaceFlowers {
    /*
    You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot
    be planted in adjacent plots.
    Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an
    integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers
    rule and false otherwise.

    Example 1:
    Input: flowerbed = [1,0,0,0,1], n = 1
    Output: true

    Example 2:
    Input: flowerbed = [1,0,0,0,1], n = 2
    Output: false
    */
    public static void main(String[] args) {
        int[] flowerbed = {0};
        int n = 1;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0)
            return true;

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed.length == 1) {
                if (flowerbed[i] == 0) {
                    n = n - 1;
                    flowerbed[i] = 1;
                    if (n == 0)
                        return true;
                }
                else return false;
            }
            if (i > 0 && i < flowerbed.length - 1) {
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    n = n - 1;
                    flowerbed[i] = 1;
                    if (n == 0)
                        return true;
                }
            } else if (i == 0) {
                if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    n = n - 1;
                    flowerbed[i] = 1;
                    if (n == 0)
                        return true;
                }
            }
            else if (i == flowerbed.length - 1){
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                    n = n - 1;
                    flowerbed[i] = 1;
                    if (n == 0)
                        return true;
                }
            }
        }
        return false;
    }

    public static int maximalNetworkRank(int n, int[][] roads) {
        return roads.length-1;
    }
}
