public class Vuelo {
private String numero, origen , destino ;
private int capacidadmax;
private Asiento[]asientos;

public Vuelo(String numero,String origen,String destino ){
    this.numero = numero;
    this.origen = origen;
    this.destino = destino;
}
public Vuelo(String numero,String origen,String destino,int capacidadmax ){
    this.numero = numero;
    this.origen = origen;
    this.destino = destino;
    this.capacidadmax = capacidadmax;

    asientos = new Asiento[capacidadmax];
        for(int i=0; i<capacidadmax;i++){
            asientos[i] = new Asiento("A"+ (i+1));
        }
    }
    public String getNumero(){
        return numero;
    }
    public String getOrigen(){
        return origen;
    }
    public String getDestino(){
        return destino;
    }
    public void mostrarInfo(){
        System.out.println("vuelo"+ numero );
        System.out.println("ruta "+ origen + "destino " + destino);
        System.out.println("capacidad"+ capacidadmax);
    }
    public void mostrarAsientos(){
        System.out.println("Asientos del vuelo " + numero + ":");
        for(Asiento a : asientos){
            a.mostrarEstado();
        }
    }
    public void embarcar(String codigoAsiento){ 
        for(Asiento a : asientos){ 
            if(a.getCodigo().equals(codigoAsiento)){
                a.ocupar();
                return;
            }
        }
        System.out.println("Asiento " + codigoAsiento + " no encontrado en el vuelo " + numero);
    }
    public void desembarcar(String codigoAsiento){ 
        for(Asiento a : asientos){ 
            if(a.getCodigo().equals(codigoAsiento)){
                a.liberar();
                return;
            }
        }
        System.out.println("Asiento " + codigoAsiento + " no encontrado en el vuelo " + numero);
    }
    
}
 
