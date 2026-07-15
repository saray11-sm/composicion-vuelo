public class App {

    public static void main(String[] args) {

       
        Vuelo vuelo1 = new Vuelo("AV123", "Bogotá", "Medellín", 5);

        vuelo1.mostrarInfo();
        vuelo1.embarcar("A1");
        vuelo1.embarcar("A2");
        vuelo1.embarcar("A3");
        vuelo1.embarcar("A1");
        vuelo1.embarcar("A3");

        vuelo1.mostrarAsientos();
        vuelo1.desembarcar("A2");
        vuelo1.mostrarAsientos();

        System.out.println();

       
        Vuelo vuelo2 = new Vuelo("LA456", "Cali", "Cartagena", 5);

        vuelo2.mostrarInfo();
        vuelo2.embarcar("A1");
        vuelo2.embarcar("A2");
        vuelo2.embarcar("A3");
        vuelo2.embarcar("A1");

        vuelo2.mostrarAsientos();
        vuelo2.desembarcar("A2");
        vuelo2.mostrarAsientos();

        System.out.println();

       
        Vuelo vuelo3 = new Vuelo("CM789", "Barranquilla", "Pereira", 5);

        vuelo3.mostrarInfo();
        vuelo3.embarcar("A1");
        vuelo3.embarcar("A2");
        vuelo3.embarcar("A3");
        vuelo3.embarcar("A1");
        
        vuelo3.mostrarAsientos();
        vuelo3.desembarcar("A2");
        vuelo3.mostrarAsientos();
    }
}