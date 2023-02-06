package com.example.assignment2;

import com.example.assignment2.iface.SalesInput;
import com.example.assignment2.iface.SalesReport;
import com.example.assignment2.iface.ShippingPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Report {
    private SalesInput salesInput;
    private SalesReport salesReport;
    private ShippingPolicy shippingPolicy;

    @Autowired
    public Report(SalesInput salesInput, SalesReport salesReport, ShippingPolicy shippingPolicy) {
        this.salesInput = salesInput;
        this.salesReport = salesReport;
        this.shippingPolicy = shippingPolicy;
    }

    public void run(){
        List<Sale> theSales = salesInput.getSales();
        shippingPolicy.applyShipping(theSales);
        salesReport.generateReport(theSales);
    }
}
