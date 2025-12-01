import java.util.Scanner;

public class CalculadoraDescuentos {


    public static void calcular(){
        Scanner scanner = new Scanner(System.in);
        double precioProducto;


        System.out.println("ingrese el precio del producto: ");
        precioProducto = scanner.nextDouble();
        for (double descuento = 0.10; descuento <= 0.50; descuento += 0.10){
            double valorDescuento = precioProducto * descuento;
            double total = precioProducto - valorDescuento;

            System.out.println((descuento *100) + "% de descuento " + "Precio Total: $" + total);


        }

    }
}
