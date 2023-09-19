import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class NumberTester {
    public static void main(String[] args) throws IOException {
        Scanner numbers = new Scanner(new File("numbers.txt"));
        while (numbers.hasNextLine()) {
            int i = numbers.nextInt();

        }
        numbers.close();
    }
}