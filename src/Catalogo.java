public class Catalogo {

    private String nombreUsuario;
    private Juego[] juegosGuardados;
    private int contadorJuegos;

    // Constru
    public Catalogo(String nombreUsuario, int capacidadMaxima) {
        this.nombreUsuario = nombreUsuario;
        this.juegosGuardados = new Juego[capacidadMaxima];
        this.contadorJuegos = 0;
    }

    // AGREGACIÓN
    // ciclo independiente
    public void agregarJuego(Juego nuevoJuego) {
        if (contadorJuegos < juegosGuardados.length) {
            this.juegosGuardados[contadorJuegos] = nuevoJuego;
            System.out.println("--> Exito: Juego '" + nuevoJuego.getTitulo() + "' agregado al catálogo de " + nombreUsuario);
            contadorJuegos++;
        } else {
            System.out.println("--> Error: El catálogo está lleno.");
        }
    }
}