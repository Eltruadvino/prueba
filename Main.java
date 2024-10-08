import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) {
        // Datos de ejemplo
        String nombreCliente = "cliente";
        String ip = "192.168.1.1";
        int numeroCliente = 123;

        String nombreCifrado = cifrarNombre(nombreCliente);
        String ipCifrada = cifrarIP(ip);
        String numeroClienteCifrado = cifrarNumeroCliente(numeroCliente);

        System.out.println("Nombre cifrado: " + nombreCifrado);
        System.out.println("IP cifrada: " + ipCifrada);
        System.out.println("Número de cliente cifrado: " + numeroClienteCifrado);
    }

    // Método para cifrar el nombre del cliente
    public static String cifrarNombre(String nombre) {
        nombre = nombre.replace('a', '1')
                .replace('e', '2')
                .replace('i', '3')
                .replace('o', '4')
                .replace('u', '5');

        if (nombre.length() > 1) {
            // Intercambiar primer y último carácter
            char[] caracteres = nombre.toCharArray();
            char temp = caracteres[0];
            caracteres[0] = caracteres[caracteres.length - 1];
            caracteres[caracteres.length - 1] = temp;
            return new String(caracteres);
        }
        return nombre;
    }

    // Método para cifrar la IP
    public static String cifrarIP(String ip) {
        try {
            InetAddress inet = InetAddress.getByName(ip);
            byte[] bytes = inet.getAddress();
            StringBuilder hexIP = new StringBuilder();
            for (byte b : bytes) {
                hexIP.append(String.format("%02X", b & 0xFF)).append(".");
            }
            // Eliminar el último punto
            return hexIP.substring(0, hexIP.length() - 1);
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Método para cifrar el número de cliente
    public static String cifrarNumeroCliente(int numeroCliente) {
        int resultado = (numeroCliente * 3 + 15) / 2;
        return Integer.toHexString(resultado).toUpperCase();
    }
}
