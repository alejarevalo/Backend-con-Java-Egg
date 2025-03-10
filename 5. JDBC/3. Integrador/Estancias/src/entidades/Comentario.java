package entidades;

public class Comentario {
    private int id;
    private int idCasa;
    private String comentario;
    
    public Comentario() {
    }

    public Comentario(int id, int idCasa, String comentario) {
        this.id = id;
        this.idCasa = idCasa;
        this.comentario = comentario;
    }

    public Comentario(int idCasa, String comentario) {
        this.idCasa = idCasa;
        this.comentario = comentario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCasa() {
        return idCasa;
    }

    public void setIdCasa(int idCasa) {
        this.idCasa = idCasa;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Comentario [id=" + id + ", idCasa=" + idCasa + ", comentario=" + comentario + "]";
    }

    
    
}
