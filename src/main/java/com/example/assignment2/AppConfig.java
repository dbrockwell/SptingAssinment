package com.example.assignment2;


import com.example.assignment2.iface.SalesInput;
import com.example.assignment2.iface.SalesReport;
import com.example.assignment2.iface.ShippingPolicy;
import com.example.assignment2.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.assignment2")
public class AppConfig {
    @Bean
    public SalesInput salesInput() {
        return new FileSalesInput();
    }

    @Bean
    public SalesReport salesReport() {
        return new SummarySalesReport();
    }

    @Bean
    //public ShippingPolicy shippingPolicy() {return new FreeShippingPolicy();}
    //public ShippingPolicy shippingPolicy() {return new FlatRateShippingPolicy();}
    public ShippingPolicy shippingPolicy() {return new FlatRateAndFreeShippingPolicy(100.00);}
}
