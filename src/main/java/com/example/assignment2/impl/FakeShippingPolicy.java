package com.example.assignment2.impl;

import com.example.assignment2.Sale;
import com.example.assignment2.iface.ShippingPolicy;

import java.util.List;

public class FakeShippingPolicy implements ShippingPolicy {
    @Override
    public void applyShipping(List<Sale> salesList) {
        System.out.println("Love that policy");
    }
}
