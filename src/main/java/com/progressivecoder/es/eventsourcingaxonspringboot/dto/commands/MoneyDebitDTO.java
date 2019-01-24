package com.progressivecoder.es.eventsourcingaxonspringboot.dto.commands;

public class MoneyDebitDTO {

    private double debitAmount;

    private String currency;

    public double getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(double debitAmount) {
        this.debitAmount = debitAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
