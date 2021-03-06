package model;
// Generated Aug 29, 2017 11:31:30 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TblPuesto generated by hbm2java
 */
public class TblPuesto  implements java.io.Serializable {


     private int codigoPuesto;
     private String nombre;
     private Set tblEmpleados = new HashSet(0);

    public TblPuesto() {
    }

	
    public TblPuesto(int codigoPuesto, String nombre) {
        this.codigoPuesto = codigoPuesto;
        this.nombre = nombre;
    }
    public TblPuesto(int codigoPuesto, String nombre, Set tblEmpleados) {
       this.codigoPuesto = codigoPuesto;
       this.nombre = nombre;
       this.tblEmpleados = tblEmpleados;
    }
   
    public int getCodigoPuesto() {
        return this.codigoPuesto;
    }
    
    public void setCodigoPuesto(int codigoPuesto) {
        this.codigoPuesto = codigoPuesto;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getTblEmpleados() {
        return this.tblEmpleados;
    }
    
    public void setTblEmpleados(Set tblEmpleados) {
        this.tblEmpleados = tblEmpleados;
    }




}


