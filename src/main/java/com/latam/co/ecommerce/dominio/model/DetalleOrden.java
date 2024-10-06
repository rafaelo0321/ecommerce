package com.latam.co.ecommerce.dominio.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "TB_DETALLE_ORDEN")
public class DetalleOrden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetalle;
    private String nombre;
    private Double cantidad,precio;
    private BigDecimal total;
    @OneToOne
    private Orden orden;
    @ManyToOne(fetch = FetchType.EAGER,targetEntity = Producto.class)
    private Producto producto;


    public DetalleOrden() {
    }

    public DetalleOrden(String nombre, Double cantidad, Double precio, BigDecimal total) {
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

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
