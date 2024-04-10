public class Student extends Person{
    private String studentNumber;
    private double CUM;
    public Student(){
        super();
        this.studentNumber = "";
        this.CUM = 0.0;
    }
    public Student(String name, String telephone, String email, String studentNumber, double CUM){
        super(name, telephone, email);
        this.studentNumber = studentNumber;
        this.CUM = CUM;
    }
    public String getStudentNumber() {
        return studentNumber;
    }
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
    public double getCUM() {
        return CUM;
    }
    public void setCUM(double CUM) {
        this.CUM = CUM;
    }
    public void attendClasses() {
        System.out.println("Writing important stuff");
    }
    public void attendPractices() {
        System.out.println("Listening to instructor and coding");
    }
}
