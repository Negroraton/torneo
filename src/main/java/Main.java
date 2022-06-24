import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String opcion;
        Map<String, Luchador> listaLuchadores = new HashMap<String, Luchador>();
        boolean error = false;
        Scanner scanner = new Scanner(System.in);
        do {
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
            if (opcion.equals("1")) {
                Registrador reg = new Registrador();
                Luchador nuevoLuchador = reg.registrar();
                listaLuchadores.put(nuevoLuchador.nombre.toUpperCase(), nuevoLuchador);
            }
            if (opcion.equals("2")) {
                System.out.print("Nombre: ");
                String nombre = scanner.nextLine();
                listaLuchadores.remove(nombre.toUpperCase());
            }
            if (opcion.equals("3")) {
                System.out.println("Nombre \t\t Tipo \t\t Fuerza \t\t Resistencia \t\t Destreza");
                for (Luchador luchador : listaLuchadores.values()) {
                    System.out.println(luchador.nombre + "\t\t" + luchador.tipo + "\t\t" + luchador.fuerza
                            + "\t\t" + luchador.resistencia + "\t\t" + luchador.destreza);
                }
            }
        } while (!opcion.equals("4"));
    }
}