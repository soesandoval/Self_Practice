package MariaAndMe;

public class Student extends Person{

    private String fieldOfStudy, studentID;
    private char grade;
    private static String schoolName;

    public Student(String name, int age, char gender, String fieldOfStudy, String studentID, char grade) {
        super(name, age, gender);
        setFieldOfStudy(fieldOfStudy);
        setGrade(grade);
        setStudentID(studentID);
        setSchoolName(schoolName);
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if(fieldOfStudy == null || fieldOfStudy.isEmpty()){
            System.err.println("Field of study cannot be null or empty");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if(!(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F' )){
            System.err.println("Grade is invalid, choose from A, B , C, D,  OR F");
            System.exit(1);
        }
        this.grade = grade;
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public static void setSchoolName(String schoolName) {
        Student.schoolName = schoolName;
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void drink() {
        super.drink();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    public void study() {
        System.out.println(getName() + " is studying ");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                ",name=" + getName() +
                ",age=" + getAge() +
                ",gender=" + getGender() +
                ",fieldOfStudy='" + fieldOfStudy + '\'' +
                ", studentID='" + studentID + '\'' +
                ", grade=" + grade +
                ",schoolName= " + schoolName +
                '}';
    }


}
