
package Pantallas;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class FrmProduccion extends javax.swing.JFrame {
    String[] cols = {"Hora","Cant", "Categoria","Calidad","Subtotal"};
   
    private DefaultTableModel dtm  = new DefaultTableModel(cols, 0);
    
    public FrmProduccion() {
        initComponents();
        cargaDatos();
        tblDetalleRecoleccion.setModel(dtm);
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbEmpaque = new javax.swing.JComboBox<>();
        txtNum = new javax.swing.JTextField();
        cmbCategoria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalleRecoleccion = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNumAves = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMotalidad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lblPorcProd = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtTotalNumHuevos = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtKg = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Recolección Diaria");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 11, -1, -1));

        jLabel2.setText("Fecha");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 51, -1, -1));

        txtFecha.setEditable(false);
        txtFecha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(0, 0, 255));
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 48, 93, -1));

        jLabel3.setText("Num");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 89, -1, -1));

        cmbEmpaque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cajas(360)", "Conos(30)", "Dieciochera", "Docenera", "Unidad" }));
        cmbEmpaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEmpaqueActionPerformed(evt);
            }
        });
        getContentPane().add(cmbEmpaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 86, 119, -1));

        txtNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNumKeyReleased(evt);
            }
        });
        getContentPane().add(txtNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 86, 47, -1));

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primera", "Segunda", "Blandos", "Sucios", "Rotos", "DobleYema", "Jumbo", " " }));
        getContentPane().add(cmbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 86, 173, -1));

        tblDetalleRecoleccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblDetalleRecoleccion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 128, 730, 95));

        jLabel4.setText("Subtotal");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 89, -1, -1));

        lblSubtotal.setBackground(new java.awt.Color(153, 204, 255));
        lblSubtotal.setToolTipText("");
        lblSubtotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblSubtotal.setOpaque(true);
        getContentPane().add(lblSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 86, 45, 20));

        btnAgregar.setText("Agregar");
        btnAgregar.setEnabled(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, -1, -1));

        jLabel6.setText("Total del día");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 237, -1, -1));

        jLabel7.setText("Num .Aves");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 275, -1, -1));

        txtNumAves.setBackground(new java.awt.Color(51, 153, 255));
        txtNumAves.setForeground(new java.awt.Color(255, 255, 255));
        txtNumAves.setText("123,000");
        txtNumAves.setToolTipText("");
        txtNumAves.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNumAves.setOpaque(true);
        getContentPane().add(txtNumAves, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 272, 58, 20));

        jLabel9.setText("Mortalidad");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 275, -1, -1));
        getContentPane().add(txtMotalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 272, 71, -1));

        jLabel10.setText("Porc. Prod. (huevos/aves)");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 275, -1, -1));

        lblPorcProd.setBackground(new java.awt.Color(0, 153, 204));
        lblPorcProd.setForeground(new java.awt.Color(255, 255, 255));
        lblPorcProd.setText("89%");
        lblPorcProd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblPorcProd.setOpaque(true);
        getContentPane().add(lblPorcProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 272, 50, 20));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 319, 68, 31));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 319, -1, 31));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 319, -1, 31));

        jLabel12.setText("Num. Huevos:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 237, -1, -1));

        txtTotalNumHuevos.setEditable(false);
        getContentPane().add(txtTotalNumHuevos, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 71, 30));

        jLabel13.setText("Kgs");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 237, -1, -1));
        getContentPane().add(txtKg, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 234, 74, -1));

        jLabel14.setText("Categoria");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 66, -1, -1));

        jLabel15.setText("Empaque");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 66, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
  private int total =0;
    private void txtNumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumKeyReleased
        // TODO add your handling code here:
        int subtotal=0;
       try{
        int x = Integer.parseInt(txtNum.getText());
       int empaque = cmbEmpaque.getSelectedIndex();
       
       switch(empaque){
           case 0: //cajas 360
             subtotal = x * 360; break;  
           case 1: //Cono 30
               subtotal = x * 30; break;
           case 2: //Dieciochera
               subtotal = x * 18; break;
           case 3: //Docenera
               subtotal = x * 12; break;
           case 4: //unidad
              subtotal = x ; break; 
               
       }
       lblSubtotal.setText(String.valueOf(subtotal));
       btnAgregar.setEnabled(true);
       } catch(Exception e){
           JOptionPane.showMessageDialog(this, "Error, introduzca numero" + e.getMessage());
       }
        
    }//GEN-LAST:event_txtNumKeyReleased

    private void cmbEmpaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEmpaqueActionPerformed
        // TODO add your handling code here:
        int x;
        try{
         x = Integer.parseInt(txtNum.getText());
        }catch(Exception e){
         x =0;
        }
        int opcion = cmbEmpaque.getSelectedIndex();
        int subtotal= 0; 
        switch (opcion){
            case 0: subtotal = x * 360; break;
            case 1: subtotal = x * 30; break;
            case 2: subtotal = x * 18; break;
            case 3: subtotal = x * 12; break;
            case 4: subtotal = x ; break;
           
        }
        lblSubtotal.setText(String.valueOf(subtotal));
        btnAgregar.setEnabled(true);
    }//GEN-LAST:event_cmbEmpaqueActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // Agegar a la tabla y recalcular el Total
          Object[] datos = new Object[5];
          datos[0] = new String("13:09:55");
          datos[1] = txtNum.getText();
          datos[2] = cmbEmpaque.getSelectedItem();
          datos[3] = cmbCategoria.getSelectedItem();
          datos[4] = lblSubtotal.getText();
          dtm.addRow(datos); 
          total+= Integer.parseInt(lblSubtotal.getText());
          txtTotalNumHuevos.setText(String.valueOf(total));
          lblSubtotal.setText("");
          cmbCategoria.setSelectedIndex(0);
          cmbEmpaque.setSelectedIndex(0);
          txtNum.setText("");
          btnAgregar.setEnabled(false);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        //Eliminar los datos de la pantalla, incluso los de la tabla
    }//GEN-LAST:event_btnCancelarActionPerformed

       private void cargaDatos(){
           Date fecha = new Date();
           Calendar cal = Calendar.getInstance();
           cal.setTime(fecha);
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
           String dato = sdf.format(cal.getTime());
           txtFecha.setText(dato);
          
       }
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
            java.util.logging.Logger.getLogger(FrmProduccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProduccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProduccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProduccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmProduccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JComboBox<String> cmbEmpaque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPorcProd;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JTable tblDetalleRecoleccion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtKg;
    private javax.swing.JTextField txtMotalidad;
    private javax.swing.JTextField txtNum;
    private javax.swing.JLabel txtNumAves;
    private javax.swing.JTextField txtTotalNumHuevos;
    // End of variables declaration//GEN-END:variables
}
