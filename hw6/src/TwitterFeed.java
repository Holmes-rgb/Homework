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


    @Override
    public String toString() {
        String feed = "";
        feed += "Feed of @" + screenName + "\n";
        for (Tweet tweet : Tweets) {
            feed += tweet.toString() + "\n";
        }
        return feed;
    }

    public String tweetsBy(String screenName2){
        ArrayList<Tweet> tweetsBy = new ArrayList<>(Tweets.size());

        for (int i = 0; i < Tweets.size(); i++){
            if (Tweets.get(i).getScreenName().equals(screenName2)){
                tweetsBy.add(Tweets.get(i));
            }
        }

        String tweets = "";
        tweets += String.format("Tweets on %s feed by %s:\n", this.screenName, screenName2);
        for (Tweet tweet : tweetsBy) {
            tweets += tweet.toString() + "\n";
        }
        return tweets;
    }
}
