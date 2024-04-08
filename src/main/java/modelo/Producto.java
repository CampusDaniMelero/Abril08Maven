package modelo;

import lombok.*;

//@NoArgsConstructor
//@AllArgsConstructor
//@Data //Getters Setters hascome , detodo vamos
//@Getter
//@Setter
//@ToString
public class Producto {

    @Getter @Setter private int idProducto;
    @Getter @Setter private String nombre;
    @Getter @Setter private double precio;
    @Getter @Setter private String proveedor;
    @Getter @Setter private String descripcion;
    public Producto() {
    }

    public Producto(int idProducto, String nombre) {
        this.idProducto = idProducto;
        this.nombre = nombre;
    }

    public Producto(int idProducto, String nombre, double precio, String proveedor, String descripcion) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.proveedor = proveedor;
        this.descripcion = descripcion;
    }
    public void comprobar() throws ProductoException {
        if (idProducto == 0) {
            throw new ProductoException(idProducto);
        }
    }
}
