package entidades;

public class Oficina {
    private int id_oficina;
    private String codigo_oficina;
    private String ciudad;
    private String pais;
    private String region;
    private String codigo_postal;
    private String telefono;
    
    public Oficina() {
    }

    public Oficina(int id_oficina, String codigo_oficina, String ciudad, String pais, String region,
            String codigo_postal, String telefono) {
        this.id_oficina = id_oficina;
        this.codigo_oficina = codigo_oficina;
        this.ciudad = ciudad;
        this.pais = pais;
        this.region = region;
        this.codigo_postal = codigo_postal;
        this.telefono = telefono;
    }

    public Oficina(String codigo_oficina, String ciudad, String pais, String region, String codigo_postal,
            String telefono) {
        this.codigo_oficina = codigo_oficina;
        this.ciudad = ciudad;
        this.pais = pais;
        this.region = region;
        this.codigo_postal = codigo_postal;
        this.telefono = telefono;
    }

    public int getId_oficina() {
        return id_oficina;
    }

    public void setId_oficina(int id_oficina) {
        this.id_oficina = id_oficina;
    }

    public String getCodigo_oficina() {
        return codigo_oficina;
    }

    public void setCodigo_oficina(String codigo_oficina) {
        this.codigo_oficina = codigo_oficina;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
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

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Oficina [id_oficina=" + id_oficina + ", codigo_oficina=" + codigo_oficina + ", ciudad=" + ciudad
                + ", pais=" + pais + ", region=" + region + ", codigo_postal=" + codigo_postal + ", telefono="
                + telefono + "]";
    }

    

    
}
