package modelo;

public class ProductoException extends Exception{
    public ProductoException(int idProducto){
        super("El ID " + idProducto + " no esta dentro de los parametros solicitados");
    }
}
