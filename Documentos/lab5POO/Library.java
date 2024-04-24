import java.util.ArrayList;
import java.util.Objects;

public class Library {
    private ArrayList<Room> rooms;
    private ArrayList<Book> books;

    public Library() {

    }

    public Library(ArrayList<Room> rooms, ArrayList<Book> books) {
        this.rooms = rooms;
        this.books = books;
    }

    public void loadRooms() {
        // Creating rooms of the first floor and saving them in the list
        for(int i = 1; i <= 3; i++) {
            Room newRoom = new Room(i, 10, Floor.FIRST_FLOOR, RoomType.MEETINGS, false);
            rooms.add(newRoom);
        }

        // Creating rooms of the second floor and saving them in the list
        for(int i = 4; i <= 12; i++) {
            Room newRoom = new Room(i, 1, Floor.SECOND_FLOOR, RoomType.INDIVIDUAL_STUDY, true);
            rooms.add(newRoom);
        }

        // Creating rooms of the third floor and saving them in the list
        for(int i = 13; i <= 17; i++) {
            Room newRoom = new Room(i, 10, Floor.THIRD_FLOOR, RoomType.GROUP_STUDY, false);
            rooms.add(newRoom);
        }
    }

    public void loadBooks() {
        Book book1 = new Book("ISBN 0-7645-2641-3", "Asesinato en el Orient Express", "Agatha Christie", Floor.FIRST_FLOOR, false);
        Book book2 = new Book("ISBN 1-2345-6789-0", "El Gran Gatsby", "F. Scott Fitzgerald", Floor.SECOND_FLOOR, true);
        Book book3 = new Book("ISBN 9-8765-4321-0", "1984", "George Orwell", Floor.THIRD_FLOOR, false);
        Book book4 = new Book("ISBN 3-1415-9265-3", "Don Quijote de la Mancha", "Miguel de Cervantes", Floor.FIRST_FLOOR, true);
        Book book5 = new Book("ISBN 2-7182-3845-1", "Orgullo y Prejuicio", "Jane Austen", Floor.SECOND_FLOOR, false);
        Book book6 = new Book("ISBN 5-5555-5555-5", "Cien años de soledad", "Gabriel García Márquez", Floor.THIRD_FLOOR, true);
        Book book7 = new Book("ISBN 7-7777-7777-7", "Matar a un ruiseñor", "Harper Lee", Floor.FIRST_FLOOR, false);
        Book book8 = new Book("ISBN 4-4444-4444-4", "Ulises", "James Joyce", Floor.SECOND_FLOOR, true);
        Book book9 = new Book("ISBN 8-8888-8888-8", "El Hobbit", "J.R.R. Tolkien", Floor.THIRD_FLOOR, false);
        Book book10 = new Book("ISBN 6-6666-6666-6", "Harry Potter y la piedra filosofal", "J.K. Rowling", Floor.FIRST_FLOOR, true);

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);
        books.add(book9);
        books.add(book10);
    }

    public void printReservedRooms() {
        for (Room room: rooms) {
            if(room.isBooked()) {
                System.out.println("Sala " + room.getId());
                System.out.println("Reservada: " + (room.isBooked() ? "Sí" : "No"));
            } else continue;
        }
    }

    public void printBorrowedBooks() {
        for (Book book: books){
            if(book.isBooked()) {
                System.out.println("Libro " + book.getISBN());
                System.out.println("Reservado: " + (book.isBooked() ? "Sí" : "No"));
                System.out.println(book.getNombre());
            } else continue;
        }
    }

    public void printAvailableRooms() {
        for (Room room: rooms) {
            if(!room.isBooked()) {
                System.out.println("Sala " + room.getId());
                System.out.println("Reservada: " + (room.isBooked() ? "Sí" : "No"));
            } else continue;
        }
    }

    public void printAvailableBooks() {
        for (Book book: books){
            if(!book.isBooked()) {
                System.out.println("Libro " + book.getISBN());
                System.out.println("Reservado: " + (book.isBooked() ? "Sí" : "No"));
            } else continue;
        }
    }

    public Room obtainRoom(int id) {
        for (Room room: rooms) {
            if(room.getId() == id) {
                return room;
            }
        }
        return null;
    }

    public Book obtainBook(String ISBN) {
        for (Book book: books){
            if(Objects.equals(book.getISBN(), ISBN)){
                return book;
            }
        }
        return null;
    }

}