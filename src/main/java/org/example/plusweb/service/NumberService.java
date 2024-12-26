package org.example.plusweb.service;

import org.example.plusweb.model.Num;
import org.springframework.stereotype.Service;

@Service
public class NumberService {

    public NumberService() {
    }

    public Num Plus(Integer num1, Integer num2)
    {
        return new Num(num1 + num2);
    }
}
