public class Main {
    public static void main(String[] args) {System.out.println("+++-- INICIANDO SISTEMA PLAYSTATION --+++\n");

        // 1 Crear juego usando el construc
        Juego juego1 = new Juego("The Last of Us", 50.5, 2);
        juego1.crearTrofeo("Sobreviviente", "Platino");
        juego1.crearTrofeo("Primeros pasos", "Bronce");

        // 2 Crear un juego usando sobrecarga
        Juego juego2 = new Juego("Crash Bandicoot");
        juego2.crearTrofeo("Giro perfecto", "Plata");

        // 3 Hacer catalogo Agregación
        System.out.println("___ Prueba de Agregación ___");
        Catalogo miCatalogo = new Catalogo("JugadorPro", 5);
        miCatalogo.agregarJuego(juego1);
        miCatalogo.agregarJuego(juego2);

        // 4 hACER consola Dependencia
        System.out.println("\n/// Prueba de Dependencia ///");
        Consola ps5 = new Consola("PlayStation 5");
        ps5.ejecutarJuego(juego1);

        // 5 eQUALs
        System.out.println("\n!!! Prueba de método equal !!!");
        Juego juego3 = new Juego("Crash Bandicoot"); // Tiene el mismo estado que juego2

        if (juego2.equals(juego3)) {
            System.out.println("Validación: juego2 y juego3 son lógicamente iguales.");
        } else {
            System.out.println("Validación: Son distintos.");
        }

        System.out.println("\n=== FIN DE LA EJECUCIÓN ===");
    }
}