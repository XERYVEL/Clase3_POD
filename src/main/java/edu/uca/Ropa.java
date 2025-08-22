package edu.uca;

public class Ropa extends Producto{
    protected Talles talle;
    protected Materiales material;

    public Ropa(int id, String nombre, double precio, Talles talle, Materiales material) {
            super(id, nombre, aplicar_descuento(precio,material));
            this.talle = talle;
            this.material = material;
    }
    private static double aplicar_descuento(double precio, Materiales material){
        if (material==Materiales.ALGODON){
            return precio * 0.8;
        }
        return precio;
    }
    @Override
    public String toString() {
        return "Ropa{id=" + id + ", nombre='" + nombre + "', precio=" + precio + "', talle=" + talle + "', material =" + material + "}";
    }


}
