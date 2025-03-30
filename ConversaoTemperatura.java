import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);

       
        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scan.nextDouble();

        
        double fahrenheit = (celsius * 9 / 5) + 32;

      
        System.out.println(celsius + " graus Celsius equivalem a " + fahrenheit + " graus Fahrenheit.");

     
        scan.close();
    }
}

