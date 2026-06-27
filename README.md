# Catálogo de PlayStation - Proyecto POO

## Descripción
Este proyecto es una implementación en Java orientada a objetos que simula el ecosistema de un catálogo de juegos de PlayStation. Fue desarrollado como parte del primer avance del portafolio de evidencias para el curso de Programación Orientada a Objetos. 

El sistema demuestra la aplicación práctica de los principios fundamentales de la POO, modelando entidades del mundo real y sus interacciones.

## Conceptos de POO Implementados
* **Abstracción:** Modelado de las entidades esenciales del sistema (`Trofeo`, `Juego`, `Catalogo`, `Consola`).
* **Encapsulamiento:** Protección de los atributos de las clases mediante modificadores de acceso `private` y exposición controlada a través de métodos `public` (Getters y Setters).
* **Composición:** Relación fuerte entre `Juego` y `Trofeo`, donde los trofeos se instancian internamente y su ciclo de vida depende estrictamente del juego.
* **Agregación:** Relación entre `Catalogo` y `Juego`, donde el catálogo agrupa juegos que existen independientemente.
* **Dependencia:** Relación donde la clase `Consola` requiere temporalmente de la clase `Juego` para ejecutar su método principal.
* **Sobrecarga de Métodos:** Múltiples constructores en la clase `Juego`.

## Estructura del Proyecto
* `Main.java`: Clase principal para la ejecución y prueba del sistema.
* `Trofeo.java`: Clase base encapsulada.
* `Juego.java`: Clase compuesta que maneja trofeos internamente.
* `Catalogo.java`: Clase que agrupa juegos en una colección.
* `Consola.java`: Clase que demuestra la dependencia al ejecutar un juego.

## Cómo Ejecutar
1. Clonar este repositorio.
2. Abrir el proyecto en un IDE compatible con Java (como IntelliJ IDEA).
3. Compilar y ejecutar la clase `Main.java` para visualizar las pruebas de las relaciones en la terminal.
