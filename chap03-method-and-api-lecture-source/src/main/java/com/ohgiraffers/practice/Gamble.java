package com.ohgiraffers.practice;

public class Gamble {

    public static void main(String[] args) {
        //동일한 클래스 내에 작성된 메소드는 클래스명 생략이 가능하다.
        int earnings = dice() + dice() + dice() + dice() + dice() + dice();     //획득자금
        System.out.println("획득 : $" + earnings);

        int profit = earnings - 18;
        System.out.println("손익 : $" + profit);

    }

    public static int dice( ) {
//1~6까지의 주사위 수
        return (int) (Math.random() * 6) + 1;

    }

}
