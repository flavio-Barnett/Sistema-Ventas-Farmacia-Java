package modelo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Producto {

    private String Id_Producto, Nombre_Producto, Tipo_Producto;
    private double Precio_Unitario;
    private int idTipoProducto;
    private int stock;
    private String descripcion;

    public Producto(String Id_Producto, String Nombre_Producto, String Tipo_Producto, double Precio_Unitario) {
        this.Id_Producto = Id_Producto;
        this.Nombre_Producto = Nombre_Producto;
        this.Tipo_Producto = Tipo_Producto;
        this.Precio_Unitario = Precio_Unitario;
    }

    public Producto(String Id_Producto, String Nombre_Producto, int idTipoProducto, double Precio_Unitario) {
        this.Id_Producto = Id_Producto;
        this.Nombre_Producto = Nombre_Producto;
        this.idTipoProducto = idTipoProducto;
        this.Precio_Unitario = Precio_Unitario;
    }

    public Producto(String Id_Producto, String Nombre_Producto, String Tipo_Producto, double Precio_Unitario, String descripcion, int stock) {
        this.Id_Producto = Id_Producto;
        this.Nombre_Producto = Nombre_Producto;
        this.Tipo_Producto = Tipo_Producto;
        this.Precio_Unitario = Precio_Unitario;
        this.descripcion = descripcion;
        this.stock = stock;
    }

    public Producto(String Id_Producto, String Nombre_Producto, int idTipoProducto, double Precio_Unitario, String descripcion, int stock) {
        this.Id_Producto = Id_Producto;
        this.Nombre_Producto = Nombre_Producto;
        this.idTipoProducto = idTipoProducto;
        this.Precio_Unitario = Precio_Unitario;
        this.descripcion = descripcion;
        this.stock = stock;

    }

    public Producto(String Id_Producto) {
        this.Id_Producto = Id_Producto;
    }

   

}
