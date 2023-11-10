import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArrayFunctions {
    /**
     * Function to read names rom a file into an array
     * @param fileName path name of file to read from
     * @param array array to read names to
     * @return number of names read into the array
     */
    public static int readArray(String fileName, String[] array){
        int count = 0;
        try {
            Scanner scanner = new Scanner(new File(fileName));
            for (int i = 0; i < array.length; i++){
                array[i] = scanner.nextLine();
                count++;
            }
        }
        catch (NullPointerException | FileNotFoundException e){
            return 0;
        }
        return count;

    }

    /**
     * Method to write the rank of names to a file
     * @param fileName file name of the file that names should be written to
     * @param array array that names are stored in
     * @return true if writing is successful false if failed
     */
    public static boolean writeArray(String fileName, String[] array){
        int rank = 1;
        try {
            FileWriter writer = new FileWriter(new File(fileName));
            for (String s : array) {
                writer.write(String.format("%d: %s\n", rank, s));
                rank++;
            }
            writer.close();
            return true;
        }
        catch (NullPointerException | IOException e){
            return false;
        }
    }


    /**
     * Method to sort an array
     * @param array array to be sorted
     */
    public static void selectionSort(String[] array){
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            String temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    /**
     * Binary search method to find names in an array that has been sorted
     * @param array array to be searched
     * @param name name searching for
     * @return -1 if search did not find name
     */
    public static int binarySearch(String[] array, String name) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int comparisonResult = name.compareTo(array[mid]);

            // Check if the name is present at the middle
            if (comparisonResult == 0) {
                return mid;
            }

            // If name is greater, ignore the left half
            if (comparisonResult > 0) {
                left = mid + 1;
            }

            // If name is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // If the name is not present in the array
        return -1;
    }
}
