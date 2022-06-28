import java.util.Scanner;

public class Registrador {
    public Luchador registrar () {
        boolean error = false;
        Scanner scanner = new Scanner(System.in);
        ValidadorStrings valStr = new ValidadorStrings();
        ValidadorEnteros valInt = new ValidadorEnteros();
        Luchador nuevoLuchador = new Luchador();
        do {
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            error = valStr.buscarError(nombre, 21);
            nuevoLuchador.setNombre(nombre);
        } while (error);
        do {
            System.out.println("Tipo: ");
            System.out.println("1.- Boxeador ");
            System.out.println("2.- Yudoka ");
            System.out.println("3.- Tirador \n");
            System.out.print("Opcion: ");
            String tipo = scanner.nextLine();
            error = valInt.buscarError(tipo, 3);
            if (!error) {
                nuevoLuchador.setTipo(Integer.parseInt(tipo));
            }
        } while (error);
        setAtributoNumerico(scanner, valInt, nuevoLuchador, "Fuerza");
        setAtributoNumerico(scanner, valInt, nuevoLuchador, "Resistencia");
        setAtributoNumerico(scanner, valInt, nuevoLuchador, "Destreza");

        return nuevoLuchador;
    }

    private void setAtributoNumerico(Scanner scanner, ValidadorEnteros valInt, Luchador nuevoLuchador, String atributo) {
        boolean error;
        do {
            System.out.print(atributo + " (1..10): ");
            String fuerza = scanner.nextLine();
            error = valInt.buscarError(fuerza, 10);
            if (!error) {
                nuevoLuchador.setAtributoNumerico(atributo, Integer.parseInt(fuerza));
            }
        } while (error);
    }
}