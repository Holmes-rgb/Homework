public class Tweet {
    private String screenName;
    private String content;
    public static final int MAX_CHARS = 140;

    /**
     * Constructor for tweets
     * @param screenName name of user who created the tweet
     * @param content content of the tweet as a string
     */
    public Tweet(String screenName, String content){
        this.screenName = screenName;
        if (content.length() > MAX_CHARS){
            this.content = content.substring(0,MAX_CHARS);
        }
        else {
            this.content = content;
        }

    }

    /**
     * Copy constructor for creating a copy of a tweet object
     * @param other tweet that you would like to copy
     */
    public Tweet(Tweet other){
        other.screenName = this.screenName;
        other.content = this.content;
    }

    /**
     * Method to retrieve the content of a tweet
     * @return content of a tweet as a string
     */
    public String getContent() {
        return content;
    }

    /**
     * Method to retrieve the name of the user who created the tweet
     * @return name of user who created the tweet
     */
    public String getScreenName() {
        return screenName;
    }

    /**
     * Set the content of an already existing tweet
     * @param content string that you would like content of the tweet to be replaced with
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * Method to change the user who created a certain tweet
     * @param screenName name of user to be used in replacement of the already existing username
     */
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    /**
     * Method to print a tweet
     * @return tweet formatted as string
     */
    @Override
    public String toString() {
        return String.format("@%s\n\"%s\"",screenName, content);
    }

    /**
     * Method for comparing two tweets
     * @param obj Tweet that you would like to compare to this tweet
     * @return true if they are the same false if they are not
     */
    @Override
    public boolean equals(Object obj) {
        Tweet other = (Tweet) obj;
        return (this.getScreenName().equals(other.getScreenName()) && this.getContent().equals(other.getContent()));
    }
}