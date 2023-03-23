package utils;

import java.util.ArrayList;
import java.util.List;

public class Orden {
    private int identificador;
    private List<LineaPedido> itemPedido;


    public Orden(int identificador) {
        this.identificador = identificador;
        this.itemPedido = new ArrayList<>();
    }


    public Orden() {
        this(1);
    }

    public void addItem(int identificador, int cantidad, Producto producto) {
        if (producto != null) {
            itemPedido.add(new LineaPedido(cantidad, identificador, producto));
        } else {
            throw new IllegalArgumentException("No seas chonte, no agregaste ningun producto >:(");
        }
    }

    public int calcularTotalOrden() {
        int totalOrden = 0;
        for (LineaPedido lineaPedido : itemPedido) {
            totalOrden += lineaPedido.calcularSubtotal();
        }
        return totalOrden;
    }
    
    @Override
    public String toString() {
        return "Orden numero " + identificador + " [ Items pedidos : " + itemPedido + " ] " + " [ Total : " + calcularTotalOrden() + " ] ";
    }


    public int getIdentificador() {
        return identificador;
    }


    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }  

}
