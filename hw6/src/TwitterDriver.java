import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TwitterDriver {
    public static void main(String[] args) throws IOException {
        TwitterFeed tf;
        Scanner scanner = new Scanner(new File("feed1.txt"));

        tf = new TwitterFeed(scanner.nextLine());
        while (scanner.hasNext()){
            tf.addTweet(scanner.nextLine(),scanner.nextLine());
        }

        System.out.println(tf);
        System.out.println(tf.tweetsBy("BillGates"));
    }
}
