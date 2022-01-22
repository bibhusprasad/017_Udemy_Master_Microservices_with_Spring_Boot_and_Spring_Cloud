package com.in28min.ms.v2.currencyconversionservicev2.bean;

import java.math.BigDecimal;

public class CurrencyConversion {

    private Long id;
    private String from;
    private String to;
    private BigDecimal quantity;
    private BigDecimal conversionMultiple;
    private BigDecimal totalCalculatedAmount;
    private String environment;

    public CurrencyConversion() {
    }

    public CurrencyConversion(final Long id, final String from, final String to, final BigDecimal quantity, final BigDecimal conversionMultiple, final BigDecimal totalCalculatedAmount, final String environment) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.quantity = quantity;
        this.conversionMultiple = conversionMultiple;
        this.totalCalculatedAmount = totalCalculatedAmount;
        this.environment = environment;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getFrom() {
        return this.from;
    }

    public void setFrom(final String from) {
        this.from = from;
    }

    public String getTo() {
        return this.to;
    }

    public void setTo(final String to) {
        this.to = to;
    }

    public BigDecimal getQuantity() {
        return this.quantity;
    }

    public void setQuantity(final BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getConversionMultiple() {
        return this.conversionMultiple;
    }

    public void setConversionMultiple(final BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public BigDecimal getTotalCalculatedAmount() {
        return this.totalCalculatedAmount;
    }

    public void setTotalCalculatedAmount(final BigDecimal totalCalculatedAmount) {
        this.totalCalculatedAmount = totalCalculatedAmount;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public void setEnvironment(final String environment) {
        this.environment = environment;
    }
}
