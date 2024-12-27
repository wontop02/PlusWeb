package org.example.plusweb.service;

import org.example.plusweb.model.Num;
import org.example.plusweb.model.NumRequest;
import org.springframework.stereotype.Service;

@Service
public class NumberService {

    public NumberService() {
    }

    public Integer Plus(Num num1, Num num2)
    {
        return num1.getNum() + num2.getNum();
    }
}
