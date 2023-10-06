/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaConexion.Conexion;
import CapaDatos.DetalleCuentasBancarias;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author labor
 */
public class DetalleCuentasBancariasBD {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql;

    public DefaultTableModel buscarDetallesCuentasBancarias(String ruc) {
        DefaultTableModel modelo;
        String[] titulos = {"ID", "BANCO", "CUENTA", "NROCUENTA", "RUC"};
        String[] registros = new String[5];
        modelo = new DefaultTableModel(null, titulos);
        sql = "SELECT idcuentas,banco,cuenta,nroCuenta,provRuc FROM detallecuentasbancarias "
                + "WHERE provRuc=? ";
        try {

            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, ruc);

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                registros[0] = rs.getString("idcuentas");
                registros[1] = rs.getString("banco");
                registros[2] = rs.getString("cuenta");
                registros[3] = rs.getString("nroCuenta");
                registros[4] = rs.getString("provRuc");

                modelo.addRow(registros);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error al buscar Detalle Cuentas Bancarias...", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return modelo;
    }
    
    public boolean registrarDetallesCuentasBancarias(DetalleCuentasBancarias d) {

        boolean rpta = false;
        sql = "INSERT INTO detallecuentasbancarias(idcuentas,banco,cuenta,nroCuenta,provRuc) VALUES (NULL,?,?,?,?)";

        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, d.getBanco());
            pst.setString(2, d.getCuenta());
            pst.setString(3, d.getNroCuenta());
            pst.setString(4, d.getProvRuc());
            

            rpta = pst.executeUpdate() == 1 ? true : false;
            pst.close();
            cn.close();
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Problemas al registrar DetallesCuentasBancarias", JOptionPane.ERROR_MESSAGE);
            return rpta;
        }
        return rpta;

    }
    public boolean eliminarDetallesCuentasBancarias(int idcuentas) {
        boolean rpta = false;

        try {
            sql = "DELETE FROM detallecuentasbancarias WHERE idcuentas=?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, idcuentas);

            rpta = pst.executeUpdate() == 1 ? true : false;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Problemas al eliminar Detalles Cuentas Bancarias...", JOptionPane.ERROR_MESSAGE);
            return rpta;
        }
        return rpta;
    }

}
