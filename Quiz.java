import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        // Escribe un programa que sea un pequeño juego trivial de acertar preguntas
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenide a este quiz de preguntas sobre mujeres en la tecnología!");
        int score = 0;

        // Pregunta 1
        System.out.println("1. ¿Quién fue la hacker que escribió en 1994 Hacking the Wetware?");
        System.out.println("a. Ada Lovelace");
        System.out.println("b. Jude Milhon");
        System.out.println("c. Martha Ackelsberg");
        System.out.println("d. Jane Jacobs");
        if (scanner.nextLine().equalsIgnoreCase("b")) {
            score += 5;
            System.out.println("¡Correcto! ¡Has acertado la primera pregunta!");
        } else {
            System.out.println("¡Incorrecto! ¡Has fallado la primera pregunta!");
        }

        // Pregunta 2
        System.out.println("2. ¿Quién es Fuencisla Clemares?");
        System.out.println("a. La directora general de IBM Europa, Oriente Medio y África");
        System.out.println("b. La vicepresidenta de Microsoft Western Europe");
        System.out.println("c. La directora general de Google en España y Portugal");
        System.out.println("d. Fundadora y CEO de Marsi Bionics");
        if (scanner.nextLine().equalsIgnoreCase("c")) {
            score += 5;
            System.out.println("¡Correcto! ¡Has acertado la segunda pregunta!");
        } else {
            System.out.println("¡Incorrecto! ¡Has fallado la segunda pregunta!");
        }

        // Pregunta 3
        System.out.println("3. ¿Quién fue Hedwig Eva Maria Kiesler, conocida como Hedy Lamarr?");
        System.out.println("a. Primera programadora de software");
        System.out.println("b. Una actriz de cine");
        System.out.println("c. Inventora del procesador de datos");
        System.out.println(
                "d. Inventora del sistema de comunicaciones de salto de frecuencia, base del wifi, bluetooth y GPS");
        System.out.println("Ejemplo de respuesta múltiple: ({x} y {z}) o ({z} y {x})");
        String respuesta3 = scanner.nextLine();
        if (respuesta3.equalsIgnoreCase("b y d") || respuesta3.equalsIgnoreCase("d y b")) {
            score += 5;
            System.out.println("¡Correcto! ¡Has acertado la tercera pregunta!");
        } else {
            System.out.println("¡Incorrecto! ¡Has fallado la tercera pregunta!");
        }

        // Pregunta 4
        System.out.println(
                "4. ¿Cómo se llamaban las principales 'mujeres ocultas' de la NASA, encargadas de los cálculos para que la misión del Apolo 11 concluyera con éxito?");
        System.out.println("a. Katherine Johnson, Dorothy Vaughan y Mary Jackson");
        System.out.println("b. Jessica Miller, Emily Johnson, Sarah Davis");
        System.out.println("c. bell hooks, Toni Morrison y Alice Walker");
        System.out.println("d. Emmeline Pankhurst, Millicent Fawcett y Harriet Harman");
        if (scanner.nextLine().equalsIgnoreCase("a")) {
            score += 5;
            System.out.println("¡Correcto! ¡Has acertado la cuarta pregunta!");
        } else {
            System.out.println("¡Incorrecto! ¡Has fallado la cuarta pregunta!");
        }

        // Mostrar el puntaje
        System.out.println("Tu puntaje es: " + score + "/20");

        // Evaluar el puntaje
        if (score >= 15) {
            System.out.println("Tú si que sabes mucho");
        } else if (score >= 5 && score < 15) {
            System.out.println("No lo has hecho mal");
        } else {
            System.out.println("Buena suerte la próxima vez");
        }

        scanner.close();
    }
}