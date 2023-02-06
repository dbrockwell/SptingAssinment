package com.example.assignment2.iface;

import com.example.assignment2.Sale;

import java.util.List;

public interface SalesReport {
    void generateReport(List<Sale> salesList);
}
