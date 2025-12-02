//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.printf("Bienvenido al restaurante Ls");
        CajaRegistradoraComida.registrar();
        CalculadoraDescuentos.calcular();

        System.out.printf("-- TABLA DE MULTIPLICAR -- \n");
        TablaMultiplicarInteractiva.multiplicar();


        System.out.printf("-- CAJERO AUTOMATICO -- \n");
        CajeroAutomatico.operar();






        }
    }
