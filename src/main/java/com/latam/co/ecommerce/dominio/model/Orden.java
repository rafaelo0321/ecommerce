package com.latam.co.ecommerce.dominio.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Orden {
    private Long idOrden;
    private String numero;
    private LocalDateTime fechaCreacion,fechaRecibida;
    private BigDecimal total;

    public Orden() {
    }

    public Orden(String numero, LocalDateTime fechaCreacion, LocalDateTime fechaRecibida, BigDecimal total) {
        this.numero = numero;
        this.fechaCreacion = fechaCreacion;
        this.fechaRecibida = fechaRecibida;
        this.total = total;
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
}
