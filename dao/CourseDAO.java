package dao;

import CatalogManagement.Course;
import dao.DAO;
import data.CourseEnum;

import java.util.ArrayList;
import java.util.List;

public class CourseDAO extends DAO<Course> {
    private List<Course> courses;
    private TrainingSessionDAO trainingSessionDAO;

    public CourseDAO() {
        trainingSessionDAO = new TrainingSessionDAO();
        courses = new ArrayList<>();
        initializeCourses();
    }

    private void initializeCourses() {
        for (CourseEnum courseEnum : CourseEnum.values()) {
            Course course = new Course(
                    courseEnum.getCourseID(),
                    courseEnum.getCourseName(),
                    courseEnum.getPrice(),
                    trainingSessionDAO.getAllTrainingSessionsByCourseId(courseEnum.getCourseID()),
                    courseEnum.getContent(),
                    courseEnum.getTopicId()
            );
            courses.add(course);
        }
    }

    public List<Course> getAllCourses() {
        return courses;
    }

    public List<Course> getAllCoursesByTopicId(int topicId) {
        List<Course> result = new ArrayList<>();
        for (Course course : courses) {
            if (course.getTopicId() == topicId) {
                result.add(course);
            }
        }
        return result;
    }

    @Override
    public Course find(int id) {
        for (Course course : courses) {
            if (course.getCourseId() == id) {
                return course;
            }
        }
        return null;
    }

    @Override
    public void create(Course course) {
        courses.add(course);
    }

    @Override
    public void update(Course course) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseId() == course.getCourseId()) {
                courses.set(i, course);
                break;
            }
        }
    }

    @Override
    public void delete(Course course) {
        courses.remove(course);
    }
}
