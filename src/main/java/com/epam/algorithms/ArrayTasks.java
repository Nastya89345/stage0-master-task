package com.epam.algorithms;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {

        return new String[]{"Winter", "Spring", "Summer", "Autumn"};
    }

    /**
     * Generate an int[] array of consecutive positive integers starting at 1 of the given length (length parameter >
     * 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1] length = 3  -> [1, 2, 3] length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9 arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array. If there is no such element in the array,
     * return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2 arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * Return the new String[] array obtained from the arr array by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"] arr = ["pineapple", "apple", "pen"] -> ["pen", "apple",
     * "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String[] result = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[arr.length - i - 1] = arr[i];
        }
        return result;
    }

    /**
     * Return new int[] array obtained from arr int[] array by choosing positive numbers only. P.S. 0 is not a positive
     * number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3] arr = [-1, -2, -3]   -> [] arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {

        int lastIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isLast = false;
            if (arr[i] < 1 && !isLast) {
                isLast = true;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] > 0) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        isLast = false;
                        break;
                    }
                }
            }
            if (isLast) {
                lastIndex = i;
                break;
            }
        }
        int[] result = new int[lastIndex];
        for (int i = 0; i < lastIndex; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules: Incoming one-dimensional arrays
     * must be arranged in ascending order of their length; numbers in all one-dimensional arrays must be in ascending
     * order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]] arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        arr = sortArr(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sortInt(arr[i]);
        }
        return arr;
    }

    private int[] sortInt(int[] arr) {
        if (arr == null) {
            return arr;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int min = arr[i];
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    private int[][] sortArr(int[][] arr) {
        int[][] copy = new int[arr.length][];
        for (int i = 0; i < copy.length; i++) {
            copy[i] = arr[i];
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            int max = 0;
            int index = 0;
            for (int j = copy.length - 1; j >= 0; j--) {
                if (copy[j] == null) {
                    continue;
                }
                if (copy[j].length > max) {
                    max = copy[j].length;
                    index = j;
                }
            }
            arr[i] = copy[index];
            copy[index] = null;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] arr = {{3, 9, 5}, {2, 1}};
        printArray(arr);
        ArrayTasks arrayTasks = new ArrayTasks();
        int[][] result = arrayTasks.sortRaggedArray(arr);
        printArray(result);
    }

    private static void printArray(int[][] array) {
        for (int[] arr : array) {
            for (int i : arr) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

}
