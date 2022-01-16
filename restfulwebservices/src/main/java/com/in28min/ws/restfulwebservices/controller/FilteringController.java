package com.in28min.ws.restfulwebservices.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.in28min.ws.restfulwebservices.bean.FilteringBean;

@RestController
public class FilteringController {

    // field1,field2
    @GetMapping("/filtering")
    public MappingJacksonValue retrieveSomeBean() {
        final FilteringBean bean = new FilteringBean("value1", "value2", "value3");

        final SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field2");

        final FilterProvider filters = new SimpleFilterProvider().addFilter("FilteringBeanFilter", filter);

        final MappingJacksonValue mapping = new MappingJacksonValue(bean);

        mapping.setFilters(filters);

        return mapping;
    }

    // field2, field3
    @GetMapping("/filtering-list")
    public MappingJacksonValue retrieveListOfSomeBeans() {
        final List<FilteringBean> list = Arrays.asList(new FilteringBean("value1", "value2", "value3"),
                new FilteringBean("value12", "value22", "value32"));

        final SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field2", "field3");

        final FilterProvider filters = new SimpleFilterProvider().addFilter("FilteringBeanFilter", filter);

        final MappingJacksonValue mapping = new MappingJacksonValue(list);

        mapping.setFilters(filters);

        return mapping;
    }
}
