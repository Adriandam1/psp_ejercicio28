import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el texto a cifrar: ");
        String texto = sc.nextLine();

        System.out.println("Ingrese el valor de desplazamiento: ");
        int desplazamiento = sc.nextInt();

        String cifrado = CifradoCesar.cifrar(texto, desplazamiento);

        System.out.println("Cadena cifrada:\n" + cifrado);

    }
}