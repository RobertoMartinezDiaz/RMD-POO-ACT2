package ejercicio3;

public class MotoDerivada extends VehiculoBase {
    private int cilindrada;

    public MotoDerivada(String tipo, int cilindrada) {
        super(tipo);
        this.cilindrada = cilindrada;
    }

    public void intentarAcceso() {
        /*
         * DISCUSIÓN SOBRE ATRIBUTOS PRIVADOS Y SUPER (Caso 2):
         *
         * ¿Por qué ocurre este error de compilación?
         * El modificador 'private' encapsula el atributo 'numeroChasis' para que sea accesible
         * ÚNICAMENTE dentro de la clase 'VehiculoBase'.
         * Aunque 'MotoDerivada' hereda de 'VehiculoBase', la palabra clave 'super' no puede saltarse
         * las reglas de seguridad de Java. 'super' solo permite acceder a miembros del padre que
         * sean 'public', 'protected' o con acceso de paquete.
         */

        // ❌ ERROR DE COMPILACIÓN: 'numeroChasis' has private access in 'VehiculoBase'
        // System.out.println(super.numeroChasis);
    }
}