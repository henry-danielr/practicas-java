import java.io.*;

public class Ciclos {
    public static void main(String[] args) throws IOException {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = System.out;
        int num1;
        out.println("Ingrese un numero a multiplicar: ");
        num1 = Integer.parseInt(teclado.readLine());
        for (int x = 1; x <= 10;) {
            int resultado = x * num1;
            out.println(num1 + "x" + x + " " + "=" + " " + resultado);
            x++;
        }
    }
}