/*
Luke Holmes
CS2100
11/9/23
 */

import java.util.Scanner;

public class FileDriver extends ArrayFunctions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fileName = "names.txt";


        String userInput = "";
        boolean notInteger = true;
        int num = 0;
        System.out.println("How many names would you like to search through?");
        do {
            System.out.println("Enter a positive integer value");
            try
            {
                userInput = scan.nextLine();
                num = Integer.parseInt(userInput);
                notInteger = false;
            }
            catch (NumberFormatException e)
            {
                System.out.println(userInput + " is not an integer");
            }

        }
        while (notInteger || num < 1);

        System.out.println("What name are you looking for?");
        String name = scan.nextLine();


        String[] array = new String[num];

        int howFull = readArray(fileName, array);
        if (howFull < num){
            System.out.println("Array is partially full");
        }

        selectionSort(array);

        if (!writeArray("sorted_" + fileName, array)){
            System.out.println("write was unsuccessful");
        }

        if (binarySearch(array, name) == -1){
            System.out.printf("%s was not in the top %d", name, num);
        }
        else {
            System.out.printf("%s was in the top %d", name, num);
        }






    }
}
