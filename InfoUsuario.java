import java.io.*;


public class InfoUsuario {
    public static void main(String [] args) throws IOException{
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        // variable para imprimir
        PrintStream out = System.out;
        // declarar las varianles
        String nombre, cedula, curso, direccion;
        int edad;
        // solicitud de datos
        out.println("Ingrese su nombre: ");
        nombre = teclado.readLine();
        out.println("Ingrese su cedula: ");
        cedula = teclado.readLine();
        out.println("Ingrese su curso: ");
        curso = teclado.readLine();
        out.println("Ingrese su direccion: ");
        direccion = teclado.readLine();
        out.println("Ingrese su edad: ");
        edad = Integer.parseInt(teclado.readLine()); // parseInt convierte string a entero
        // imprimir datos
        out.println("Informacion del usuario: ");
        out.println("Nombre: " + nombre);
        out.println("Cedula: " + cedula);
        out.println("Curso: " + curso);
        out.println("Direccion: " + direccion);
        out.println("Edad: " + edad);
    }
}
