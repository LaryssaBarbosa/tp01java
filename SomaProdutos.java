import java.util.Scanner;

public class SomaProdutos {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double totalCompra = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o  valor do produto " + i + ": ");
            double precoProduto = scan.nextDouble();  
            totalCompra += precoProduto;  
        }


        System.out.print("Digite o valor do pagamento: ");
        double pagamento = scan.nextDouble();

   
        if (pagamento < totalCompra) {
            double faltaPagar = totalCompra - pagamento;
            System.out.println("Ainda falta pagar: R$ " + faltaPagar);
        }
     
        else if (pagamento > totalCompra) {
            double troco = pagamento - totalCompra;
            System.out.println("O troco é de: R$ " + troco);
        }

        else {
            System.out.println("Produto pago com sucesso!");
        }
        scan.close();
    }
}

