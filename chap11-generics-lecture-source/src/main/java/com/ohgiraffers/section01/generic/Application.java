package com.ohgiraffers.section01.generic;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 제네릭(generic)에 대해 이해할 수 있다. */
        /* 필기.
        *   제네릭(generic)
        *   제네릭의 사전적인 의미는 일반적인 이라는 의미이다.
        *   자바에서 제네릭이란, 데이터의 타입을 일반화 한다는 의미를 가진다.
        *
        *   필기.
        *    제네릭은 클래스나 메소드에서 사용할 내부 데이터 타입을 컴파일 시에 지정하는 방법을 말한다.
        *    컴파일 시에 미리 타입 검사를 시행하게 되면 클래스나 메소드 내부에서 사용되는 객체의 타입
        *    안정성을 높일 수 있으며, (잘못 된 타입인 경우 컴파일 에러를 발생시킴. )
        *    반환값에 대한 타입 변환 및 타입 검사에 들어가는 코드 생략이 가능해진다.
        *    (instanceof 비교 및 다운캐스팅 작성 불필요)
        *
        *    필기.
        *     제네릭 프로그래밍
        *     데이터의 형식에 의존하지 않고 하나의 값이 여러 다른 데이터 타입들을 가질 수 있는 기술에
        *     중점을 두어 재사용성을 높일 수 있는 프로그래밍 방식이다.
        * */

        GenericTest<Integer> gt1 = new GenericTest<Integer>();

        gt1.setValue(new Integer(10));      // new를 안써줘도 된다..?. 빨간 줄은 그냥 경고의 의미.
        System.out.println(gt1.getValue());     // set으로 설정한 값 get으로 받기
        System.out.println(gt1.getValue() instanceof Integer);  // 인티져 타입이 맞는지 instance of로 확인해보기

        GenericTest<String> gt2 = new GenericTest<String>();        // 굳이 뒤에 String 또 안써줘도 됨.
        gt2.setValue("홍길동");        // String은 자주 쓰는 거라 인티저와 달리 new 생략 가능
        System.out.println(gt2.getValue());
        System.out.println(gt2.getValue() instanceof String);

    }



}
