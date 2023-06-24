package CatalogManagement;

import java.util.Date;

public class TrainingSession {

    private int trainingSessionId;
    private Date date;
    private String location;
    private int nbParticipants;
    private int courseId;

    public TrainingSession(int trainingSessionId, Date date, String location, int nbParticipants, int courseId) {
        this.trainingSessionId = trainingSessionId;
        this.date = date;
        this.location = location;
        this.nbParticipants = nbParticipants;
        this.courseId = courseId;
    }

    public int getTrainingSessionId() {
        return trainingSessionId;
    }

    public void setTrainingSessionId(int trainingSessionId) {
        this.trainingSessionId = trainingSessionId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNbParticipants() {
        return nbParticipants;
    }

    public void setNbParticipants(int nbParticipants) {
        this.nbParticipants = nbParticipants;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
}
