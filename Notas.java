import java.io.*;
public class Notas {
    public static void main(String[] args) throws IOException {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = System.out;
        float nota;
        out.println("Ingrese la nota: ");
        nota = Float.parseFloat(teclado.readLine());
        if (nota >= 90) {
            out.println("Excelente");
        } else if (nota  >= 80) {
            out.println("Muy bueno");
        } else if (nota >= 70) {
            out.println("Aprobado");
        } else {
            out.println("Reprobado");
        }
    }
}
