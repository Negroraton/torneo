public class ValidadorEnteros implements Validador {
    @Override
    public boolean buscarError (String opcion, int valorMaximo) {
        boolean error = false;
        try {
            int eleccion = Integer.parseInt(opcion);
            if (eleccion > 0 && eleccion < valorMaximo + 1) {
                error = false;
            } else {
                System.out.println("ERROR: Debe ingresar un numero entre 1 y " + valorMaximo);
                error = true;
            }
        } catch (NumberFormatException exception) {
            System.out.println("ERROR: Debe ingresar un numero entero.");
            error = true;
        }
        return error;
    }
}