package ejercicio2;

public class Pez extends Animal {
    private String tipoDeAgua;

    public Pez(String especie, String tipoDeAgua) {
        // 1. Uso de super para invocar el constructor de la clase base Animal
        super(especie);
        this.tipoDeAgua = tipoDeAgua;
    }

    /*
     * DISCUSIÓN SOBRE EL USO DE SUPER EN CONSTRUCTORES Y MÉTODOS:
     *
     * ¿Por qué es fundamental el uso de 'super' en este escenario?
     * 1. Inicialización en Cascada: 'super(especie)' garantiza que el estado heredado de la
     *    clase base se configure correctamente antes de que la subclase inicialice sus propios atributos.
     * 2. Delegación de Comportamiento: Al llamar a 'super.mostrarEspecie()', permitimos que la clase
     *    padre se encargue de su propia responsabilidad (imprimir la especie), manteniendo el código limpio.
     */
    public void mostrarDetallesPez() {
        // 2. Uso de super para invocar el método de la clase base Animal
        super.mostrarEspecie();
        System.out.println("Tipo de agua: " + tipoDeAgua);
    }
}
