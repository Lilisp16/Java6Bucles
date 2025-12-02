import java.util.Scanner;

public class CalculadoraPromedios {

    public static void simular(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantas calificaciones desea ingresar: ");
        int cantidadNota = scanner.nextInt();

        double sumaNota = 0;

        for (int i = 1; i <= cantidadNota; i++) {
            System.out.print("Ingrese la nota N° " + i + " = ");
            double nota = scanner.nextDouble();
            sumaNota += nota;
        }
            double promedioTotal = sumaNota/cantidadNota;
            System.out.println("Promedio de notas: " + promedioTotal);


            if (promedioTotal < 6){
                System.out.println("Promedio " + promedioTotal + " Reprobado 🚫");

            } else if(promedioTotal >= 6 && promedioTotal <= 7.9){
                    System.out.println("Promedio "+ promedioTotal + " Aprobado ✅");

                } else {
                    System.out.println("Promedio " + promedioTotal + " Excelente 💙🎉");

                }
            }

        }



