package org.itstack.demo.design.test;

import org.itstack.demo.design.SsoInterceptor;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_sso() {
        SsoInterceptor ssoInterceptor = new SsoInterceptor();
        String request = "1successhuahua";
        boolean success = ssoInterceptor.preHandle(request, "ewcdqwt40liuiu", "t");
        System.out.println("登录校验：" + request +(success ? " 放行" : " 拦截"));
    }

}
