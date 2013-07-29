class CourseSession {
    private String department;
    private String number;
    private int numberOfStudents;      //test version control

    CourseSession(String department, String number) {
        this.department = department;
        this.number = number;
        numberOfStudents = 0;
    }

    String getDepartment() {
        return department;
    }

    String getNumber() {
        return number;
    }

    int getNumberOfStudents() {
        return numberOfStudents;
    }

    void enroll(Student student){
        numberOfStudents = numberOfStudents + 1;
    }
}