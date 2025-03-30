import java.util.Scanner;

public class VolumeCone {
    public static void main(String[] args) {
  
        Scanner scan = new Scanner(System.in);

        
        System.out.println("Digite a altura:");
        double altura = scan.nextDouble();

    
        System.out.println("Digite o raio da base:");
        double base = scan.nextDouble(); // Aqui você usou 'base', mantendo a mesma nomeação


        double pi = 3.14159;


        double volume = (1.0 / 3.0) * pi * base * base * altura; 
        
        System.out.println("O volume do cone eh: " + volume);

       
        scan.close();
    }
}


