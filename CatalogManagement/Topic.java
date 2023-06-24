package CatalogManagement;

import java.util.List;

public class Topic {

    private int topicId;
    private int themeId;
    private String name;
    private boolean isSubTopic;
    private List<Topic> subTopicList;
    private List<Course> courseList;
    private Integer parentTopicId;

    public Topic(int topicId, int themeId, String name, boolean isSubTopic, List<Topic> subTopicList, List<Course> courseList, Integer parentTopicId) {
        this.topicId = topicId;
        this.themeId = themeId;
        this.name = name;
        this.isSubTopic = isSubTopic;
        this.subTopicList = subTopicList;
        this.courseList = courseList;
        this.parentTopicId = parentTopicId;
    }

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public int getThemeId() {
        return themeId;
    }

    public void setThemeId(int themeId) {
        this.themeId = themeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSubTopic() {
        return isSubTopic;
    }

    public void setSubTopic(boolean subTopic) {
        isSubTopic = subTopic;
    }

    public List<Topic> getSubTopicList() {
        return subTopicList;
    }

    public void setSubTopicList(List<Topic> subTopicList) {
        this.subTopicList = subTopicList;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public Integer getParentTopicId() {
        return parentTopicId;
    }

    public void setParentTopicId(Integer parentTopicId) {
        this.parentTopicId = parentTopicId;
    }

    public String toString() {
        String result = "Topic n°" + topicId + ": " + name + '\n';
        String subTopicsListString = "Sub topics list of this topic: ";
        if (isSubTopic) {
            for (Topic topic : subTopicList) {
                subTopicsListString += topic.toString() + '\n';
            }
            result += subTopicsListString + '\n';
        }
        String coursesString = "";
        for (Course course : courseList) {
            coursesString += course.toString() + '\n';
        }
        return result;
    }
}
