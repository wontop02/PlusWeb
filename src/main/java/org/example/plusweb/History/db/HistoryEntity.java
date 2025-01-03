package org.example.plusweb.History.db;

import jakarta.persistence.*;

//Entity는 실제 데이터베이스 테이블과 매칭될 클래스임
//Entity를 직접 반환할 경우 보안 등 문제가 생기므로 Dto를 사용 (*자세히)
@Entity
@Table(name = "history_table") //매핑
public class HistoryEntity { //따로 매핑을 하지 않을 거면 sql의 table 이름과 같아야 함

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer num1;
    private Integer num2;
    private Integer result;

    public Integer getId() {
        return id;
    }

    public Integer getNum1() {
        return num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public Integer getResult() {
        return result;
    }


    public HistoryEntity() {
    }

    public HistoryEntity(Builder builder) {
        this.id = builder.id;
        this.num1 = builder.num1;
        this.num2 = builder.num2;
        this.result = builder.result;
    }

    //builder 패턴
    public static class Builder {
        private Integer id;
        private Integer num1;
        private Integer num2;
        private Integer result;

        public Builder(){}

        public Builder(Integer id, Integer num1, Integer num2, Integer result){
            this.id = id;
            this.num1 = num1;
            this.num2 = num2;
            this.result = result;
        }

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder num1(Integer num1) {
            this.num1 = num1;
            return this;
        }

        public Builder num2(Integer num2) {
            this.num2 = num2;
            return this;
        }

        public Builder result(Integer result) {
            this.result = result;
            return this;
        }

        public HistoryEntity build(){
            return new HistoryEntity(this);
        }

    }

}
