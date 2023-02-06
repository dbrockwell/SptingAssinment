package com.example.assignment2.impl;

import com.example.assignment2.Sale;
import com.example.assignment2.iface.ShippingPolicy;

import java.util.List;

public class FlatRateAndFreeShippingPolicy implements ShippingPolicy {
    double threshold = Double.MAX_VALUE;

    public FlatRateAndFreeShippingPolicy(Double minLimit) {
        this.threshold = minLimit;
    }
    @Override
    public void applyShipping(List<Sale> salesList) {
        new FlatRateShippingPolicy().applyShipping(salesList);

        if(this.threshold < 0) {
            throw new IllegalArgumentException("The min limit is too low");
        }
        for(Sale sale: salesList){
            if(sale.getPrice() > this.threshold)
                sale.setShippingCost(0D);
        }
    }
}
