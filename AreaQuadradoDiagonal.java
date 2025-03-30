import java.util.Scanner;

 public class AreaQuadradoDiagonal{
 	 public static void main (String[] args){

  	 Scanner scan = new Scanner(System.in);

  	 System.out.println("Digite a diagonal do quadrado:");
   	int diagonal = scan.nextInt();

   	int area = (diagonal * diagonal)/2;
  	 System.out.println("A area do quadrado eh :" + area);
         scan.close();
}
}