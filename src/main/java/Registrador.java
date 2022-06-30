import java.util.Scanner;

public class Registrador {
    public Luchador registrar() {
        boolean error = false;
        Scanner scanner = new Scanner(System.in);
        ValidadorEnteros val = new ValidadorEnteros();
        Luchador nuevoLuchador = null;
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        do {
            preguntarTipo();
            String tipo = scanner.nextLine();
            error = val.buscarError(tipo, 3);
            if (!error) {
                if (tipo.equals("1")) {
                    nuevoLuchador = new Boxeador(nombre);
                }
                if (tipo.equals("2")) {
                    nuevoLuchador = new Yodoka(nombre);
                }
                if (tipo.equals("3")) {
                    nuevoLuchador = new Tirador(nombre);
                }

            }
        } while (error);
        nuevoLuchador.setFuerza(optenerAtributoNumerico("Fuerza (1..10): ", scanner, val));
        nuevoLuchador.setResistencia(optenerAtributoNumerico("Resistencia (1..10): ", scanner, val));
        nuevoLuchador.setDestreza(optenerAtributoNumerico("Destreza (1..10): ", scanner, val));
        return nuevoLuchador;
    }

    private int optenerAtributoNumerico(String s, Scanner scanner, ValidadorEnteros val) {
        boolean error;
        int numero = 0;
        do {
            System.out.print(s);
            String fuerza = scanner.nextLine();
            error = val.buscarError(fuerza, 10);
            if (!error) {
                numero = Integer.parseInt(fuerza);
            }
        } while (error);
        return numero;

    }

    private void preguntarTipo() {
        System.out.println("Tipo: ");
        System.out.println("1.- Boxeador ");
        System.out.println("2.- Yudoka ");
        System.out.println("3.- Tirador ");
        System.out.println("");
        System.out.print("Opcion: ");
    }
}