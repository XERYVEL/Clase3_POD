import edu.uca.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {

    @Test
    public void productToStringTest(){
        Producto ropa = new Ropa(1, "Ropa de prueba", 200, Talles.L ,Materiales.ALGODON);
        System.out.println(ropa);
        Producto electrodomestico = new Electrodomestico(1, "Electrodomestico de prueba", 100, 6);
        System.out.println(electrodomestico);
    }

    @Test
    public void tiendaAgregarProductoTest(){
        Tienda tienda = new Tienda();
        Producto producto = new Ropa(1, "producto de prueba", 200, Talles.L,Materiales.ALGODON);
        tienda.agregarProducto(producto);
        Assert.assertEquals(tienda.getSize(), 1);
    }

    @Test
    public void mostrarInventarioTest(){
        Tienda tienda = new Tienda();
        Producto electro = new Electrodomestico(1, "producto electro", 100, 6);
        tienda.agregarProducto(electro);
        tienda.mostrarInventario();
    }
}
