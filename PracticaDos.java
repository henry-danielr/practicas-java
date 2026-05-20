import java.io.*;

public class PracticaDos {
    public static void main(String[] args) throws IOException {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        PrintStream out = System.out;
        String nombre_producto;
        float precio_bruto;
        float precio_neto;
        float impuesto = 15;
        out.println("Digite el nombre del producto: ");
        nombre_producto = teclado.readLine();
        out.println("Digite el precio bruto del producto: ");
        precio_bruto = Float.parseFloat(teclado.readLine());
        precio_neto = precio_bruto - precio_bruto * impuesto / 100;
        out.println("El precio neto del producto es: " + precio_neto);
    }
}
