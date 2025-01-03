package org.example.plusweb.History.service;

import org.example.plusweb.History.db.HistoryEntity;
import org.example.plusweb.History.db.HistoryRepository;
import org.example.plusweb.History.model.HistoryDto;
import org.example.plusweb.Num.model.Num;
import org.example.plusweb.Num.model.NumRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryService {

    private final HistoryRepository historyRepository;
    private final HistoryConverter historyConverter;

    //Lombok의 @RequiredArgsConstructor를 사용하면 초기화되지 않은 final 필드,
    // @NotNull이 붙은 필드에 대한 생성자를 생성해줌
    @Autowired //더 알아보기. Bean 주입
    public HistoryService(HistoryRepository historyRepository, HistoryConverter historyConverter) {
        this.historyRepository = historyRepository;
        this.historyConverter = historyConverter;
    }

    public HistoryDto create(
        NumRequest numRequest,
        Num result
    ){
        var entity = new HistoryEntity.Builder()
            .num1(numRequest.getNum1().getNum())
            .num2(numRequest.getNum2().getNum())
            .result(result.getNum())
            .build();

        var saveEntity = historyRepository.save(entity);

        return historyConverter.toDto(saveEntity);
    }

    public List<HistoryDto> getAllHistory(){
        List<HistoryEntity> historyList = historyRepository.findAll();
        return historyConverter.toDto(historyList);
    }

}
