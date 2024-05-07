
package Modelo;

public class Categoria {
    
    private int cod_cate;
    private String categoria;

    public Categoria(int cod_cate, String categoria) {
        this.cod_cate = cod_cate;
        this.categoria = categoria;
    }
    
    public Categoria(int cod_cate) {
        this.cod_cate = cod_cate;
    }

    public int getCod_cate() {
        return cod_cate;
    }

    public void setCod_cate(int cod_cate) {
        this.cod_cate = cod_cate;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return cod_cate + "," + categoria + "\n";
    }
}
