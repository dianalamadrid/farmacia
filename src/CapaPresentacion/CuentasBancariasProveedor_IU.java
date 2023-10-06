/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

import CapaDatos.DetalleCuentasBancarias;
import CapaNegocio.DetalleCuentasBancariasBD;
import CapaNegocio.ProveedorBD;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author labor
 */
public class CuentasBancariasProveedor_IU extends javax.swing.JInternalFrame {
    
    DefaultTableModel tabla_temporal_detalle_cuenta, tabla_temporal_proveedor;
    int idcuentas;

    /**
     * Creates new form CuentasBancariasProveedor_IU
     */
    public CuentasBancariasProveedor_IU() {
        initComponents();
        
    }
    
    private void limpiar_tabla_formulario() {
        tabla_temporal_detalle_cuenta = (DefaultTableModel) tabla_reporte_cuentas_bancarias.getModel();
        tabla_temporal_detalle_cuenta.setRowCount(0);
    }
    
    private void exito(String mensaje) {
        JOptionPane.showConfirmDialog(this, mensaje, "MENSAJE", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void error(String mensaje) {
        JOptionPane.showConfirmDialog(this, mensaje, "ERROR", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
    }
    
    private void advertencia(String mensaje) {
        JOptionPane.showConfirmDialog(this, mensaje, "ADVERTENCIA", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
    }
    
    private void limpiar() {
        txtRuc.setText("");
        txtRazonSocial.setText("");
        txtBanco.setText("");
        txtCuenta.setText("");
        txtNroCuenta.setText("");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtRuc = new javax.swing.JTextField();
        txtRazonSocial = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtCuenta = new javax.swing.JTextField();
        txtNroCuenta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBanco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_reporte_cuentas_bancarias = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("CUENTAS BANCARIAS DEL PROVEEDOR");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Proveedor"));

        jLabel1.setText("RUC");

        txtRazonSocial.setEnabled(false);

        jLabel2.setText("RAZON SOCIAL");

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtRazonSocial))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("CUENTA");

        jLabel4.setText("NRO CUENTA");

        jLabel5.setText("BANCO");

        tabla_reporte_cuentas_bancarias.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla_reporte_cuentas_bancarias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla_reporte_cuentas_bancariasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_reporte_cuentas_bancarias);

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        txtCantidad.setEnabled(false);

        jLabel6.setText("CANTIDAD");

        btnCerrar.setText("CERRAR");

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtNroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCerrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btnCerrar)
                    .addComponent(btnEliminar))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:

        if (txtRuc.getText().length() > 0) {
            
            DetalleCuentasBancariasBD oCuentasBancariasBD = new DetalleCuentasBancariasBD();
            ProveedorBD oProveedorBD = new ProveedorBD();
            
            tabla_temporal_proveedor = oProveedorBD.buscarProveedor(txtRuc.getText().trim());
            
            if (tabla_temporal_proveedor.getRowCount() > 0) {
                
                txtRazonSocial.setText(tabla_temporal_proveedor.getValueAt(0, 1).toString());
                tabla_temporal_detalle_cuenta = oCuentasBancariasBD.buscarDetallesCuentasBancarias(txtRuc.getText().trim());
                tabla_reporte_cuentas_bancarias.setModel(tabla_temporal_detalle_cuenta);
                
            } else {
                error("No se encontro al proveedor, tienes que registrarlo primero....");
                txtRuc.requestFocus();
                txtRuc.setText("");
                txtRazonSocial.setText("");
                tabla_temporal_detalle_cuenta = oCuentasBancariasBD.buscarDetallesCuentasBancarias(txtRuc.getText().trim());
                tabla_reporte_cuentas_bancarias.setModel(tabla_temporal_detalle_cuenta);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese el ruc para buscar al proveedor");
            txtRuc.requestFocus();
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:

        if (txtBanco.getText().length() > 0) {
            if (txtNroCuenta.getText().length() > 0) {
                if (txtCuenta.getText().length() > 0) {
                    
                    DetalleCuentasBancarias oDetalleCuentasBancarias = new DetalleCuentasBancarias();
                    DetalleCuentasBancariasBD oDetalleCuentasBancariasBD = new DetalleCuentasBancariasBD();
                    
                    oDetalleCuentasBancarias.setBanco(txtBanco.getText().toUpperCase().trim());
                    oDetalleCuentasBancarias.setNroCuenta(txtNroCuenta.getText().toUpperCase().trim());
                    oDetalleCuentasBancarias.setCuenta(txtCuenta.getText().toUpperCase().trim());
                    oDetalleCuentasBancarias.setProvRuc(txtRuc.getText().trim());
                    
                    boolean rpta = oDetalleCuentasBancariasBD.registrarDetallesCuentasBancarias(oDetalleCuentasBancarias);
                    if (rpta) {
                        exito("Todo OK...");
                        DefaultTableModel tabla_temporal;
                        DetalleCuentasBancariasBD oCuentasBancariasBD = new DetalleCuentasBancariasBD();
                        tabla_temporal = oCuentasBancariasBD.buscarDetallesCuentasBancarias(txtRuc.getText().trim());
                        tabla_reporte_cuentas_bancarias.setModel(tabla_temporal);
                        limpiar();
                        
                    } else {
                        error("Tienes problemas al registrar....");
                    }
                    
                } else {
                    error("Ingrese la cuenta");
                    txtCuenta.requestFocus();
                }
            } else {
                error("Ingrese el numero de cuenta");
                txtNroCuenta.requestFocus();
            }
        } else {
            error("Ingrese el nombre del banco");
            txtBanco.requestFocus();
        }

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void tabla_reporte_cuentas_bancariasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_reporte_cuentas_bancariasMousePressed
        // TODO add your handling code here:
        int fila_seleccionada=tabla_reporte_cuentas_bancarias.getSelectedRow();
        idcuentas=Integer.parseInt(tabla_reporte_cuentas_bancarias.getValueAt(fila_seleccionada, 0).toString());
    }//GEN-LAST:event_tabla_reporte_cuentas_bancariasMousePressed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        
        int aviso=JOptionPane.showConfirmDialog(rootPane, "Estas seguro de eliminar");
        if (aviso==0) {
            
            DetalleCuentasBancariasBD oDetalleCuentasBancariasBD=new DetalleCuentasBancariasBD();
            boolean rpta=oDetalleCuentasBancariasBD.eliminarDetallesCuentasBancarias(idcuentas);
            if (rpta) {
                exito("Todo OK");
                limpiar();
                limpiar_tabla_formulario();
                
            } else {
                error("Tiene problemas para eliminar");
            }
            
            
        }
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_reporte_cuentas_bancarias;
    private javax.swing.JTextField txtBanco;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCuenta;
    private javax.swing.JTextField txtNroCuenta;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtRuc;
    // End of variables declaration//GEN-END:variables
}
