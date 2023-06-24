package data;

public enum CourseEnum {
    COURSE_1(1, "Basics of Java", 29.99, "Basics of Java is an introductory course designed to provide learners with a strong foundation in Java programming. This course emphasizes the fundamental concepts of the Java language, providing a clear understanding of basic principles and programming structures.", 4),
    COURSE_2(2, "Advanced Java", 30.90, "The Advanced Java course is designed to take your Java programming skills to the next level. This comprehensive course covers advanced concepts and techniques that will enhance your ability to develop robust and efficient Java applications.", 2),
    COURSE_3(3, "Learn the basics of python", 54.00, "This course is designed to provide a comprehensive introduction to the fundamentals of the Python programming language. This course is suitable for beginners with little to no prior programming experience.", 3),
    COURSE_4(4, "Advanced web development", 34.50, "This course is designed to provide in-depth knowledge and skills to experienced web developers who want to take their expertise to the next level. This course explores advanced concepts, techniques, and tools used in modern web development, empowering participants to build sophisticated and high-performing web applications.", 4),
    COURSE_5(5, "Learn C#", 48.90, "This course is designed to provide beginners with a comprehensive introduction to the C# programming language. Whether you're new to programming or have experience with other languages, this course will equip you with the fundamental knowledge and skills needed to start building your own C# applications.", 7),
    COURSE_6(6, "The basics of Cloud", 69.99, "This course is an introductory course that provides a comprehensive understanding of cloud computing. This course is designed to familiarize participants with the fundamental concepts, principles, and technologies related to cloud computing.", 1),
    COURSE_7(7, "Cyber-security for beginners", 95.90, "This course is an introductory course that provides a comprehensive overview of the field of cybersecurity. This course is designed for individuals who have limited or no prior knowledge of cybersecurity and aims to equip them with fundamental concepts, principles, and practices to enhance their understanding of the digital security landscape.", 7),
    COURSE_8(8, "The basics of artificial intelligence", 98.00, "This course is an introductory course that provides a comprehensive overview of the fundamental concepts and principles underlying the field of artificial intelligence (AI). This course aims to familiarize students with the core ideas, techniques, and applications of AI, empowering them to understand and participate in the exciting world of intelligent systems.", 8);

    private final int courseID;
    private final String courseName;
    private final double price;
    private final String content;
    private final int topicId;

    CourseEnum(int courseID, String courseName, double price, String content, int topicId) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.price = price;
        this.content = content;
        this.topicId = topicId;
    }

    public int getCourseID() {
        return courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getPrice() {
        return price;
    }

    public String getContent() {
        return content;
    }

    public int getTopicId() {
        return topicId;
    }
}
