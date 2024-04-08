package presentacion;

import modelo.Producto;
import modelo.ProductoException;

import java.util.Scanner;

public class probarProducto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el ID del producto: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.print("Introduce el nombre del producto: ");
        String nombre = scanner.nextLine();

        // Crear un objeto Producto usando el constructor con ID y nombre
        Producto producto = new Producto(id, nombre);

        try {
            producto.comprobar(); // Comprobar si el ID está asignado
            System.out.println("Producto creado: " + producto.toString());
            System.out.println("El producto es  : " + producto.getNombre() + " y el id que le corresponde es : " + producto.getIdProducto());

        } catch (ProductoException e) {
            System.out.println("El producto es  : " + producto.getNombre() + " y el id que le corresponde es : " + producto.getIdProducto());

            System.err.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}
