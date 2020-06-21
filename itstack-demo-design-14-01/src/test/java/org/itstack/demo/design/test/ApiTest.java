package org.itstack.demo.design.test;

import org.itstack.demo.design.XiaoEr;
import org.junit.Test;

/**
 * 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 * 公众号：bugstack虫洞栈
 * Create by 小傅哥(fustack) @2020
 */
public class ApiTest {

    @Test
    public void test(){
        // 广东（粤菜）、江苏（苏菜）、山东（鲁菜）、四川（川菜）
        XiaoEr xiaoEr = new XiaoEr();
        xiaoEr.order(1);
        xiaoEr.order(2);
        xiaoEr.order(3);
        xiaoEr.order(4);

        // 下单
        xiaoEr.placeOrder();
    }

}
