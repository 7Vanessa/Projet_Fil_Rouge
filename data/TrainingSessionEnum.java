package data;

public enum TrainingSessionEnum {
    SESSION_1(1, "2023-06-24", "Location1", 45, 1),
    SESSION_2(2, "2023-06-28", "Location1", 35, 1),
    SESSION_3(3, "2023-06-24", "Location1", 40, 2),
    SESSION_4(4, "2023-07-04", "Location1", 50, 3),
    SESSION_5(5, "2023-07-04", "Location2", 38, 4),
    SESSION_6(6, "2023-07-09", "Location2", 35, 4),
    SESSION_7(7, "2023-07-15", "Location3", 30, 5),
    SESSION_8(8, "2023-07-15", "Location3", 35, 6);

    private final int sessionID;
    private final String sessionDate;
    private final String location;
    private final int nbParticipants;
    private final int courseID;

    TrainingSessionEnum(int sessionID, String sessionDate, String location, int nbParticipants, int courseID) {
        this.sessionID = sessionID;
        this.sessionDate = sessionDate;
        this.location = location;
        this.nbParticipants = nbParticipants;
        this.courseID = courseID;
    }

    public int getSessionID() {
        return sessionID;
    }

    public String getSessionDate() {
        return sessionDate;
    }

    public String getLocation() {
        return location;
    }

    public int getNbParticipants() {
        return nbParticipants;
    }

    public int getCourseID() {
        return courseID;
    }
}
