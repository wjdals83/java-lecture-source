package com.ohgiraffers.section01.init;

public class Car {

    private String modelName;
    private int maxSpeed;

    public Car(String modelName, int maxSpeed) {
        this.modelName  = modelName;
        this.maxSpeed = maxSpeed;
    }       // 모든 필드를 초기화

    public void driveMaxSpeed() {

        System.out.println(modelName + "이(가) 최고시속 " + maxSpeed + "km/h 로 달려값니다. ");

    }

}
