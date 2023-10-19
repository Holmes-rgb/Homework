import java.util.ArrayList;

public class TwitterFeed {
    private String screenName;
    private ArrayList<Tweet> Tweets;
    private static int INITIAL_CAPACITY = 100;

    public TwitterFeed(String screenName){
        Tweets = new ArrayList<>(INITIAL_CAPACITY);
        this.screenName = screenName;
    }

    //TODO: A getter for the feed that makes a deep copy of the ArrayList and each Tweet reference
    public ArrayList<Tweet> getTweets() {
        return Tweets;
    }

    public void addTweet(String screenName, String content){
        Tweets.add(new Tweet(screenName, content));
    }
    public void addTweet(Tweet tweet){
        Tweets.add(tweet);
    }

    //TODO: Both add the Tweet to the end of the feed.


    @Override
    public String toString() {
        for (int i = 0; i < Tweets.size(); i++){
            if (i == 0){
                return screenName + "\n" + Tweets.get(i).toString();
            }
            else {
                return Tweets.get(i).toString();
            }
        }
        return null;
    }

    public ArrayList<Tweet> tweetsBy(String screenName){
        ArrayList<Tweet> tweetsBy = new ArrayList<>(Tweets.size());

        for (int i = 0; i < Tweets.size(); i++){
            if (Tweets.get(i).getScreenName().equals(screenName)){
                tweetsBy.add(Tweets.get(i));
            }
        }
        return tweetsBy;
    }
}
