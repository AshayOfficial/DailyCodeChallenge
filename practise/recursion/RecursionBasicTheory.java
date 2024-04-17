package practise.recursion;

/**
 * Recursion is the function which calls itself again and again is called as recursive function and the method is
 * called as recursion.
 * This is mandatory that we have to provide the <b>Base-Condition</b> which helps to terminate the recursive
 * function calls or else it wil throw the Stack Overflow error.*/

public class RecursionBasic {
    public static void main(String[] args) {
        recursiveFunctionWithoutBaseCondition(1);
//        recursiveFunctionWithBaseCondition(1);
    }

    private static void recursiveFunctionWithoutBaseCondition(int count) {
        System.out.println(count);
        count++;
        recursiveFunctionWithoutBaseCondition(count);
    }

    private static void recursiveFunctionWithBaseCondition(int count) {
        if (count==10) {                // Base Condition
            System.out.println(count);
            return;
        }
        System.out.println(count);
        count++;
        recursiveFunctionWithBaseCondition(count);
    }
}
