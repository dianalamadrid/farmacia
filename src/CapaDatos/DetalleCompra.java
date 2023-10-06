/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;

/**
 *
 * @author labor
 */
public class DetalleCompra {
    
    private int idcompra;
    private String pSerie;
    private double dcCantidad;
    private double dcPrecio;
    private double dcImporte;
    private String dcLote;
    private String dcPresentacion;

    public DetalleCompra() {
    }

    public DetalleCompra(int idcompra, String pSerie, double dcCantidad, double dcPrecio, double dcImporte, String dcLote, String dcPresentacion) {
        this.idcompra = idcompra;
        this.pSerie = pSerie;
        this.dcCantidad = dcCantidad;
        this.dcPrecio = dcPrecio;
        this.dcImporte = dcImporte;
        this.dcLote = dcLote;
        this.dcPresentacion = dcPresentacion;
    }

    public int getIdcompra() {
        return idcompra;
    }

    public void setIdcompra(int idcompra) {
        this.idcompra = idcompra;
    }

    public String getpSerie() {
        return pSerie;
    }

    public void setpSerie(String pSerie) {
        this.pSerie = pSerie;
    }

    public double getDcCantidad() {
        return dcCantidad;
    }

    public void setDcCantidad(double dcCantidad) {
        this.dcCantidad = dcCantidad;
    }

    public double getDcPrecio() {
        return dcPrecio;
    }

    public void setDcPrecio(double dcPrecio) {
        this.dcPrecio = dcPrecio;
    }

    public double getDcImporte() {
        return dcImporte;
    }

    public void setDcImporte(double dcImporte) {
        this.dcImporte = dcImporte;
    }

    public String getDcLote() {
        return dcLote;
    }

    public void setDcLote(String dcLote) {
        this.dcLote = dcLote;
    }

    public String getDcPresentacion() {
        return dcPresentacion;
    }

    public void setDcPresentacion(String dcPresentacion) {
        this.dcPresentacion = dcPresentacion;
    }
    
    
    
    
}
