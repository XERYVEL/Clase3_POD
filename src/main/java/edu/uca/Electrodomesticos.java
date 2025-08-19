package edu.uca;

public class Electrodomesticos extends Producto {
    int garantia;
    public Electrodomesticos(int id, String nombre, double precio, int garantia) {
        super(id, nombre, precio*1.1);
        this.garantia =garantia;
    }
    @Override
    public String toString() {
        return "Electrodomesticos {id=" + id + ", nombre='" + nombre + "', precio=" + precio + ", garantia" + garantia + "}";
    }
}
