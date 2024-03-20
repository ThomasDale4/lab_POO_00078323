//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la calculadora");
        Scanner sc = new Scanner(System.in);
        System.out.printf("1. Sumar %n2. Restar %n3. Multiplicar %n4. Dividir %n5. Salir %n");
        int opcion = sc.nextInt();
        int a;
        int b;
        while (opcion !=5)
        switch (opcion){
            case 1:
                System.out.println("Introduce el primer numero");
                a = sc.nextInt();
                System.out.println("Introduce el segundo numero");
                b = sc.nextInt();
                System.out.println(sumar(a, b));
                break;
            case 2:
                System.out.println("Introduce el primer numero");
                a = sc.nextInt();
                System.out.println("Introduce el segundo numero");
                b = sc.nextInt();
                System.out.println(restar(a, b));
                break;
            case 3:
                System.out.println("Introduce el primer numero");
                a = sc.nextInt();
                System.out.println("Introduce el segundo numero");
                b = sc.nextInt();
                System.out.println(multiplicar(a, b));
                break;
            case 4:
                System.out.println("Introduce el primer numero");
                a = sc.nextInt();
                System.out.println("Introduce el segundo numero");
                b = sc.nextInt();
                System.out.println(dividir(a, b));
                break;
            case 5:
            	break;
            default:
            	System.out.println("La opcion no existe");
            	break;
        }
    }
    public static int sumar(int a, int b){
        return a + b;
    }
    public static int restar(int a, int b){
        return a - b;
    }
    public static int multiplicar(int a, int b){
        return a * b;
    }
    public static int dividir(int a, int b){
    	if (b != 0){
        	return a / b;
        } else {
        	System.out.println("No se puede dividir entre 0");
        }
    }
}
