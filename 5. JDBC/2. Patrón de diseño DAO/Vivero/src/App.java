import java.util.List;
import java.sql.Connection;

import entidades.Cliente;
import entidades.Producto;
import persistencia.ClienteDAO;
import persistencia.ProductoDAO;

public class App {

    public static Connection conexion;
    public static void main(String[] args) throws Exception {
        ClienteDAO cliente1 = new ClienteDAO();
        Cliente cliente = new Cliente(45,"Hedy", "Lamarr", "123456");
        cliente1.guardarCliente(cliente);
        
        cliente1.listarTodosLosClientes();
        // crear un array list para almacenecar el listar y poder imprimir:
        List<Cliente> clientesDao = cliente1.listarTodosLosClientes();
        System.out.println(clientesDao);
        // O también:
        // for (Cliente cliente : clientesDao) {
        //     System.out.println(cliente.toString() + "\n");
        // }

        //

        ProductoDAO producto = new ProductoDAO();
        producto.eliminarProducto(39);
        System.out.println(cliente1.buscarClientePorCodigo(10));

    }
}
