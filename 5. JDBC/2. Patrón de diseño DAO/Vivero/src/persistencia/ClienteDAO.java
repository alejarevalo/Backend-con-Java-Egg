package persistencia;

import java.util.ArrayList;
import java.util.List;
import entidades.Cliente;

public class ClienteDAO extends DAO {
    public void guardarCliente(Cliente cliente) throws Exception{
        try {
            if(cliente == null){
                throw new Exception("El cliente no puede estar nulo");
            }
            String sql = "INSERT INTO cliente (id_cliente, nombre_cliente, apellido_contacto, telefono) VALUES ('"
                    + cliente.getIdCliente() + "', '"
                    + cliente.getNombreCliente() + "', '"
                    + cliente.getApellidoContacto() + "', '"
                    + cliente.getTelefono() + "')";
            insertarModificarEliminarDataBase(sql);
        }catch (Exception e){
            throw e; 
        }
       
    }

    public List<Cliente> listarTodosLosClientes() throws Exception {
        try{
            String sql = "SELECT id_cliente, nombre_cliente, apellido_contacto FROM cliente";
            consultarDatabase(sql);

            List<Cliente> clientes = new ArrayList<>();
            while (resultSet.next()){
                Cliente cliente = new Cliente();
                cliente.setIdCliente(resultSet.getInt("id_cliente"));
                cliente.setNombreCliente(resultSet.getString("nombre_cliente"));
                cliente.setApellidoContacto(resultSet.getString("apellido_contacto"));
                clientes.add(cliente);
            }
            return clientes;

        }catch (Exception e){

            throw e;
        }finally{
            desconectarDataBase();
        }
        
    }

    public void eliminarClientePorId(int id) throws Exception{
        try{
            String sql = "DELETE FROM cliente WHERE id_cliente = " + id;
            insertarModificarEliminarDataBase(sql);
        }catch (Exception e){
            throw e;
        }finally{
            desconectarDataBase(); //cerrar la conexión???
        }  
    }

    
    public String buscarClientePorCodigo(int codigo) throws Exception{
        String sql = "select*from cliente where codigo_cliente ="+codigo+ """
                """;
        String datosCliente = "";
        consultarDatabase(sql);
        while (resultSet.next()) {
            Cliente cliente = new Cliente();
            cliente.setCodigoCliente(resultSet.getInt("codigo_cliente"));
            cliente.setNombreCliente(resultSet.getString("nombre_cliente"));
            cliente.setApellidoContacto(resultSet.getString("apellido_contacto"));
            cliente.setTelefono(resultSet.getString("telefono"));
            datosCliente = cliente.toString();
         }
        desconectarDataBase();
        return datosCliente;
    }

}