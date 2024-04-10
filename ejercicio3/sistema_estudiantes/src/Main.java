import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Archive archive = new Archive(); // For saving registers in lists
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("---------------------");
            System.out.println("Registro de personas");
            System.out.println("1. Registrar a un estudiante \n2. Registrar a un instructor \n3. Registrar a un profesor");
            System.out.println("4. Mostrar estudiantes \n5. Mostrar instructores \n6. Mostrar profesores \n7. Salir \nTu opción: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1: {
                    System.out.println("---------------------");
                    Student student = new Student();

                    // Obtaining student info
                    System.out.println("Nombre: ");
                    student.setName(sc.nextLine());
                    System.out.println("Número de estudiante: ");
                    student.setStudentNumber(sc.nextLine());
                    System.out.println("Correo electrónico: ");
                    student.setEmail(sc.nextLine());
                    System.out.println("CUM: ");
                    student.setCUM(sc.nextDouble());

                    // Adding student to the list
                    archive.addNewStudent(student);
                    break;
                }
                case 2: {
                    System.out.println("---------------------");
                    Instructor instructor = new Instructor();

                    // Obtaining instructor info
                    /* YOUR CODE HERE */

                    // Adding instructor to the list
                    archive.addNewInstructor(instructor);
                    break;
                }
                case 3: {
                    System.out.println("---------------------");
                    Professor professor = new Professor();

                    // Obtaining professor info
                    /* YOUR CODE HERE */

                    // Adding professor to the list
                    archive.addNewProfessor(professor);
                    break;
                }
                case 4:
                    System.out.println("---------------------");
                    System.out.println("Lista de estudiantes: ");
                    archive.showStudents();
                    break;
                case 5:
                    System.out.println("---------------------");
                    System.out.println("Lista de instructores");
                    archive.showInstructors();
                    break;
                case 6:
                    System.out.println("---------------------");
                    System.out.println("Lista de profesores");
                    archive.showProffesors();
                    break;
                case 7:
                    System.out.println("Adiós...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (option != 7);
    }
}