package com.ohgiraffers.section02.extend;

public class RabbitFarm<T extends Rabbit> {

    /* 필기. 타입 변수는 아직 어떤 토끼가 들어올 지 모른다.
    *       다만 토끼이거나 토끼의 후손만 가능하다.
    * */

    private T animal;

    public RabbitFarm() {}      //기본생성자

    public RabbitFarm(T animal) {
        this.animal = animal;       // 매개변수 만들어줌
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
