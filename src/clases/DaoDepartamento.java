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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class DaoDepartamento extends Departamento {
    
    public boolean insertaDepartamento(Departamento dept){
        Connection conex = Conex.getConnection();
        boolean resultado = false;
        try {
            PreparedStatement pstm = conex.prepareStatement("insert into departamentos(nombre,responsable) values(?,?)");
            pstm.setString(1, dept.getNombre());
            pstm.setString(2, dept.getResponsable());
            int res = pstm.executeUpdate();
            if(res == 1){
                resultado = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoDepartamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    public List<Departamento> obtenDepartamentos(){
        
        
        List<Departamento> lista = new ArrayList();
        Connection conn= Conex.getConnection();
        try {
            Statement  stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("select * from departamentos");
            Departamento dep = null;
            while(rs.next()){
                dep = new Departamento();
                dep.setId(rs.getInt("id"));
                dep.setNombre(rs.getString("nombre"));
                dep.setResponsable(rs.getString("responsable"));
                lista.add(dep);
            }
            rs.close();
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(DaoDepartamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lista;
        
    }
    
    public Departamento buscaDepartamento(int elid){
        Departamento dep = new Departamento();
        Connection conn = Conex.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement("select * from departamentos where id = ?");
            pstm.setInt(1, elid);
            ResultSet rs = pstm.executeQuery();
            while(rs.next()){
                dep.setNombre(rs.getString("nombre"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoDepartamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dep;
    }
    public boolean modifica(Departamento dep){
        boolean res = false;
        Connection conn = Conex.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement("update departamentos set nombre = ?, responsable = ? where id = ?");
            pstm.setInt(3, dep.getId());
            pstm.setString(1, dep.getNombre());
            pstm.setString(2, dep.getResponsable());
            pstm.executeUpdate();
            res = true;
          
        } catch (SQLException ex) {
            Logger.getLogger(DaoDepartamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return res;
    }
}
