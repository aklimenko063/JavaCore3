package org.javaacademy.module1.homework;

public enum TaxRates {
    TAX_BEFORE_ONE_MILLION(0.08, 1_000_000),
    TAX_BEFORE_TWO_MILLION(0.1, 2_000_000),
    TAX_AFTER_TWO_MILLION(0.13, Long.MAX_VALUE);
    private double taxRate;
    private long limit;

    TaxRates(double taxRate, long limit) {
        this.taxRate = taxRate;
        this.limit = limit;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public long getLimit() {
        return limit;
    }
}