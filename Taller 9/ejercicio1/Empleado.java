package ejercicio1;

public class Empleado extends Persona {

    private String departamento;

    public Empleado(String nombre, int edad, String departamento) {
        // Invocación obligatoria al constructor del padre para inicializar sus atributos
        super(nombre, edad);
        this.departamento = departamento;
    }

    /*
     * DISCUSIÓN SOBRE SOBRESCRITURA Y USO DE SUPER:
     *
     * ¿Por qué usamos super.mostrarDetalles() aquí?
     * 1. Reutilización de código: Evitamos duplicar la lógica de impresión de 'nombre' y 'edad'
     *    que ya está correctamente resuelta y centralizada en la clase abstracta o padre 'Persona'.
     * 2. Extensibilidad: Cumplimos con la sobrescritura (@Override) al mantener el mismo comportamiento
     *    base del método original, pero añadiendo la información específica de la subclase ('departamento').
     */
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llama al método de la clase Persona
        System.out.println("Departamento: " + departamento);
    }
}
