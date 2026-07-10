public class Asiento{

    private String codigo;
    private Boolean ocupado;

    public Asiento(String codigo){
        this.ocupado = false;
        this.codigo = codigo;
    }
    
    public String getCodigo(){
        return codigo;
    }

    public Boolean isOcupado(){
        return ocupado;
    }
    public void ocupar(){
        if(ocupado){
            System.out.println("El asiento"+ codigo + "esta ocupado"); 
        }else{
            this.ocupado = true;
            System.out.println("el asiento"+ codigo + "ha sido ocupado");
        }
    }
    public void liberar(){
        if(ocupado){
            this.ocupado = false;
            System.out.println("el asiento"+ codigo +"esta liberado");
        }else{
            System.out.println("El asiento"+ codigo + "ya esta libre");
        }
        
    }    
    public void mostrarEstado(){
        System.out.println("Asiento"+ codigo +":"+(ocupado ?"ocupado":"libre"));
    } 


}