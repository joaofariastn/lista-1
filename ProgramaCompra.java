import java.util.Scanner;

public class ProgramaCompra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor do produto: ");
        double valorProduto = input.nextDouble();

        System.out.println("Escolha a forma de pagamento: ");
        System.out.println("1 - À vista (10% de desconto)");
        System.out.println("2 - Pix (10% de desconto)");
        System.out.println("3 - Débito (10% de desconto)");
        System.out.println("4 - Crédito à vista");
        System.out.println("5 - Crédito parcelado (com juros simples de 10% ao mês)");

        int opcaoPagamento = input.nextInt();

        double valorFinal = 0;

        switch (opcaoPagamento) {
            case 1: // À vista
            case 2: // Pix
            case 3: // Débito
                valorFinal = valorProduto * 0.9;
                break;
            case 4: // Crédito à vista
                valorFinal = valorProduto;
                break;
            case 5: // Crédito parcelado
                System.out.print("Informe a quantidade de parcelas: ");
                int quantidadeParcelas = input.nextInt();
                double taxaJuros = 0.1; // 10% ao mês
                valorFinal = valorProduto * (1 + taxaJuros * quantidadeParcelas);
                break;
            default:
                System.out.println("Opção de pagamento inválida.");
                break;
        }

        System.out.println("Valor final da compra: R$ " + valorFinal);
    }
}
