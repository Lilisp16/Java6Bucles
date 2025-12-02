import java.util.Scanner;

public class CajeroAutomatico {

    public static void operar() {
        Scanner scanner = new Scanner(System.in);

        int saldo = 0;
        int opcion;


        do {
            System.out.println("Ingresa una opcion del menu");

            System.out.println("\n -- MENU -- ");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Retirar Saldo");
            System.out.println("3. Depositar Saldo");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo Actual $" + saldo);
                    break;
                case 2:
                    System.out.println("Ingrese el monto a retirar");
                    int montoRetiro = scanner.nextInt();
                    if(montoRetiro <= saldo){
                        saldo -= montoRetiro;
                        System.out.println("Retiro exitoso!. Saldo Actual $" + saldo);
                    }else{
                        System.out.println("Saldo insuficiente");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el monto a depositar");
                    int montoDeposito = scanner.nextInt();
                    saldo += montoDeposito;
                    System.out.println("Operacion exitosa!. Saldo Actual $" + saldo);


                    break;
                case 4:
                    System.out.println("Hasta pronto!");
                    break;

                default:
                    System.out.println("opcion invalida, intente de nuevo");


            }


        }
        while (opcion != 4);



    }
}
