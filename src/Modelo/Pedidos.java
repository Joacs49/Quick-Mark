
package Modelo;

public class Pedidos {
    
    private int id_pedido;
    private String fecha_pedido;
    private int cantidad;
    private double precio;
    private String estado;

    public Pedidos(int id_pedido, String fecha_pedido, int cantidad, double precio, String estado) {
        this.id_pedido = id_pedido;
        this.fecha_pedido = fecha_pedido;
        this.cantidad = cantidad;
        this.precio = precio;
        this.estado = estado;
    }
    
    public Pedidos(String fecha_pedido, int cantidad, double precio, String estado) {
        this.id_pedido = id_pedido;
        this.fecha_pedido = fecha_pedido;
        this.cantidad = cantidad;
        this.precio = precio;
        this.estado = estado;
    }
    
    public Pedidos(){
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public String getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(String fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return id_pedido + "," + fecha_pedido + "," + cantidad + "," + precio + "," + estado + "\n";
    }
    
    
    
}
