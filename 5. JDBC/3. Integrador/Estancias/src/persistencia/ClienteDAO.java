/*En este paquete se almacenarán aquellas clases que llevarán adelante lógica del negocio.
Para realizar las consultas con la base de datos, dentro del paquete servicios, crea las clases 
para cada una de las entidades con los métodos necesarios para realizar consultas a la base de datos. 
Una de las clases a crear en este paquete será: FamiliaServicio.java, y en esta clase se implementará, 
por ejemplo, un método para listar todas las familias que ofrecen alguna habitación para realizar estancias. */

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
            String sql = "INSERT INTO clientes (nombre, calle, numero, codigo_postal, ciudad, pais, email) VALUES ('"
                    
                    + cliente.getNombre() + "', '"
                    + cliente.getNumero() + "', '"
                    + cliente.getCodigoPostal() + "', '"
                    + cliente.getCiudad() + "', '"
                    + cliente.getPais() + "', '"
                    + cliente.getEmail() + "')";
            insertarModificarEliminarDataBase(sql);
        }catch (Exception e){
            throw e; 
        }
       
    }

    public List<Cliente> listarTodosLosClientes() throws Exception {
        try{
            String sql = "SELECT id_cliente, nombre, calle, numero, codigo_postal, ciudad, pais, email FROM clientes";
            consultarDatabase(sql);

            List<Cliente> clientes = new ArrayList<>();
            while (resultSet.next()){
                Cliente cliente = new Cliente();
                cliente.setId(resultSet.getInt("id_cliente"));
                cliente.setNombre(resultSet.getString("nombre"));
                cliente.setCalle(resultSet.getString("calle"));
                cliente.setNumero(resultSet.getInt("numero"));
                cliente.setCodigoPostal(resultSet.getString("codigo_postal"));
                cliente.setCiudad(resultSet.getString("ciudad"));
                cliente.setPais(resultSet.getString("pais"));
                cliente.setEmail(resultSet.getString("email"));
                clientes.add(cliente);
            }
            return clientes;

        }catch (Exception e){

            throw e;
        }finally{
            desconectarDataBase();
        }
        
    }

    // public void eliminarClientePorId(int id) throws Exception{
    //     try{
    //         String sql = "DELETE FROM cliente WHERE id_cliente = " + id;
    //         insertarModificarEliminarDataBase(sql);
    //     }catch (Exception e){
    //         throw e;
    //     }finally{
    //         desconectarDataBase(); //cerrar la conexión???
    //     }  
    // }

/*  private String nombre;
    private String calle;
    private int numero;
    private String codigo_postal;
    private String ciudad;
    private String pais;
    private String email; */
    
    public Cliente buscarClientePorCodigo(int id) throws Exception{
        String sql = "SELECT * FROM clientes WHERE id_cliente ="+id+ """
                """;
            consultarDatabase(sql);
            Cliente datosCliente = null;
        if (resultSet.next()) {
            datosCliente = new Cliente(resultSet.getInt("id_cliente"), 
            resultSet.getString("nombre"),
            resultSet.getString("calle"),
            resultSet.getInt("numero"),
            resultSet.getString("codigo_postal"),
            resultSet.getString("ciudad"),
            resultSet.getString("pais"),
            resultSet.getString("email"));
        }
        desconectarDataBase();
        return datosCliente;
    }
}
