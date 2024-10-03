public class Main {

    public static void main(String[] args) {
        String direccion = "Av. Libertador, 1234, Ciudad de México, C.P. 06000";

        // 1. Validación de longitud
        if (direccion.length() < 10 || direccion.length() > 100) {
            System.out.println("La dirección no es válida por su longitud.");
            return;
        }

        // 2. Extracción de caracteres relevantes
        char primerCaracter = direccion.charAt(0);
        char ultimoCaracter = direccion.charAt(direccion.length() - 1);
        System.out.println("El primer carácter de la dirección es: " + primerCaracter);
        System.out.println("El último carácter de la dirección es: " + ultimoCaracter);

        // 3. Conversión a mayúsculas y minúsculas
        String direccionMayus = direccion.toUpperCase();
        String direccionMinus = direccion.toLowerCase();
        System.out.println("Dirección en mayúsculas: " + direccionMayus);
        System.out.println("Dirección en minúsculas: " + direccionMinus);

        // 4. División en componentes
        String[] componentes = direccion.split(", ");
        String calle = componentes[0];
        String numero = componentes[1];
        String ciudad = componentes[2];
        String codigoPostal = componentes[3].replace("C.P. ", "");

        System.out.println("Calle: " + calle);
        System.out.println("Número: " + numero);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Código Postal: " + codigoPostal);

        // 5. Búsqueda de números
        int posicionNumero = direccion.indexOf(numero);
        System.out.println("La primera aparición de un número está en la posición: " + posicionNumero);

        // 6. Reemplazo de caracteres especiales (como comas o puntos) por espacios
        String direccionCorregida = direccion.replaceAll("[.,]", "");
        System.out.println("Dirección corregida: " + direccionCorregida);

        // 7. Eliminación de espacios innecesarios
        String direccionSinEspaciosExtra = direccion.trim().replaceAll("\\s+", " ");
        System.out.println("Dirección completa sin espacios extra: " + direccionSinEspaciosExtra);

        // 8. Generación de una versión abreviada
        String direccionAbreviada = calle.split(" ")[1] + ", " + numero + ", " + ciudad.split(" ")[2] + ", " + codigoPostal;
        System.out.println("Versión abreviada de la dirección: " + direccionAbreviada);

        // 9. Normalización de la dirección
        // Este paso depende del formato deseado, en este caso la dirección ya está estandarizada.
    }
}
