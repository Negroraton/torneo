public class Boxeador extends Luchador{
    public Boxeador(String nombre) {
        super();
        setNombre(nombre);
    }

    @Override
    public int getTipo() {
        return 1;
    }

    @Override
    public int pelear() {
        return (2*getFuerza())+ getResistencia();

    }
}
