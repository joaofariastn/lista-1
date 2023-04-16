import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = sc.nextInt();

        System.out.print("Digite o valor de B: ");
        int b = sc.nextInt();

        int c;
        String caminho;

        if (a > b) {
            c = a + b;
            caminho = "A + B";
        } else {
            c = a * b;
            caminho = "A * B";
        }

        System.out.println("O resultado é: " + c);
        System.out.println("O caminho utilizado foi: " + caminho);

        sc.close();
    }
}
