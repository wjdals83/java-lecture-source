package com.chap01.level02;

public class Application01 {

    public static void main(String[] args) {

        char unicode = 'a';
        int result1 = unicode;
        System.out.println("문자 a의 unicode : " + result1);

        System.out.println("============또 다른 풀이===========");
        char text = 'a';
        System.out.println("문자 " + text + "의 unicode : " + (int)text);
//        그냥 쭉 쓰면 띄어쓰기가 안 되니 직접 넣어주자
//        변수 앞에 바로 하위 자료형을 넣어 주는 것도 가능


    }

}
