package com.in28min.ms.v2.currencyexchangeservicev2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28min.ms.v2.currencyexchangeservicev2.bean.CurrencyExchange;

public interface CurrencyExchangeRepository
        extends JpaRepository<CurrencyExchange, Long> {
    CurrencyExchange findByFromAndTo(String from, String to);
}
