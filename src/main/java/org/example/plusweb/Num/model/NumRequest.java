package org.example.plusweb.Num.model;

public class NumRequest {
    private Num num1;
    private Num num2;

    public NumRequest() {

    }

    public NumRequest(Num num1) {
        this.num1 = num1;
    }

    public Num getNum1() {
        return num1;
    }

    public void setNum1(Num num1) {
        this.num1 = num1;
    }

    public Num getNum2() {
        return num2;
    }

    public void setNum2(Num num2) {
        this.num2 = num2;
    }

    public NumRequest(Num num1, Num num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}
