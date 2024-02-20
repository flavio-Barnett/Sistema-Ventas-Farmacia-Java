/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Venta {
    private Date fecha;
    private int idVenta,idVendedor;
    private String idProducto,dniCliente, nombreProducto, descripcion;
    private double precioUnitario;
    private int cantidad;
    private double total;

   public Venta( String idProducto, String nombreProducto, String descripcion,double precioUnitario,int cantidad, double total){
       this.idProducto=idProducto;
       this.nombreProducto=nombreProducto;
       this.descripcion=descripcion;
       this.precioUnitario=precioUnitario;
       this.cantidad=cantidad;
       this.total=total;
          
   }
   
   public Venta(int idVenta,String dniCliente,int idVendedor,String descripcion,double total,Date fecha){
       this.idVenta=idVenta;
       this.dniCliente=dniCliente;
       this.idVendedor=idVendedor;
       this.descripcion=descripcion;
       this.total=total;
       this.fecha=fecha;
       
   }
   
   public Date getFecha(){
       return fecha;
   }
    
}
