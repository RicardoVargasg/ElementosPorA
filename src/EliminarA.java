import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class EliminarA {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> palabras = new HashSet<>();

        System.out.println("Introduce palabras (0 para finalizar)");
        while (true) {
            String entrada = scanner.nextLine();
            if (entrada.equals("0")){
                break;
            }
            palabras.add(entrada);
        }

        System.out.println("\nSet original: " + palabras);

        Iterator<String> it = palabras.iterator();
        while (it.hasNext()){
            String palabra = it.next();
            if (palabra.startsWith("A")){
                it.remove();
            }
        }

        System.out.println("Set sin palabras que empiecen por A: " + palabras);
    }
}