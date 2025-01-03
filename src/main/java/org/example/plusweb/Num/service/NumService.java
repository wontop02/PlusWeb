package org.example.plusweb.Num.service;

import org.example.plusweb.Num.model.Num;
import org.springframework.stereotype.Service;

@Service
public class NumService {

    public NumService() {
    }

    public Integer Plus(Num num1, Num num2)
    {
        return num1.getNum() + num2.getNum();
    }
}
