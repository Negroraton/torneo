public class Yodoka extends Luchador{
    public Yodoka(String nombre) {
        super();
        setNombre(nombre);
    }

    @Override
    public int getTipo() {
        return 2;
    }

    @Override
    public int pelear() {
        return (2*getResistencia())+ getDestreza();

    }
}
