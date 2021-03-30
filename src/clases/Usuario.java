/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

/**
 *
 * @author joelfc
 */
public class Usuario {
    private int idusuario;
    private String clave;
    private String password;
    private String nombre;
    private String appat;
    private String apmat;
    private int activo;
    private int cambioPwd;
    private int departamento;
    private int puesto;
    private int mClientes;
    private int mCompras;
    private int mGastos;
    private int mParametros;
    private int mProduccion;
    private int mProveedores;
    private int mUsuarios;
    private int mVentas;
    private int mPuestos;
    private int mDepartamentos;
    private int mGranjas;
    private int mParvadas;

    public Usuario() {
    }

    public Usuario(String clave, String password, String nombre, String appat, String apmat, int activo, int cambioPwd, int departamento, int puesto, int mClientes, int mCompras, int mGastos, int mParametros, int mProduccion, int mProveedores, int mUsuarios, int mVentas, int mPuestos, int mDepartamentos, int mGranjas, int mParvadas) {
        this.clave = clave;
        this.password = password;
        this.nombre = nombre;
        this.appat = appat;
        this.apmat = apmat;
        this.activo = activo;
        this.cambioPwd = cambioPwd;
        this.departamento = departamento;
        this.puesto = puesto;
        this.mClientes = mClientes;
        this.mCompras = mCompras;
        this.mGastos = mGastos;
        this.mParametros = mParametros;
        this.mProduccion = mProduccion;
        this.mProveedores = mProveedores;
        this.mUsuarios = mUsuarios;
        this.mVentas = mVentas;
        this.mPuestos = mPuestos;
        this.mDepartamentos = mDepartamentos;
        this.mGranjas = mGranjas;
        this.mParvadas = mParvadas;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    public int getCambioPwd() {
        return cambioPwd;
    }

    public void setCambioPwd(int cambioPwd) {
        this.cambioPwd = cambioPwd;
    }

    public int getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = departamento;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }


    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppat() {
        return appat;
    }

    public void setAppat(String appat) {
        this.appat = appat;
    }

    public String getApmat() {
        return apmat;
    }

    public void setApmat(String apmat) {
        this.apmat = apmat;
    }

    public int getmClientes() {
        return mClientes;
    }

    public void setmClientes(int mClientes) {
        this.mClientes = mClientes;
    }

    public int getmCompras() {
        return mCompras;
    }

    public void setmCompras(int mCompras) {
        this.mCompras = mCompras;
    }

    public int getmGastos() {
        return mGastos;
    }

    public void setmGastos(int mGastos) {
        this.mGastos = mGastos;
    }

    public int getmParametros() {
        return mParametros;
    }

    public void setmParametros(int mParametros) {
        this.mParametros = mParametros;
    }

    public int getmProduccion() {
        return mProduccion;
    }

    public void setmProduccion(int mProduccion) {
        this.mProduccion = mProduccion;
    }

    public int getmProveedores() {
        return mProveedores;
    }

    public void setmProveedores(int mProveedores) {
        this.mProveedores = mProveedores;
    }

    public int getmUsuarios() {
        return mUsuarios;
    }

    public void setmUsuarios(int mUsuarios) {
        this.mUsuarios = mUsuarios;
    }

    public int getmVentas() {
        return mVentas;
    }

    public void setmVentas(int mVentas) {
        this.mVentas = mVentas;
    }

   
    public int getmDepartamentos() {
        return mDepartamentos;
    }

   
    public void setmDepartamentos(int mDepartamentos) {
        this.mDepartamentos = mDepartamentos;
    }

    public int getmPuestos() {
        return mPuestos;
    }

    public void setmPuestos(int mPuestos) {
        this.mPuestos = mPuestos;
    }

    public int getmGranjas() {
        return mGranjas;
    }

    public void setmGranjas(int mGranjas) {
        this.mGranjas = mGranjas;
    }

    public int getmParvadas() {
        return mParvadas;
    }

    public void setmParvadas(int mParvadas) {
        this.mParvadas = mParvadas;
    }

  
    
    
}
