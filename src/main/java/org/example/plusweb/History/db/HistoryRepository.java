package org.example.plusweb.History.db;


import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoryRepository extends JpaRepository<HistoryEntity, Long> {
}
//Repository는 Entity에 의해 생성된 데이터베이스 테이블에 접근하는 메서드를 사용하기 위한 인터페이스임.