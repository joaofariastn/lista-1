import java.util.Scanner;

public class Soma {
   public static void main(String[] args) {
      int num1, num2, soma;
      Scanner input = new Scanner(System.in);
      
      System.out.print("Digite o primeiro número: ");
      num1 = input.nextInt();
      
      System.out.print("Digite o segundo número: ");
      num2 = input.nextInt();
      
      soma = num1 + num2;
      
      System.out.println("A soma de " + num1 + " e " + num2 + " é igual a " + soma + ".");
   }
}
