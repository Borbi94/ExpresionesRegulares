import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un texto: ");
        String input = scanner.nextLine();

    
        String holaMundoExacto = "\\bHola mundo\\b";
        String holaMundoCaseInsensitive = "(?i)\\bHola mundo\\b";
        String Lenguaje = "\\b(Java|Python|Go|Pascal|Perl)\\b";
        String correoUnison = "^[a-zA-Z0-9._%+-]+@(unison\\.mx|uson\\.mx)$";
        String nombreArchivo = "^ISI\\d{4}-[12]\\.(txt|csv)$";

        boolean matchholaMundoExacto = input.matches(holaMundoExacto);
        boolean matchholaMundoCaseInsensitive = input.matches(holaMundoCaseInsensitive);
        boolean matchLenguaje = input.matches(Lenguaje);
        boolean matchcorreoUnison = input.matches(correoUnison);
        boolean matchnombreArchivo = input.matches(nombreArchivo);

        if (matchholaMundoExacto) {
            System.out.println("La cadena coincide 'Hola mundo'.");
        } else if (matchholaMundoCaseInsensitive) {
            System.out.println("La cadena coincide con la frase 'Hola mundo' en cualquier variante");
        } else if (matchLenguaje) {
            System.out.println("La cadena coincide con uno de los lenguajes de programación (Java, Python, Go, Pascal, Perl).");
        } else if (matchcorreoUnison) {
            System.out.println("La cadena si es un correo válido.");
        } else if (matchnombreArchivo) {
            System.out.println("La cadena es un nombre de archivo válido.");
        } else {
            System.out.println("La cadena NO coincide con ninguna de las expresiones establecidas.");
        }

        scanner.close();
    }
}

