import java.text.DecimalFormat;

public class Main {

    // Método para cifrar el correo electrónico
    public static String cifrarCorreo(String correo) {
        // Separar el nombre de usuario y el dominio
        String[] partesCorreo = correo.split("@");
        String usuario = partesCorreo[0];
        String dominio = partesCorreo[1];

        // Invertir el nombre de usuario
        String usuarioInvertido = new StringBuilder(usuario).reverse().toString();

        // Retornar el correo cifrado
        return usuarioInvertido + "@" + dominio;
    }

    // Método para cifrar la fecha de ascenso (año, mes, día)
    public static int cifrarFechaAscenso(int anio, int mes, int dia) {
        // Sumar los componentes de la fecha
        return anio + mes + dia;
    }

    // Método para cifrar el salario
    public static double cifrarSalario(double salario) {
        // Separar la parte entera y la parte decimal
        int parteEntera = (int) salario;
        double parteDecimal = salario - parteEntera;

        // Calcular la diferencia absoluta
        double diferencia = Math.abs(parteEntera - parteDecimal);

        // Retornar el resultado multiplicado por 2
        return diferencia * 2;
    }

    // Método principal
    public static void main(String[] args) {
        // Ejemplo de datos de entrada
        String correo = "juan.perez@empresa.com";
        int anioAscenso = 2020;
        int mesAscenso = 5;
        int diaAscenso = 15;
        double salario = 55000.75;

        // Cifrado de los datos
        String correoCifrado = cifrarCorreo(correo);
        int fechaCifrada = cifrarFechaAscenso(anioAscenso, mesAscenso, diaAscenso);
        double salarioCifrado = cifrarSalario(salario);

        // Formato del salario para mantener dos decimales
        DecimalFormat formatoDecimal = new DecimalFormat("#.00");

        // Resultado final con delimitador '|'
        String resultadoFinal = correoCifrado + "|" + fechaCifrada + "|" + formatoDecimal.format(salarioCifrado);

        // Imprimir el resultado
        System.out.println("Datos cifrados: " + resultadoFinal);
    }
}
