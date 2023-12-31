/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaConexion.Conexion;
import CapaDatos.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author labor
 */
public class ProveedorBD {

    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql;

    public DefaultTableModel reportarProveedor() {

        DefaultTableModel modelo;
        String[] titulos = {"RUC", "RAZONSOCIAL", "REPRESENTANTE", "DIRECCION", "CORREO", "WEB", "CELULAR"};
        String[] registros = new String[7];
        modelo = new DefaultTableModel(null, titulos);

        sql = "SELECT provRuc,provRazonSocial,provRepresentante,provDireccion,provCorreo,provWeb,povCelular FROM proveedor";

        try {
            PreparedStatement pst = cn.prepareStatement(sql);

            ResultSet rs = pst.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("provRuc");
                registros[1] = rs.getString("provRazonSocial");
                registros[2] = rs.getString("provRepresentante");
                registros[3] = rs.getString("provDireccion");
                registros[4] = rs.getString("provCorreo");
                registros[5] = rs.getString("provWeb");
                registros[6] = rs.getString("povCelular");

                modelo.addRow(registros);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "ERROR AL REPORTAR PROVEEDOR BD", JOptionPane.ERROR_MESSAGE);
            return null;
        }

    }

    public boolean registrarProveedor(Proveedor p) {

        boolean rpta = false;
        sql = "INSERT INTO proveedor(provRuc,provRazonSocial,provRepresentante,provDireccion,provCorreo,provWeb,povCelular) VALUES (?,?,?,?,?,?,?)";

        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, p.getProvRuc());
            pst.setString(2, p.getProvRazonSocial());
            pst.setString(3, p.getProvRepresentante());
            pst.setString(4, p.getProvDireccion());
            pst.setString(5, p.getProvCorreo());
            pst.setString(6, p.getProvWeb());
            pst.setString(7, p.getPovCelular());

            rpta = pst.executeUpdate() == 1 ? true : false;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Problemas al registrar proveedor...", JOptionPane.ERROR_MESSAGE);
            return rpta;
        }
        return rpta;

    }

    public DefaultTableModel buscarProveedor(String ruc) {

        DefaultTableModel modelo;
        String[] titulos = {"RUC", "RAZONSOCIAL", "REPRESENTANTE", "DIRECCION", "CORREO", "WEB", "CELULAR"};
        String[] registros = new String[7];
        modelo = new DefaultTableModel(null, titulos);

        sql = "SELECT provRuc,provRazonSocial,provRepresentante,provDireccion,provCorreo,provWeb,povCelular FROM proveedor "
                + "WHERE provRuc=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, ruc);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                registros[0] = rs.getString("provRuc");
                registros[1] = rs.getString("provRazonSocial");
                registros[2] = rs.getString("provRepresentante");
                registros[3] = rs.getString("provDireccion");
                registros[4] = rs.getString("provCorreo");
                registros[5] = rs.getString("provWeb");
                registros[6] = rs.getString("povCelular");

                modelo.addRow(registros);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "ERROR AL BUSCAR PROVEEDOR BD", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return modelo;

    }

    public boolean modificarProveedor(Proveedor p) {

        boolean rpta = false;
        sql = "UPDATE proveedor SET provRazonSocial=?,provRepresentante=?,provDireccion=?,provCorreo=?,provWeb=?,povCelular=? WHERE provRuc=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);

            pst.setString(1, p.getProvRazonSocial());
            pst.setString(2, p.getProvRepresentante());
            pst.setString(3, p.getProvDireccion());
            pst.setString(4, p.getProvCorreo());
            pst.setString(5, p.getProvWeb());
            pst.setString(6, p.getPovCelular());
            pst.setString(7, p.getProvRuc());

            rpta = pst.executeUpdate() == 1 ? true : false;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return rpta;
        }
        return rpta;
    }
    
    public boolean EliminarProveedor(String provRuc) {
        boolean rpta = false;

        try {
            sql = "DELETE FROM proveedor WHERE provRuc=?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, provRuc);

            rpta = pst.executeUpdate() == 1 ? true : false;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Problemas al eliminar un proveedor...", JOptionPane.ERROR_MESSAGE);
            return rpta;
        }
        return rpta;
    }

}
