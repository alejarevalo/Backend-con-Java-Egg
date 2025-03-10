package entidades;

public class Empleado {
    private int id_empleado;
    private int codigo_empleado;
    private String nombre;
    private String apellido;
    private String extension;
    private String email;
    private int id_oficina;
    private int id_jefe;
    private String puesto;

    public Empleado() {
    }

    public Empleado(int id_empleado, int codigo_empleado, String nombre, String apellido, String extension,
            String email, int id_oficina, int id_jefe, String puesto) {
        this.id_empleado = id_empleado;
        this.codigo_empleado = codigo_empleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.extension = extension;
        this.email = email;
        this.id_oficina = id_oficina;
        this.id_jefe = id_jefe;
        this.puesto = puesto;
    }

    public Empleado(int codigo_empleado, String nombre, String apellido, String extension, String email, int id_oficina,
            int id_jefe, String puesto) {
        this.codigo_empleado = codigo_empleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.extension = extension;
        this.email = email;
        this.id_oficina = id_oficina;
        this.id_jefe = id_jefe;
        this.puesto = puesto;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public int getCodigo_empleado() {
        return codigo_empleado;
    }

    public void setCodigo_empleado(int codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId_oficina() {
        return id_oficina;
    }

    public void setId_oficina(int id_oficina) {
        this.id_oficina = id_oficina;
    }

    public int getId_jefe() {
        return id_jefe;
    }

    public void setId_jefe(int id_jefe) {
        this.id_jefe = id_jefe;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado [id_empleado=" + id_empleado + ", codigo_empleado=" + codigo_empleado + ", nombre=" + nombre
                + ", apellido=" + apellido + ", extension=" + extension + ", email=" + email + ", id_oficina="
                + id_oficina + ", id_jefe=" + id_jefe + ", puesto=" + puesto + "]";
    }

    
    

}
