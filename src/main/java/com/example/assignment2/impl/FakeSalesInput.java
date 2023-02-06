package com.example.assignment2.impl;

import com.example.assignment2.Sale;
import com.example.assignment2.iface.SalesInput;

import java.util.ArrayList;
import java.util.List;

public class FakeSalesInput implements SalesInput {
    @Override
    public List<Sale> getSales() {
        System.out.println("Got a Sale");
        List<Sale> theList = new ArrayList<>();
        theList.add(new Sale("Bob", "Texas", 4335.56, 23.32));
        theList.add(new Sale("Dave", "Wisconsin", 5575.66, 12.22));
        return theList;
    }
}
