package com.example.assignment2.impl;

import com.example.assignment2.Sale;
import com.example.assignment2.iface.SalesInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleSalesInput implements SalesInput {
    private Scanner scanner = new Scanner(System.in);
    @Override
    public List<Sale> getSales() {
        List<Sale> salesList = new ArrayList<>();
        String name = "";
        while (!name.equalsIgnoreCase("na")) {
            System.out.println("Enter Name (NA to quit): ");
            name = scanner.nextLine();
            if (!name.equalsIgnoreCase("na")) {
                System.out.println("Enter Country: ");
                String country = scanner.nextLine();
                Double price = 0.0;
                boolean priceIsDouble = false;
                while (!priceIsDouble) {
                    System.out.println("Enter Price: ");
                    try {
                        price = Double.parseDouble(scanner.nextLine());
                        priceIsDouble = true;
                    } catch (NumberFormatException e) {
                        System.out.println("Not a valid number");
                    }
                }
                Double tax = 0.0;
                boolean taxIsDouble = false;
                while (!taxIsDouble) {
                    System.out.println("Enter Tax: ");
                    try {
                        tax = Double.parseDouble(scanner.nextLine());
                        taxIsDouble = true;
                    } catch (NumberFormatException e) {
                        System.out.println("Not a valid number");
                    }
                }
                salesList.add(new Sale(name, country, price, tax));
            }
        }
        return salesList;
    }
}
