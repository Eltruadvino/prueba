public class Main {

    public static void main(String[] args) {
        // Cadena del producto
        String productoInfo = "12345; Laptop HP Pavilion; 1500.99; Electrónica";

        // 1. Obtener la longitud de la cadena
        int longitudCadena = productoInfo.length();
        System.out.println("Longitud de la cadena: " + longitudCadena);

        // 2. Extraer el ID del producto (antes del primer ';')
        String[] partes = productoInfo.split("; ");
        String idProducto = partes[0];
        System.out.println("ID del producto: " + idProducto);

        // 3. Obtener el nombre del producto (entre el primer y segundo ';')
        String nombreProducto = partes[1];
        System.out.println("Nombre del producto: " + nombreProducto);

        // 4. Convertir el nombre del producto a mayúsculas
        String nombreMayusculas = nombreProducto.toUpperCase();
        System.out.println("Nombre del producto en mayúsculas: " + nombreMayusculas);

        // 5. Extraer el precio y convertirlo a un número decimal
        String precioString = partes[2];
        double precio = Double.parseDouble(precioString);
        System.out.println("Precio del producto: " + precio);

        // 6. Mostrar el carácter en la posición 10 del nombre del producto
        if (nombreProducto.length() >= 10) {
            char caracterPos10 = nombreProducto.charAt(9); // Recuerda que los índices comienzan en 0
            System.out.println("Carácter en la posición 10 del nombre del producto: " + caracterPos10);
        } else {
            System.out.println("El nombre del producto es demasiado corto.");
        }

        // 7. Obtener la primera ocurrencia de la letra 'a' en el nombre del producto
        int primeraOcurrenciaA = nombreProducto.indexOf('a');
        if (primeraOcurrenciaA != -1) {
            System.out.println("Primera ocurrencia de la letra 'a' en el nombre del producto: " + primeraOcurrenciaA);
        } else {
            System.out.println("No se encontró la letra 'a' en el nombre del producto.");
        }

        // 8. Mostrar la última ocurrencia de la letra 'o' en el nombre del producto
        int ultimaOcurrenciaO = nombreProducto.lastIndexOf('o');
        if (ultimaOcurrenciaO != -1) {
            System.out.println("Última ocurrencia de la letra 'o' en el nombre del producto: " + ultimaOcurrenciaO);
        } else {
            System.out.println("No se encontró la letra 'o' en el nombre del producto.");
        }

        // 9. Convertir el precio a texto y concatenarlo con la categoría
        String categoriaProducto = partes[3];
        String precioConcatenadoConCategoria = precioString + " - " + categoriaProducto;
        System.out.println("Precio y categoría concatenados: " + precioConcatenadoConCategoria);

        // 10. Mostrar la subcadena desde la posición 7 hasta el final del nombre del producto
        if (nombreProducto.length() >= 7) {
            String subcadenaDesde7 = nombreProducto.substring(6);
            System.out.println("Subcadena desde la posición 7 hasta el final: " + subcadenaDesde7);
        } else {
            System.out.println("El nombre del producto es demasiado corto para extraer una subcadena.");
        }
    }
}
