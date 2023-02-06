package com.example.assignment2.impl;

import com.example.assignment2.Sale;
import com.example.assignment2.iface.SalesInput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileSalesInput implements SalesInput {
    static private String INPUT_FILE_PATH = "sales.txt";
    @Override
    public List<Sale> getSales() {
        List<Sale> theSales = new ArrayList<>();

        File inputFile = new File(INPUT_FILE_PATH);

        BufferedReader bufferedReader;

        try {
            bufferedReader = new BufferedReader(new FileReader(inputFile));
        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalArgumentException();
        }

        String line;
        do{
            try {
                line = bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }
            if(line==null){
                break;
            }

            String[] splitLine = line.split(",", 4);
            theSales.add(new Sale(splitLine[0], splitLine[1], Double.parseDouble(splitLine[2]), Double.parseDouble(splitLine[3])));
        }while (true);
        System.out.println(theSales.size()+" sales generated from file at "+INPUT_FILE_PATH);
        return theSales;
    }
}
