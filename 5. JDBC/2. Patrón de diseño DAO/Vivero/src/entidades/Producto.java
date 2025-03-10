package entidades;

public class Producto {
    private int id_producto;
    private String codigo_producto;
    private String nombre;
    private int id_gama;
    private String dimensiones;
    private String proveedor;
    private String descripcion;
    private int cantidad_en_stock;
    private double precio_venta;
    private double precio_proveedor;

    public Producto() {
    }

    public Producto(int id_producto, String codigo_producto, String nombre, int id_gama, String dimensiones,
            String proveedor, String descripcion, int cantidad_en_stock, double precio_venta, double precio_proveedor) {
        this.id_producto = id_producto;
        this.codigo_producto = codigo_producto;
        this.nombre = nombre;
        this.id_gama = id_gama;
        this.dimensiones = dimensiones;
        this.proveedor = proveedor;
        this.descripcion = descripcion;
        this.cantidad_en_stock = cantidad_en_stock;
        this.precio_venta = precio_venta;
        this.precio_proveedor = precio_proveedor;
    }

    public Producto(String codigo_producto, String nombre, int id_gama, String dimensiones, String proveedor,
            String descripcion, int cantidad_en_stock, double precio_venta, double precio_proveedor) {
        this.codigo_producto = codigo_producto;
        this.nombre = nombre;
        this.id_gama = id_gama;
        this.dimensiones = dimensiones;
        this.proveedor = proveedor;
        this.descripcion = descripcion;
        this.cantidad_en_stock = cantidad_en_stock;
        this.precio_venta = precio_venta;
        this.precio_proveedor = precio_proveedor;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(String codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_gama() {
        return id_gama;
    }

    public void setId_gama(int id_gama) {
        this.id_gama = id_gama;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad_en_stock() {
        return cantidad_en_stock;
    }

    public void setCantidad_en_stock(int cantidad_en_stock) {
        this.cantidad_en_stock = cantidad_en_stock;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public double getPrecio_proveedor() {
        return precio_proveedor;
    }

    public void setPrecio_proveedor(double precio_proveedor) {
        this.precio_proveedor = precio_proveedor;
    }

    @Override
    public String toString() {
        return "Producto [id_producto=" + id_producto + ", codigo_producto=" + codigo_producto + ", nombre=" + nombre
                + ", id_gama=" + id_gama + ", dimensiones=" + dimensiones + ", proveedor=" + proveedor
                + ", descripcion=" + descripcion + ", cantidad_en_stock=" + cantidad_en_stock + ", precio_venta="
                + precio_venta + ", precio_proveedor=" + precio_proveedor + "]";
    }

        
}
