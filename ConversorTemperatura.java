import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bem-vindo ao programa de conversão de temperaturas!");
        System.out.print("Qual a temperatura de origem? (Celsius, Fahrenheit ou Kelvin) ");
        String origem = input.nextLine();
        System.out.print("Para qual temperatura deseja converter? (Celsius, Fahrenheit ou Kelvin) ");
        String destino = input.nextLine();
        System.out.print("Digite a temperatura a ser convertida: ");
        double temp_origem = input.nextDouble();

      
        if (origem.equalsIgnoreCase("Celsius") && destino.equalsIgnoreCase("Fahrenheit")) {
            double temp_destino = (temp_origem * 9/5) + 32;
            System.out.printf("%.2f graus Celsius equivalem a %.2f graus Fahrenheit.", temp_origem, temp_destino);
        }
       
        else if (origem.equalsIgnoreCase("Fahrenheit") && destino.equalsIgnoreCase("Celsius")) {
            double temp_destino = (temp_origem - 32) * 5/9;
            System.out.printf("%.2f graus Fahrenheit equivalem a %.2f graus Celsius.", temp_origem, temp_destino);
        }
        
        else if (origem.equalsIgnoreCase("Celsius") && destino.equalsIgnoreCase("Kelvin")) {
            double temp_destino = temp_origem + 273;
            System.out.printf("%.2f graus Celsius equivalem a %.2f graus Kelvin.", temp_origem, temp_destino);
        }
        
        else if (origem.equalsIgnoreCase("Kelvin") && destino.equalsIgnoreCase("Celsius")) {
            double temp_destino = temp_origem - 273;
            System.out.printf("%.2f graus Kelvin equivalem a %.2f graus Celsius.", temp_origem, temp_destino);
        }
        
        else if (origem.equalsIgnoreCase("Fahrenheit") && destino.equalsIgnoreCase("Kelvin")) {
            double temp_celsius = (temp_origem - 32) * 5/9;
            double temp_destino = temp_celsius + 273;
            System.out.printf("%.2f graus Fahrenheit equivalem a %.2f graus Kelvin.", temp_origem, temp_destino);
        }
        
        else if (origem.equalsIgnoreCase("Kelvin") && destino.equalsIgnoreCase("Fahrenheit")) {
            double temp_celsius = temp_origem - 273;
            double temp_destino = (temp_celsius * 9/5) + 32;
            System.out.printf("%.2f graus Kelvin equivalem a %.2f graus Fahrenheit.", temp_origem, temp_destino);
        }
        
        else {
            System.out.println("Temperatura de origem ou de destino inválida. Tente novamente.");
        }
    }
}
