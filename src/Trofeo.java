public class Trofeo {

    private String nombre;
    private String tipo;

    // Construc
    public Trofeo(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    // Setters
    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public void setTipo(String nuevoTipo) {
        this.tipo = nuevoTipo;
    }

    // equals
    public boolean equals(Trofeo trofeoComparar) {
        return this.nombre.equals(trofeoComparar.getNombre()) &&
                this.tipo.equals(trofeoComparar.getTipo());
    }
}
