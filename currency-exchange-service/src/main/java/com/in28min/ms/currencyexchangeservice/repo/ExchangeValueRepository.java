package com.in28min.ms.currencyexchangeservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28min.ms.currencyexchangeservice.bean.ExchangeValue;

public interface ExchangeValueRepository extends
        JpaRepository<ExchangeValue, Long> {
    ExchangeValue findByFromAndTo(String from, String to);
}
