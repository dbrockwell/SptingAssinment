package com.example.assignment2.impl;

import com.example.assignment2.Sale;
import com.example.assignment2.iface.SalesReport;

import java.util.List;

public class FakeSalesReport implements SalesReport {
    @Override
    public void generateReport(List<Sale> salesList) {
        System.out.println("Wrote a report");
        for (Sale sale: salesList) {
            System.out.println(sale);
        }
    }
}
