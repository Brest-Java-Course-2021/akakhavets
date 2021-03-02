package com.epam.brest.model.model;

import com.epam.brest.model.files.FileReader;
import com.epam.brest.model.selector.PriceSelector;

import java.util.Scanner;

abstract class AbstractStatus implements Status {

    PriceSelector priceSelector;
    FileReader fileReader;
    Scanner scanner;

    public AbstractStatus(PriceSelector priceSelector, FileReader fileReader, Scanner scanner) {
        this.priceSelector = priceSelector;
        this.fileReader = fileReader;
        this.scanner = scanner;
    }
}
