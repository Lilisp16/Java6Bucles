//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.printf("BIENVENIDOS AL RESTAURANTE Ls");
        CajaRegistradoraComida.registrar();
        CalculadoraDescuentos.calcular();

        System.out.printf("\n-- TABLA DE MULTIPLICAR -- \n");
        TablaMultiplicarInteractiva.multiplicar();


        System.out.printf("\n-- CAJERO AUTOMATICO -- \n");
        CajeroAutomatico.operar();


        System.out.printf("\n-- GENERADOR DE CONTRASEÑAS -- \n");
        String password = GeneradorContrasenas.generador(8);
        System.out.println("Contraseña creada: " + password);


        System.out.printf("\n-- CONTROL DE ASISTENCIA A CLASES -- \n");
        ControlAsistenciaClase.controlador();

        System.out.println("\n-- CALCULADORA DE PROMEDIOS-- \n");
        CalculadoraPromedios.simular();






        }
    }
