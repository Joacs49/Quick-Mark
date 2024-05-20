package Modelo.Dao;

import Modelo.Cuenta;
import Modelo.Pedidos;
import Modelo.Productos;
import javax.swing.JTable;
import javax.swing.JTextField;

public interface IPedidosDAO {
    
    public void mostrar(JTable jTable1);
    public void insertar(Pedidos pedidos, Cuenta cuenta, Productos prod);
    public void modificar(JTable jTable1,JTextField dato);
    public void eliminar(JTable jTable1, String eliminar);
    public void mostrarFiltrado(JTable jTable1, String buscar);
    
}
