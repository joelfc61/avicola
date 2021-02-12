/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joelfc
 */
public class DaoUsuario extends Usuario{

    public DaoUsuario(String clave, String password, String nombre, String appat, String apmat, int mPacientes, int mFarmacia, int mBenefactores, int mCtrlEnf, int mInventario, int mPersMed) {
        super(clave, password, nombre, appat, apmat, mPacientes, mFarmacia, mBenefactores, mCtrlEnf, mInventario, mPersMed);
    }

    public DaoUsuario() {
     super();
    }
    
    public boolean agregar(){
        Connection cone = Conex.getConnection();
        boolean res = false;
        try {
            CallableStatement cstm = cone.prepareCall("{call insuser(?,?,?,?,?,?,?,?,?,?,?)}");
            cstm.setString(1,this.getClave());
            cstm.setString(2,this.getPassword());
            cstm.setString(3,this.getNombre());
            cstm.setString(4,this.getAppat());
            cstm.setString(5,this.getApmat());
            cstm.setInt(6,this.getmPacientes());
            cstm.setInt(7,this.getmFarmacia());
            cstm.setInt(8,this.getmCtrlEnf());
            cstm.setInt(9,this.getmBenefactores());
            cstm.setInt(10,this.getmInventario());
            cstm.setInt(11,this.getmPersMed());
            res= cstm.execute();
                                    
        } catch (SQLException ex) {
            Logger.getLogger(DaoUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return res;
    }
}
