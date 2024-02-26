package com.ohgiraffers.section04.wrapper;

public class Application01 {

    public static void main(String[] args) {

        /* 수업목표. Wrapper 클래스에 대해 이해할 수 있다. */

        /* 필기.
        *   기본 자료형 데이터를 인스턴스화 해야하는 경우들이 발생한다.
        *   이 때 8가지 자료형의 데이터를 인스턴스화 할 수 있도록 하는 클래스를
        *   Wrapper 클래스 라고 한다. (주방에서 사용하는 랩 과 같이 감싼다는 의미이다. )
        * */

        /* 필기.
        *   기본타입         래퍼클래스
        *   byte            Byte
        *   short           Short
        *   int             Integer
        *   long            Long
        *   float           Float
        *   double          Double
        *   char            Character
        *   boolean         Boolean
        * */

        /* 필기.
        *   박싱(Boxing) 언박싱(Unboxing)
        *   기본타입을 래퍼클래스의 인스턴스로 인스턴스화 하는 것을 Boxing 이라고 하며,
        *   래퍼클래스 타입의 인스턴스를 기본 타입으로 변경하는 것을 UnBoxing 이라고 한다.
        * */

        int intValue = 20;
        Integer boxingNumber1 = new Integer(intValue);      // 인스턴스화(박싱)

        int unBoxingNumber1 = boxingNumber1.intValue();     // 언박싱 (intValue()) 이용

        Integer boxingNumber2 = intValue;           // 오토 박싱

        int unBoxingNumber2 = boxingNumber2;        // 오토 언박싱

        int inum = 20;
        Integer integerNum1 = new Integer(20);
        Integer integerNum2 = new Integer(20);   // 박싱
        Integer integerNum3 = 20;               // 오토박싱
        Integer integerNum4 = 20;

        // 기본 타입이랑 래퍼클래스 타입은 == 연산으로 비교 가능하다.
        System.out.println("int 와 Integer 비교 : " + (inum == integerNum1));

        // 생성자를 이용해 생성한 인스턴스의 경우 == 로 비교가 불가능 하다. (박싱)
        // 단 오토 박싱을 이용해서 생성한 값은 == 로 비교가 가능하다.

    }

}
