package com.progressivecoder.es.eventsourcingaxonspringboot.dto.commands;

public class AccountCreateDTO {

    private double startingBalance;

    private String currency;

    public double getStartingBalance() {
        return startingBalance;
    }

    public void setStartingBalance(double startingBalance) {
        this.startingBalance = startingBalance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
