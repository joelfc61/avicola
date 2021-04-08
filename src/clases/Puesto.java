/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Admin
 */
public class Puesto {
    private int id;
    private String nombre;
    private int departamento;
    private String actividades;

    public Puesto() {
    }

    public Puesto(int id, String nombre, int departamento, String actividades) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.actividades = actividades;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public String getActividades() {
        return actividades;
    }

    public void setActividades(String actividades) {
        this.actividades = actividades;
    }
    
}
