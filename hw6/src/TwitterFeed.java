import java.util.ArrayList;

public class TwitterFeed {
    private String owner;
    private ArrayList<String> Tweets;
    private static int INITIAL_CAPACITY = 100;

    public TwitterFeed(){
        Tweets = new ArrayList<>(INITIAL_CAPACITY);
    }

}
