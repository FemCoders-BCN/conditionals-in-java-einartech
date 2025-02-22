import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        // Escribe un programa que pida al usuario ingresar un nombre de usuario y una
        // constraseña, si son iguales a los datos dados imprimirá en terminal: Acceso
        // concedido, si no son iguales imprimirá en terminal: Nombre de usuario o
        // contraseña incorrecta.
        // Averigua como hacer para poder ingresar el dato justo al lado de lo que
        // termine la pregunta, es decir, que no haga un salto de línea.

        Scanner scanner = new Scanner(System.in);
        String usuario = "admin";
        String contrasena = "1234";

        System.out.print("Ingresa tu nombre de usuario: ");
        String usuarioIngresado = scanner.nextLine();

        System.out.print("Ingresa tu contraseña: ");
        String contrasenaIngresada = scanner.nextLine();

        if (usuarioIngresado.equals(usuario) && contrasenaIngresada.equals(contrasena)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Nombre de usuario o contraseña incorrecta");
        }

        scanner.close();
    }
}
