package org.itstack.demo.design.test;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.ArrayList;


public class ApiTest {

    @Test
    public void test_clone() throws CloneNotSupportedException {
        ArrayList<String> l01 = new ArrayList<String>();
        l01.add("xxx");
        l01.add("yyy");

        ArrayList<String> l02 = (ArrayList<String>) l01.clone();
        l02.add("zzz");

        System.out.println(JSON.toJSONString(l01));
        System.out.println(JSON.toJSONString(l02));

        l01.remove("xxx");

        System.out.println(JSON.toJSONString(l01));
        System.out.println(JSON.toJSONString(l02));
    }

}
