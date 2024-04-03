import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Libro miLibro = new Libro(78, "Librito", "Thomas", 209);
        ArrayList<Libro> lista = new ArrayList<>();
        Biblioteca biblio = new Biblioteca(lista);
        biblio.Agregar(miLibro);
        biblio.Mostrar();
    }
}