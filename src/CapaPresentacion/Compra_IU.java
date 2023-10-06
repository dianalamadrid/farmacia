/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

import CapaDatos.Compra;
import CapaDatos.DetalleCompra;
import CapaDatos.Medida;
import CapaNegocio.CompraBD;
import CapaNegocio.DetalleCompraBD;
import CapaNegocio.MedidaBD;
import CapaNegocio.ProductoBD;
import CapaNegocio.ProveedorBD;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author labor
 */
public class Compra_IU extends javax.swing.JInternalFrame {

    List<Medida> lista_medida;

    /**
     * Creates new form Compra_IU
     */
    public Compra_IU() {
        initComponents();

    }

    public void limpiarAgregar() {
        txtBarras.setText("");
        txtProducto.setText("");
        txtCantidad.setText("");
        txtLote.setText("");
        txtPrecio.setText("");
        txtImporte.setText("");
        cmbMedida.setSelectedIndex(0);
    }

    private void calcularTotal() {

        DefaultTableModel tabla_temporal_compras = (DefaultTableModel) tabla_reporte_detalle_productos.getModel();
        int maxCompras = tabla_temporal_compras.getRowCount();
        double total = 0;
        for (int i = 0; i < maxCompras; i++) {
            total = total + (Double) tabla_temporal_compras.getValueAt(i, 6);
        }
        BigDecimal numero = new BigDecimal(total);
        BigDecimal decimal_total = numero.setScale(2, RoundingMode.DOWN);
        txtSubTotal.setText("" + decimal_total);
        txtTotalPagar.setText("" + decimal_total);
    }

    public void registrarDetalleCompra(int idcompra) {

        DefaultTableModel tabla_temporal_compras = (DefaultTableModel) tabla_reporte_detalle_productos.getModel();
        int cantCompras = tabla_temporal_compras.getRowCount();
        DetalleCompra oDetalleCompra = new DetalleCompra();
        DetalleCompraBD oDetalleCompraBD = new DetalleCompraBD();

        for (int i = 0; i < cantCompras; i++) {

            oDetalleCompra.setIdcompra(idcompra);
            oDetalleCompra.setpSerie(tabla_temporal_compras.getValueAt(i, 0).toString());
            oDetalleCompra.setDcCantidad((Double) tabla_temporal_compras.getValueAt(i, 4));
            oDetalleCompra.setDcPrecio((Double) tabla_temporal_compras.getValueAt(i, 5));
            oDetalleCompra.setDcImporte((Double) tabla_temporal_compras.getValueAt(i, 6));
            oDetalleCompra.setDcLote(tabla_temporal_compras.getValueAt(i, 2).toString());
            oDetalleCompra.setDcPresentacion(tabla_temporal_compras.getValueAt(i, 3).toString());

            oDetalleCompraBD.resgistarDetalleCompra(oDetalleCompra);

        }

    }

    private void limpiar_compra() {
        txtBarras.setText("");
        txtProducto.setText("");
        txtCantidad.setText("");
        txtLote.setText("");
        txtPrecio.setText("");
        txtImporte.setText("");
        txtNroComprobante.setText("");
        cmbMedida.setSelectedIndex(0);
        cmbTipoPago.setSelectedIndex(0);
        cmbTipoComprobante.setSelectedIndex(0);
        cmbTienda.setSelectedIndex(0);
        cmbMoneda.setSelectedIndex(0);
        cmbFormaPago.setSelectedIndex(0);
        txtRuc.setText("");
        txtFlete.setText("");
        txtDescuento.setText("");
        txtIgv.setText("");

    }

    private void limpiar_tabla_formulario() {
        DefaultTableModel tabla_temporal_detalle_producto = (DefaultTableModel) tabla_reporte_detalle_productos.getModel();
        tabla_temporal_detalle_producto.setRowCount(0);
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

    private void cargarMedida() {
        try {
            cmbMedida.removeAllItems();
            MedidaBD OMedidaBD = new MedidaBD();
            DefaultTableModel tabla_temporal;
            tabla_temporal = OMedidaBD.reportarMedida();

            lista_medida = new ArrayList<>();
            cmbMedida.addItem("Seleccionar");

            for (int i = 0; i < tabla_temporal.getRowCount(); i++) {
                int codigo = Integer.parseInt(tabla_temporal.getValueAt(i, 0).toString());
                String nombre = String.valueOf(tabla_temporal.getValueAt(i, 1));

                lista_medida.add(new Medida(codigo, nombre, ""));
                cmbMedida.addItem(nombre);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "error al cargar medida", JOptionPane.ERROR_MESSAGE);
        }

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
        cmbTipoComprobante = new javax.swing.JComboBox<>();
        cmbFormaPago = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNroComprobante = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dcFechaCompa = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbMoneda = new javax.swing.JComboBox<>();
        cmbTienda = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbTipoPago = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtRuc = new javax.swing.JTextField();
        txtRazonSocial = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtBarras = new javax.swing.JTextField();
        txtProducto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cmbMedida = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtLote = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtImporte = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnQuitar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_reporte_detalle_productos = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        txtDescuento = new javax.swing.JTextField();
        txtSubtotalDscto = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtFlete = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtIgv = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("COMPRAS");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS DE LA COMPRA"));

        jLabel1.setText("TIPO DE COMPROBANTE");

        cmbTipoComprobante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "FACTURA", "BOLETA" }));

        cmbFormaPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "EFECTIVO", "TARJETA" }));

        jLabel2.setText("FORMA DE PAGO");

        jLabel3.setText("NRO COMPROBANTE");

        jLabel4.setText("FECHA DE COMPRA");

        jLabel5.setText("MONEDA");

        jLabel6.setText("TIENDA");

        cmbMoneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SOLES" }));

        cmbTienda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "PRINCIPAL", "SECUNDARIA" }));

        jLabel7.setText("TIPO DE PAGO");

        cmbTipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CONTADO" }));

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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbTipoComprobante, 0, 139, Short.MAX_VALUE)
                    .addComponent(cmbFormaPago, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNroComprobante)
                    .addComponent(dcFechaCompa, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(cmbTienda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(cmbTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbTipoComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtNroComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cmbMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbFormaPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4))
                    .addComponent(dcFechaCompa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(cmbTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbTipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS DE LA COMPRA"));

        jLabel8.setText("RUC");

        txtRazonSocial.setEnabled(false);

        jLabel9.setText("RAZON SOCIAL");

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtRazonSocial))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setText("BARRAS");

        txtBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBarrasActionPerformed(evt);
            }
        });

        txtProducto.setEnabled(false);

        jLabel11.setText("PRODUCTO");

        cmbMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel12.setText("PRESENTACION");

        jLabel13.setText("LOTE");

        jLabel14.setText("CANT");

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        jLabel15.setText("PRECIO");

        jLabel16.setText("IMPORTE");

        btnAgregar.setText("jButton2");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnQuitar.setText("jButton3");
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLote, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnQuitar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar)
                    .addComponent(btnQuitar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabla_reporte_detalle_productos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla_reporte_detalle_productos);

        jLabel17.setText("SUBTOTAL");

        txtSubTotal.setEnabled(false);

        jLabel18.setText("DESCUENTO");

        jLabel19.setText("SUBTOTAL CON DSCTO");

        jLabel20.setText("FLETE");

        jLabel21.setText("IGV");

        jLabel22.setText("TOTAL A PAGAR");

        txtTotalPagar.setEnabled(false);

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnCerrar.setText("CERRAR");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrar)
                    .addComponent(btnCerrar))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 524, Short.MAX_VALUE)
                .addComponent(btnCerrar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSubtotalDscto, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFlete, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIgv, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSubtotalDscto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFlete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIgv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || c == '.') {
            evt.consume();
        }

    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyReleased
        // TODO add your handling code here:
        try {
            double precio = Double.parseDouble(txtPrecio.getText().trim());
            double cant = Double.parseDouble(txtCantidad.getText().trim());

            double resultado = precio * cant;

            BigDecimal numero = new BigDecimal(resultado);
            BigDecimal decimales = numero.setScale(2, RoundingMode.DOWN);

            txtImporte.setText("" + decimales);

        } catch (Exception e) {
        }

    }//GEN-LAST:event_txtPrecioKeyReleased

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:

        if (txtRuc.getText().length() > 0) {
            DefaultTableModel tabla_temporal;
            ProveedorBD oProveedorBD = new ProveedorBD();
            tabla_temporal = oProveedorBD.buscarProveedor(txtRuc.getText().trim());

            if (tabla_temporal.getRowCount() > 0) {
                txtRazonSocial.setText(tabla_temporal.getValueAt(0, 1).toString());

            } else {
                advertencia("No se encontro, tienes que registrarlo primero al proveedor...");
                txtRuc.requestFocus();
                txtRazonSocial.setText("");
            }
        } else {
            advertencia("Ingrese el ruc para buscar el proveedor");
            txtRuc.requestFocus();
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBarrasActionPerformed
        // TODO add your handling code here:

        if (txtRuc.getText().length() > 0) {
            DefaultTableModel tabla_temporal;
            ProductoBD OProductoBD = new ProductoBD();
            tabla_temporal = OProductoBD.buscarProducto(txtBarras.getText().trim());

            if (tabla_temporal.getRowCount() > 0) {
                txtProducto.setText(tabla_temporal.getValueAt(0, 1).toString());

            } else {
                error("No se encontro el producto con ese codigo de barras...");
                txtBarras.requestFocus();
                txtProducto.setText("");
            }
        } else {
            advertencia("Ingrese el codigo de barras");
            txtBarras.requestFocus();
        }

    }//GEN-LAST:event_txtBarrasActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:

        if (txtProducto.getText().length() > 0) {
            if (txtImporte.getText().length() > 0) {
                if (txtPrecio.getText().length() > 0) {
                    if (txtLote.getText().length() > 0) {
                        if (!cmbMedida.getSelectedItem().equals("Seleccionar")) {

                            String barras = txtBarras.getText().trim();
                            String producto = txtProducto.getText().trim();
                            String lote = txtLote.getText().trim().toUpperCase();
                            String presentacion = cmbMedida.getSelectedItem().toString();
                            double cant = Double.parseDouble(txtCantidad.getText().trim());
                            double precio = Double.parseDouble(txtPrecio.getText().trim());
                            double importe = Double.parseDouble(txtImporte.getText().trim());

                            DefaultTableModel tabla_temporal_compras = (DefaultTableModel) tabla_reporte_detalle_productos.getModel();
                            Object[] data = {barras, producto, lote, presentacion, cant, precio, importe};
                            tabla_temporal_compras.addRow(data);
                            limpiarAgregar();
                            calcularTotal();

                        } else {
                            advertencia("Seleccione una medida");
                        }
                    } else {
                        advertencia("Ingrese el lote de la compra");
                        txtLote.requestFocus();
                    }
                } else {
                    advertencia("Ingrese el precio del producto...");
                    txtPrecio.requestFocus();
                }
            } else {
                advertencia("Calcule el importe...");
                txtImporte.requestFocus();
            }
        } else {
            advertencia("Ingrese un producto...");
            txtProducto.requestFocus();
        }


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
        // TODO add your handling code here:
        int fila_seleccionada = tabla_reporte_detalle_productos.getSelectedRow();
        try {
            DefaultTableModel tabla_temporal_compras = (DefaultTableModel) tabla_reporte_detalle_productos.getModel();
            tabla_temporal_compras.removeRow(fila_seleccionada);

            tabla_reporte_detalle_productos.setModel(tabla_temporal_compras);
            calcularTotal();

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error al quitar producto", "Error", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_btnQuitarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:

        int cant_producto = tabla_reporte_detalle_productos.getRowCount();
        if (cant_producto > 0) {
            if (txtNroComprobante.getText().length() > 0) {
                if (txtRuc.getText().length() > 0) {
                    if (txtRazonSocial.getText().length() > 0) {
                        if (txtSubTotal.getText().length() > 0) {
                            if (txtDescuento.getText().length() > 0) {
                                if (txtSubtotalDscto.getText().length() > 0) {
                                    if (txtFlete.getText().length() > 0) {
                                        if (txtIgv.getText().length() > 0) {
                                            if (dcFechaCompa.getDate() != null) {

                                                Compra oCompra = new Compra();
                                                CompraBD oCompraBD = new CompraBD();

                                                SimpleDateFormat dcn = new SimpleDateFormat("yyyy-MM-dd");
                                                String fecha = dcn.format(dcFechaCompa.getDate());
                                                oCompra.setCoFecha(fecha);
                                                oCompra.setCoTipoDoc(cmbTipoComprobante.getSelectedItem().toString());
                                                oCompra.setConNroDoc(txtNroComprobante.getText().toUpperCase());
                                                oCompra.setCoTipoPago(cmbTipoPago.getSelectedItem().toString());
                                                oCompra.setCoFormaPago(cmbFormaPago.getSelectedItem().toString());
                                                oCompra.setCoMoneda(cmbMoneda.getSelectedItem().toString());
                                                oCompra.setCoSubTotal(Double.parseDouble(txtSubTotal.getText().trim()));
                                                oCompra.setCoFlete(Double.parseDouble(txtFlete.getText().trim()));
                                                oCompra.setCoIgv(Double.parseDouble(txtIgv.getText().trim()));
                                                oCompra.setCoTotal(Double.parseDouble(txtTotalPagar.getText().trim()));
                                                oCompra.setProvRuc(txtRuc.getText().trim());
                                                oCompra.setuDni(Login_IU.dni_publico);
                                                oCompra.setTienda(cmbTienda.getSelectedItem().toString());

                                                int idcompra = oCompraBD.resgistarCompra(oCompra);
                                                if (idcompra > -1) {
                                                    registrarDetalleCompra(idcompra);
                                                    exito("Todo OK...");
                                                    limpiar_compra();
                                                    limpiar_tabla_formulario();
                                                } else {
                                                    error("No se puede realizar la compra");
                                                }
                                            } else {
                                                advertencia("Seleccione una fecha...");
                                                dcFechaCompa.requestFocus();
                                            }
                                        } else {
                                            advertencia("Ingrese el igv de la compra. Si no hubiera coloque 0...");
                                            txtIgv.requestFocus();
                                        }
                                    } else {
                                        advertencia("Ingrese el flete de la compra. Si no hubiera coloque 0...");
                                        txtFlete.requestFocus();
                                    }
                                } else {
                                    advertencia("Ingrese el subtotal con descuento de la compra. Si no hubiera coloque 0...");
                                    txtSubtotalDscto.requestFocus();
                                }
                            } else {
                                advertencia("Ingrese el descuento de la compra. Si no hubiera coloque 0...");
                                txtDescuento.requestFocus();
                            }
                        } else {
                            advertencia("Ingrese el subtotal de la compra...");
                            txtSubTotal.requestFocus();
                        }
                    } else {
                        advertencia("Coloque una razon social valido...");
                        txtRazonSocial.requestFocus();
                    }
                } else {
                    advertencia("Ingrese el ruc del proveedor...");
                    txtRuc.requestFocus();
                }
            } else {
                advertencia("Ingrese el numero de comprobante de la compra...");
                txtNroComprobante.requestFocus();
            }
        } else {
            advertencia("No hay productos en la lista...");
            txtBarras.requestFocus();
        }

    }//GEN-LAST:event_btnRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnQuitar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbFormaPago;
    private javax.swing.JComboBox<String> cmbMedida;
    private javax.swing.JComboBox<String> cmbMoneda;
    private javax.swing.JComboBox<String> cmbTienda;
    private javax.swing.JComboBox<String> cmbTipoComprobante;
    private javax.swing.JComboBox<String> cmbTipoPago;
    private com.toedter.calendar.JDateChooser dcFechaCompa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_reporte_detalle_productos;
    private javax.swing.JTextField txtBarras;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtFlete;
    private javax.swing.JTextField txtIgv;
    private javax.swing.JTextField txtImporte;
    private javax.swing.JTextField txtLote;
    private javax.swing.JTextField txtNroComprobante;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtRuc;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtSubtotalDscto;
    private javax.swing.JTextField txtTotalPagar;
    // End of variables declaration//GEN-END:variables
}
