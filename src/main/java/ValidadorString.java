public class ValidadorString {

    public boolean buscarError (String opcion, int valorMaximo) {
        boolean error = false;
        if (!opcion.isBlank()){
            error = false;
        } else {
            System.out.println("ERROR: NO SE PUEDE INGRESAR UN NOMBRE VACIO ");

        }
        if (opcion.length() < valorMaximo){
            error = false;
        } else {
            System.out.println("ERROR: el nombre es demasiado largo");
            error = true;
        }
        return error;
    }
}