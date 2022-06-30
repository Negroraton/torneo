public class Tirador extends Luchador{
    public Tirador(String nombre) {
        super();
        setNombre(nombre);
    }

    @Override
    public int getTipo() {
        return 3;
    }

    @Override
    public int pelear() {
        return (2*getDestreza())+ getFuerza();

    }
}
