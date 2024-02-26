package com.ohgiraffers.section01.extend;

// extends : Car 를 확장, 상속 받는다는 의미
public class FireCar extends Car{

    /* 목차. 1. extends 키워드를 이용해서 Car 클래스 상속 */

    /* 필기.
    *   car 클래스를 부모클래스로 FireFCar를 자식클래스로 사용한다는 뜻.
    *   FireCar는 부모클래스인 Car 가 가지고 있는 모든 멤버를 상속 받는다.
    *   하지만, 생성자는 상속받지 못한다.
    *   또한 부모가 가지고 있는 private 멤버는 접근 불가.
    * */

    // 기본생성자
    public FireCar() {      // 기본 생성자 만들기

        /* 필기.
        *   모든 생성자 맨 첫 줄에는 super() 를 컴파일러가 자동으로 추가한다.
        *   부모의 기본 생성자를 호출하는 구문이다.
        *   명시적, 묵시적 전부 사용이 가능하다.
        * */
        super();        // 부모의 기본 생성자를 호출하는 구문. 명시적, 묵시적 둘 다 가능

        System.out.println("FireCar의 기본 생성자 호출됨...");
    }

    /* 목차. 2. soundHorn() 메소드 오버라이딩( 메소드 재정의 ) */
    /* 소방차의 경적이 너무 작다. 소방차만의 색으로 바꿔보자 */

    /* 필기.
    *   @Override 어노테이션
    *   오버라이딩이 정상적으로 작성 된 것인지 체크해주는 기능
    *   오버라이딩 하는 메소드는 기본적으로 부모 메소드 선언 내용을 그대로 작성해야 한다.
    * */

    @Override       // 부모의 soundHorn 메소드를 재정의 해준다.
    public void soundHorn() {

        if(isRunning()) {

            /* 필기.
            *   isRunning() 는 private 였기 때문에 사용이 불가능 했다.
            *   하지만, protected 접근제한자로 바꿔 사용이 가능하게 했다.
            *   (캡슐화 위배) 그나마 범위가 좁은 것으로 대체를 하였다.
            * */
            System.out.println("빠아앙아앙ㅇ앙아아아아~~~~~빵ㅃ빵~~~~~~~!!@!");

        } else {
            System.out.println("소방차가 앞으로 갈 수 없습니다.. 비켜주세요");
        }

    }

    /* 목차. 3. 물뿌리기 기능을 추가해보자 */
    public void sprayWater() {

        System.out.println("불난 곳을 발견했습니다... 물을 뿌릴게요 ===================>>>>>>>");

    }

}
