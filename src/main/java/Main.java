import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String opcion;
        Map<String, Luchador> listaLuchadores = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        do {
            opcion = menuPrincipal(scanner);
            if (opcion.equals("1")) {
                agregarLuchador(listaLuchadores);
            }
            if (opcion.equals("2")) {
                borrarLuchador(listaLuchadores, scanner);
            }
            if (opcion.equals("3")) {
                listarLuchadores(listaLuchadores);
            }
        } while (!opcion.equals("4"));
    }

    private static void listarLuchadores(Map<String, Luchador> listaLuchadores) {
        System.out.println("Nombre \t\t Tipo \t\t Fuerza \t\t Resistencia \t\t Destreza");
        for (Luchador luchador : listaLuchadores.values()) {
            System.out.println(luchador.getNombre() + "\t\t" + luchador.getTipo() + "\t\t" + luchador.getFuerza()
                    + "\t\t" + luchador.getResistencia() + "\t\t" + luchador.getDestreza());
        }
    }

    private static void borrarLuchador(Map<String, Luchador> listaLuchadores, Scanner scanner) {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        listaLuchadores.remove(nombre.toUpperCase());
    }

    private static void agregarLuchador(Map<String, Luchador> listaLuchadores) {
        Registrador reg = new Registrador();
        Luchador nuevoLuchador = reg.registrar();
        listaLuchadores.put(nuevoLuchador.getNombre().toUpperCase(), nuevoLuchador);
    }

    private static String menuPrincipal(Scanner scanner) {
        boolean error;
        String opcion;
        do {
            System.out.println("Torneo");
            System.out.println("1.- Agregar luchador");
            System.out.println("2.- Borrar luchador");
            System.out.println("3.- Listar luchadores");
            System.out.println("4.- Salir\n");
            System.out.print("Opcion: ");
            opcion = scanner.nextLine();
            ValidadorEnteros val = new ValidadorEnteros();
            error = val.buscarError(opcion, 4);
        } while (error);
        return opcion;
    }
}