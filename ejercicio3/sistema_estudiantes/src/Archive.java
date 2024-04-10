import java.util.ArrayList;

public class Archive {
    private ArrayList<Student> students;
    private ArrayList<Instructor> instructors;
    private ArrayList<Professor> professors;

    // Default constructor
    public Archive() {
        this.students = new ArrayList<>();
        this.instructors = new ArrayList<>();
        this.professors = new ArrayList<>();
    }

    // Overloaded constructor
    public Archive(ArrayList<Student> students, ArrayList<Instructor> instructors, ArrayList<Professor> professors) {
        this.students = students;
        this.instructors = instructors;
        this.professors = professors;
    }

    // Methods
    public void addNewStudent(Student student) {
        this.students.add(student);
    }

    public void addNewInstructor(Instructor instructor) {
        this.instructors.add(instructor);
    }

    public void addNewProfessor(Professor professor) {
        this.professors.add(professor);
    }

    public void showStudents() {
        for(int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getStudentNumber() + "\t" + students.get(i).getName() + "\t" + students.get(i).getEmail());
        }
    }

    public void showInstructors() {
        for(int i = 0; i < instructors.size(); i++) {
            System.out.println(instructors.get(i).getStudentNumber() + "\t" + instructors.get(i).getName() + "\t" + instructors.get(i).getEmail() + "\t" + instructors.get(i).getSubject());
        }
    }

    public void showProffesors() {
        for(int i = 0; i < professors.size(); i++) {
            System.out.println(professors.get(i).getName() + "\t" + professors.get(i).getEmail() + "\t" + professors.get(i).getFaculty() + "\t" + professors.get(i).getSubject());
        }
    }
}
