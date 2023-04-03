import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = leitor.nextInt();
        leitor.close();

        boolean encontrado = false;
        int primeiroNumero = 0, segundoNumero = 1, proximoNumero = 1;

        while (proximoNumero <= numero) {
            if (proximoNumero == numero) {
                encontrado = true;
                break;
            }
            primeiroNumero = segundoNumero;
            segundoNumero = proximoNumero;
            proximoNumero = primeiroNumero + segundoNumero;
        }

        if (encontrado) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }
}