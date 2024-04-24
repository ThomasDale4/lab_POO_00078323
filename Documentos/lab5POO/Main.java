import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        ArrayList<Room> rooms = new ArrayList<>();
        ArrayList<Book> books = new ArrayList<>();
        Library biblioteca = new Library(rooms, books);
        biblioteca.loadRooms();
        biblioteca.loadBooks();
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("---------------------");
            System.out.println("Biblioteca");
            System.out.println("1. Mostrar salas disponibles \n2. Mostrar salas reservadas \n3. Mostrar detalles de una sala");
            System.out.println("4. Reservar sala \n5. Cancelar reserva de una sala \n6. Mostrar libros disponibles \n7. Mostrar libros prestados");
            System.out.println("8. Mostrar detalles de un libro \n9. Prestar libro \n10. Devolver libro \n11. Salir \nEscoge tu opcion: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    biblioteca.printAvailableRooms();
                    break;
                case 2:
                    biblioteca.printReservedRooms();
                    break;
                case 3:
                    System.out.println("Ingresa el ID de la sala");
                    int numero = sc.nextInt();
                    sc.nextLine();
                    Room room = biblioteca.obtainRoom(numero);
                    System.out.println(room.getId());
                    System.out.println(room.getType());
                    System.out.println(room.getFloor());
                    System.out.println(room.isBooked());
                    break;
                case 4:
                    System.out.println("Ingresa el ID de la sala a reservar");
                    int id = sc.nextInt();
                    sc.nextLine();
                    Room sala = biblioteca.obtainRoom(id);
                    boolean resultado = sala.BOOK();
                    System.out.println(resultado);
                    break;
                case 5:
                    System.out.println("Ingresa el ID de la sala reservada a cancelar");
                    int n = sc.nextInt();
                    sc.nextLine();
                    Room s = biblioteca.obtainRoom(n);
                    boolean res = s.CancelBooking();
                    System.out.println(res);
                    break;
                case 6:
                    biblioteca.printAvailableBooks();
                    break;
                case 7:
                    biblioteca.printBorrowedBooks();
                    break;
                case 8: {
                    System.out.println("Ingresa el ISBN del libro");
                    String ISBN = sc.nextLine();
                    Book book = biblioteca.obtainBook(ISBN);
                    if(book != null) {
                        System.out.println(book.getISBN());
                        System.out.println(book.getNombre());
                        System.out.println(book.getFloor());
                        System.out.println(book.isBooked());
                    }else System.out.println("Error");
                    break;}
                case 9:
                    System.out.println("Ingresa el ISBN del libro a prestar");
                    String isbn = sc.nextLine();
                    Book BOOK = biblioteca.obtainBook(isbn);
                    boolean respuesta = BOOK.BOOK();
                    System.out.println(respuesta);
                    break;
                case 10:
                    System.out.println("Ingresa el ISBN del libro a devolver");
                    String Isbn = sc.nextLine();
                    Book b = biblioteca.obtainBook(Isbn);
                    boolean ans = b.CancelBooking();
                    System.out.println(ans);
                    break;
            }
        } while(option != 11);
    }
}
