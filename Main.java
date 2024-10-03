public class Main {

    public static void main(String[] args) {
        String cadena = "supercalifragilisticoespialidoso";

        // 1. Mostrar la longitud de la cadena
        System.out.println("Longitud de la cadena: " + cadena.length());

        // 2. Mostrar el carácter en la posición 10
        System.out.println("Carácter en la posición 10: " + cadena.charAt(9));

        // 3. Convertir la cadena a mayúsculas
        String cadenaMayusculas = cadena.toUpperCase();
        System.out.println("Cadena en mayúsculas: " + cadenaMayusculas);

        // 4. Obtener la subcadena desde la posición 5 hasta la 15
        String subcadena1 = cadena.substring(4, 15);
        System.out.println("Subcadena de la posición 5 a la 15: " + subcadena1);

        // 5. Mostrar la primera ocurrencia de la letra 'i'
        int primeraOcurrenciaI = cadena.indexOf('i');
        System.out.println("Primera ocurrencia de 'i': " + primeraOcurrenciaI);

        // 6. Mostrar la última ocurrencia de la letra 'o'
        int ultimaOcurrenciaO = cadena.lastIndexOf('o');
        System.out.println("Última ocurrencia de 'o': " + ultimaOcurrenciaO);

        // 7. Convertir la cadena a minúsculas
        String cadenaMinusculas = cadena.toLowerCase();
        System.out.println("Cadena en minúsculas: " + cadenaMinusculas);

        // 8. Obtener la subcadena desde la posición 7 hasta el final
        String subcadena2 = cadena.substring(6);
        System.out.println("Subcadena desde la posición 7 hasta el final: " + subcadena2);

        // 9. Mostrar la última ocurrencia de la frase "li"
        int ultimaOcurrenciaLi = cadena.lastIndexOf("li");
        System.out.println("Última ocurrencia de 'li': " + ultimaOcurrenciaLi);
    }
}
