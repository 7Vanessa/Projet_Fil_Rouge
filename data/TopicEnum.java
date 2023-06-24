package data;

public enum TopicEnum {
    TOPIC1(1, "Topic1", false, 1, null),
    TOPIC2(2, "Topic2", false, 2, null),
    TOPIC3(3, "Topic3", false, 4, null),
    TOPIC4(4, "Topic4", true, 4, 3),
    TOPIC5(5, "Topic5", true, 4, 3),
    TOPIC6(6, "Topic6", true, 2, 2),
    TOPIC7(7, "Topic7", true, 2, 2),
    TOPIC8(8, "Topic8", true, 2, 2);

    private int topicID;
    private String topicName;
    private boolean isSubTopic;
    private int themeID;
    private Integer parentTopicID;

    TopicEnum(int topicID, String topicName, boolean isSubTopic, int themeID, Integer parentTopicID) {
        this.topicID = topicID;
        this.topicName = topicName;
        this.isSubTopic = isSubTopic;
        this.themeID = themeID;
        this.parentTopicID = parentTopicID;
    }

    public int getTopicID() {
        return topicID;
    }

    public String getTopicName() {
        return topicName;
    }

    public boolean isSubTopic() {
        return isSubTopic;
    }

    public int getThemeID() {
        return themeID;
    }

    public Integer getParentTopicID() {
        return parentTopicID;
    }
}
