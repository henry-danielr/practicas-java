import java.io.BufferedReader;
import java.io.InputStreamReader;


public class LaboratorioUno {
    public static void main(String[] args) throws Exception {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Nombre: ");
        String nombre = teclado.readLine();
        System.out.print("Edad: ");
        int edad = Integer.parseInt(teclado.readLine());
        System.out.println(nombre + " tiene " + edad + " años");
    }
}
