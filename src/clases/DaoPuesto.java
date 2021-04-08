/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DaoPuesto extends Puesto {
    
    public boolean insertaPuesto(Puesto puesto){
        boolean res = false;
        Connection conn = Conex.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement("insert into puestos(nombre,departamento,actividades) values(?,?,?)");
            pstm.setString(1, puesto.getNombre());
            pstm.setInt(2, puesto.getDepartamento());
            pstm.setString(3, puesto.getActividades());
            pstm.executeUpdate();
            res = true;
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        
        return res;
    }
    public List<Puesto> obtenerPuestos(){
        List<Puesto> lista = new ArrayList<>();
        
        Connection conn = Conex.getConnection();
        PreparedStatement pstm;
        try {
            pstm = conn.prepareStatement("select * from puestos where 1");
             ResultSet rs = pstm.executeQuery();
             Puesto puesto = null;
             while(rs.next()){
                 puesto = new Puesto();
                 puesto.setId(rs.getInt("id"));
                 puesto.setNombre(rs.getString("nombre"));
                 puesto.setDepartamento(rs.getInt("departamento"));
                 puesto.setActividades(rs.getString("actividades"));
                 lista.add(puesto);
             }
             pstm.close();
             conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoPuesto.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return lista;
        
    }
}
