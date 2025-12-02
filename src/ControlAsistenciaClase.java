import java.util.Scanner;

class ControlAsistenciaClase {

    public static void controlador() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el total de estudiantes: ");
        int totalEstudiantes = scanner.nextInt();
        scanner.nextLine();

        String [] presente = new String[totalEstudiantes];
        String [] ausente = new String[totalEstudiantes];

        int cantidadPresentes = 0;
        int cantidadAusentes = 0;

        for (int i = 1; i <= totalEstudiantes; i++){
            System.out.println("Nombre Estudiante " + i + ": " );
            String nombre = scanner.nextLine();

            System.out.println("El estudiante " + nombre + " está Presente si/no: ");
            String estado = scanner.nextLine();

            if (estado.equalsIgnoreCase("si")){
                presente[cantidadPresentes] = nombre;
                cantidadPresentes++;

            }else{
                ausente[cantidadAusentes] = nombre;
                cantidadAusentes++;
            }
        }
        System.out.println("\n 👩🏽‍🎓 Estudiantes Presentes");
        for (int i = 0; i < cantidadPresentes; i++){
            System.out.println("🙋🏽‍♀️" + presente[i]);
        }

        System.out.println("\n 🧑🏽‍🎓 Estudiantes Ausentes");
        for (int i = 0; i < cantidadAusentes; i++){
            System.out.println("🙅🏽" + ausente[i]);
        }


    }
}
