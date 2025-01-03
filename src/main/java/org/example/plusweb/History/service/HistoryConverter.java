package org.example.plusweb.History.service;

import org.example.plusweb.History.db.HistoryEntity;
import org.example.plusweb.History.model.HistoryDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HistoryConverter {

    public HistoryDto toDto(HistoryEntity historyEntity){
        return new HistoryDto.Builder()
            .id(historyEntity.getId())
            .num1(historyEntity.getNum1())
            .num2(historyEntity.getNum2())
            .result(historyEntity.getResult())
            .build();
    }

    public List<HistoryDto> toDto(List<HistoryEntity> historyEntities) {
        return historyEntities.stream() //stream 자세히 알기
            .map(this::toDto)  // 각 HistoryEntity를 HistoryDto로 변환
            .collect(Collectors.toList());  // 변환된 DTO들을 리스트로 반환
    }
    //여러 entity를 dto 리스트로 변환하는 메서드

    //이건 언제 쓰지? 쓸 데가 없나?
    public HistoryEntity toEntity(HistoryDto historyDto){
        return new HistoryEntity.Builder()
            .id(historyDto.getId())
            .num1(historyDto.getNum1())
            .num2(historyDto.getNum2())
            .result(historyDto.getResult())
            .build();
    }
}
