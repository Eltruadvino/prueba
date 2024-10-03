public class Main {

    public static void main(String[] args) {
        String nombreCompleto = "García, Juan Carlos";

        // 1. Obtener la longitud del nombre completo
        System.out.println("Longitud del nombre completo: " + nombreCompleto.length());

        // 2. Extraer el apellido (la subcadena antes de la coma)
        String apellido = nombreCompleto.substring(0, nombreCompleto.indexOf(","));
        System.out.println("Apellido: " + apellido);

        // 3. Extraer el nombre completo sin el apellido (subcadena después de la coma)
        String nombre = nombreCompleto.substring(nombreCompleto.indexOf(",") + 2);
        System.out.println("Nombre completo sin el apellido: " + nombre);

        // 4. Mostrar el primer nombre (primera palabra del nombre completo)
        String primerNombre = nombre.split(" ")[0];
        System.out.println("Primer nombre: " + primerNombre);

        // 5. Convertir el apellido a mayúsculas
        String apellidoMayusculas = apellido.toUpperCase();
        System.out.println("Apellido en mayúsculas: " + apellidoMayusculas);

        // 6. Convertir el nombre completo a minúsculas
        String nombreCompletoMinusculas = nombreCompleto.toLowerCase();
        System.out.println("Nombre completo en minúsculas: " + nombreCompletoMinusculas);

        // 7. Mostrar el carácter en la posición 5 del nombre completo
        System.out.println("Carácter en la posición 5: " + nombreCompleto.charAt(4));

        // 8. Mostrar la posición de la primera ocurrencia de la letra 'a' en el nombre completo
        int primeraOcurrenciaA = nombreCompleto.indexOf('a');
        System.out.println("Primera ocurrencia de 'a': " + primeraOcurrenciaA);

        // 9. Mostrar la última ocurrencia de la letra 'a' en el nombre completo
        int ultimaOcurrenciaA = nombreCompleto.lastIndexOf('a');
        System.out.println("Última ocurrencia de 'a': " + ultimaOcurrenciaA);
    }
}
