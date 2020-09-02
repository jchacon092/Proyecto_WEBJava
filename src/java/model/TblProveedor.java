package model;
// Generated Aug 29, 2017 11:31:30 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TblProveedor generated by hbm2java
 */
public class TblProveedor  implements java.io.Serializable {


     private int codigoProveedor;
     private String nombre;
     private String direccion;
     private String nit;
     private String telefono;
     private String email;
     private boolean activo;
     private Set tblProductos = new HashSet(0);

    public TblProveedor() {
    }

	
    public TblProveedor(int codigoProveedor, String nombre, String direccion, String nit, String telefono, boolean activo) {
        this.codigoProveedor = codigoProveedor;
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
        this.telefono = telefono;
        this.activo = activo;
    }
    public TblProveedor(int codigoProveedor, String nombre, String direccion, String nit, String telefono, String email, boolean activo, Set tblProductos) {
       this.codigoProveedor = codigoProveedor;
       this.nombre = nombre;
       this.direccion = direccion;
       this.nit = nit;
       this.telefono = telefono;
       this.email = email;
       this.activo = activo;
       this.tblProductos = tblProductos;
    }
   
    public int getCodigoProveedor() {
        return this.codigoProveedor;
    }
    
    public void setCodigoProveedor(int codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getNit() {
        return this.nit;
    }
    
    public void setNit(String nit) {
        this.nit = nit;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean isActivo() {
        return this.activo;
    }
    
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    public Set getTblProductos() {
        return this.tblProductos;
    }
    
    public void setTblProductos(Set tblProductos) {
        this.tblProductos = tblProductos;
    }




}


