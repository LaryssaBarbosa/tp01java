import java.util.Scanner;

public class ConversaoMilhasMaritimas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Digite a quantidade de milhas maritimas:");
        double milhasMaritimas = scan.nextDouble();
        
       
        double metrosPorMilhaMaritima = 1852;
        
    
        double quilometros = (milhasMaritimas * metrosPorMilhaMaritima) / 1000;

        System.out.println(milhasMaritimas + " milhas maritimas equivalem a " + quilometros + " quilometros.");


        scan.close();
    }
}

