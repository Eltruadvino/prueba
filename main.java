import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variables para almacenar los nombres, cantidades, precios, descuentos e impuestos
        String[] nombres = new String[3];
        int[] cantidades = new int[3];
        double[] preciosUnitarios = new double[3];
        double[] descuentos = new double[3];
        double[] impuestos = new double[3];

        // Entrada de usuario
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el nombre del producto " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
            System.out.println("Ingrese la cantidad del producto " + (i + 1) + ": ");
            cantidades[i] = sc.nextInt();
            System.out.println("Ingrese el precio unitario del producto " + (i + 1) + ": ");
            preciosUnitarios[i] = sc.nextDouble();
            System.out.println("Ingrese el porcentaje de descuento para el producto " + (i + 1) + ": ");
            descuentos[i] = sc.nextDouble();
            System.out.println("Ingrese el porcentaje de impuestos aplicables para el producto " + (i + 1) + ": ");
            impuestos[i] = sc.nextDouble();
            sc.nextLine(); // Limpiar el buffer
        }

        double totalAcumulado = 0;

        // Cálculos y salida
        for (int i = 0; i < 3; i++) {
            // Precio total sin descuento
            double precioTotalSinDescuento = cantidades[i] * preciosUnitarios[i];

            // Monto descontado
            double montoDescontado = precioTotalSinDescuento * (descuentos[i] / 100);

            // Precio total con descuento
            double precioConDescuento = precioTotalSinDescuento - montoDescontado;

            // Total de impuestos aplicados
            double totalImpuestos = precioConDescuento * (impuestos[i] / 100);

            // Precio total a pagar
            double precioTotalAPagar = precioConDescuento + totalImpuestos;

            // Sumar al total acumulado
            totalAcumulado += precioTotalAPagar;

            // Mostrar resultados por producto
            System.out.println("Producto: " + nombres[i]);
            System.out.println("Cantidad: " + cantidades[i]);
            System.out.println("Precio total sin descuento: " + precioTotalSinDescuento);
            System.out.println("Monto descontado: " + montoDescontado);
            System.out.println("Precio con descuento: " + precioConDescuento);
            System.out.println("Impuestos aplicados: " + totalImpuestos);
            System.out.println("Precio total a pagar: " + precioTotalAPagar);
            System.out.println("---------------------------------");
        }

        // Mostrar el total acumulado a pagar por los tres productos
        System.out.println("Total acumulado a pagar por los tres productos: " + totalAcumulado);

        sc.close();
    }
}
