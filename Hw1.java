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

    /**
     * Displays the menu
     * 
     * @author Begüm Filiz Öz
     */
    public static void displayMenu() {
        System.out.println( "1 - Find the maximum value in the array" );
        System.out.println( "2 - Find the minimum value in the array" );
        System.out.println( "3 - Find the average value in the array and the difference value of the array" );
        System.out.println( "4 - Find the sum of elements with odd-numbered and even-numbered indexes" );
        System.out.println( "5 - Exit the program" );
    }

    /**
     * Gets user input and returns the input if it is valid
     * 
     * @author Begüm Filiz Öz
     * @return user input
     */
    public static int getUserInput() {
        Scanner input = new Scanner(System.in);
        boolean inputValid = false;
        while ( !inputValid )
        {
            System.out.print( "Please enter the number of the option you want to execute: ");
            if ( input.hasNextInt() )
            {
                int userInput = input.nextInt();
                if ( userInput <= 5 && userInput >= 1 )
                {
                    inputValid = true;
                    return userInput;
                }
                else
                {
                    inputValid = false;
                    System.out.println( "The option you entered is not valid.");
                }
            }
            else
            {
                input.nextLine();
                inputValid = false;
                System.out.println( "The option you entered is not valid.");
            }
        }
        return 0;
    }

    public static int findMinArr(int[] arr) {
        //TODO: Bertan
    }

    public static int findMaxArr(int[] arr) {
        //TODO: Bertan
    }

    /**
	 * Returns the average of all values in a given array.
	 * The function returns 0 if the given array has no elements.
	 * 
	 * @author 	Emirhan Yagcioglu
	 * @param 	arr
	 * @return 	an integer representing the average of array elements
	 */
	public static double findAvgArr(int[] arr) {
		double average;
		int sum = 0;
		int arrayLength = arr.length;
		if (arrayLength == 0) {
			return 0;	// if array has zero elements, returns 0
		}
		else {
			for (int i = 0; i < arrayLength; i++) {
				sum += arr[i]; 	// sum of all elements in the array
			}
			average = (double) sum / arrayLength; 	// average of all elements
			return average;
		}
	}

	/**
	 * Finds the difference between each element of a given array and 
	 * the average of all values in the array. Returns an array containing
	 * the difference between the average all elements of the given array.
	 * 
	 * @author 	Emirhan Yagcioglu
	 * @param 	arr
	 * @return 	an array consisting of each element subtracted from the average
	 */
	public static double[] findDiffArr(int[] arr) {
		int arrayLength = arr.length;
		double[] finalArray = new double[arrayLength];	// new array with the same length
		double average = findAvgArr(arr);	// get average of the array
		for (int i = 0; i < arrayLength; i++) {
			finalArray[i] = average - arr[i];	// populate new array with values
		}
		return finalArray;
	}

    public static String arrayToString(double[] arr) {
        //TODO: Emirhan
    }

    /**
     * Gives the sum of elements with odd numbered indexes and even numbered indexes
     * seperately.
     * 
     * @author Can Tucer
     * @param arr (array to work on)
     * @returns string to be printed
     */
    public static String findSumArr(int[] arr){
        // Initial variables to use for calculation:
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < arr.length; i++) { // Iterating through the list.

            if (isEven(i)) {
                evenSum += arr[i];
            } else {
                oddSum += arr[i];
            }

        }

        String text = String.format("Sum of even numbered indexes: %d%nSum of odd numbered indexes: %d", evenSum, oddSum);
        return text;
    }

    /**
     * Checks if a number is even.
     * 
     * @author Can Tucer
     * @param i (number to work on)
     * @returns result boolean
     */
    public static boolean isEven(int i){
        return (i % 2 == 0);
    }
}
