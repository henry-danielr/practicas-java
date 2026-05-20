import java.io.*;
public class calculadora {
    public static void main(String[] args) throws IOException {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = System.out;
        float numero1, numero2,suma, resta, multiplicacion, division, resultado;
        out.println("Escoja el primer numero: ");
        numero1 = Float.parseFloat(teclado.readLine());
        out.println("Escoja el segundo numero: ");
        numero2 = Float.parseFloat(teclado.readLine());
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;
        out.println("El resultado de la suma es:" + " "+ suma);
        out.println("El resultado de la resta es:" + " "+ resta);
        out.println("El resultado de la multiplicacion es:" + " "+ multiplicacion);
        out.println("El resultado de la division es:" + " "+ division);
    }
}
