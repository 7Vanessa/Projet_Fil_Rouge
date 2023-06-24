package dao;

import CatalogManagement.TrainingSession;
import data.TrainingSessionEnum;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TrainingSessionDAO extends DAO<TrainingSession> {
    private List<TrainingSession> trainingSessions;

    public TrainingSessionDAO() {
        trainingSessions = new ArrayList<>();
        initializeTrainingSessions();
    }

    private void initializeTrainingSessions() {
        for (TrainingSessionEnum sessionEnum : TrainingSessionEnum.values()) {
            TrainingSession session = new TrainingSession(
                    sessionEnum.getSessionID(),
                    parseDate(sessionEnum.getSessionDate()),
                    sessionEnum.getLocation(),
                    sessionEnum.getNbParticipants(),
                    sessionEnum.getCourseID()
            );
            trainingSessions.add(session);
        }
    }

    public List<TrainingSession> getAllTrainingSessions() {
        return trainingSessions;
    }

    public List<TrainingSession> getAllTrainingSessionsByCourseId(int courseId) {
        List<TrainingSession> result = new ArrayList<>();
        for (TrainingSession trainingSession: trainingSessions) {
            if (trainingSession.getCourseId() == courseId) {
                result.add(trainingSession);
            }
        }
        return result;
    }

    @Override
    public TrainingSession find(int id) {
        for (TrainingSession session : trainingSessions) {
            if (session.getTrainingSessionId() == id) {
                return session;
            }
        }
        return null;
    }

    @Override
    public void create(TrainingSession session) {
        trainingSessions.add(session);
    }

    @Override
    public void update(TrainingSession session) {
        for (int i = 0; i < trainingSessions.size(); i++) {
            if (trainingSessions.get(i).getTrainingSessionId() == session.getTrainingSessionId()) {
                trainingSessions.set(i, session);
                break;
            }
        }
    }

    @Override
    public void delete(TrainingSession session) {
        trainingSessions.remove(session);
    }

    private Date parseDate(String dateString) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
