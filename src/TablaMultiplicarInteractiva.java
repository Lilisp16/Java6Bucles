import java.util.Scanner;
public class TablaMultiplicarInteractiva {


  public static void multiplicar(){

      Scanner scanner = new Scanner(System.in);
      int numero;

      System.out.println("Ingrese un numero del 1 al 10 ");
      numero = scanner.nextInt();

      while(numero < 1 || numero > 10 ){
          System.out.println("Numero invalido");
          System.out.println("Ingrese numero valido");
          numero = scanner.nextInt();
      }

      System.out.println("TABLA DE MULTIPLICAR DEL " + numero);
      int i = 1;
      while(i <= 10){
      System.out.println(numero + " ✖️ " + i + " 🟰 " + (numero * i));
      i++;

  }

    }
}


