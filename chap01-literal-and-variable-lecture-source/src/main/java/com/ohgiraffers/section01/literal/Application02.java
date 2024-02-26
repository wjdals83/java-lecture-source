package com.ohgiraffers.section01.literal;

import java.net.SocketTimeoutException;
import java.sql.SQLOutput;

public class Application02 {

    public static void main(String[] args) {

        /* 수업목표. 값을 직접 연산하여 출력할 수 있다. */

        /* 목차. 1. 숫자와 숫자의 연산 */
        System.out.println("==========================정수와 정수의 연산==========================");
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 10);
        System.out.println(123 / 10);
        System.out.println(123 % 10);   // mod 연산자

        /* 목차. 1-2. 실수와 실수의 연산 */
        System.out.println("==========================실수와 실수의 연산===========================");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 1.0);

        /* 목차. 1-3. 정수와 실수의 연산 */
        /*필기. 정수와 실수 연산의 결과는 항상 실수가 나온다. */
        System.out.println("==========================정수와 실수의 연산===========================");
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);

        /* 목차. 문자의 연산 */
        /* 목차. 2-1. 문자와 문자의 연산 */
        System.out.println("==========================문자와 문자의 연산===========================");
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        /* 목차. 2-2. 문자와 정수의 연산 */
        System.out.println("==========================문자와 정수의 연산===========================");
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);

        System.out.println("==========================연습==========================");
        System.out.println('안' + '녕');

        /* 목차. 2-3. 문자와 실수의 연산 */
        System.out.println("========================문자와 실수의 연산========================");
        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);

        /* 목차. 3-2. 문자열과 다른 형태의 갑 ㅅ연산 */
        System.out.println("========================문자열과 다른 형태의 값 연산=====================");
        System.out.println("hello" + 123);
        System.out.println("hello" +123.456);
        System.out.println("hello" + 'a');
        System.out.println("hellp" + true);

        /* 목차. 4. 논리 값 연산 */
        /* 목차. 4-1. 논리값과 논리값 연산 */
        // 필기. 논리값 끼리의 연산은 모든 연산자의 사용이 불가능하다.
//        System.out.println(true + false);
//        System.out.println(true - false);
//        System.out.println(true * false);
//        System.out.println(true / false);
//        System.out.println(true % false);


        System.out.println("===========================논리와 문자열의 연산======================");
        System.out.println(true + "a");
//        System.out.println(true - "a");
//        System.out.println(true / "a");
//        System.out.println(true * "a");
//        System.out.println(true % "a");





         }

}

