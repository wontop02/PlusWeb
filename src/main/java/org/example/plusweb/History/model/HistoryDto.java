package org.example.plusweb.History.model;

//DTO(Data Transfer Object)는 프로세스 간 데이터를 전달하는 객체
//클라이언트와 서버가 데이터를 주고받을 때 사용
//로직을 가지지 않는 순수한 데이터 객체
public class HistoryDto {
    private Integer id;
    private Integer num1;
    private Integer num2;
    private Integer result;

    //Dto는 Builder 객체를 통해 생성
    public HistoryDto(Builder builder) {
        this.id = builder.id;
        this.num1 = builder.num1;
        this.num2 = builder.num2;
        this.result = builder.result;
    }

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

    //Builder 클래스
    public static class Builder { //빌더 클래스는 DTO 생성 역할만 수행하므로, 내부에 Getter 메서드 불필요
        private Integer id;
        private Integer num1;
        private Integer num2;
        private Integer result;

        public Builder(){}

        /*  public Builder(Integer id, Integer num1, Integer num2, Integer result){
            this.id = id;
            this.num1 = num1;
            this.num2 = num2;
            this.result = result;
        }*/ //필드초기화는 Builder 메서드를 통해 처리하는 게 Builder 패턴의 취지에 맞음

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

        public HistoryDto build(){
            return new HistoryDto(this);
        }

    }
}
