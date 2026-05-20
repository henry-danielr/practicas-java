import java.io.*;

public class PracticaCuatro {
    public static void main(String[] args) throws IOException {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = System.out;
        int precio_limonada = 100;
        int costo_limonada = 20;
        int cantidad_limonadas;
        out.println("Digite la cantidad de limonadas vendidas: ");
        cantidad_limonadas = Integer.parseInt(teclado.readLine());
        int ganancia = cantidad_limonadas * precio_limonada - cantidad_limonadas * costo_limonada;
        out.println("La ganancia de las limonadas vendidas es: " + ganancia);
    }
}
