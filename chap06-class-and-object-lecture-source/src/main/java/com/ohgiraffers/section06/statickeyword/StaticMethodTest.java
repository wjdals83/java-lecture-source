package com.ohgiraffers.section06.statickeyword;

public class StaticMethodTest {

    private int count;

    public void nonStaticMethod() {

        this.count++;
        System.out.println("nonStaticMethod 호출됨...");
    }

    public static void staticMethod() {

//        this.count++;       //인스턴스를 생성하지 않고 사용하는 메소드이기 때문에 this에는 주소가 들어갈 수 없다. static은 new를 통해 인스턴스를 만들어 낼 필요가 없는 아이. 주소값이 없음.
        System.out.println("staticMethod 호출됨...");

    }

}
