package org.itstack.demo.design.test;

import com.alibaba.fastjson.JSON;
import org.itstack.demo.design.LotteryResult;
import org.itstack.demo.design.LotteryService;
import org.itstack.demo.design.LotteryServiceImpl;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test() {
        LotteryService lotteryService = new LotteryServiceImpl();
        LotteryResult result = lotteryService.draw("2765789109876");
        logger.info("测试结果：{}", JSON.toJSONString(result));
    }

}
