package ru.norddigital.tgbot.service;

import ru.norddigital.tgbot.enums.Currency;
import ru.norddigital.tgbot.service.impl.HashMapCurrencyModeService;

import java.util.HashMap;

public interface CurrencyModeService {

    static CurrencyModeService getInstance() { return new HashMapCurrencyModeService(); }

    Currency getOriginalCurrency(long chatId);

    Currency getTargetCurrency(long chatId);

    void setOriginalCurrency(long chatId, Currency currency);

    void setTargetCurrency(long chatId, Currency currency);

}
