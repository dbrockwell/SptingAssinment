package com.example.assignment2.impl;

import com.example.assignment2.Sale;
import com.example.assignment2.iface.SalesReport;

import java.util.List;

public class SummarySalesReport implements SalesReport {
    @Override
    public void generateReport(List<Sale> salesList) {
        double priceTotal = 0;
        double taxTotal = 0;
        double shippingFeeTotal = 0;
        for (Sale sale: salesList) {
            priceTotal += sale.getPrice();
            taxTotal += sale.getTax();
            shippingFeeTotal += sale.getShippingCost();
        }
        System.out.println("SALES SUMMARY REPORT");
        System.out.format("%20s%15s%20s\n","Price","Tax","Shipping");
        System.out.format("%20.2f%15.2f%20.2f\n",priceTotal,taxTotal,shippingFeeTotal);

        System.out.println("SALES DETAIL REPORT");
        System.out.format("%40s%30s%20s%15s%20s \n","Customer","Country","Price", "Tax", "Shipping");
        for (Sale sale: salesList) {
            System.out.format("%40s%30s%20.2f%15.2f%20.2f\n",sale.getName(),sale.getCountry(),sale.getPrice(), sale.getTax(), sale.getShippingCost());
        }
    }
}
