package com.example.assignment2.impl;

import com.example.assignment2.Sale;
import com.example.assignment2.iface.ShippingPolicy;

import java.util.List;

public class FreeShippingPolicy implements ShippingPolicy {
    @Override
    public void applyShipping(List<Sale> salesList) {
        for(Sale sale: salesList) {
            sale.setShippingCost(0D);
        }
    }
}
