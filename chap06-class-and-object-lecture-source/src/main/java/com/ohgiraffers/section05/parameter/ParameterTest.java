package com.ohgiraffers.section05.parameter;

public class ParameterTest {

    public void testParameterPrimaryType(int num) {

        System.out.println("매개변수로 전달 받은 값 : " + num);

    }

    public void testParameterPrimaryTypeArray(int[] iarr) {

        /* 필기.
        *   배열의 주소가 전달 될 것이다.
        *   즉 인자로 전달하는 배열과 매개변수로 전달 받은 배열은 서로 동일한 배열을 가리킨다. (얕은 복사)
        * */
        System.out.println("매개변수로 전달 받은 값 : " + iarr);

        System.out.print("배열의 값 출력 : ");
        for(int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        iarr[0] = 99;

        System.out.print("변경 후 배열의 값 출력 : ");
        for(int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
    }

    public void testParameterClassType(RectAngle rectAngle) {       // 클래스도 자료형이 될 수 있기 때문에 int num 처럼 보면 됨. 클래스자료형 + 아무변수

        /* 필기.
        *   인스턴스도 주소가 전달된다.
        *   즉, 인자로 전달하는 인스턴스와 매개변수로 전달 받은 인스턴스는 동일한
        *   인스턴스를 가리킨다. (얕은 복사)
        * */

        System.out.println("매개변수로 전달 받는 값 : " + rectAngle);

        System.out.println("변경 전 사각형의 넓이와 둘레====================");
        rectAngle.calcArea();
        rectAngle.calcRound();

        rectAngle.setWidth(100);        // 자동형변환
        rectAngle.setHeight(100);

        System.out.println("변경 후 사각형의 넓이와 둘레================");
        rectAngle.calcArea();
        rectAngle.calcRound();

    }

    public void testVariableLengthArrayParameter(String name, String...hobby) {     // 가변인자라는 뜻. ... 몇 개 보낼지 모를 때

        /* 필기.
        *   가변길이의 배열은 몇 개가 매개변수로 전달 될 지 모르는 상황이기 때문에 이름과
        *   구분하기 위해 뒤쪽에 작성해야 한다.
        *   앞쪽에 작성하는 경우 에러가 발생한다.
        * */

        System.out.println("이름 : " + name);
        System.out.print("취미의 갯수 : " + hobby.length + ", ");
        System.out.print("취미 : ");
        for(int i = 0; i < hobby.length; i++) {
            System.out.print(hobby[i] + " ");
        }
        System.out.println();
    }

}
