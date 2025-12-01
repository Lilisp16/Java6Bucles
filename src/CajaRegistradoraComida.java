import java.util.Scanner;

public class CajaRegistradoraComida {

    public static void registrar() {
        Scanner scanner = new Scanner(System.in);

        int hamburguesa = 50;
        int papas = 30;
        int refesco = 20;
        double total = 0;
        int opcion;

        System.out.println("ingrese su articulo a comprar");

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Hamburguesa");
            System.out.println("2. Papas");
            System.out.println("3. Refresco");
            System.out.println("4. salir");
            System.out.println("Elige una opcion");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has pedido una Hamburguesa");
                    total += hamburguesa;
                    break;
                case 2:
                    System.out.println("Has pedido unas Papas");
                    total += papas;
                    break;
                case 3:
                    System.out.println("Has pedido unas refresco");
                    total += refesco;
                    break;
                case 4:
                    System.out.println("Saliendo del Menu");
                    break;
                default:
                    System.out.println("opcione invalida intenta de nuevo");

            }

        }while (opcion != 4) ;

            // aqui mostramos el total y calculamos el cambio
            System.out.println("\n total a pagar" + total);
            if(total > 0){
                System.out.println("ingrese el monto a pagar: $ ");
                double pago = scanner.nextDouble();
                double cambio = pago - total;
                System.out.println("Su cambio: $" + cambio);
            }
        }

    }


