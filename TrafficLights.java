public class TrafficLights {
    public static void main(String[] args) {

        // Escribe un programa que basado en el color del semáforo verde, amarillo o
        // rojo determine las acciones de un conductor

        String trafficLightColor = "black";

        // Si es verde imprime en la terminal: Puedes seguir
        if (trafficLightColor.equals("green")) {
            System.out.println("Puedes seguir");

            // Si es amarillo imprime en la terminal: Ten cuidado
        } else if (trafficLightColor.equals("yellow")) {
            System.out.println("Ten cuidado");

            // Si es rojo imprime en la terminal: ¡¡¡Para!!!
        } else if (trafficLightColor.equals("red")) {
            System.out.println("¡¡¡Para!!!");
            // Si es otro color imprime en la terminal: El semáforo está dañado
        } else {
            System.out.println("El semáforo está dañado");
        }
        // Cambia el valor de la variable, corre el programa y mira el resultado

    }

}
