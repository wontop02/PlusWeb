package org.example.plusweb.Num.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.plusweb.History.model.HistoryDto;
import org.example.plusweb.History.service.HistoryService;
import org.example.plusweb.Num.model.Num;
import org.example.plusweb.Num.model.NumRequest;
import org.example.plusweb.Num.service.NumService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
public class NumApiController {
    private final NumService numService;
    private final HistoryService historyService;

    public NumApiController(NumService numService, HistoryService historyService)
    {
        this.numService = numService;
        this.historyService = historyService;
    }

    @PostMapping("/add")
    public Num Plus(
        @RequestBody NumRequest numRequest
        ){
        Num result = new Num(numService.Plus(numRequest.getNum1(), numRequest.getNum2()));
        historyService.create(numRequest, result);
        return result;
    }

    @GetMapping("/history")
    public List<HistoryDto> getAllHistory() {
        var history_list = historyService.getAllHistory();
        log.info("history list: {}", history_list);
        return history_list;
    }

}
