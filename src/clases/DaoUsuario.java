/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joelfc
 */
public class DaoUsuario extends Usuario{

    public DaoUsuario(String clave, String password, String nombre, String appat, String apmat, int activo, int cambioPwd, int departamento, int puesto, int mClientes, int mCompras, int mGastos, int mParametros, int mProduccion, int mProveedores, int mUsuarios, int mVentas, int mPuestos, int mDepartamentos, int mGranjas, int mParvadas) {
        super(clave, password, nombre, appat, apmat, activo, cambioPwd, departamento, puesto, mClientes, mCompras, mGastos, mParametros, mProduccion, mProveedores, mUsuarios, mVentas, mPuestos, mDepartamentos, mGranjas, mParvadas);
    }

   

  

    public DaoUsuario() {
     super();
    }
    
    public boolean agregar(){
        Connection cone = Conex.getConnection();
        boolean res = false;
        try {
            CallableStatement cstm = cone.prepareCall("{call insuser(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cstm.setString(1,this.getClave());
            cstm.setString(2,this.getPassword());
            cstm.setString(3,this.getNombre());
            cstm.setString(4,this.getAppat());
            cstm.setString(5,this.getApmat());
            cstm.setInt(6,1);  //activo
            cstm.setInt(7,1); // cambio Pwd
            cstm.setInt(8,this.getDepartamento()); //departamento
            cstm.setInt(9,this.getPuesto()); // puesto
            cstm.setInt(10,this.getmClientes());
            cstm.setInt(11,this.getmCompras());
            //  mPuestos, mDepartamentos, mGranjas, mParvadas);
            cstm.setInt(12, this.getmGastos());
            cstm.setInt(13, this.getmParametros());
            cstm.setInt(14, this.getmProduccion());
            cstm.setInt(15, this.getmProveedores());
            cstm.setInt(16, this.getmUsuarios());
            cstm.setInt(17, this.getmVentas());
            cstm.setInt(18, this.getmPuestos());
            cstm.setInt(19, this.getmDepartamentos());
            cstm.setInt(20, this.getmGranjas());
            cstm.setInt(21, this.getmParvadas());
  
            res= cstm.execute();
                                    
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return res;
    }
    public Usuario buscaUsuario(){
        Usuario usr = new Usuario();
        
        Connection conn = Conex.getConnection();
        try {
            PreparedStatement pstm =  conn.prepareStatement("select * from usuarios where idusuario = ?");
            pstm.setInt(1, getIdusuario());
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                usr.setmProduccion(rs.getInt("mProduccion"));
                usr.setmProveedores(rs.getInt("mProveedores"));
                usr.setmGastos(rs.getInt("mGastos"));
                usr.setmVentas(rs.getInt("mVentas"));
                usr.setmUsuarios(rs.getInt("mUsuarios"));
                usr.setmClientes(rs.getInt("mClientes"));
                usr.setmCompras(rs.getInt("mCompras"));
                usr.setmParametros(rs.getInt("mParametros"));
                usr.setmPuestos(rs.getInt("mPuestos"));
                usr.setmDepartamentos(rs.getInt("mDepartamentos"));
                usr.setmGranjas(rs.getInt("mGranjas"));
                usr.setmParvadas(rs.getInt("mParvadas"));
               
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        
        
        return usr;
    }
    public List<DaoUsuario> listaUsuarios(){
        List<DaoUsuario> lista = new ArrayList<>();
         Connection conn = Conex.getConnection();
        try {
            Statement stm =  conn.createStatement();
            ResultSet rs = stm.executeQuery("select * from usuarios");
            DaoUsuario user ;
            while(rs.next()){
                user = new DaoUsuario();
                user.setIdusuario(rs.getInt("idusuario"));
                user.setClave( rs.getString("clave"));
                user.setNombre(rs.getString("nombre"));
                user.setAppat( rs.getString("appaterno"));
                user.setApmat(rs.getString("apmaterno"));
                lista.add(user);
            }
            rs.close();
            stm.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        return lista;
    }
}
