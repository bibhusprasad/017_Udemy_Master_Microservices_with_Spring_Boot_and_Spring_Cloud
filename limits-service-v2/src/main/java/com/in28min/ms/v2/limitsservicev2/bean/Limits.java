package com.in28min.ms.v2.limitsservicev2.bean;

public class Limits {

    private int maximum;
    private int minimum;

    public Limits() {
    }

    public Limits(final int maximum, final int minimum) {
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public int getMaximum() {
        return this.maximum;
    }

    public void setMaximum(final int maximum) {
        this.maximum = maximum;
    }

    public int getMinimum() {
        return this.minimum;
    }

    public void setMinimum(final int minimum) {
        this.minimum = minimum;
    }
}
