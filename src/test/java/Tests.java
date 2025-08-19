import edu.uca.Electrodomesticos;
import edu.uca.Producto;
import edu.uca.Ropa;
import edu.uca.Tienda;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {

    @Test
    public void productToStringTest(){
        Producto producto = new Ropa(11, "Ropa de prueba", 200);
        System.out.println(producto);
        Producto electro = new Electrodomesticos(21, "electro de prueba", 500, 6);
        System.out.println(electro);
    }

    @Test
    public void tiendaAgregarProductoTest(){
        Tienda tienda = new Tienda();
        Producto producto = new Ropa(11, "ropa de prueba", 200);
        tienda.agregarProducto(producto);
        Assert.assertEquals(tienda.getSize(), 1);

        Producto electro = new Electrodomesticos(21, "electro de prueba", 500, 6);
        tienda.agregarProducto(producto);
        Assert.assertEquals(tienda.getSize(), 1);

    }

    @Test
    public void mostrarInventarioTest(){
        Tienda tienda = new Tienda();
        Producto producto = new Ropa(11, "ropa de prueba", 200);
        tienda.agregarProducto(producto);
        tienda.mostrarInventario();
        Producto electro = new Electrodomesticos(21, "electro de prueba", 500, 6 );
        tienda.agregarProducto(electro);
        tienda.mostrarInventario();
    }
}
