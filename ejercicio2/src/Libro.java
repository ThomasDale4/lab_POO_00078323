public class Libro {
    private int ISBN;
    private String nombre;
    private String autor;
    private int paginas;

    public static void add(Libro libro) {
    }

    public int getISBN() {
        return ISBN;
    }
    public String getNombre() {
        return nombre;
    }
    public String getAutor() {
        return autor;
    }
    public int getPaginas() {
        return paginas;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    public Libro(int ISBN, String nombre, String autor, int paginas) {
        this.ISBN = ISBN;
        this.nombre = nombre;
        this.autor = autor;
        this.paginas = paginas;
    }

    public Libro(String nombre, String autor, int paginas) {
        this.ISBN = ISBNGenerator.NewISBN();
        this.nombre = nombre;
        this.autor = autor;
        this.paginas = paginas;
    }
}
