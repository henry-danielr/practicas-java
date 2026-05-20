import java.io.*;

public class PracticaCinco {
    public static void main(String[] args)throws IOException {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out = System.out;
        int paginas_por_leer;
        out.println("Digite la cantidad de paginas por leer: ");
        paginas_por_leer = Integer.parseInt(teclado.readLine());
        int dias_restantes;
        out.println("Digite los dias restantes: ");
        dias_restantes = Integer.parseInt(teclado.readLine());
        int paginas_cada_dia = paginas_por_leer/dias_restantes;
        out.println("La cantidad de paginas que debe leer cada dia es: " + paginas_cada_dia);
    }
}
