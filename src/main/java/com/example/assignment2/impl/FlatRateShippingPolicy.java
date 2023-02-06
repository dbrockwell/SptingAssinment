package com.example.assignment2.impl;

import com.example.assignment2.Sale;
import com.example.assignment2.iface.ShippingPolicy;

import java.util.List;

public class FlatRateShippingPolicy implements ShippingPolicy {
    @Override
    public void applyShipping(List<Sale> salesList) {
        for(Sale sale: salesList) {
            Double shipping;
            switch (sale.getCountry().toLowerCase()) {
                case "united states","usa","us" -> shipping = 29.95;
                case "japan" -> shipping = 14.58;
                case "scotland" -> shipping = 7.54;
                case "india" -> shipping = 11.79;
                default ->  {
                    throw new IllegalArgumentException("COUNTY NAME NOT FOUND");
                }
            }
            sale.setShippingCost(shipping);
        }
    }
}
