import java.io.*;

public class PracticaTres {
    public static void main(String[] args) throws IOException {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = System.out;
        String nombre, apellido, segundo_apellido, nombre_completo;
        out.println("Digite su nombre: ");
        nombre = teclado.readLine();
        out.println("Digite su primer apellido: ");
        apellido = teclado.readLine();
        out.println("Digite su segundo apellido: ");
        segundo_apellido = teclado.readLine();
        nombre_completo = nombre + " " + apellido + " " + segundo_apellido;
        out.println("Su nombre completo es: " + nombre_completo);

    }
}
