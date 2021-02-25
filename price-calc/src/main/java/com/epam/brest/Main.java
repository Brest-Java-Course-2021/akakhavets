package com.epam.brest;

import com.epam.brest.files.FileReader;
import com.epam.brest.model.ReadData;
import com.epam.brest.model.Status;
import com.epam.brest.model.StatusType;
import com.epam.brest.selector.PriceSelector;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        FileReader fileReader = applicationContext.getBean(FileReader.class);
        PriceSelector priceSelector = applicationContext.getBean(PriceSelector.class);

        Scanner scanner = new Scanner(System.in);

        Status currentStatus = new ReadData(priceSelector, fileReader, scanner);
        while (currentStatus.getType() != StatusType.EXIT) {
            currentStatus = currentStatus.handle();
        }

    }

}