package com.andrew.soapdemo.mypackage;

import javax.xml.bind.annotation.XmlElement;

public class AddRequest {

    private int num1;
    private int num2;

    @XmlElement
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    @XmlElement
    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }


}
