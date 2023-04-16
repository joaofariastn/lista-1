import java.util.Scanner;

public class ParOUimpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " é um número par.");
        } else {
            System.out.println(num + " é um número ímpar.");
        }

        sc.close();
    }
}
