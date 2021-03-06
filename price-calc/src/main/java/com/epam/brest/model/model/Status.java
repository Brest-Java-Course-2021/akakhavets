package com.epam.brest.model.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface Status {

    List<String> messages = new ArrayList<>(Arrays.asList("Please, enter distance:", "Please, enter weight:"));

    List<BigDecimal> userData = new ArrayList<>();

    Status handle();

    StatusType getType();

}
