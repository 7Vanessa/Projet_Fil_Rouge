package dao;

import CatalogManagement.Theme;
import CatalogManagement.Topic;
import data.TopicEnum;

import java.util.ArrayList;
import java.util.List;

public class TopicDAO extends DAO<Topic> {
    private List<Topic> topics;
    private CourseDAO courseDAO;

    public TopicDAO() {
        courseDAO = new CourseDAO();
        topics = new ArrayList<>();
        initializeTopics();
    }

    private void initializeTopics() {
        for (TopicEnum topicEnum : TopicEnum.values()) {
            Topic topic;
            if (topicEnum.getParentTopicID() != null) {
                topic = new Topic(
                        topicEnum.getTopicID(),
                        topicEnum.getThemeID(),
                        topicEnum.getTopicName(),
                        topicEnum.isSubTopic(),
                        getAllTopicsByTopicId(topicEnum.getParentTopicID()),
                        courseDAO.getAllCoursesByTopicId(topicEnum.getTopicID()),
                        topicEnum.getParentTopicID()
                );
            } else {
                topic = new Topic(
                        topicEnum.getTopicID(),
                        topicEnum.getThemeID(),
                        topicEnum.getTopicName(),
                        topicEnum.isSubTopic(),
                        null,
                        courseDAO.getAllCoursesByTopicId(topicEnum.getTopicID()),
                        topicEnum.getParentTopicID()
                );
            }

            topics.add(topic);
        }
    }

    public List<Topic> getAllTopics() {
        return topics;
    }

    public List<Topic> getAllTopicsByTopicId(int topicId) {
        List<Topic> result = new ArrayList<>();
        for (Topic topic : topics) {
            if (Boolean.TRUE.equals(topic.isSubTopic()) && (topic.getParentTopicId() == topicId)) {
                result.add(topic);
            }
        }
        return result;
    }

    public List<Topic> getAllTopicsByThemeId(int themeId) {
        List<Topic> result = new ArrayList<>();
        for (Topic topic : topics) {
            if (topic.getThemeId() == themeId) {
                result.add(topic);
            }
        }
        return result;
    }

    @Override
    public Topic find(int id) {
        for (Topic topic : topics) {
            if (topic.getTopicId() == id) {
                return topic;
            }
        }
        return null;
    }

    @Override
    public void create(Topic topic) {
        topics.add(topic);
    }

    @Override
    public void update(Topic topic) {
        for (int i = 0; i < topics.size(); i++) {
            if (topics.get(i).getTopicId() == topic.getTopicId()) {
                topics.set(i, topic);
                break;
            }
        }
    }

    @Override
    public void delete(Topic topic) {
        topics.remove(topic);
    }
}
