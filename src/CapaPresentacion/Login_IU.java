/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

import CapaDatos.Asistencia;
import CapaDatos.Turno;
import CapaDatos.Usuario;
import CapaNegocio.AsistenciaBD;
import CapaNegocio.TurnoBD;
import CapaNegocio.UsuarioBD;
import java.awt.Color;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author labor
 */
public class Login_IU extends javax.swing.JFrame {

    public static String dni_publico;
    public static String usuario;
    public static String tienda;
    public static int idasistencia;

    /**
     * Creates new form Login_IU
     */
    public Login_IU() {
        initComponents();
        setLocationRelativeTo(null);

    }

    private String obtener_Fecha_actual() {
        Calendar calendario = Calendar.getInstance();
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int mes = calendario.get(Calendar.MONTH) + 1;
        int anio = calendario.get(Calendar.YEAR);
        String fecha = anio + "_" + mes + "_" + dia;
        return fecha;
    }

    private String obtener_hora() {
        Calendar calendario = Calendar.getInstance();
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        int minutos = calendario.get(Calendar.MINUTE);
        int segundos = calendario.get(Calendar.SECOND);
        String tiempo = hora + ":" + minutos + ":" + segundos;
        return tiempo;
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        txtClave = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setBackground(new java.awt.Color(102, 255, 102));

        jLabel1.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("¡¡BIENVENIDOS!!");

        jLabel2.setText("DNI");

        txtDni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDniFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDniFocusLost(evt);
            }
        });
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDniKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        txtClave.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtClaveFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtClaveFocusLost(evt);
            }
        });
        txtClave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtClaveKeyPressed(evt);
            }
        });

        jLabel3.setText("CLAVE");

        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/llavvvv.png"))); // NOI18N
        btnIngresar.setText("INGRESAR");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrrarr.jpg"))); // NOI18N
        btnCerrar.setText("CERRAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnIngresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                        .addComponent(btnCerrar))
                    .addComponent(txtDni)
                    .addComponent(txtClave))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar)
                    .addComponent(btnCerrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:

        if (txtDni.getText().length() > 0) {
            if (txtClave.getText().length() > 0) {

                String dni = txtDni.getText().trim();
                String clave = txtClave.getText();
                UsuarioBD oUsuarioBD = new UsuarioBD();
                List<Usuario> lista_usuario = oUsuarioBD.login(dni, clave);

                if (lista_usuario.size() > 0) {

                    String nombre = lista_usuario.get(0).getuNombre();
                    String apellidos = lista_usuario.get(0).getuApellidos();
                    tienda = lista_usuario.get(0).getTienda();
                    dni_publico = dni;
                    usuario = nombre + " " + apellidos;

                    TurnoBD oTurnoBD = new TurnoBD();
                    String hora_actual = obtener_Fecha_actual();
                    List<Turno> lista_turno = oTurnoBD.buscarTurno(hora_actual, hora_actual, dni);

                    if (lista_turno.size() > 0) {

                        Menu oMenu = new Menu();
                        String fecha = obtener_Fecha_actual();
                        String hora = obtener_hora();
                        Asistencia oAsistencia = new Asistencia();
                        AsistenciaBD oAsistenciaBD = new AsistenciaBD();

                        int tipo = lista_usuario.get(0).getuTipo();
                        if (tipo == 9) {
                            oMenu.menu_mantenimiento.setEnabled(true);
                            oMenu.menu_compras.setEnabled(true);
                            oMenu.menu_inventario.setEnabled(true);
                            oMenu.btnProductos.setEnabled(true);
                            oMenu.btnCompras.setEnabled(true);
                            oMenu.btnCerrar.setEnabled(true);

                            oMenu.setVisible(true);
                            oMenu.setTitle("TIENDA: " + tienda + "- USUARIO: " + usuario);
                            this.setVisible(false);
                        }
                        if (tipo == 10) {
                            oMenu.menu_ventas.setEnabled(true);
                            oMenu.menu_caja.setEnabled(true);
                            oMenu.btnIngresos.setEnabled(true);
                            oMenu.btnCaja.setEnabled(true);
                            oMenu.btnVentas.setEnabled(true);
                            oMenu.btnCerrar.setEnabled(true);
                            oMenu.btnEgresos.setEnabled(true);

                            List<Asistencia> lista = oAsistenciaBD.buscarAsistenciaUsuario(dni, tienda, fecha);

                            if (lista.size() > 0) {
                                String estado = lista.get(0).getaEstado();
                                if (estado.equals("CERRADO")) {
                                    advertencia("YA NO PUEDES INGRESAR AL SISTEMA POR QUE YA CERRASTE TU CAJA");

                                } else {
                                    idasistencia = lista.get(0).getIdasistencia();
                                    oMenu.setVisible(true);
                                    oMenu.setTitle("TIENDA: " + tienda + "- USUARIO: " + usuario);
                                }
                            } else {
                                oAsistencia.setaFechaE(fecha);
                                oAsistencia.setaHoraE(hora);
                                oAsistencia.setaHoraS("00:00:00");
                                oAsistencia.setuDni(dni);
                                oAsistencia.setaTurno("");
                                oAsistencia.setaEstado("ABIERTO");
                                oAsistencia.setaTienda(tienda);
                                idasistencia = oAsistenciaBD.registrarAsistencia(oAsistencia);
                                oMenu.setVisible(true);
                                oMenu.setTitle("TIENDA: " + tienda + "- USUARIO: " + usuario);

                                this.setVisible(false);
                            }
                        }

                    } else {
                        advertencia("NO PUEDES INGRESAR AL SISTEMA, POR QUE NO ES TU TURNO");
                    }
                } else {
                    error("NO PERTENECES AL SISTEMA");
                }

            } else {
                advertencia("INGRESE SU CLAVE");
                txtClave.requestFocus();
            }
        } else {
            advertencia("INGRESE DNI");
            txtDni.requestFocus();
        }

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtClaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btnIngresar.requestFocus();
            btnIngresar.doClick();
        }
    }//GEN-LAST:event_txtClaveKeyPressed

    private void txtClaveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtClaveFocusLost
        // TODO add your handling code here:
        txtClave.setBackground(Color.white);
    }//GEN-LAST:event_txtClaveFocusLost

    private void txtClaveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtClaveFocusGained
        // TODO add your handling code here:
        txtClave.setBackground(Color.pink);
    }//GEN-LAST:event_txtClaveFocusGained

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || txtDni.getText().length() >= 8) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            txtClave.requestFocus();
        }
    }//GEN-LAST:event_txtDniKeyPressed

    private void txtDniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDniFocusLost
        // TODO add your handling code here:
        txtDni.setBackground(Color.white);
    }//GEN-LAST:event_txtDniFocusLost

    private void txtDniFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDniFocusGained
        // TODO add your handling code here:
        txtDni.setBackground(Color.pink);
    }//GEN-LAST:event_txtDniFocusGained

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
            java.util.logging.Logger.getLogger(Login_IU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_IU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_IU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_IU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_IU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtDni;
    // End of variables declaration//GEN-END:variables
}
