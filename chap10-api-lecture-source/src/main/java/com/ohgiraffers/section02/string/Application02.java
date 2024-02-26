package com.ohgiraffers.section02.string;

public class Application02 {

    public static void main(String[] args) {

        /* 수업목표. 문자열 객체를 만드는 다양한 방법을 숙지하고 인스턴스가 생성되늰 방식 확인. */
        /* 필기.
        *   문자열 객체를 만드는 방법
        *   "" 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다. (singleton)
        *   new String("문자열") : 매번 새로운 인스턴스 생성
        * */

        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        System.out.println("str1 = str2 : " + (str1 == str2));
        // new 키워드로 새로운 인스턴스 할당 받았기 때문
        System.out.println("str1 == str3 : " + (str1 == str3));

        /* 필기.
        *   하지만 4개의 문자열 모두 동일한 hashcode 를 가진다.
        *   동일한 문자열은 동일한 hashcode 를 갖게 재정의 되어 있다.
        * */  // 아까 오버라이딩 해서!

        System.out.println("str1의 hashcode : " + str1.hashCode());
        System.out.println("str2의 hashcode : " + str2.hashCode());
        System.out.println("str3의 hashcode : " + str3.hashCode());
        System.out.println("str4의 hashcode : " + str4.hashCode());

        /* 필기.
        *   equals() : String 클래스의 equals() 메소드는 인스턴스 비교가 아닌 문자열값을 비교
        *              동일한 값을 가지는 경우 true, 다른 값을 가지는 경우 false를 반환하도록
        *              equals() 메소드를 재정의 해두었다.
        *              따라서 문자열 인스턴스 생성 방식과 상관 없이 동일한 문자열인 지 비교ㅛ하기 위해
        *              == 대신 equals() 메소드를 사용해야 한다.
        * */

        System.out.println("str1.equals(str3) : " + str1.equals(str3));


    }

}
