import java.util.Scanner;
public class Dobrotriplo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = input.nextInt();
        
        if (numero >= 0) {
            int resultado = numero * 2;
            System.out.println("O dobro de " + numero + " é " + resultado);
        } else {
            int resultado = numero * 3;
            System.out.println("O triplo de " + numero + " é " + resultado);
        }
        
        input.close();
    }
}
