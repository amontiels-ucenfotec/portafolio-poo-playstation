public class Juego {


    private String titulo;
    private double pesoGB;
    private Trofeo[] trofeos;
    private int contadorTrofeos;

    // Construct
    public Juego(String titulo, double pesoGB, int cantidadTrofeos) {
        this.titulo = titulo;
        this.pesoGB = pesoGB;
        // COMPOSICIÓN: El arreglo se instancia aquí adentro. Ciclo de vida atado al Juego.
        this.trofeos = new Trofeo[cantidadTrofeos];
        this.contadorTrofeos = 0;
    }

    // SOBRECARGA Constructor valores por defecto
    public Juego(String titulo) {
        this.titulo = titulo;
        this.pesoGB = 10.0; // Peso por defecto
        this.trofeos = new Trofeo[1]; // Espacio para 1 trofeo por defecto
        this.contadorTrofeos = 0;
    }

    // Metod instancia trofeo
    public void crearTrofeo(String nombre, String tipo) {
        if (contadorTrofeos < trofeos.length) {
            this.trofeos[contadorTrofeos] = new Trofeo(nombre, tipo);
            contadorTrofeos++;
        } else {
            System.out.println("No se pueden añadir más trofeos a " + this.titulo);
        }
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public double getPesoGB() {
        return pesoGB;
    }

    // Setters
    public void setTitulo(String nuevoTitulo) {
        this.titulo = nuevoTitulo;
    }

    public void setPesoGB(double nuevoPeso) {
        this.pesoGB = nuevoPeso;
    }

    // equals
    public boolean equals(Juego juegoComparar) {
        return this.titulo.equals(juegoComparar.getTitulo()) &&
                this.pesoGB == juegoComparar.getPesoGB();
    }

    // toString
    public String toString() {
        return "Juego: " + titulo + " | Peso: " + pesoGB + " GB | Trofeos totales: " + contadorTrofeos;
    }
}