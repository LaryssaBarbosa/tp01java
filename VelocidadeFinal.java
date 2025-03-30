import java.util.Scanner;

public class VelocidadeFinal {
    public static void main(String[] args) {
  
        Scanner scan = new Scanner(System.in);

       
        System.out.print("Digite a velocidade inicial (em m/s): ");
        double velocidadeInicial = scan.nextDouble();


        System.out.print("Digite a aceleração (em m/s²): ");
        double aceleracao = scan.nextDouble();


        System.out.print("Digite o tempo de percurso (em segundos): ");
        double tempo = scan.nextDouble();

   
        double velocidadeFinalEmMS = velocidadeInicial + aceleracao * tempo;


        double velocidadeFinalEmKMH = velocidadeFinalEmMS * 3.6;     // Converter a velocidade final para km (multiplicando por 3.6)

   
        System.out.println("A velocidade final do automóvel é: " + velocidadeFinalEmKMH + " km/h");

 
        scan.close();
    }
}
