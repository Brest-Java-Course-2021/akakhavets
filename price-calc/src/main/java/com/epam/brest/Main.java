package com.epam.brest;

import com.epam.brest.model.ReadData;
import com.epam.brest.model.Status;
import com.epam.brest.model.StatusType;

import java.io.IOException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        Status currentStatus = new ReadData();
        while (currentStatus.getType() != StatusType.EXIT) {
            currentStatus = currentStatus.handle(scanner);
        }

    }

}