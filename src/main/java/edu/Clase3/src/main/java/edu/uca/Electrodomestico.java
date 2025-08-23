package edu.uca;

public class Electrodomestico extends Producto{
    int  garantia;
    public Electrodomestico(int id, String nombre, double precio, int garantia) {
        super(id, nombre, precio * 1.10);
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        return "Electrodomestico{id=" + id + ", nombre='" + nombre + "', precio=" + precio + ", garantia= "+ garantia + "}";
    }
}
