package com.latam.co.ecommerce.dominio.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Entity
@Table(name = "TB_ORDEN")
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrden;
    private String numero;
    private LocalDateTime fechaCreacion,fechaRecibida;
    private BigDecimal total;
    @ManyToOne(fetch = FetchType.EAGER,targetEntity = Usuario.class)
    private Usuario usuario;
    @OneToOne(mappedBy = "orden")
    private DetalleOrden detalle;


    public Orden() {
    }

    public Orden(String numero, LocalDateTime fechaCreacion, LocalDateTime fechaRecibida, BigDecimal total, Usuario usuario) {
        this.numero = numero;
        this.fechaCreacion = fechaCreacion;
        this.fechaRecibida = fechaRecibida;
        this.total = total;
        this.usuario = usuario;
    }

    public Long getIdOrden() {
        return idOrden;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaRecibida() {
        return fechaRecibida;
    }

    public void setFechaRecibida(LocalDateTime fechaRecibida) {
        this.fechaRecibida = fechaRecibida;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
