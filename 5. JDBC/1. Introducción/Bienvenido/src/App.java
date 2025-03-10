import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        Connection conexion = getConnection();
        buscarClientes(conexion);        
        cerrarConexion(conexion);
    }

    public static Connection getConnection() {
        String host = "127.0.0.1"; // localhost
        String port = "3306"; // por defecto es el puerto que utiliza
        String name = "root"; // usuario de la base de datos
        String password = "miel"; // password de la base de datos
        String database = "vivero"; // nombre de la base de datos recien creada, en este caso vivero.
        // Esto especifica una zona horaria, no es obligatorio de utilizar, pero en
        // algunas zonas genera conflictos de conexión si no existiera
        String zona = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String url = "jdbc:mysql://" + host + ":" + port + "/" + database + zona;
        // esto indica la ruta de conexion, que es la combinacion de
        // host,usuario,puerto, nombre de la base de datos a la cual queremos
        // conectarnos y la zona horaria (si se precisara).

        Connection conexion = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conexion = DriverManager.getConnection(url, name, password);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el conector JDBC: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
        return conexion;
    }

    public static void cerrarConexion(Connection conexion) {
        if (conexion != null) {
            try {
                conexion.close();
                System.out.println("La conexión a la base de datos fue cerrada de manera exitosa");
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión:" + e.getMessage());
            }
        }
    }

    public static void buscarClientes(Connection conexion){
        String sql = "SELECT nombre_contacto, apellido_contacto, telefono FROM cliente";
        try {
            Statement statement = conexion.createStatement();
            ResultSet result = statement.executeQuery(sql);
            int count = 0;
            while (result.next()){
                String nombre = result.getString("nombre_contacto");
                String apellido = result.getString("apellido_contacto");
                String telefono = result.getString("telefono");
                count ++;
                System.out.println(count + " - " + nombre + " " + apellido + " -  " + telefono);
            }
            result.close();
            statement.close();
        } catch (SQLException e) {
            System.out.println("Error en la consulta: "+ e.getMessage());
        }
    }



        // Realiza un método llamado buscarClientePorCodigo(codigo) que reciba como
    // parámetro el código del cliente y muestre por pantalla los datos que tiene el
    // cliente guardado en la base de datos.
    public static void buscarClientePorCodigo(int codigo_cliente, Connection conexion) {
        try {
            PreparedStatement preparedStatement = conexion
                    .prepareStatement("SELECT * FROM cliente WHERE codigo_cliente = ?");
            preparedStatement.setInt(1, codigo_cliente);
            ResultSet rs = preparedStatement.executeQuery();

            int columnCount = rs.getMetaData().getColumnCount();

            // Iterar a través de las filas del ResultSet
            while (rs.next()) {
                // Iterar a través de todas las columnas de la fila
                for (int i = 1; i <= columnCount; i++) {
                    // Obtener el nombre de la columna
                    String columnName = rs.getMetaData().getColumnName(i);
                    // Obtener el valor de la columna en la fila actual
                    Object columnValue = rs.getObject(i);
                    // Imprimir el nombre de la columna y su valor
                    System.out.println(columnName + ": " + columnValue + " ");
                }
                System.out.println("---"); // Separador entre filas
            }
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        }
    }

    // Realiza un método llamado buscarClientesPorEmpleado(codigo) que reciba el
    // código del empleado como parámetro y muestre todos los clientes asociados a
    // un empleado en particular. Puedes elegir qué campos mostrar en tu método.
    public static void buscarClientePorCodigoEmpleado(int codigo_empleado, Connection connection) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("SELECT * FROM empleado join cliente on cliente.id_empleado = empleado.id_empleado WHERE codigo_empleado = ?");
            preparedStatement.setInt(1, codigo_empleado);
            ResultSet rs = preparedStatement.executeQuery();

            int columnCount = rs.getMetaData().getColumnCount();

            // Iterar a través de las filas del ResultSet
            while (rs.next()) {
                // Iterar a través de todas las columnas de la fila
                for (int i = 1; i <= columnCount; i++) {
                    // Obtener el nombre de la columna
                    String columnName = rs.getMetaData().getColumnName(i);
                    // Obtener el valor de la columna en la fila actual
                    Object columnValue = rs.getObject(i);
                    // Imprimir el nombre de la columna y su valor
                    System.out.println(columnName + ": " + columnValue + " ");
                }
                System.out.println("---"); // Separador entre filas
            }
        } catch (SQLException e) {
            System.out.println("Error en la consulta: " + e.getMessage());
        }
    }


}


