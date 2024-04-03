public class ISBNGenerator {
    private static int counter = 0;
    public static int NewISBN(){
        counter++;
        return counter;
    }
}
