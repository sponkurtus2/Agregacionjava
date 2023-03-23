import utils.LineaPedido;
import utils.Producto;

public class Agregacion {
    public static void main(String[] args) throws Exception {
        Producto Terraria = new Producto(1, "Terraria" , "El mejor juego del mundo", 100);

        LineaPedido a = new LineaPedido(1, 2, Terraria);
        
        
    }
}
