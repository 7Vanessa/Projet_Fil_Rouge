package CatalogManagement;

import java.util.List;

public class Course {
    private int courseId;
    private String name;
    private double price;
    private List<TrainingSession> trainingSessionList;
    private String content;
    public int topicId;

    public Course(int courseId, String name, double price, List<TrainingSession> trainingSessionList, String content, int topicId) {
        this.courseId = courseId;
        this.name = name;
        this.price = price;
        this.content = content;
        this.trainingSessionList = trainingSessionList;
        this.topicId = topicId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<TrainingSession> getTrainingSessionList() {
        return trainingSessionList;
    }

    public void setTrainingSessionList(List<TrainingSession> trainingSessionList) {
        this.trainingSessionList = trainingSessionList;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public String toString() {
        String trainingSessionsString = "";
        for (TrainingSession trainingSession : trainingSessionList) {
            trainingSessionsString += trainingSession.toString() + '\n';
        }
        return "Course n°" + courseId + ": " + name + "\n" + "TrainingSession list of this course: \n" + trainingSessionsString;
    }
}
