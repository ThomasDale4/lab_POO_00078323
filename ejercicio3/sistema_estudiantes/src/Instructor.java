public class Instructor extends Student{
    private double salary;
    private String subject;

    public Instructor(){
        super();
        this.salary = 0.0;
        this.subject = "";
    }
    public Instructor(String name, String telephone, String email, String studentNumber, double CUM, double salary, String subject) {
        super(name, telephone, email, studentNumber, CUM);
        this.salary = salary;
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void attendPractices(){
        System.out.println("Explicando guía a estudiantes");
    }
}
