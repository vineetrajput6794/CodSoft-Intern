public class Student {

    // Private Data Members
    private int id;
    private String name;
    private int age;
    private String course;
    private String email;

    // Default Constructor
    public Student() {
    }

    // Parameterized Constructor
    public Student(int id, String name, int age, String course, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.email = email;
    }

    // Getter and Setter for ID
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for Age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter for Course
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // Getter and Setter for Email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Display Student Information
    @Override
    public String toString() {
        return "----------------------------------\n" +
               "Student ID : " + id + "\n" +
               "Name       : " + name + "\n" +
               "Age        : " + age + "\n" +
               "Course     : " + course + "\n" +
               "Email      : " + email + "\n" +
               "----------------------------------";
    }
}