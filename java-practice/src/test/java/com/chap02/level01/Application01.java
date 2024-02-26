package com.chap02.level01;

public class Application01 {

    public static void main(String[] args) {

        int x = 2;
        int y = 5;
        char c = 'A';       //'A'의 문자코드는 65
        System.out.println(y >= 5 || x < 0 && x > 2);       // ||부분이 우선 true니까 뒤를 볼 ㄹ필요 없음

        System.out.println(y += 10 - x++);      //13
//x=3, y=15
        System.out.println(x+=2);       //5
//x=5
        System.out.println( !('A' <= c && x > 'Z'));      //

        System.out.println('C'-c);      //2
//C는 67
        System.out.println('5' - '0');      //5
//'5'는 53 '0'은 48
        System.out.println(c+1);        //66
//66은 'B'임
        System.out.println(++c);        //B

        System.out.println(c++);        // B

        System.out.println(c);      // C


        int text = (int)'Z';
        System.out.println(text);
        char convert = (char)66;
        System.out.println(convert);

    }

}
