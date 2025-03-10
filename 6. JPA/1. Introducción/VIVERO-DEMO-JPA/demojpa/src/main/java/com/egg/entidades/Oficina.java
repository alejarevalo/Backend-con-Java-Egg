package com.egg.entidades;
import jakarta.persistence.*;

@Entity
@Table(name="oficina")
public class Oficina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_oficina")
    private int idOficina;

    @Column(name="ciudad")
    private String ciudad;

    @Column(name="codigo_postal")
    private String codigoPostal;

    @Column(name="codigo_oficina")
    private String codigoOficina;

    @Column(name="pais")
    private String pais;

    @Column(name="region")
    private String region;

    @Column(name="telefono")
    private String telefono;

    public Oficina() {
    }

    public Oficina(int idOficina, String ciudad, String codigoPostal, String codigoOficina, String pais, String region,
            String telefono) {
        this.idOficina = idOficina;
        this.ciudad = ciudad;
        this.codigoPostal = codigoPostal;
        this.codigoOficina = codigoOficina;
        this.pais = pais;
        this.region = region;
        this.telefono = telefono;
    }

    public int getIdOficina() {
        return idOficina;
    }

    public void setIdOficina(int idOficina) {
        this.idOficina = idOficina;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCodigoOficina() {
        return codigoOficina;
    }

    public void setCodigoOficina(String codigoOficina) {
        this.codigoOficina = codigoOficina;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
