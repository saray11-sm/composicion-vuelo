public class Vuelo {

    private String numero;
    private String origen;
    private String destino;
    private int capacidadmax;
    private Asiento[] asientos;

    public Vuelo(String numero, String origen, String destino, int capacidadmax) {
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
        this.capacidadmax = capacidadmax;

        asientos = new Asiento[capacidadmax];
        for (int i = 0; i < capacidadmax; i++) {
            asientos[i] = new Asiento("A" + (i + 1));
        }
    }

    public String getNumero() {
        return numero;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public void mostrarInfo() {
        System.out.println("Vuelo: " + numero);
        System.out.println("Ruta: " + origen + " - " + destino);
        System.out.println("Capacidad: " + capacidadmax);
    }

    public void mostrarAsientos() {
        System.out.println("Asientos del vuelo " + numero + ":");
        for (Asiento a : asientos) {
            a.mostrarEstado();
        }
    }

    public void embarcar(String codigoAsiento) {
        for (Asiento a : asientos) {
            if (a.getCodigo().equals(codigoAsiento)) {
                a.ocupar();
                return;
            }
        }
        System.out.println("El asiento " + codigoAsiento + " no existe.");
    }

    public void desembarcar(String codigoAsiento) {
        for (Asiento a : asientos) {
            if (a.getCodigo().equals(codigoAsiento)) {
                a.liberar();
                return;
            }
        }
        System.out.println("El asiento " + codigoAsiento + " no existe.");
    }
}