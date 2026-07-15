public class Asiento {

    private String codigo;
    private Boolean ocupado;

    public Asiento(String codigo) {
        this.codigo = codigo;
        this.ocupado = false;
    }

    public String getCodigo() {
        return codigo;
    }

    public Boolean isOcupado() {
        return ocupado;
    }

    public void ocupar() {
        if (ocupado) {
            System.out.println("El asiento " + codigo + " ya esta ocupado. No puede ser asignado a otra persona.");
        } else {
            ocupado = true;
            System.out.println("El asiento " + codigo + " ha sido ocupado.");
        }
    }

    public void liberar() {
        if (ocupado) {
            ocupado = false;
            System.out.println("El asiento " + codigo + " ha sido liberado.");
        } else {
            System.out.println("El asiento " + codigo + " ya está libre.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Asiento " + codigo + ": " + (ocupado ? "Ocupado" : "Libre"));
    }
}