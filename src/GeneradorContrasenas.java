import java.util.Random;

public class GeneradorContrasenas {

    public static String generador(int longitud) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
        String contrasena = "";
        Random random = new Random();


        for (int i = 0; i < longitud; i++){
            int aleatorea = random.nextInt(caracteres.length());
            contrasena = contrasena + caracteres.charAt(aleatorea);

        }
        return contrasena;





    }
}
