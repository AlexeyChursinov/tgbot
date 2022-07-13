package ru.norddigital.tgbot.service;

import ru.norddigital.tgbot.enums.Currency;
import ru.norddigital.tgbot.service.impl.NbrbCurrencyConversionService;

public interface CurrencyConversionService {

    static CurrencyConversionService getInstance() {
        return new NbrbCurrencyConversionService();
    }

    double getConversionRatio(Currency original, Currency target);
}