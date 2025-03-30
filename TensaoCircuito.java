import java.util.Scanner;

public class TensaoCircuito {
    public static void main(String[] args) {
     
        Scanner scan = new Scanner(System.in);
        
      
        System.out.println("Digite o valor da resistencia (em ohms): ");
        double resistencia = scan.nextDouble();
      
        System.out.print("Digite o valor da corrente eletrica (em amperes): ");
        double corrente = scan.nextDouble();
        
   
        double tensao = corrente * resistencia;
        
 
        System.out.println("A tensao no circuito eh: " + tensao + " volts.");
 
        scan.close();
    }
}
