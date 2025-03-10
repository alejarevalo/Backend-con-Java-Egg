package persistencia;

public class ProductoDAO extends DAO {

    public void eliminarProducto(int idProducto) throws Exception{
        String sql = "delete from producto where id_producto ="+idProducto+ """
                """;
        insertarModificarEliminarDataBase(sql);
        System.out.println("---------------------------------");
        System.out.println("El producto id "+idProducto+" fue eliminado.");
    }
}
