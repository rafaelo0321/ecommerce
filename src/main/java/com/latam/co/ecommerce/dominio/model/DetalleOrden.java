package com.latam.co.ecommerce.dominio.model;

public class DetalleOrden {
    private Long idDetalle;
    private String nombre;
    private Double cantidad,precio,total;

    public DetalleOrden() {
    }

    public DetalleOrden(String nombre, Double cantidad, Double precio, Double total) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = total;
    }

    public Long getIdDetalle() {
        return idDetalle;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
