import javax.swing.*;

public class ValidadorStrings implements Validador {
    @Override
    public boolean buscarError (String opcion, int valorMaximo) {
        boolean error = false;
        if (!opcion.isBlank()) {
            error = false;
        } else {
            System.out.println("ERROR: No se puede ingresar un nombre vacio");
            error = true;
        }
        if (opcion.length() < valorMaximo) {
            error = false;
        } else {
            System.out.println("ERROR: El nombre es demasiado largo");
            error = true;
        }
        return error;
    }
}