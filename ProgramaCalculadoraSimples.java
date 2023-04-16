import java.util.Scanner;

public class ProgramaCalculadoraSimples {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Digite o primeiro número: ");
    double num1 = scanner.nextDouble();
    
    System.out.print("Digite o segundo número: ");
    double num2 = scanner.nextDouble();
    
    System.out.print("Digite a operação desejada (+, -, /, *): ");
    String operacao = scanner.next();
    
    double resultado = 0;
    
    switch(operacao) {
      case "+":
        resultado = num1 + num2;
        break;
      case "-":
        resultado = num1 - num2;
        break;
      case "/":
        resultado = num1 / num2;
        break;
      case "*":
        resultado = num1 * num2;
        break;
      default:
        System.out.println("Operação inválida!");
        return;
    }
    
    System.out.println("Resultado: " + resultado);
    
    scanner.close();
  }
}
