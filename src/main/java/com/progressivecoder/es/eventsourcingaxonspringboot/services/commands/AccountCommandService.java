package com.progressivecoder.es.eventsourcingaxonspringboot.services.commands;

import com.progressivecoder.es.eventsourcingaxonspringboot.dto.commands.AccountCreateDTO;
import com.progressivecoder.es.eventsourcingaxonspringboot.dto.commands.MoneyCreditDTO;
import com.progressivecoder.es.eventsourcingaxonspringboot.dto.commands.MoneyDebitDTO;

import java.util.concurrent.CompletableFuture;

public interface AccountCommandService {

    public CompletableFuture<String> createAccount(AccountCreateDTO accountCreateDTO);
    public CompletableFuture<String> creditMoneyToAccount(String accountNumber, MoneyCreditDTO moneyCreditDTO);
    public CompletableFuture<String> debitMoneyFromAccount(String accountNumber, MoneyDebitDTO moneyDebitDTO);
}
