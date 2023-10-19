public class Tweet {
    private String screenName;
    private String content;
    public static final int MAX_CHARS = 140;

    public Tweet(String screenName, String content){
        this.screenName = screenName;
        this.content = content.substring(0,MAX_CHARS);
    }

    public Tweet(Tweet other){
        other.screenName = this.screenName;
        other.content = this.content;
    }

    public String getContent() {
        return content;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    @Override
    public String toString() {
        return String.format("@%s\n\"%s\"",screenName, content);
    }

    @Override
    public boolean equals(Object obj) {
        Tweet other = (Tweet) obj;
        return (this.getScreenName().equals(other.getScreenName()) && this.getContent().equals(other.getContent()));
    }
}