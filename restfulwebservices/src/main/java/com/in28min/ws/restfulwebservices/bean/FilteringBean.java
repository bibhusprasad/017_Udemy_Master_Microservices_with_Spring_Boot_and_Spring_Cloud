package com.in28min.ws.restfulwebservices.bean;

import com.fasterxml.jackson.annotation.JsonFilter;

@JsonFilter("FilteringBeanFilter")
public class FilteringBean {

    private String field1;
    private String field2;
    private String field3;

    public FilteringBean(final String field1, final String field2, final String field3) {
        super();
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public String getField1() {
        return this.field1;
    }

    public void setField1(final String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return this.field2;
    }

    public void setField2(final String field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return this.field3;
    }

    public void setField3(final String field3) {
        this.field3 = field3;
    }
}
