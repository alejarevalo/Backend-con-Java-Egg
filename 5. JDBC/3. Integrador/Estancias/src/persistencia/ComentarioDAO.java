package persistencia;
import java.util.ArrayList;
import java.util.List;
import entidades.Comentario;

public class ComentarioDAO extends DAO {


    public void guardarComentario(Comentario comentario) throws Exception {
        if (comentario == null) {
            throw new Exception("El comentario no puede ser nulo");
        }
        String sql = "INSERT INTO comentarios (id_casa, comentario) VALUES ('"

                + comentario.getIdCasa() + "', '"
                + comentario.getComentario() + "')";
        insertarModificarEliminarDataBase(sql);    
    }

    public List<Comentario> listarTodosLosComentarios() throws Exception {
        String sql = "SELECT * FROM comentarios";
        consultarDatabase(sql);
        List<Comentario> comentarios = new ArrayList<>();
        while (resultSet.next()) {
            comentarios.add(crearComentario());
        } // -> crea objetos comentario con la info que saca de cada registro de la base de datos y luego los añade a la lista commentarios
        for (Comentario comentario : comentarios) {
            System.out.println(comentario.toString());
        }
        desconectarDataBase();
        return comentarios;
    }

    public void eliminarComentarioPorId(int id) throws Exception {
        String sql = "DELETE FROM comentarios WHERE id_comentario = " + id;
        insertarModificarEliminarDataBase(sql);
    }

    public void actualizarComentario(Comentario comentario) throws Exception {
        if (comentario == null) {
            throw new Exception("El comentario no puede ser nulo");
        }
        String sql = "UPDATE comentarios SET id_casa = " + comentario.getIdCasa() + ", comentario = '"
                + comentario.getComentario() + "' WHERE id_comentario = " + comentario.getId();
        insertarModificarEliminarDataBase(sql);
    }

     // El siguiente método sirve para leer de la base de datos y crear objetos que sean más fácilmente 
     // manipulables en la aplicación
    public Comentario crearComentario() throws Exception {
        Comentario comentario = new Comentario();
        comentario.setId(resultSet.getInt("id_comentario"));
        comentario.setIdCasa(resultSet.getInt("id_casa"));
        comentario.setComentario(resultSet.getString("comentario"));
        return comentario;
    }

    public Comentario buscarComentarioPorId(int id) throws Exception {
        String sql = "SELECT * FROM comentarios WHERE id_comentario = " + id;
        consultarDatabase(sql);
        resultSet.next();
        Comentario comentario = crearComentario();
        desconectarDataBase();
        System.out.println(comentario.toString());
        return comentario;
    }

}