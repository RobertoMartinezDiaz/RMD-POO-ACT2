package ejercicio1;

public class Prueba {
    public static void main(String[] args) {
        Empleado emp = new Empleado("Luis Mendoza", 34, "Recursos Humanos");

        // Ejecuta el método sobrescrito que utiliza 'super' internamente
        emp.mostrarDetalles();
    }
}
