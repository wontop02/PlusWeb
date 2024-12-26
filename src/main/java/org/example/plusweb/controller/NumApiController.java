package org.example.plusweb.controller;

import org.example.plusweb.model.Num;
import org.example.plusweb.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class NumApiController {

    private final NumberService numberService;

    public NumApiController(NumberService numberService) {
        this.numberService = numberService;
    }

    @PostMapping("/add")
    public Num Plus(
        @RequestBody Num num
    ){
        return numberService.Plus(num.getNum1(), num.getNum2());
    }

}
