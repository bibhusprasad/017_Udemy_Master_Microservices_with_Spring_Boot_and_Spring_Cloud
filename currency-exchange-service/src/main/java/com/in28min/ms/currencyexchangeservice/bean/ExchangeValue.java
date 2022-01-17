package com.in28min.ms.currencyexchangeservice.bean;

import java.math.BigDecimal;

public class ExchangeValue {

    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;

    public ExchangeValue() {
    }

    public ExchangeValue(final Long id, final String from, final String to, final BigDecimal conversionMultiple) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
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

    public BigDecimal getConversionMultiple() {
        return this.conversionMultiple;
    }

    public void setConversionMultiple(final BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }
}
