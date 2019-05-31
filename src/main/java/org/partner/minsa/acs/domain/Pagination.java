/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.partner.minsa.acs.domain;

/**
 *
 * @author fchuquilin
 */
public class Pagination {
    private Integer offset;
    private Integer limit;
    private Integer cantidad;

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
}
