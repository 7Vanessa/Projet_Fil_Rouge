package CatalogManagement;

import java.util.List;

public class Theme {

    private int themeId;
    private int fieldId;
    private String name;
    private List<Topic> topicList;

    public Theme(int themeId, int fieldId, String name, List<Topic> topicList) {
        this.themeId = themeId;
        this.fieldId = fieldId;
        this.name = name;
        this.topicList = topicList;
    }

    public int getThemeId() {
        return themeId;
    }

    public void setThemeId(int themeId) {
        this.themeId = themeId;
    }

    public int getFieldId() {
        return fieldId;
    }

    public void setFieldId(int fieldId) {
        this.fieldId = fieldId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Topic> getTopicList() {
        return topicList;
    }

    public void setTopicList(List<Topic> topicList) {
        this.topicList = topicList;
    }

    public String toString() {
        String topicsString = "";
        for (Topic topic : topicList) {
            topicsString += topic.toString();
        }
        return "Theme n°" + themeId + ": " + name + '\n' + "Topic list of this theme: " + topicsString;
    }
}
