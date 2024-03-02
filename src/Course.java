public class Course {

    private  int courseID;
    private  String courseName;
    private String duration;

    public Course() {
    }

    public Course(int courseID, String courseName, String duration) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.duration = duration;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
