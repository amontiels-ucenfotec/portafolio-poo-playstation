public class Consola {

    private String modelo;

    // cONSTRU
    public Consola(String modelo) {
        this.modelo = modelo;
    }

    // DEPENDENCIA
    public void ejecutarJuego(Juego juegoAEjecutar) {
        System.out.println("\n[SISTEMA] Iniciando consola " + this.modelo + "...");
        System.out.println("[SISTEMA] Ejecutando: " + juegoAEjecutar.toString());
    }
}