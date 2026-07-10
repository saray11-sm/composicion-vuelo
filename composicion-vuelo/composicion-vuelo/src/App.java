public class App {
   public static void main(String[] args) {
        Vuelo vuelo1 = new Vuelo("AV123", "Bogotá", "Medellín", 5);
        vuelo1.mostrarInfo();
        vuelo1.mostrarAsientos();

        vuelo1.embarcar("A1");
        vuelo1.embarcar("A2");
        vuelo1.embarcar("A3");
        vuelo1.embarcar("A4");
        vuelo1.embarcar("A5");
        vuelo1.embarcar("A6"); 

        vuelo1.mostrarAsientos();

        vuelo1.desembarcar("A3");
        vuelo1.desembarcar("A6"); 

        vuelo1.mostrarAsientos();
    }
}