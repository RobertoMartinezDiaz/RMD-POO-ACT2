package ejercicio3;

public class TallerMecanico {

    private String nombreTaller;

    public void registrarReparacion() {
        /*
         * DISCUSIÓN SOBRE EL CONTEXTO DE SUPER (Caso 1):
         *
         * ¿Por qué ocurre este error de compilación?
         * La palabra clave 'super' está estrictamente reservada para referirse a la clase padre.
         * Como 'TallerMecanico' es una clase independiente y no hereda de ninguna otra clase
         * de vehículos, el compilador bloquea su uso porque no hay ninguna jerarquía que resolver.
         */

        // ❌ ERROR DE COMPILACIÓN: 'super' cannot be used here
        // super.toString();
    }
}
