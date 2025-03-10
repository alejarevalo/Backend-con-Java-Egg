package persistencia;

import java.util.ArrayList;
import java.util.List;
import entidades.Familia;


public class FamiliaDAO extends DAO{

    // private int id;
    // private String nombre; 
    // private int edad_minima;
    // private int edad_maxima; 
    // private int num_hijos; 
    // private String email;

    public void guardarFamilia(Familia familia) throws Exception{
        try {
            if(familia == null){
                throw new Exception("La familia no puede estar nulo");
            }
            String sql = "INSERT INTO familias (nombre, edad_minima, edad_maxima, num_hijos, email) VALUES ('"
                    
                    + familia.getNombre() + "', '"
                    + familia.getedadMinima() + "', '"
                    + familia.getedadMaxima() + "', '"
                    + familia.getnumHijos() + "', '"
                    + familia.getEmail() + "')";
            insertarModificarEliminarDataBase(sql);
        }catch (Exception e){
            throw e; 
        }       
    }
    
    public List<Familia> listarTodosLosfamilias() throws Exception {
        try{
            String sql = "SELECT id_familia, nombre, edad_minima, edad_maxima, num_hijos, email FROM familias";
            consultarDatabase(sql);
            
            List<Familia> familias = new ArrayList<>();
            while (resultSet.next()){
                Familia familia = new Familia();
                familia.setId(resultSet.getInt("id_familia"));
                familia.setNombre(resultSet.getString("nombre"));
                familia.setedadMinima(resultSet.getInt("edad_minima"));
                familia.setedadMaxima(resultSet.getInt("edad_maxima"));
                familia.setnumHijos(resultSet.getInt("num_hijos"));
                familia.setEmail(resultSet.getString("email"));
                familias.add(familia);
            }
            return familias;
            
        }catch (Exception e){
            
            throw e;
        }finally{
            desconectarDataBase();
        }
        
    }
    

    public Familia buscarfamiliaPorCodigo(int id) throws Exception{
        String sql = "select * from familias where codigo_familia ="+id+ """
                """;
            consultarDatabase(sql);
            Familia datosFamilia = null;
        if (resultSet.next()) {
            datosFamilia = new Familia(resultSet.getInt("id_familia"), 
            resultSet.getString("nombre"),
            resultSet.getInt("edad_minima"),
            resultSet.getInt("edad_maxima"),
            resultSet.getInt("num_hijos"),
            resultSet.getString("email"));
        }
        desconectarDataBase();
        return datosFamilia;
    }


}
