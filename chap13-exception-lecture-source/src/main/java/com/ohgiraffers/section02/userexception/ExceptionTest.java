package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest {

    public void checkEnoughMoney(int price, int money) throws PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException {

        if(price < 0) {
            throw new PriceNegativeException("상품의 가격은 음수일 수 없습니다.");        // Exception 말고 내가 임의로 정의한 클래스
        }

        if(money < 0) {
            throw new MoneyNegativeException("가지고 있는 돈은 음수일 수 없습니다.");      // throw를 해 줌.
        }

        if(money < price) {
            throw new NotEnoughMoneyException("가진 돈 보다 상품 가격이 비쌉니다~~~");
        }

    }

}
