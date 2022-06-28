public class Luchador {
    private String nombre;
    private int tipo;
    private int fuerza;
    private int resistencia;
    private int destreza;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getDestreza() {
        return destreza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public void setAtributoNumerico(String atributo, int valor) {
        if (atributo.equalsIgnoreCase("fuerza")) {
            fuerza = valor;
        }
        if (atributo.equalsIgnoreCase("destreza")) {
            destreza = valor;
        }
        if (atributo.equalsIgnoreCase("resistencia")) {
            resistencia = valor;
        }
    }
}
