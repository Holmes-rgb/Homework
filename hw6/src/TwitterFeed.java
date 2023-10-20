import java.util.ArrayList;

public class TwitterFeed {
    private String screenName;
    private ArrayList<Tweet> tweets;
    private static int INITIAL_CAPACITY = 100;

    /**
     * Constructor for Twitter Feed object
     * @param screenName name of the person whose feed is being constructed
     */
    public TwitterFeed(String screenName){
        tweets = new ArrayList<>(INITIAL_CAPACITY);
        this.screenName = screenName;
    }

    /**
     * Getter for the Twitter feed
     * @return Returns a hard copy of the feed arraylist
     */
    public ArrayList<Tweet> getTwitterFeed(){
        ArrayList<Tweet> tweetsCopy = new ArrayList<>();
        for (int i = 0; i < tweets.size(); i++){
            tweetsCopy.add(tweets.get(i));
        }
        return tweetsCopy;
    }

    /**
     * Method for adding tweets to the feed
     * @param screenName name of the user who created the tweet
     * @param content String with the content of the tweet
     */
    public void addTweet(String screenName, String content){
        tweets.add(new Tweet(screenName, content));
    }

    /**
     * Method for adding a copy of another tweet to the feed. Essentially a retweet.
     * @param tweet tweet object that should be copied to feed
     */
    public void addTweet(Tweet tweet){
        tweets.add(tweet);
    }

    /**
     * Method for printing the Twitter feed
     * @return the Twitter feed formatted as a string
     */
    @Override
    public String toString() {
        String feed = "";
        feed += "Feed of @" + screenName + "\n";
        for (Tweet tweet : tweets) {
            feed += tweet.toString() + "\n";
        }
        return feed;
    }

    /**
     * Method for looking up tweets by a user
     * @param screenName2 Name of user that you would like to see tweets from.
     * @return Returns all tweets by the user in an easy-to-read format
     */
    public String tweetsBy(String screenName2){
        ArrayList<Tweet> tweetsBy = new ArrayList<>(tweets.size());

        for (int i = 0; i < tweets.size(); i++){
            if (tweets.get(i).getScreenName().equals(screenName2)){
                tweetsBy.add(tweets.get(i));
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
