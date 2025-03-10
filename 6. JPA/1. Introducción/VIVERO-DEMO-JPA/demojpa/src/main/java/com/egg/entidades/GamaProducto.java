package com.egg.entidades;
import jakarta.persistence.*;

@Entity
@Table(name="gama_producto")
public class GamaProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_gama")
    private int idGama;

    @Column(name="descripcion_html")
    private String descripcionHtml;

    @Column(name="descripcion_texto")
    private String descripcionTexto;

    @Column(name="gama")
    private String gama;

    @Column(name="imagen")
    private String imagen;

    public GamaProducto() {
    }

    public GamaProducto(int idGama, String descripcionHtml, String descripcionTexto, String gama, String imagen) {
        this.idGama = idGama;
        this.descripcionHtml = descripcionHtml;
        this.descripcionTexto = descripcionTexto;
        this.gama = gama;
        this.imagen = imagen;
    }

    public int getIdGama() {
        return idGama;
    }

    public void setIdGama(int idGama) {
        this.idGama = idGama;
    }

    public String getDescripcionHtml() {
        return descripcionHtml;
    }

    public void setDescripcionHtml(String descripcionHtml) {
        this.descripcionHtml = descripcionHtml;
    }

    public String getDescripcionTexto() {
        return descripcionTexto;
    }

    public void setDescripcionTexto(String descripcionTexto) {
        this.descripcionTexto = descripcionTexto;
    }

    public String getGama() {
        return gama;
    }

    public void setGama(String gama) {
        this.gama = gama;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }   
    
    
    

}
