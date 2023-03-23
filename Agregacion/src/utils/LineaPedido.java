package utils;

public class LineaPedido {
    private int identificador;
    private int cantidad;
    private Producto producto; //Necesario porque es agregacion.


    public LineaPedido() { //CONSTRUCTOR DEFAULT
        this(0, 0, null);
    }

    public LineaPedido(int identificador, int cantidad, Producto producto) { //CONSTRUCTOR PARAMETRIZADO
        this.identificador = identificador;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    public int getIdentificador() {
        return identificador;
    }

    private void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getCantidad() {
        return cantidad;
    }

    private void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    private void setProducto(Producto producto) {
        this.producto = producto;
    }


    public int calcularSubtotal() {

        if (producto != null) return producto.getPrecio() * cantidad;
        else return 0;

    }

    @Override
    public String toString() {
        return "Linea de pedido numero " + identificador + " [ Cantidad : " + cantidad +  " ] " + " [ Producto : " + producto + " ]" 
        + " [ Total : " + calcularSubtotal();
    }    

    
}