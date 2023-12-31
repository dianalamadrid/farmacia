/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CapaPresentacion;

import java.awt.Dimension;

/**
 *
 * @author labor
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        btnProductos = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnCompras = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnIngresos = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnEgresos = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnVentas = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnCaja = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnCerrar = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_mantenimiento = new javax.swing.JMenu();
        menu_item_tipoUsuario = new javax.swing.JMenuItem();
        menu_item_usuario = new javax.swing.JMenuItem();
        menu_item_turno = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        menu_item_marca = new javax.swing.JMenuItem();
        menu_item_categoria = new javax.swing.JMenuItem();
        menu_item_medida = new javax.swing.JMenuItem();
        menu_item_producto = new javax.swing.JMenuItem();
        menu_item_composicion = new javax.swing.JMenuItem();
        menu_item_proveedor = new javax.swing.JMenuItem();
        menu_item_cuentas_bancarias = new javax.swing.JMenuItem();
        menu_compras = new javax.swing.JMenu();
        menu_item_compras = new javax.swing.JMenuItem();
        menu_item_reporte_compra_varios = new javax.swing.JMenuItem();
        menu_inventario = new javax.swing.JMenu();
        menu_ventas = new javax.swing.JMenu();
        menu_caja = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        jToolBar1.setRollover(true);
        jToolBar1.add(jSeparator8);

        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cajita.jpg"))); // NOI18N
        btnProductos.setEnabled(false);
        btnProductos.setFocusable(false);
        btnProductos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProductos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnProductos);
        jToolBar1.add(jSeparator1);

        btnCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lista.jpg"))); // NOI18N
        btnCompras.setEnabled(false);
        btnCompras.setFocusable(false);
        btnCompras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCompras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnCompras);
        jToolBar1.add(jSeparator2);

        btnIngresos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ingresos.png"))); // NOI18N
        btnIngresos.setEnabled(false);
        btnIngresos.setFocusable(false);
        btnIngresos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIngresos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnIngresos);
        jToolBar1.add(jSeparator3);

        btnEgresos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/egresos.png"))); // NOI18N
        btnEgresos.setEnabled(false);
        btnEgresos.setFocusable(false);
        btnEgresos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEgresos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnEgresos);
        jToolBar1.add(jSeparator4);

        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/compra_carrito.jpg"))); // NOI18N
        btnVentas.setEnabled(false);
        btnVentas.setFocusable(false);
        btnVentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVentas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnVentas);
        jToolBar1.add(jSeparator5);

        btnCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cajaa.jpg"))); // NOI18N
        btnCaja.setEnabled(false);
        btnCaja.setFocusable(false);
        btnCaja.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCaja.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnCaja);
        jToolBar1.add(jSeparator6);

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrrarr.jpg"))); // NOI18N
        btnCerrar.setFocusable(false);
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnCerrar);
        jToolBar1.add(jSeparator7);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
        );

        menu_mantenimiento.setText("MANTENIMIENTO");
        menu_mantenimiento.setEnabled(false);

        menu_item_tipoUsuario.setText("Tipo de Usuarios");
        menu_item_tipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_tipoUsuarioActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(menu_item_tipoUsuario);

        menu_item_usuario.setText("Usuario");
        menu_item_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_usuarioActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(menu_item_usuario);

        menu_item_turno.setText("Turno");
        menu_item_turno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_turnoActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(menu_item_turno);
        menu_mantenimiento.add(jSeparator9);

        menu_item_marca.setText("Laboratorio");
        menu_item_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_marcaActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(menu_item_marca);

        menu_item_categoria.setText("Categoria");
        menu_item_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_categoriaActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(menu_item_categoria);

        menu_item_medida.setText("Medida");
        menu_item_medida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_medidaActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(menu_item_medida);

        menu_item_producto.setText("Producto");
        menu_item_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_productoActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(menu_item_producto);

        menu_item_composicion.setText("Composicion");
        menu_item_composicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_composicionActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(menu_item_composicion);

        menu_item_proveedor.setText("Proveedor");
        menu_item_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_proveedorActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(menu_item_proveedor);

        menu_item_cuentas_bancarias.setText("Cuentas Bancarias");
        menu_item_cuentas_bancarias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_cuentas_bancariasActionPerformed(evt);
            }
        });
        menu_mantenimiento.add(menu_item_cuentas_bancarias);

        jMenuBar1.add(menu_mantenimiento);

        menu_compras.setText("COMPRAS");
        menu_compras.setEnabled(false);

        menu_item_compras.setText("Realizar Compras");
        menu_item_compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_comprasActionPerformed(evt);
            }
        });
        menu_compras.add(menu_item_compras);

        menu_item_reporte_compra_varios.setText("Reporte de Compras Varios");
        menu_item_reporte_compra_varios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_item_reporte_compra_variosActionPerformed(evt);
            }
        });
        menu_compras.add(menu_item_reporte_compra_varios);

        jMenuBar1.add(menu_compras);

        menu_inventario.setText("INVENTARIO");
        menu_inventario.setEnabled(false);
        jMenuBar1.add(menu_inventario);

        menu_ventas.setText("VENTAS");
        menu_ventas.setEnabled(false);
        jMenuBar1.add(menu_ventas);

        menu_caja.setText("CAJA");
        menu_caja.setEnabled(false);
        jMenuBar1.add(menu_caja);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 932, Short.MAX_VALUE)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritorio))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menu_item_tipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_tipoUsuarioActionPerformed
        // TODO add your handling code here:

        TipoUsuario_IU frame = new TipoUsuario_IU();
        escritorio.add(frame);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = frame.getSize();
        frame.setLocation((desktopSize.width = FrameSize.width) / 2, (desktopSize.height = FrameSize.height) / 2);

        frame.show();

    }//GEN-LAST:event_menu_item_tipoUsuarioActionPerformed

    private void menu_item_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_usuarioActionPerformed
        // TODO add your handling code here:
        Usuarios_IU frame=new Usuarios_IU();
        
        escritorio.add(frame);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = frame.getSize();
        frame.setLocation((desktopSize.width = FrameSize.width) / 2, (desktopSize.height = FrameSize.height) / 2);

        frame.show();
    }//GEN-LAST:event_menu_item_usuarioActionPerformed

    private void menu_item_turnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_turnoActionPerformed
        // TODO add your handling code here:
        Turno_IU frame = new Turno_IU();
        escritorio.add(frame);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = frame.getSize();
        frame.setLocation((desktopSize.width = FrameSize.width) / 2, (desktopSize.height = FrameSize.height) / 2);

        frame.show();
    }//GEN-LAST:event_menu_item_turnoActionPerformed

    private void menu_item_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_marcaActionPerformed
        // TODO add your handling code here:
        Marca_IU frame = new Marca_IU();
        escritorio.add(frame);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = frame.getSize();
        frame.setLocation((desktopSize.width = FrameSize.width) / 2, (desktopSize.height = FrameSize.height) / 2);

        frame.show();
    }//GEN-LAST:event_menu_item_marcaActionPerformed

    private void menu_item_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_categoriaActionPerformed
        // TODO add your handling code here:
        Categoria_IU frame = new Categoria_IU();
        escritorio.add(frame);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = frame.getSize();
        frame.setLocation((desktopSize.width = FrameSize.width) / 2, (desktopSize.height = FrameSize.height) / 2);

        frame.show();
    }//GEN-LAST:event_menu_item_categoriaActionPerformed

    private void menu_item_medidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_medidaActionPerformed
        // TODO add your handling code here:
        Medida_IU frame = new Medida_IU();
        escritorio.add(frame);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = frame.getSize();
        frame.setLocation((desktopSize.width = FrameSize.width) / 2, (desktopSize.height = FrameSize.height) / 2);

        frame.show();
    }//GEN-LAST:event_menu_item_medidaActionPerformed

    private void menu_item_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_productoActionPerformed
        // TODO add your handling code here:
        Producto_IU frame = new Producto_IU();
        
        escritorio.add(frame);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = frame.getSize();
        frame.setLocation((desktopSize.width = FrameSize.width) / 2, (desktopSize.height = FrameSize.height) / 2);

        frame.show();
        
    }//GEN-LAST:event_menu_item_productoActionPerformed

    private void menu_item_composicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_composicionActionPerformed
        // TODO add your handling code here:
        Composicion_IU frame =new Composicion_IU();
        escritorio.add(frame);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = frame.getSize();
        frame.setLocation((desktopSize.width = FrameSize.width) / 2, (desktopSize.height = FrameSize.height) / 2);

        frame.show();
        
    }//GEN-LAST:event_menu_item_composicionActionPerformed

    private void menu_item_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_proveedorActionPerformed
        // TODO add your handling code here:
        Proveedor_IU frame =new Proveedor_IU();
        escritorio.add(frame);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = frame.getSize();
        frame.setLocation((desktopSize.width = FrameSize.width) / 2, (desktopSize.height = FrameSize.height) / 2);

        frame.show();
    }//GEN-LAST:event_menu_item_proveedorActionPerformed

    private void menu_item_cuentas_bancariasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_cuentas_bancariasActionPerformed
        // TODO add your handling code here:
        CuentasBancariasProveedor_IU frame= new CuentasBancariasProveedor_IU();
        escritorio.add(frame);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = frame.getSize();
        frame.setLocation((desktopSize.width = FrameSize.width) / 2, (desktopSize.height = FrameSize.height) / 2);

        frame.show();
        
    }//GEN-LAST:event_menu_item_cuentas_bancariasActionPerformed

    private void menu_item_comprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_comprasActionPerformed
        // TODO add your handling code here:
        
        Compra_IU frame= new Compra_IU();
        escritorio.add(frame);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = frame.getSize();
        frame.setLocation((desktopSize.width = FrameSize.width) / 2, (desktopSize.height = FrameSize.height) / 2);

        frame.show();
        
    }//GEN-LAST:event_menu_item_comprasActionPerformed

    private void menu_item_reporte_compra_variosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_item_reporte_compra_variosActionPerformed
        // TODO add your handling code here:
        ReporteComprasVarios_IU frame =new ReporteComprasVarios_IU();
        escritorio.add(frame);
        Dimension desktopSize = escritorio.getSize();
        Dimension FrameSize = frame.getSize();
        frame.setLocation((desktopSize.width = FrameSize.width) / 2, (desktopSize.height = FrameSize.height) / 2);

        frame.show();
    }//GEN-LAST:event_menu_item_reporte_compra_variosActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCaja;
    public javax.swing.JButton btnCerrar;
    public javax.swing.JButton btnCompras;
    public javax.swing.JButton btnEgresos;
    public javax.swing.JButton btnIngresos;
    public javax.swing.JButton btnProductos;
    public javax.swing.JButton btnVentas;
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    public javax.swing.JMenu menu_caja;
    public javax.swing.JMenu menu_compras;
    public javax.swing.JMenu menu_inventario;
    private javax.swing.JMenuItem menu_item_categoria;
    private javax.swing.JMenuItem menu_item_composicion;
    private javax.swing.JMenuItem menu_item_compras;
    private javax.swing.JMenuItem menu_item_cuentas_bancarias;
    private javax.swing.JMenuItem menu_item_marca;
    private javax.swing.JMenuItem menu_item_medida;
    private javax.swing.JMenuItem menu_item_producto;
    private javax.swing.JMenuItem menu_item_proveedor;
    private javax.swing.JMenuItem menu_item_reporte_compra_varios;
    private javax.swing.JMenuItem menu_item_tipoUsuario;
    private javax.swing.JMenuItem menu_item_turno;
    private javax.swing.JMenuItem menu_item_usuario;
    public javax.swing.JMenu menu_mantenimiento;
    public javax.swing.JMenu menu_ventas;
    // End of variables declaration//GEN-END:variables
}
