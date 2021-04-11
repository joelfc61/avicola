/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pantallas;

import clases.ComboItem;
import clases.Conex;
import clases.DaoPuesto;
import clases.DaoUsuario;
import clases.Datos;
import clases.Hash;
import clases.Puesto;
import clases.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joelfc
 */
public class FrmUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form frmUsuarios
     */
    public FrmUsuarios() {
        initComponents();
        cargaTabla();
        cargaCombo();
    }
private void cargaCombo(){
    ComboItem item = null;
    DaoPuesto dp = new DaoPuesto();
    List<Puesto> lista =  dp.obtenerPuestos();
    for(Puesto p : lista){
        item = new ComboItem(p.getId(), p.getNombre());
        cmbPuestos.addItem(item);
    }
}
    private void cargaTabla(){
        Object[]  columns ={"Id","Clave","Nombre","A. Paterno","A. Materno"};
        DefaultTableModel dtm = new DefaultTableModel(columns,0);
        List<DaoUsuario> milista = new ArrayList<DaoUsuario>();
        DaoUsuario du = new DaoUsuario();
        milista =(List<DaoUsuario>) du.listaUsuarios();
        Object[] fila = new Object[5];
        for(DaoUsuario midu: milista){
            fila[0] = midu.getIdusuario();
            fila[1] = midu.getClave();
            fila[2] = midu.getNombre();
            fila[3] = midu.getAppat();
            fila[4] = midu.getApmat();
            dtm.addRow(fila);
        }
        tblUsuarios.setModel(dtm);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApPaterno = new javax.swing.JTextField();
        txtApMaterno = new javax.swing.JTextField();
        chkProveedores = new javax.swing.JCheckBox();
        chkClientes = new javax.swing.JCheckBox();
        chkProduccion = new javax.swing.JCheckBox();
        chkVentas = new javax.swing.JCheckBox();
        chkParametros = new javax.swing.JCheckBox();
        chkGastos = new javax.swing.JCheckBox();
        btnAgregar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnResetPwd = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        chkPuestos = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        chkUsuarios = new javax.swing.JCheckBox();
        chkCompras = new javax.swing.JCheckBox();
        chkDepartamentos = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDepartamento = new javax.swing.JTextField();
        txtPuesto = new javax.swing.JTextField();
        chkParvadas = new javax.swing.JCheckBox();
        chkGranjas = new javax.swing.JCheckBox();
        lblId = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmbPuestos = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Clave");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, 30));

        txtClave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 171, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Ap. Paterno");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Ap. Materno");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, 30));

        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 171, 30));

        txtApPaterno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtApPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 171, 30));

        txtApMaterno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtApMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 168, 30));

        chkProveedores.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkProveedores.setText("Proveedores");
        getContentPane().add(chkProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        chkClientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkClientes.setText("Clientes");
        getContentPane().add(chkClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, -1));

        chkProduccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkProduccion.setText("Produccion");
        getContentPane().add(chkProduccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, -1, -1));

        chkVentas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkVentas.setText("Ventas");
        getContentPane().add(chkVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, -1));

        chkParametros.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkParametros.setText("Parámetros");
        getContentPane().add(chkParametros, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, -1, -1));

        chkGastos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkGastos.setText("Gastos");
        getContentPane().add(chkGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, -1, -1));

        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, -1, 41));

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, 72, 42));

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, -1, 41));

        btnResetPwd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnResetPwd.setText("Reset Pwd");
        btnResetPwd.setEnabled(false);
        btnResetPwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetPwdActionPerformed(evt);
            }
        });
        getContentPane().add(btnResetPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, -1, 41));

        btnModificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, -1, 41));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Control de Usuarios");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, -1, -1));

        chkPuestos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkPuestos.setText("Puestos");
        getContentPane().add(chkPuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Asignar Acceso a   Módulos  ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuariosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblUsuarios);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 470, 200));

        chkUsuarios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkUsuarios.setText("Usuarios");
        getContentPane().add(chkUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, -1));

        chkCompras.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkCompras.setText("Compras");
        getContentPane().add(chkCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        chkDepartamentos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkDepartamentos.setText("Departamentos");
        getContentPane().add(chkDepartamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Departamento");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Puesto");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        txtDepartamento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 170, 30));

        txtPuesto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 170, 30));

        chkParvadas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkParvadas.setText("Parvadas");
        getContentPane().add(chkParvadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, -1, -1));

        chkGranjas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkGranjas.setText("Granjas");
        getContentPane().add(chkGranjas, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, -1, -1));

        lblId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 30, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("ID");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 20, -1));

        getContentPane().add(cmbPuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 230, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
       DaoUsuario du = new DaoUsuario();
       du.setClave(txtClave.getText());
       du.setPassword(Hash.sha1(txtClave.getText()+"Pwd"));
       du.setNombre(txtNombre.getText());
       du.setAppat(txtApPaterno.getText());
       du.setApmat(txtApMaterno.getText());
       du.setActivo(1);
       du.setCambioPwd(0);
       du.setDepartamento( Integer.parseInt(txtDepartamento.getText()));
       du.setPuesto(Integer.parseInt(txtPuesto.getText()));
       
       du.setmClientes(chkClientes.isSelected()?1:0);
       du.setmCompras(chkCompras.isSelected()?1:0);
       du.setmGastos(chkGastos.isSelected()?1:0);
       du.setmParametros(chkParametros.isSelected()?1:0);
       du.setmProduccion(chkProduccion.isSelected()?1:0);
       du.setmProveedores(chkProveedores.isSelected()?1:0);
       du.setmUsuarios(chkUsuarios.isSelected()?1:0);
       du.setmVentas(chkVentas.isSelected()?1:0);
       du.setmPuestos(chkPuestos.isSelected()?1:0);
       du.setmDepartamentos(chkDepartamentos.isSelected()?1:0);
       du.setmGranjas(chkGranjas.isSelected()?1:0);
       du.setmParvadas(chkParvadas.isSelected()?1:0);
       
       du.agregar();
       JOptionPane.showMessageDialog(this, "Usuario Agregado exitosamente");
       limpiar();
       cargaTabla();
    }//GEN-LAST:event_btnAgregarActionPerformed
private void limpiar(){
    lblId.setText("");
    txtClave.setText("");
    txtNombre.setText("");
    txtApPaterno.setText("");
    txtApMaterno.setText("");
    txtDepartamento.setText("");
    txtPuesto.setText("");
    chkClientes.setSelected(false);
    chkCompras.setSelected(false);
    chkDepartamentos.setSelected(false);
    chkGastos.setSelected(false);
    chkGranjas.setSelected(false);
    chkParametros.setSelected(false);
    chkParvadas.setSelected(false);
    chkProduccion.setSelected(false);
    chkProveedores.setSelected(false);
    chkPuestos.setSelected(false);
    chkUsuarios.setSelected(false);
    chkVentas.setSelected(false);
    btnEliminar.setEnabled(false);
    btnModificar.setEnabled(false);
    txtClave.requestFocus();
    btnEliminar.setEnabled(false);
    btnModificar.setEnabled(false);
    btnResetPwd.setEnabled(false);
}
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
      
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void tblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMouseClicked
        // TODO add your handling code here:
        int renglon = tblUsuarios.getSelectedRow();
        lblId.setText(tblUsuarios.getValueAt(renglon, 0).toString());
        txtClave.setText(tblUsuarios.getValueAt(renglon, 1).toString());
        txtNombre.setText(tblUsuarios.getValueAt(renglon, 2).toString());
        txtApMaterno.setText(tblUsuarios.getValueAt(renglon, 3).toString());
        txtApPaterno.setText(tblUsuarios.getValueAt(renglon, 4).toString());
        DaoUsuario du = new DaoUsuario();
        int ID =  Integer.parseInt(lblId.getText());
        du.setIdusuario(ID);
        Usuario usuario = du.buscaUsuario();
        usuario.setIdusuario(ID);
        du.buscaUsuario();
        chkProduccion.setSelected((usuario.getmProduccion() == 1)? true:  false);
        chkProveedores.setSelected((usuario.getmProveedores()== 1)? true:  false);
        chkGastos.setSelected((usuario.getmGastos()== 1)? true:  false);
        chkVentas.setSelected((usuario.getmVentas()== 1)? true:  false);
        chkUsuarios.setSelected((usuario.getmUsuarios()== 1)? true:  false);
        chkClientes.setSelected((usuario.getmClientes()== 1)? true:  false);
        chkCompras.setSelected((usuario.getmCompras()== 1)? true:  false);
        chkParametros.setSelected((usuario.getmParametros()== 1)? true:  false);
        chkPuestos.setSelected((usuario.getmPuestos()== 1)? true:  false);
        chkDepartamentos.setSelected((usuario.getmDepartamentos()== 1)? true:  false);
        chkParvadas.setSelected((usuario.getmParvadas()== 1)? true:  false);
        chkGranjas.setSelected((usuario.getmGranjas()== 1)? true:  false);
        
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnResetPwd.setEnabled(true);
    }//GEN-LAST:event_tblUsuariosMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnResetPwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetPwdActionPerformed
        // TODO add your handling code here:
        Connection conn = Conex.getConnection();
        int id = Integer.parseInt(lblId.getText());
        String cve = txtClave.getText();
        String nvoPwd = Hash.sha1(cve+"Pwd");
        try {
            PreparedStatement pstm = conn.prepareStatement("update usuarios set passwprd = ? where idusuario=? ");
            pstm.setString(1, nvoPwd);
            pstm.setInt(2, id);
            pstm.executeUpdate();
            JOptionPane.showMessageDialog(this, "El password ha sido reseteado");
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        dispose();
        
    }//GEN-LAST:event_btnResetPwdActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnResetPwd;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox chkClientes;
    private javax.swing.JCheckBox chkCompras;
    private javax.swing.JCheckBox chkDepartamentos;
    private javax.swing.JCheckBox chkGastos;
    private javax.swing.JCheckBox chkGranjas;
    private javax.swing.JCheckBox chkParametros;
    private javax.swing.JCheckBox chkParvadas;
    private javax.swing.JCheckBox chkProduccion;
    private javax.swing.JCheckBox chkProveedores;
    private javax.swing.JCheckBox chkPuestos;
    private javax.swing.JCheckBox chkUsuarios;
    private javax.swing.JCheckBox chkVentas;
    private javax.swing.JComboBox<ComboItem> cmbPuestos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblId;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtApMaterno;
    private javax.swing.JTextField txtApPaterno;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtDepartamento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPuesto;
    // End of variables declaration//GEN-END:variables
}
