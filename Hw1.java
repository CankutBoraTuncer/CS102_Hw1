package lab0.CS102_Hw1;

/**
 * For this assignment, you are going to create a tiny Java project with a group
 * of 3-5 students.
 * 
 * @authors Cankut Bora Tuncer // TODO: Add your name here
 * @version
 */

public class Hw1 {
    public static void main(String[] args) {
        // Constants & Variables
        final int ARR_SIZE = 100;
        final int MAX_NUM = 10;
        int[] arr = new int[ARR_SIZE];
        boolean runFlag = true;
        int userInput;

        // Fill in the array with random integers
        fillArr(arr, MAX_NUM);

        // One empty line to make the program look better on startup.
        System.out.println();

        do {
            displayMenu();
            userInput = getUserInput();
            switch (userInput) {
                case (1): // Min
                    System.out.println("\nThe maximum value in the array: " + findMaxArr(arr) + "\n");
                    break;
                case (2): // Max
                    System.out.println("\nThe minimum value in the array: " + findMinArr(arr) + "\n");
                    break;
                case (3): // Avg
                    System.out.println("\nThe average value of the array: " + findAvgArr(arr));
                    System.out.println("The difference value of the array: " + arrayToString(findDiffArr(arr)) + "\n");
                    break;
                case (4): // Sum
                    System.out.println("\nThe sum of elements with odd-numbered and even-numbered indexes:\n"
                            + findSumArr(arr) + "\n");
                    break;
                case (5): // Exit
                    runFlag = false;
                    break;
            }
        } while (runFlag);

        System.out.println("The program is exited by the user!");

    }

    /**
     * Randomly fills the given array
     * 
     * @param arr
     * @param MAX_NUM
     * @author Cankut Bora Tuncer
     */
    public static void fillArr(int[] arr, int MAX_NUM) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * MAX_NUM + 1);
        }
    }

    public static void displayMenu() {
        //TODO: Begum
    }

    public static int getUserInput() {
        //TODO: Begum
    }

    public static int findMinArr(int[] arr) {
        //TODO: Bertan
    }

    public static int findMaxArr(int[] arr) {
        //TODO: Bertan
    }

    public static double findAvgArr(int[] arr) {
        //TODO: Emirhan
    }

    public static double[] findDiffArr(int[] arr) {
        //TODO: Emirhan
    }

    public static String arrayToString(double[] arr) {
        //TODO: Emirhan
    }

    public static String findSumArr(int[] arr) {
        //TODO: Can
    }

    public static boolean isEven(int i) {
        //TODO: Can
    }
}
