
package Modelo;

public class Cuenta {
    private String id_trabajador;
    private String usuario;
    private String contraseña;

    public Cuenta(String id_trabajador, String usuario, String contraseña) {
        this.id_trabajador = id_trabajador;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    
    public Cuenta(String id_trabajador, String contraseña) {
        this.id_trabajador = id_trabajador;
        this.contraseña = contraseña;
    }
    
    public Cuenta(String id_trabajador) {
        this.id_trabajador = id_trabajador;
    }
    
    public Cuenta(){
    }

    public String getId_trabajador() {
        return id_trabajador;
    }

    public void setId_trabajador(String id_trabajador) {
        this.id_trabajador = id_trabajador;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return id_trabajador + "," + usuario + "," + contraseña + '}';
    }
    
    
}
