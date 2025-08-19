package edu.uca;

public class Ropa extends Producto{
    public Ropa(int id, String nombre, double precio) {
        super(id, nombre, precio);
    }
    @Override
    public String toString() {
        return "Ropa{id=" + id + ", nombre='" + nombre + "', precio=" + precio + "}";
    }
}
