
package Modelo;

public class Productos{
    
    private int cod_prod;
    private String des_prod;
    private double val_uni;
    private int stock_max;
    private int stock_min;
    private int cantidad;
    
    public Productos(String des_prod, double val_uni, int stock_max, int stock_min, int cantidad, String cod_cate) {
        this.cod_prod = cod_prod;
        this.des_prod = des_prod;
        this.val_uni = val_uni;
        this.stock_max = stock_max;
        this.stock_min = stock_min;
        this.cantidad = cantidad;
    }
    
    public Productos(int cod_prod) {
        this.cod_prod = cod_prod;
    }

    public Productos() {
    }

    public int getCod_prod() {
        return cod_prod;
    }

    public void setCod_prod(int cod_prod) {
        this.cod_prod = cod_prod;
    }

    public String getDes_prod() {
        return des_prod;
    }

    public void setDes_prod(String des_prod) {
        this.des_prod = des_prod;
    }

    public double getVal_uni() {
        return val_uni;
    }

    public void setVal_uni(double val_uni) {
        this.val_uni = val_uni;
    }

    public int getStock_max() {
        return stock_max;
    }

    public void setStock_max(int stock_max) {
        this.stock_max = stock_max;
    }

    public int getStock_min() {
        return stock_min;
    }

    public void setStock_min(int stock_min) {
        this.stock_min = stock_min;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return cod_prod + "," + des_prod + "," + val_uni + "," + cantidad + "\n";
    }
    
    
}
