package ejercicio3;

public class VehiculoBase {
    protected String tipo;

    // Atributo estrictamente privado (Ninguna otra clase puede verlo directamente)
    private String numeroChasis = "CH987654321";

    public VehiculoBase(String tipo) {
        this.tipo = tipo;
    }
}
