public class Book implements Reservable{
    private String ISBN;
    private String nombre;
    private String autor;
    private Floor floor;
    private boolean isReserved;

    public Book(String ISBN, String nombre, String autor, Floor floor, boolean isReserved) {
        this.ISBN = ISBN;
        this.nombre = nombre;
        this.autor = autor;
        this.floor = floor;
        this.isReserved = isReserved;
    }

    @Override
    public boolean BOOK(){
        if(!isReserved){
            isReserved = true;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean CancelBooking(){
        if(isReserved){
            isReserved = false;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean isBooked(){
        return isReserved;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }
}