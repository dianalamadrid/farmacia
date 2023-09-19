/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaNegocio;

import CapaConexion.Conexion;
import CapaDatos.Categoria;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author labor
 */
public class CategoriaBD {
    
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sql;
    
    public List<Categoria> reportarCategoria() {
        List<Categoria> lista = new ArrayList<>();
        sql = "SELECT idcategoria, catNombre FROM categoria";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                
                Categoria oCategoria = new Categoria();
                
                oCategoria.setIdcategoria(rs.getInt(1));
                oCategoria.setCatNombre(rs.getString(2));
                
                lista.add(oCategoria);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error al reportar categoria...", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return lista;
        
    }
    
    public boolean registrarCategoria(Categoria c) {
        boolean rpta = false;
        
        sql = "INSERT INTO categoria(idcategoria,catNombre) VALUES(0,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, c.getCatNombre());
            rpta = pst.executeUpdate() == 1 ? true : false;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Problemas al registrar categoria...", JOptionPane.ERROR_MESSAGE);
            return rpta;
        }
        return rpta;
        
    }
    
    public boolean modificarCategoria(Categoria c) {
        
        boolean rpta = false;
        
        sql = "UPDATE categoria SET catNombre WHERE idcategoria=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, c.getCatNombre());
            pst.setInt(2, c.getIdcategoria());
            rpta = pst.executeUpdate() == 1 ? true : false;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Problemas al modificar categoria...", JOptionPane.ERROR_MESSAGE);
            return rpta;
        }
        return rpta;
        
    }
    
    public boolean eliminarCategoria(Categoria c) {
        
        boolean rpta = false;
        
        sql = "DELETE FROM categoria WHERE idcategoria=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, c.getIdcategoria());
            rpta = pst.executeUpdate() == 1 ? true : false;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Problemas al eliminar categoria...", JOptionPane.ERROR_MESSAGE);
            return rpta;
        }
        return rpta;
        
    }
    
    public List<Categoria> buscarCategorias(String valor) {
        List<Categoria> lista = new ArrayList<>();
        
        sql = "SELECT idcategoria,catNombre FROM categoria WHERE catNombre LIKE ?";
        try {
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, "%" + valor + "%");
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {                
                Categoria oCategoria = new Categoria();
                
                oCategoria.setIdcategoria(rs.getInt(1));
                oCategoria.setCatNombre(rs.getString(2));
                
                lista.add(oCategoria);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Problemas al eliminar categoria...", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return lista;
        
    }
    
}
