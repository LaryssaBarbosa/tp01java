import java.util.Scanner;

public class ReaisDolares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de dinheiro (em dolar):");
        double dolar = scan.nextDouble();

        
        double conversao = dolar * 5.76;


        System.out.println("O valor em dolar: " + dolar + " convertido em real eh : R$ " + conversao);

        scan.close();
    }      
}

