
package Modelo;

public class Proveedor {
    private int cod_prov;
    private String nombre_prov;
    private String empresa_prov;

    public Proveedor(int cod_prov, String nombre_prov, String empresa_prov) {
        this.cod_prov = cod_prov;
        this.nombre_prov = nombre_prov;
        this.empresa_prov = empresa_prov;
    }

    public Proveedor(int cod_prov) {
        this.cod_prov = cod_prov;
    }

    public int getCod_prov() {
        return cod_prov;
    }

    public void setCod_prov(int cod_prov) {
        this.cod_prov = cod_prov;
    }

    public String getNombre_prov() {
        return nombre_prov;
    }

    public void setNombre_prov(String nombre_prov) {
        this.nombre_prov = nombre_prov;
    }

    public String getEmpresa_prov() {
        return empresa_prov;
    }

    public void setEmpresa_prov(String empresa_prov) {
        this.empresa_prov = empresa_prov;
    }

    @Override
    public String toString() {
        return cod_prov + "," + nombre_prov + "," + empresa_prov + "\n";
    }
    
    
    
}
