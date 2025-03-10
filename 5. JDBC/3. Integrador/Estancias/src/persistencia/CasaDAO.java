package persistencia;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import entidades.Casa;

public class CasaDAO extends DAO {


        public void guardarCasa(Casa casa) throws Exception{
        try {
            if(casa == null){
                throw new Exception("La casa no puede estar nulo");
            }
            String sql = "INSERT INTO casas (calle, numero, codigo_postal, ciudad, pais, fecha_desde, fecha_hasta, tiempo_minimo, tiempo_maximo, precio_habitacion, vivienda) VALUES ('"
                    
                    + casa.getCalle() + "', '"
                    + casa.getNumero() + "', '"
                    + casa.getCodigoPostal() + "', '"
                    + casa.getCiudad() + "', '"
                    + casa.getPais() + "', '"
                    + casa.getFechaDesde() + "', '"
                    + casa.getFechaHasta() + "', '"
                    + casa.getTiempoMinimo() + "', '"
                    + casa.getTiempoMaximo() + "', '"
                    + casa.getPrecioHabitacion() + "', '"                        
                    + casa.getVivienda() + "')";
            insertarModificarEliminarDataBase(sql);
        }catch (Exception e){
            throw e; 
        }       
    }
    

    public List<Casa> listarTodosLoscasas() throws Exception {
        try{
            String sql = "SELECT id_casa, calle, numero, codigo_postal, ciudad, pais, fecha_desde, fecha_hasta, tiempo_minimo, tiempo_maximo, precio_habitacion, vivienda FROM casas";
            consultarDatabase(sql);
            
            List<Casa> casas = new ArrayList<>();
            while (resultSet.next()){
                Casa casa = new Casa();
                casa.setId(resultSet.getInt("id_casa"));
                casa.setCalle(resultSet.getString("calle"));
                casa.setNumero(resultSet.getInt("numero"));
                casa.setCodigoPostal(resultSet.getString("codigo_postal"));
                casa.setCiudad(resultSet.getString("ciudad"));
                casa.setPais(resultSet.getString("pais"));
                // casa.setFechaDesde(resultSet.getLocalDate("fecha_desde"));
                // casa.setFechaHasta(resultSet.getLocalDate("fecha_hasta"));
                /*A partir de JDBC 4.2, se soporta directamente el uso de LocalDate 
                con el método getObject. Si estás utilizando una versión compatible, 
                puedes hacerlo de esta manera: */
                casa.setFechaDesde(resultSet.getObject("fecha_desde", LocalDate.class));
                casa.setFechaHasta(resultSet.getObject("fecha_hasta", LocalDate.class)); 
                // //
                casa.setTiempoMinimo(resultSet.getInt("tiempo_minimo"));
                casa.setTiempoMaximo(resultSet.getInt("tiempo_maximo"));
                casa.setPrecioHabitacion(resultSet.getInt("precio_habitacion"));       
                casa.setVivienda(resultSet.getString("vivienda"));
                casas.add(casa);
            }
            return casas;
            
        }catch (Exception e){
            
            throw e;
        }finally{
            desconectarDataBase();
        }
        
    }
    
    //  private int id;
    // private String calle;
    // private int numero;
    // private String codigoPostal;
    // private String ciudad;
    // private String pais;
    // private LocalDate fechaDesde;
    // private LocalDate fechaHasta;
    // private int tiempoMinimo;
    // private int tiempoMaximo;
    // private double precioHabitacion;
    // private String vivienda;


    public Casa buscarcasaPorCodigo(int id) throws Exception{
        String sql = "select * from casas where id_casa ="+id+ """
                """;
            consultarDatabase(sql);
            Casa datosCasa = null;
        if (resultSet.next()) {
            datosCasa = new Casa(resultSet.getInt("id_casa"), 
            resultSet.getString("calle"),
            resultSet.getInt("numero"),
            resultSet.getString("codigo_postal"),
            resultSet.getString("ciudad"),
            resultSet.getString("pais"),
            resultSet.getObject("fecha_desde", LocalDate.class),
            resultSet.getObject("fecha_hasta", LocalDate.class),
            resultSet.getInt("tiempo_minimo"),
            resultSet.getInt("tiempo_maximo"),
            resultSet.getInt("precio_habitacion"),
            resultSet.getString("vivienda"));          
            
        }
        desconectarDataBase();
        return datosCasa;
    }


}
