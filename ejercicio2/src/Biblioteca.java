import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private ArrayList<Libro> libros;
    public Biblioteca(ArrayList<Libro> libros){
        this.libros = libros;
    }
    public void Agregar(Libro nuevo){
        libros.add(nuevo);
    }
    public void Mostrar(){
        for(int i = 0; i < libros.size(); i++){
            System.out.println(libros.get(i).getNombre());
            System.out.println(libros.get(i).getISBN());
        }
    }
}
